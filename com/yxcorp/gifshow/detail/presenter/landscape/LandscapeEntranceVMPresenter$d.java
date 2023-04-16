package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$d;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rf5.u;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import e5a.a;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.LandscapeEntrance;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.SerialOpLandscapeEntrance;
import io.reactivex.subjects.PublishSubject;
import nsd.u;

public final class LandscapeEntranceVMPresenter$d implements g	// class@0016e3
{
    public final LandscapeEntranceVMPresenter b;

    public void LandscapeEntranceVMPresenter$d(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LandscapeEntranceVMPresenter$d.class, "1")) {
       }else if(!LandscapeEntranceVMPresenter.S8(this.b).v()){
          LandscapeEntranceVMPresenter.S8(this.b).l();
          PatchProxy.onMethodExit(LandscapeEntranceVMPresenter$d.class, "1");
       }else {
          p0 = this.b.w;
          if (p0 != null) {
             p0 = p0.getNasaSlideParam();
             if (p0 != null) {
                boolean b = true;
                if (p0.isSerialStyle() == b) {
                   p0 = this.b.F;
                   if (p0 != null) {
                      p0.onNext(new a(LandscapeEntrance.SCREEN, false, b, SerialOpLandscapeEntrance.COLLECTION_DETAIL_PAGE));
                   }
                }else {
                label_004d :
                   p0 = this.b.F;
                   if (p0 != null) {
                      a uoa = new a(LandscapeEntrance.SCREEN, false, false, null, 14, null);
                      p0.onNext(v9);
                   }
                }
             }else {
                goto label_004d ;
             }
          }else {
             goto label_004d ;
          }
          PatchProxy.onMethodExit(LandscapeEntranceVMPresenter$d.class, "1");
       }
       return;
    }
}
