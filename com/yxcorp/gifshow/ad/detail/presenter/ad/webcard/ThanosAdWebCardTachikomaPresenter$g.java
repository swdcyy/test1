package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import java.lang.Object;
import a59.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import java.util.List;
import java.lang.Integer;
import s09.a;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class ThanosAdWebCardTachikomaPresenter$g implements g	// class@001620
{
    public final ThanosAdWebCardTachikomaPresenter b;

    public void ThanosAdWebCardTachikomaPresenter$g(ThanosAdWebCardTachikomaPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdWebCardTachikomaPresenter$g.class, "1")) {
       }else {
          ThanosAdWebCardTachikomaPresenter$g tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, ThanosAdWebCardTachikomaPresenter.class, "13") || (!tb.h9(tb.J) && p0.a().contains(Integer.valueOf(2)))) {
             if (p0.b()) {
                tb.j9(0);
             }else {
                p0 = tb.E;
                if (p0 != null) {
                   p0.post(new a(tb));
                }
             }
          }
       }
       return;
    }
}
