package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$c;
import rq5.a;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qp3.a;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import java.lang.Boolean;

public final class BaseLiveTunaExplainPresenter$c extends a	// class@000fc1
{
    public final BaseLiveTunaExplainPresenter h;

    public void BaseLiveTunaExplainPresenter$c(BaseLiveTunaExplainPresenter p0){
       this.h = p0;
       super();
    }
    public View H(){
       Object[] objArray = null;
       BaseLiveTunaExplainPresenter obj = PatchProxy.apply(objArray, this, BaseLiveTunaExplainPresenter$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.F;
       if (obj != null) {
          objArray = obj.b();
       }
       return objArray;
    }
    public List c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseLiveTunaExplainPresenter$c obj = PatchProxy.apply(null, this, BaseLiveTunaExplainPresenter$c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(null, obj, BaseLiveTunaExplainPresenter.class, "17");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(LivePendantRelation.MERCHANT_INTERPRET);
          uArrayList.add(LivePendantRelation.SCORE_RANK);
          uArrayList.add(LivePendantRelation.CHAT);
          uArrayList.add(LivePendantRelation.ANSWERING_QUESTION);
          uArrayList.add(LivePendantRelation.PK_CRITICAL_HIT_ANIMATION);
          uArrayList.add(LivePendantRelation.LIVE_PK_RANK);
          uArrayList.add(LivePendantRelation.SCREEN_LANDSCAPE);
          uArrayList.add(LivePendantRelation.LIVE_PK_SMALL_WINDOW);
          uArrayList.add(LivePendantRelation.RECRUIT_INTERPRET);
          uArrayList.add(LivePendantRelation.LOCAL_LIFE_PENDANT);
          uArrayList.add(LivePendantRelation.LOCAL_LIFE_HOT_BUBBLE);
       }
       return uArrayList;
    }
    public LivePendantPriority f(){
       return LivePendantPriority.TUNA_SCENE_PENDANT;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.TUNA_EXPLAIN_PENDANT;
    }
    public void o(boolean p0){
       if (PatchProxy.isSupport(BaseLiveTunaExplainPresenter$c.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseLiveTunaExplainPresenter$c.class, "4")) {
          return;
       }
       p0.A = false;
       return;
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveTunaExplainPresenter$c.class, "3")) {
          return;
       }
       BaseLiveTunaExplainPresenter$c th = this.h;
       th.A = true;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, BaseLiveTunaExplainPresenter.class, "10")) {
          th.Z8();
       }
       return;
    }
}
