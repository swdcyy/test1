package com.kuaishou.aegon.netcheck.NetcheckTaskController;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.aegon.netcheck.NetcheckTaskListenerWrapper;

public class NetcheckTaskController	// class@0007b5
{

    public void NetcheckTaskController(){
       super();
    }
    public static native void nativeCancelTask(long p0);
    public static native long nativeCreateTask(String p0,String p1,String p2,NetcheckTaskListenerWrapper p3);
}
