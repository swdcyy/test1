package com.alipay.apmobilesecuritysdk.f.c;
import java.lang.Runnable;
import com.alipay.apmobilesecuritysdk.f.b;
import java.lang.Object;
import android.os.Process;
import java.util.LinkedList;
import java.lang.Thread;

public final class c implements Runnable	// class@000e77
{
    public final b a;

    public void c(b p0){
       this.a = p0;
       super();
    }
    public final void run(){
       int i = 0;
       try{
          Process.setThreadPriority(i);
          while (!b.a(this.a).isEmpty()) {
             Runnable runnable = b.a(this.a).get(i);
             b.a(this.a).remove(i);
             if (runnable != null) {
                runnable.run();
             }
          }
          b.b(this.a);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
