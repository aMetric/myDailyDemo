package com.coderwhs.day20240626;

/**
 * @Author whs
 * @Date 2024/6/26 20:33
 * @description:
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes,i am alive");
    }

    //垃圾收集器确定此对象没有被程序引用时，会主动调用该对象的finalize()方法
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();

        //对象第一次拯救自己
        /**
         * 在第一次将SAVE_HOOK设为null后调用System.gc()主动请求垃圾回收
         * 垃圾收集器发现FinalizeEscapeGC对象已经没有其他引用指向它，于是将其标记为可回收状态
         * 并在进行垃圾回收时执行了finalize()方法
         * 在finalize()方法中，对象将SAVE_HOOK重新指向了自己，因此对象得以在被回收前完成自我拯救。
         */
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);

        if (SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no i am dead");
        }

        //因为finalize只能被系统自动调用一次，所以没有自救成功
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);

        if (SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no i am dead");
        }
    }
}
/**
 * 运行结果：
 * finalize method executed
 * yes,i am alive
 * no i am dead
 */
