package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$a$a;
import x49.q;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter;
import java.lang.Throwable;
import yx.j0;

public final class ThanosAdTopTagTKPresenter$a$a implements q	// class@001583
{
    public final ThanosAdTopTagTKPresenter$a a;

    public void ThanosAdTopTagTKPresenter$a$a(ThanosAdTopTagTKPresenter$a p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdTopTagTKPresenter$a$a.class, "2")) {
          return;
       }
       a.p(p0, "e");
       j0.b(this.a.b.s, "onRenderFailed ", p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ThanosAdTopTagTKPresenter$a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f(this.a.b.s, "onRenderSuccess", objArray);
       return;
    }
}
