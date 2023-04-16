package com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.lang.Runnable;
import ekd.k1;

public class PlcEntryLoggerImplPresenter$2 implements DefaultLifecycleObserver	// class@001693
{
    public final PlcEntryLoggerImplPresenter b;

    public void PlcEntryLoggerImplPresenter$2(PlcEntryLoggerImplPresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcEntryLoggerImplPresenter$2.class, "2")) {
          return;
       }
       PlcEntryLoggerImplPresenter$2 tb = this.b;
       long l = 0;
       if (tb.v - l > 0) {
          PlcEntryLoggerImplPresenter w = tb.w;
          if (w - l > 0) {
             PlcEntryLoggerImplPresenter$2 tb1 = this.b;
             tb.w = w - (SystemClock.uptimeMillis() - tb1.v);
             k1.m(tb1.F);
          }
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcEntryLoggerImplPresenter$2.class, "1")) {
          return;
       }
       PlcEntryLoggerImplPresenter$2 tb = this.b;
       if (tb.w > 0) {
          tb.v = SystemClock.uptimeMillis();
          tb = this.b;
          k1.r(tb.F, tb.w);
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
