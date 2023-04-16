package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$d;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;

public final class ThanosAdMixBarTKPresenter$d implements g	// class@00157c
{
    public final ThanosAdMixBarTKPresenter b;

    public void ThanosAdMixBarTKPresenter$d(ThanosAdMixBarTKPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdMixBarTKPresenter$d.class, "1")) {
       }else {
          ThanosAdMixBarTKPresenter$d tb = this.b;
          if (tb.F == null) {
             a.o(p0, "it");
             tb.F = p0.booleanValue();
             p0 = this.b;
             if (p0.G != null) {
                p0 = p0.x;
                if (p0 == null || p0.getVisibility()) {
                   this.b.P8();
                }
             }
          }
       }
       return;
    }
}
