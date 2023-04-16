package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$b;
import jta.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import jta.b;
import java.lang.Boolean;
import im8.f;

public class SlidePlayAutoPlayNextPresenter$b implements c	// class@0018c3
{
    public final SlidePlayAutoPlayNextPresenter a;

    public void SlidePlayAutoPlayNextPresenter$b(SlidePlayAutoPlayNextPresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       SlidePlayAutoPlayNextPresenter$b uob = SlidePlayAutoPlayNextPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.a.y9(p0);
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       if (PatchProxy.isSupport(SlidePlayAutoPlayNextPresenter$b.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlidePlayAutoPlayNextPresenter$b.class, "2")) {
          return;
       }
       this.a.G9();
       return;
    }
    public void d(float p0){
       SlidePlayAutoPlayNextPresenter$b uob = SlidePlayAutoPlayNextPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.C.set(Boolean.FALSE);
       p0.X = 1;
       return;
    }
}
