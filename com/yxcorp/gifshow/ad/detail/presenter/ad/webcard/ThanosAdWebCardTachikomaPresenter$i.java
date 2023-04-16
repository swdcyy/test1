package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$i;
import y49.h;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import vz8.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ToggleState;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$i$a;
import erd.g;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.PageStatus;
import java.lang.StringBuilder;
import yx.j0;

public final class ThanosAdWebCardTachikomaPresenter$i implements h	// class@001623
{
    public final ThanosAdWebCardTachikomaPresenter a;

    public void ThanosAdWebCardTachikomaPresenter$i(ThanosAdWebCardTachikomaPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(ThanosAdWebCardTachikomaPresenter$i.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, ThanosAdWebCardTachikomaPresenter$i.class, "3")) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter b = this.a.B;
       if (b == null) {
          a.S("mCardToggleStateSubject");
       }
       b.onNext(new g(ToggleState.TOGGLE_STATE_CARD_TO_INFO, p2, p3));
       QPhoto mEntity = ThanosAdWebCardTachikomaPresenter.R8(this.a).mEntity;
       if (mEntity != null) {
          i0.a().e(141, mEntity).d(new ThanosAdWebCardTachikomaPresenter$i$a(p0, p1)).a();
       }
       this.a.Z8();
       return;
    }
    public void b(PageStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdWebCardTachikomaPresenter$i.class, "2")) {
          return;
       }
       a.p(p0, "newStatus");
       this.a.H = p0.mStatus;
       Object[] objArray = new Object[0];
       j0.f("TachikomaWebCard", "onBind\(\) changePageStatus newStatus "+p0, objArray);
       return;
    }
    public void c(int p0){
       ThanosAdWebCardTachikomaPresenter$i oi = ThanosAdWebCardTachikomaPresenter$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "1")) {
          return;
       }
       this.a.d9(p0);
       this.a.Z8();
       return;
    }
}
