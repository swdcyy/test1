package com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import android.content.Context;
import f4a.i;
import f4a.d0;
import f4a.l;
import android.app.Activity;

public class ApkDownloadHelper$1 implements DefaultLifecycleObserver	// class@001667
{
    public final ApkDownloadHelper b;

    public void ApkDownloadHelper$1(ApkDownloadHelper p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApkDownloadHelper$1.class, "2")) {
          return;
       }
       this.b.h();
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ApkDownloadHelper$1.class, str)) {
          return;
       }
       ApkDownloadHelper$1 tb = this.b;
       if (tb.j.f(tb.e, tb.d.getPackageName())) {
          this.b.f(d0.d);
          tb = this.b;
          tb.e("5", tb.d.getTitle());
          tb = this.b;
          tb.c("5", tb.d.getActionIconUrl());
          this.b.f.L(4);
       }else {
          tb = this.b;
          if (tb.j.c(tb.d.getDownloadUrl())) {
             this.b.f(d0.c);
             tb = this.b;
             tb.c("4", tb.d.getActionIconUrl());
             tb = this.b;
             tb.e("4", tb.d.getTitle());
             this.b.f.L(3);
          }else {
             tb = this.b;
             if (tb.j.b(tb.d.getDownloadUrl(), this.b.d.getPackageName(), this.b.e)) {
                tb = this.b;
                tb.f(tb.d.getActionLabel());
                tb = this.b;
                tb.c(str, tb.d.getActionIconUrl());
                tb = this.b;
                tb.e(str, tb.d.getTitle());
                tb = this.b;
                tb.h = 0;
                tb.f.L(0);
             }
          }
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
