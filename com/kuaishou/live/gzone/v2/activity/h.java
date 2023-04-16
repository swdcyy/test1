package com.kuaishou.live.gzone.v2.activity.h;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import zod.a;
import brd.t;
import t45.d;
import brd.z;
import w53.k0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import android.view.View;
import ekd.m1;
import y43.a;

public class h extends c	// class@001cbf
{
    public a p;
    public Activity q;
    public View r;
    public static String sLivePresenterClassName = "LiveGzoneVideoTextImageViewPresenter";

    public void h(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new k0(this)));
       this.q = this.getActivity();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3cb6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       return;
    }
}
