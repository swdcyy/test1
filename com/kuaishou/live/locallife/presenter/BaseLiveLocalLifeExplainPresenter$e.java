package com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$e;
import rq5.a;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze3.a;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import java.lang.Boolean;

public final class BaseLiveLocalLifeExplainPresenter$e extends a	// class@000c43
{
    public final BaseLiveLocalLifeExplainPresenter h;

    public void BaseLiveLocalLifeExplainPresenter$e(BaseLiveLocalLifeExplainPresenter p0){
       this.h = p0;
       super();
    }
    public View H(){
       Object[] objArray = null;
       BaseLiveLocalLifeExplainPresenter obj = PatchProxy.apply(objArray, this, BaseLiveLocalLifeExplainPresenter$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.P;
       if (obj != null) {
          objArray = obj.b();
       }
       return objArray;
    }
    public List c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseLiveLocalLifeExplainPresenter$e obj = PatchProxy.apply(null, this, BaseLiveLocalLifeExplainPresenter$e.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(null, obj, BaseLiveLocalLifeExplainPresenter.class, "23");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(LivePendantRelation.MERCHANT_INTERPRET);
          uArrayList.add(LivePendantRelation.SCORE_RANK);
          uArrayList.add(LivePendantRelation.PK_CRITICAL_HIT_ANIMATION);
          uArrayList.add(LivePendantRelation.LIVE_PK_RANK);
          uArrayList.add(LivePendantRelation.SCREEN_LANDSCAPE);
          uArrayList.add(LivePendantRelation.LIVE_PK_SMALL_WINDOW);
          uArrayList.add(LivePendantRelation.RECRUIT_INTERPRET);
          uArrayList.add(LivePendantRelation.LOCAL_LIFE_HOT_BUBBLE);
       }
       return uArrayList;
    }
    public LivePendantPriority f(){
       return LivePendantPriority.LOCAL_LIFE_PENDANT;
    }
    public int g(){
       return this.h.C;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.LOCAL_LIFE_PENDANT;
    }
    public void o(boolean p0){
       if (PatchProxy.isSupport(BaseLiveLocalLifeExplainPresenter$e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseLiveLocalLifeExplainPresenter$e.class, "4")) {
          return;
       }
       p0.J = false;
       return;
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveLocalLifeExplainPresenter$e.class, "3")) {
          return;
       }
       BaseLiveLocalLifeExplainPresenter$e th = this.h;
       th.J = true;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, BaseLiveLocalLifeExplainPresenter.class, "12")) {
          th.c9();
       }
       return;
    }
}
