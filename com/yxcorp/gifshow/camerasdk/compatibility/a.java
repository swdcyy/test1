package com.yxcorp.gifshow.camerasdk.compatibility.a;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import qi9.q1;
import java.lang.String;
import q87.c;
import v16.a;
import v16.d;
import java.lang.InterruptedException;
import android.os.Process;
import java.lang.System;

public final class a implements Thread$UncaughtExceptionHandler	// class@001013
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void uncaughtException(Thread p0,Throwable p1){
       Object[] objArray = new Object[0];
       q1.C().u("RecorderCompatibility", p1, objArray);
       if (a.j()) {
          a.k(0);
          d.a(p1, -1, HardwareEncodeTestService.c);
          a.m(0);
          try{
             int i = 500;
             Thread.sleep(i);
          }catch(java.lang.InterruptedException e4){
             e4.printStackTrace();
          }
       }
    }
}
