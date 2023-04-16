package com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import tkd.b;
import tkd.d;
import wu5.a;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$a$a;
import n3d.a;

public final class PymkListContactItemPresenter$a implements Runnable	// class@0016b4
{
    public final GifshowActivity b;
    public final PymkListContactItemPresenter c;

    public void PymkListContactItemPresenter$a(GifshowActivity p0,PymkListContactItemPresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, PymkListContactItemPresenter$a.class, "1")) {
          return;
       }
       if (this.c.R8().d()) {
          PymkListContactItemPresenter$a tc = this.c;
          if (tc.H != null) {
             Intent intent = d.a(0x6de3c81e).V7(this.b, this.c.S8());
             a.o(intent, "PluginManager\n          ¡­endActIntent\(it, mPortal\)");
             this.b.t1(intent, 2049, new PymkListContactItemPresenter$a$a(this));
          }else {
             tc.V8();
          }
       }
       PatchProxy.onMethodExit(PymkListContactItemPresenter$a.class, "1");
       return;
    }
}
