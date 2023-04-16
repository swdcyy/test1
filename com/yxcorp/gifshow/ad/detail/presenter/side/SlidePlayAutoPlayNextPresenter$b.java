package com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$b;
import jta.c;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import java.util.BitSet;
import jta.b;
import java.lang.Boolean;
import im8.f;

public class SlidePlayAutoPlayNextPresenter$b implements c	// class@001699
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
       uob = this.a;
       Objects.requireNonNull(uob);
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       if (!PatchProxy.isSupport(slidePlayAut) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), uob, slidePlayAut, "2")) {
          if (p0 || (uob.Z != null || (!p0 - 0x3f800000 && uob.Z == null))) {
             SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus eNABLE = ((uob.Y8() - uob.W8()) - 3000 > 0)? SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE: SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.CURRENT_POSITION_DISABLE;
             uob.W = eNABLE;
             uob.T.clear(2);
             uob.d9();
          }else {
             uob.T.set(2);
             uob.e9();
          }
       }
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       if (PatchProxy.isSupport(SlidePlayAutoPlayNextPresenter$b.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlidePlayAutoPlayNextPresenter$b.class, "2")) {
          return;
       }
       this.a.e9();
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
