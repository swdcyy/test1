package com.yxcorp.gifshow.detail.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import brd.t;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import y4a.g;
import erd.g;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import vnc.a;
import io.reactivex.g;
import vnc.b;
import erd.a;
import y4a.h;
import im8.f;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends PresenterV2	// class@0016d1
{
    public f p;
    public QPhoto q;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.X7(HeadsetPlugMonitor.c(a.b(), true).doOnNext(new g(this)).subscribe());
       Application uApplication = a.b();
       AtomicReference uAtomicRefer = new AtomicReference();
       this.X7(t.create(new a(uAtomicRefer, uApplication)).doOnDispose(new b(uApplication, uAtomicRefer)).subscribe(new h(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.x8("DETAIL_USE_EARPHONE");
       this.q = this.q8(QPhoto.class);
       return;
    }
}
