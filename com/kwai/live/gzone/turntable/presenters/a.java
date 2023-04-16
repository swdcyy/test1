package com.kwai.live.gzone.turntable.presenters.a;
import h47.b;
import com.kwai.live.gzone.turntable.presenters.c;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import k67.b;
import k67.e$a;
import k67.g;
import k67.p;
import com.kwai.framework.model.user.QCurrentUser;
import u37.h;
import u37.e;
import fq5.b;
import brd.t;
import cjd.e;
import erd.o;
import o77.e;
import com.kwai.live.gzone.turntable.presenters.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o77.a;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import aq5.d;

public final class a implements b	// class@000e5a
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final void a(LiveGzoneConfigResponse p0){
       c t;
       a ta = this.a;
       c uoc = c.class;
       ta.G = p0;
       int i = 1;
       Object[] objArray = null;
       if (p0.mEnableShowLiveTurntable == null) {
          if (!PatchProxy.applyVoid(objArray, ta, uoc, "9")) {
             t = ta.t;
             if (t != null) {
                t.ec(LiveGzoneAudienceFeatureEntranceItem.TURN_TABLE.mEntranceId, 0);
             }
             if (!PatchProxy.applyVoid(objArray, ta, uoc, "10")) {
                t = ta.C;
                if (t != null) {
                   ta.w.sg(t, 8);
                }
             }
          }
       }else {
          ta.w.p4(ta.P);
          if (!PatchProxy.applyVoid(objArray, ta, uoc, "7")) {
             ta.V8();
             t = ta.t;
             if (t != null) {
                t.ec(LiveGzoneAudienceFeatureEntranceItem.TURN_TABLE.mEntranceId, i);
             }
             if (!PatchProxy.applyVoid(objArray, ta, uoc, "8")) {
                ta.w.sg(ta.C, 0);
             }
          }
          if (QCurrentUser.me().isLogined() && !PatchProxy.applyVoid(objArray, ta, uoc, "11")) {
             ta.X7(e.d().a(ta.r.getLiveStreamId()).map(new e()).subscribe(new e(ta), b.b));
          }
       }
    label_009e :
       if (ta.I == null) {
          ta.I = new a(ta);
       }
       a[] uoaArray = new a[i];
       uoaArray[0] = AudienceBizRelation.RED_PACK_RAIN_ING;
       ta.y.u5(ta.I, uoaArray);
       return;
    }
}
