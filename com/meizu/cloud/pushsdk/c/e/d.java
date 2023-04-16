package com.meizu.cloud.pushsdk.c.e.d;
import android.os.Handler;
import com.meizu.cloud.pushsdk.c.d.a;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import com.meizu.cloud.pushsdk.c.f.a;

public class d extends Handler	// class@0014e7
{
    public final WeakReference a;

    public void d(a p0){
       this.a = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       a uoa = this.a.get();
       if (p0.what == 1) {
          if (uoa != null) {
             p0 = p0.obj;
             uoa.a(p0.a, p0.b);
          }
       }else {
          super.handleMessage(p0);
       }
       return;
    }
}
