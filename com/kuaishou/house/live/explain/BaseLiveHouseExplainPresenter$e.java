package com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$e;
import rq5.a;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vg0.c;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import java.lang.Boolean;

public final class BaseLiveHouseExplainPresenter$e extends a	// class@00077f
{
    public final BaseLiveHouseExplainPresenter h;

    public void BaseLiveHouseExplainPresenter$e(BaseLiveHouseExplainPresenter p0){
       this.h = p0;
       super();
    }
    public View H(){
       Object[] objArray = null;
       BaseLiveHouseExplainPresenter obj = PatchProxy.apply(objArray, this, BaseLiveHouseExplainPresenter$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.Q;
       if (obj != null) {
          objArray = obj.b();
       }
       return objArray;
    }
    public List c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseLiveHouseExplainPresenter$e obj = PatchProxy.apply(null, this, BaseLiveHouseExplainPresenter$e.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(null, obj, BaseLiveHouseExplainPresenter.class, "25");
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
       }
       return uArrayList;
    }
    public LivePendantPriority f(){
       return LivePendantPriority.LOCAL_LIFE_PENDANT;
    }
    public int g(){
       return this.h.D;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.LOCAL_LIFE_PENDANT;
    }
    public void o(boolean p0){
       if (PatchProxy.isSupport(BaseLiveHouseExplainPresenter$e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseLiveHouseExplainPresenter$e.class, "4")) {
          return;
       }
       p0.J = false;
       return;
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveHouseExplainPresenter$e.class, "3")) {
          return;
       }
       BaseLiveHouseExplainPresenter$e th = this.h;
       th.J = true;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, BaseLiveHouseExplainPresenter.class, "13")) {
          th.a9();
       }
       return;
    }
}
