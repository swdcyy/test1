package com.yxcorp.gifshow.detail.plc.helper.ApkStatusHelper;
import java.lang.String;
import lnc.a1;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import o4a.b;
import f4a.i;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.helper.ApkStatusHelper$1;
import f4a.m;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.c;
import brd.t;
import t45.d;
import brd.z;
import f4a.e;
import com.yxcorp.gifshow.detail.plc.helper.d;
import erd.g;
import android.content.Context;

public class ApkStatusHelper	// class@00166d
{
    public b a;
    public Fragment b;
    public Activity c;
    public PlcEntryDataAdapter d;
    public i e;
    public b f;
    public final LifecycleObserver g;
    public static final String h;
    public static final String i;

    static {
       ApkStatusHelper.h = a1.p(0x7f1016d0);
       ApkStatusHelper.i = a1.p(0x7f103ce5);
    }
    public void ApkStatusHelper(PlcEntryDataAdapter p0,Activity p1,Fragment p2,b p3,i p4){
       super();
       ApkStatusHelper$1 u1 = new ApkStatusHelper$1(this);
       this.g = u1;
       this.d = p0;
       this.c = p1;
       this.b = p2;
       this.a = p3;
       this.e = p4;
       m.g(p0.getDownloadUrl(), p0.getFileName());
       this.b.getLifecycle().addObserver(u1);
       if (PatchProxy.applyVoid(null, this, ApkStatusHelper.class, "4")) {
       }else {
          b9.a(this.f);
          this.f = RxBus.f.f(c.class).observeOn(d.a).subscribe(new e(this), d.b);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ApkStatusHelper.class, "3")) {
          return;
       }
       this.b();
       this.b.getLifecycle().removeObserver(this.g);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ApkStatusHelper.class, "5")) {
          return;
       }
       b9.a(this.f);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ApkStatusHelper.class, "2")) {
          return;
       }
       if (this.e.f(this.c, this.d.getPackageName())) {
          this.a.a(ApkStatusHelper.i);
       }else if(this.e.c(this.d.getDownloadUrl())){
          this.a.a(ApkStatusHelper.h);
       }else if(this.e.b(this.d.getDownloadUrl(), this.d.getPackageName(), this.c)){
          this.a.a(this.d.getActionLabel());
       }
       return;
    }
}
