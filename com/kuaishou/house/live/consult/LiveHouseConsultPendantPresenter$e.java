package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$e;
import rq5.a;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sg0.b;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import java.lang.Boolean;

public final class LiveHouseConsultPendantPresenter$e extends a	// class@000770
{
    public final LiveHouseConsultPendantPresenter h;

    public void LiveHouseConsultPendantPresenter$e(LiveHouseConsultPendantPresenter p0){
       this.h = p0;
       super();
    }
    public View H(){
       Object[] objArray = null;
       LiveHouseConsultPendantPresenter obj = PatchProxy.apply(objArray, this, LiveHouseConsultPendantPresenter$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.N;
       if (obj != null) {
          objArray = obj.H();
       }
       return objArray;
    }
    public List c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveHouseConsultPendantPresenter$e obj = PatchProxy.apply(null, this, LiveHouseConsultPendantPresenter$e.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(null, obj, LiveHouseConsultPendantPresenter.class, "27");
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
       return LivePendantPriority.HOUSE_CONSULT_PENDANT;
    }
    public int g(){
       return this.h.F;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.HOUSE_CONSULT_PENDANT;
    }
    public void o(boolean p0){
       if (PatchProxy.isSupport(LiveHouseConsultPendantPresenter$e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveHouseConsultPendantPresenter$e.class, "4")) {
          return;
       }
       p0.L = false;
       return;
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHouseConsultPendantPresenter$e.class, "3")) {
          return;
       }
       LiveHouseConsultPendantPresenter$e th = this.h;
       th.L = true;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, LiveHouseConsultPendantPresenter.class, "16")) {
          th.Y8();
       }
       return;
    }
}
