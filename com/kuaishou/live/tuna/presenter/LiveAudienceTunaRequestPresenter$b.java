package com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter$b;
import erd.g;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter;
import java.lang.Object;
import com.kuaishou.live.tuna.model.LiveTunaPreRequestResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.k;
import tj3.e;
import aq3.l;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter$onLiveBind$2$1;
import java.util.List;
import msd.a;
import c15.b;

public final class LiveAudienceTunaRequestPresenter$b implements g	// class@000fce
{
    public final LiveAudienceTunaRequestPresenter b;

    public void LiveAudienceTunaRequestPresenter$b(LiveAudienceTunaRequestPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       k ok;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTunaRequestPresenter$b.class, "1")) {
       }else {
          LiveAudienceTunaRequestPresenter n = this.b.N;
          if (n != null) {
             ok = n.x();
             if (ok != null) {
                ok.X("KEY_TUNA_PRE_REQUEST_FINISHED");
             }
          }
          LiveTunaPreRequestResponse mData = (p0 != null)? p0.mData: null;
          if (mData != null) {
             n = this.b.N;
             if (n != null) {
                ok = n.x();
                if (ok != null) {
                   ok.X("TunaPreRequestFinished");
                }
             }
             this.b.a9().a().onNext(p0.mData);
          }else {
             b.g(this.b.O, LiveAudienceTunaRequestPresenter$onLiveBind$2$1.INSTANCE);
          }
       }
       return;
    }
}
