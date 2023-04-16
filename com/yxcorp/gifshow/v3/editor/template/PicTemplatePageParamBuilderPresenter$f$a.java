package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$f$a;
import brd.y;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$f;
import crd.a;
import brd.v;
import java.util.concurrent.CountDownLatch;
import java.lang.Float;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.List;
import brd.g;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import crd.b;

public final class PicTemplatePageParamBuilderPresenter$f$a implements y	// class@001301
{
    public final int b;
    public final PicTemplatePageParamBuilderPresenter$f c;
    public final a d;
    public final v e;
    public final CountDownLatch f;
    public final Float[] g;

    public void PicTemplatePageParamBuilderPresenter$f$a(int p0,PicTemplatePageParamBuilderPresenter$f p1,a p2,v p3,CountDownLatch p4,Float[] p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoidWithListener(null, this, PicTemplatePageParamBuilderPresenter$f$a.class, "5")) {
          return;
       }
       PicTemplatePageParamBuilderPresenter$f$a te = this.e;
       PicTemplatePageParamBuilderPresenter$f$a tg = this.g;
       int i = 0;
       double d = (double)i;
       int len = tg.length;
       for (; i < len; i = i + 1) {
          d = d + (double)tg[i].floatValue();
       }
       te.onNext(Float.valueOf((float)(d / (double)this.c.b.size())));
       if (!this.f.getCount()) {
          this.e.onComplete();
       }
       PatchProxy.onMethodExit(PicTemplatePageParamBuilderPresenter$f$a.class, "5");
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoidWithListener(null, this, PicTemplatePageParamBuilderPresenter$f$a.class, "3")) {
          return;
       }
       this.f.countDown();
       this.g[this.b] = Float.valueOf(0x3f800000);
       this.a();
       PatchProxy.onMethodExit(PicTemplatePageParamBuilderPresenter$f$a.class, "3");
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PicTemplatePageParamBuilderPresenter$f$a.class, "2")) {
          return;
       }
       a.p(p0, "e");
       this.e.onError(p0);
       PatchProxy.onMethodExit(PicTemplatePageParamBuilderPresenter$f$a.class, "2");
       return;
    }
    public void onNext(Object p0){
       float f = p0.floatValue();
       if (!PatchProxy.isSupport2(PicTemplatePageParamBuilderPresenter$f$a.class, "4") || !PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(f), this, PicTemplatePageParamBuilderPresenter$f$a.class, "4")) {
          this.g[this.b] = Float.valueOf(f);
          this.a();
          PatchProxy.onMethodExit(PicTemplatePageParamBuilderPresenter$f$a.class, "4");
       }
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PicTemplatePageParamBuilderPresenter$f$a.class, "1")) {
          return;
       }
       a.p(p0, "d");
       this.d.c(p0);
       PatchProxy.onMethodExit(PicTemplatePageParamBuilderPresenter$f$a.class, "1");
       return;
    }
}
