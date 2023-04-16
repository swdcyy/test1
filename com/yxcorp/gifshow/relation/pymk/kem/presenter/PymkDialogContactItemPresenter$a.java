package com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter;
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
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$a$a;
import n3d.a;

public final class PymkDialogContactItemPresenter$a implements Runnable	// class@00193f
{
    public final GifshowActivity b;
    public final PymkDialogContactItemPresenter c;

    public void PymkDialogContactItemPresenter$a(GifshowActivity p0,PymkDialogContactItemPresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, PymkDialogContactItemPresenter$a.class, "1")) {
          return;
       }
       if (this.c.R8().d()) {
          PymkDialogContactItemPresenter$a tc = this.c;
          if (tc.A != null) {
             Intent intent = d.a(0x6de3c81e).V7(this.b, this.c.q);
             a.o(intent, "PluginManager\n          ¡­endActIntent\(it, mPortal\)");
             this.b.t1(intent, 2049, new PymkDialogContactItemPresenter$a$a(this));
          }else {
             tc.S8();
          }
       }
       PatchProxy.onMethodExit(PymkDialogContactItemPresenter$a.class, "1");
       return;
    }
}
