package com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.lang.Runnable;
import ekd.k1;

public class PLCLogHelper$2 implements DefaultLifecycleObserver	// class@001681
{
    public final PLCLogHelper b;

    public void PLCLogHelper$2(PLCLogHelper p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCLogHelper$2.class, "2")) {
          return;
       }
       PLCLogHelper$2 tb = this.b;
       long l = 0;
       if (tb.e - l > 0) {
          PLCLogHelper f = tb.f;
          if (f - l > 0) {
             PLCLogHelper$2 tb1 = this.b;
             tb.f = f - (SystemClock.uptimeMillis() - tb1.e);
             k1.m(tb1.u);
          }
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCLogHelper$2.class, "1")) {
          return;
       }
       PLCLogHelper$2 tb = this.b;
       if (tb.f > 0) {
          tb.e = SystemClock.uptimeMillis();
          tb = this.b;
          k1.r(tb.u, tb.f);
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
