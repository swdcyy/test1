package com.kuaishou.live.common.core.component.pendant.pendantgroup.b;
import cw1.n0;
import cw1.c;
import cw1.g;
import cw1.d;
import cw1.e;
import cw1.f;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.b$a;
import java.lang.Enum;
import cw1.m0;
import aq5.d;
import fq5.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.b;
import java.lang.Boolean;
import ty1.c;
import p91.m;
import ty1.b;

public class b extends n0	// class@001716
{
    public m c;
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final b h;

    public void b(){
       super();
       this.d = new c(this);
       this.e = new g(this);
       this.f = new d(this);
       this.g = new e(this);
       this.h = new f(this);
    }
    public void c(LivePendantRelation p0){
       boolean b;
       b tc;
       a[] uoaArray;
       m0 om0;
       LivePendantRelation pK_CRITICAL_;
       Object obj;
       boolean b1;
       b tc1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       int i = b$a.a[p0.ordinal()];
       b = 3;
       String str = 2;
       int i1 = 0;
       if (i != 1) {
          if (i != str) {
             if (i != b) {
                if (i != 4) {
                   if (i == 5) {
                      this.b().a(LivePendantRelation.RECRUIT_EXPLAIN, this.i());
                      if (!PatchProxy.applyVoid(null, this, uob, "17")) {
                         tc = this.c;
                         if (tc != null) {
                            uoaArray = new a[]{AnchorBizRelation.RECRUIT_EXPLAIN_PANEL};
                            tc.A0().u5(this.h, uoaArray);
                         }
                      }
                   }
                }else {
                   this.b().a(LivePendantRelation.LIVE_PK, this.h());
                   if (!PatchProxy.applyVoid(null, this, uob, "13")) {
                      tc = this.c;
                      if (tc != null) {
                         uoaArray = new a[]{AnchorBizRelation.PK};
                         tc.A0().u5(this.g, uoaArray);
                      }
                   }
                }
             }else {
                om0 = this.b();
                pK_CRITICAL_ = LivePendantRelation.PK_CRITICAL_HIT_ANIMATION;
                obj = PatchProxy.apply(null, this, uob, "12");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   tc1 = this.c;
                   b1 = (tc1 == null)? false: tc1.A0().r2(AnchorBizRelation.PK_GIFT_MOMENT);
                }
                om0.a(pK_CRITICAL_, b1);
                if (!PatchProxy.applyVoid(null, this, uob, "7")) {
                   tc = this.c;
                   if (tc != null) {
                      uoaArray = new a[]{AnchorBizRelation.PK_GIFT_MOMENT};
                      tc.A0().u5(this.f, uoaArray);
                   }
                }
             }
          }else {
             om0 = this.b();
             pK_CRITICAL_ = LivePendantRelation.VOICE_PARTY_SCENE;
             obj = PatchProxy.apply(null, this, uob, "11");
             if (obj != patchProxyRe) {
                i1 = obj.booleanValue();
             }else {
                tc1 = this.c;
                if (tc1 != null) {
                   i1 = tc1.A0().r2(AnchorBizRelation.VOICE_PARTY);
                }
             }
             om0.a(pK_CRITICAL_, i1);
             if (!PatchProxy.applyVoid(null, this, uob, "5")) {
                tc = this.c;
                if (tc != null && tc.w() != null) {
                   this.c.w().b(this.d);
                }
             }
          }
       }else {
          om0 = this.b();
          LivePendantRelation cHAT = LivePendantRelation.CHAT;
          Object obj1 = PatchProxy.apply(null, this, uob, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             tc1 = this.c;
             b1 = (tc1 == null || tc1.A0().r2(AnchorBizRelation.CHAT_CENTER_VIEW))? false: this.g();
          }
          om0.a(cHAT, b1);
          if (!PatchProxy.applyVoid(null, this, uob, "3")) {
             tc = this.c;
             if (tc != null) {
                uoaArray = new a[b];
                uoaArray[i1] = AnchorBizRelation.CHAT_BETWEEN_ANCHORS;
                uoaArray[1] = AnchorBizRelation.CHAT_WITH_GUEST;
                uoaArray[str] = AnchorBizRelation.CHAT_CENTER_VIEW;
                tc.A0().u5(this.e, uoaArray);
             }
          }
       }
    label_0160 :
       return;
    }
    public void d(LivePendantRelation p0){
       b tc;
       a[] uoaArray;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       int i = b$a.a[p0.ordinal()];
       int i1 = 1;
       Object[] objArray = null;
       if (i != i1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5 && !PatchProxy.applyVoid(objArray, this, uob, "18")) {
                      tc = this.c;
                      if (tc != null) {
                         uoaArray = new a[i1];
                         uoaArray[0] = AnchorBizRelation.RECRUIT_EXPLAIN_PANEL;
                         tc.A0().G5(this.h, uoaArray);
                      }
                   }
                }else if(PatchProxy.applyVoid(objArray, this, uob, "14")){
                   tc = this.c;
                   if (tc != null) {
                      uoaArray = new a[i1];
                      uoaArray[0] = AnchorBizRelation.PK;
                      tc.A0().G5(this.g, uoaArray);
                   }
                }
             }else if(PatchProxy.applyVoid(objArray, this, uob, "8")){
                tc = this.c;
                if (tc != null) {
                   uoaArray = new a[0];
                   tc.A0().G5(this.f, uoaArray);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, this, uob, "6")){
             tc = this.c;
             if (tc != null && tc.w() != null) {
                this.c.w().a(this.d);
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, uob, "4")){
          tc = this.c;
          if (tc != null) {
             uoaArray = new a[0];
             tc.A0().G5(this.e, uoaArray);
          }
       }
       return;
    }
    public final boolean g(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       b = false;
       if (obj == null) {
          return b;
       }
       if (obj.A0().r2(AnchorBizRelation.CHAT_BETWEEN_ANCHORS) || this.c.A0().r2(AnchorBizRelation.CHAT_WITH_GUEST)) {
          b = true;
       }
       return b;
    }
    public final boolean h(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       b = (obj != null && obj.A0().r2(AnchorBizRelation.PK))? true: false;
       return b;
    }
    public final boolean i(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       b = (obj != null && obj.A0().r2(AnchorBizRelation.RECRUIT_EXPLAIN_PANEL))? true: false;
       return b;
    }
}
