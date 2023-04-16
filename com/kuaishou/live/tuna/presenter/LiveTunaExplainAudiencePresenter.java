package com.kuaishou.live.tuna.presenter.LiveTunaExplainAudiencePresenter;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
import com.kuaishou.live.tuna.presenter.LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import java.lang.Boolean;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;

public final class LiveTunaExplainAudiencePresenter extends BaseLiveTunaExplainPresenter	// class@000fd5
{
    public boolean L;
    public LiveSlidePlayService M;
    public boolean N;
    public LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1 O;
    public static String sLivePresenterClassName = "LiveTunaExplainAudiencePresenter";

    public void LiveTunaExplainAudiencePresenter(){
       super();
       this.O = new LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveTunaExplainAudiencePresenter.class, "3")) {
          return;
       }
       super.E8();
       if (this.N != null) {
          LiveTunaExplainAudiencePresenter tM = this.M;
          if (tM != null) {
             tM.P4(this.O);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveTunaExplainAudiencePresenter.class, "4")) {
          return;
       }
       super.J8();
       if (this.N != null) {
          LiveTunaExplainAudiencePresenter tM = this.M;
          if (tM != null) {
             tM.d5(this.O);
          }
       }
       return;
    }
    public boolean S8(){
       return (this.L ^ 0x01);
    }
    public String W8(){
       return "AUDIENCE";
    }
    public void X8(TunaLiveExplainMessage p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(LiveTunaExplainAudiencePresenter.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, LiveTunaExplainAudiencePresenter.class, "2")) {
          return;
       }
       super.X8(p0, p1, p2);
       this.L = true;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveTunaExplainAudiencePresenter.class, "1")) {
          return;
       }
       super.j8();
       this.M = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       Object obj = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.TYPE);
       a.o(obj, "injectOptionalPrimitive\(¡­Boolean::class.java\n    \)");
       this.N = obj.booleanValue();
       return;
    }
}
