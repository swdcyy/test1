package com.kuaishou.live.common.core.component.pendant.pendantgroup.d;
import cw1.n0;
import cw1.u;
import cw1.y;
import cw1.v;
import cw1.t;
import cw1.z;
import cw1.w;
import cw1.x;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.d$a;
import java.lang.Enum;
import cw1.m0;
import java.lang.Boolean;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import aq5.b;
import lp3.e;
import p91.m;
import hz1.a;
import lp3.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import lnc.l1;
import oq5.c;
import jv1.b;
import ty1.c;
import ty1.b;

public class d extends n0	// class@001719
{
    public m c;
    public b d;
    public final b e;
    public final b f;
    public final b g;
    public final b h;
    public final c i;
    public final b j;
    public final b k;

    public void d(){
       super();
       this.e = new u(this);
       this.f = new y(this);
       this.g = new v(this);
       this.h = new t(this);
       this.i = new z(this);
       this.j = new w(this);
       this.k = new x(this);
    }
    public void c(LivePendantRelation p0){
       m0 om0;
       a[] obj;
       d tc;
       d tc1;
       LivePendantRelation obj1;
       Object obj2;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       LivePendantRelation livePendantR = 1;
       boolean b = false;
       switch (d$a.a[p0.ordinal()]){
           case 1:
             if (!PatchProxy.applyVoid(null, this, uod, "5")) {
                tc1 = this.c;
                if (tc1 != null) {
                   a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW,AudienceBizRelation.CHAT_VIDEO_VIEW,AudienceBizRelation.CHAT_CENTER_STATUS_VIEW};
                   tc1.A0().u5(this.f, uoaArray);
                }
             }
             om0 = this.b();
             livePendantR = LivePendantRelation.CHAT;
             obj = PatchProxy.apply(null, this, uod, "13");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                tc = this.c;
                if (tc != null && !tc.A0().r2(AudienceBizRelation.CHAT_CENTER_STATUS_VIEW)) {
                   b = this.g();
                }
             }
             om0.a(livePendantR, b);
             break;
           case 2:
             om0 = this.b();
             livePendantR = LivePendantRelation.VOICE_PARTY_SCENE;
             obj1 = PatchProxy.apply(null, this, uod, "15");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                tc = this.c;
                if (tc != null) {
                   b = tc.A0().r2(AudienceBizRelation.VOICE_PARTY);
                }
             }
             om0.a(livePendantR, b);
             if (!PatchProxy.applyVoid(null, this, uod, "9")) {
                tc1 = this.c;
                if (tc1 != null && tc1.w() != null) {
                   this.c.w().b(this.h);
                }
             }
             break;
           case 3:
             om0 = this.b();
             obj1 = LivePendantRelation.PK_CRITICAL_HIT_ANIMATION;
             obj2 = PatchProxy.apply(null, this, uod, "16");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else {
                tc = this.c;
                b1 = (tc == null)? false: tc.A0().r2(AudienceBizRelation.PK_GIFT_MOMENT);
             }
             om0.a(obj1, b1);
             if (!PatchProxy.applyVoid(null, this, uod, "7")) {
                tc1 = this.c;
                if (tc1 != null) {
                   obj = new a[livePendantR];
                   obj[b] = AudienceBizRelation.PK_GIFT_MOMENT;
                   tc1.A0().u5(this.g, obj);
                }
             }
             break;
           case 4:
             om0 = this.b();
             livePendantR = LivePendantRelation.SCREEN_LANDSCAPE;
             Object obj3 = PatchProxy.apply(null, this, uod, "17");
             if (obj3 != patchProxyRe) {
                b1 = obj3.booleanValue();
             }else {
                tc = this.c;
                b1 = (tc == null || tc.b() == null)? l1.a(): y.d(this.c.b().getActivity());
             }
             om0.a(livePendantR, b1);
             if (!PatchProxy.applyVoid(null, this, uod, "11")) {
                tc1 = this.d;
                if (tc1 != null) {
                   tc1.H6(this.i);
                }
             }
             break;
           case 5:
             this.b().a(LivePendantRelation.LIVE_PK, this.h());
             if (!PatchProxy.applyVoid(null, this, uod, "18")) {
                tc1 = this.c;
                if (tc1 != null) {
                   obj = new a[livePendantR];
                   obj[b] = AudienceBizRelation.PK;
                   tc1.A0().u5(this.j, obj);
                }
             }
             break;
           case 6:
             this.b().a(LivePendantRelation.RECRUIT_EXPLAIN, this.i());
             if (!PatchProxy.applyVoid(null, this, uod, "24")) {
                tc1 = this.c;
                if (tc1 != null) {
                   obj = new a[livePendantR];
                   obj[b] = AudienceBizRelation.RECRUIT_EXPLAIN_PANEL;
                   tc1.A0().u5(this.k, obj);
                }
             }
             break;
           case 7:
             om0 = this.b();
             obj1 = LivePendantRelation.GZONE_LIVE;
             Object obj4 = PatchProxy.apply(null, this, uod, "22");
             if (obj4 != patchProxyRe) {
                b1 = obj4.booleanValue();
             }else {
                tc = this.c;
                if (tc == null || !tc.t5().a(a.class).ci()) {
                   livePendantR = 0;
                }
                LivePendantRelation livePendantR1 = livePendantR;
             }
             om0.a(obj1, b1);
             break;
           case 8:
             om0 = this.b();
             obj1 = LivePendantRelation.MERCHANT_FAST_PAY_BUBBLE;
             obj2 = PatchProxy.apply(null, this, uod, "23");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else {
                tc = this.c;
                b1 = (tc != null && tc.A0().r2(AudienceBizRelation.MERCHANT_FAST_PAY_BUBBLE))? true: false;
             }
             om0.a(obj1, b1);
             if (!PatchProxy.applyVoid(null, this, uod, "3")) {
                tc1 = this.c;
                if (tc1 != null) {
                   obj = new a[livePendantR];
                   obj[b] = AudienceBizRelation.MERCHANT_FAST_PAY_BUBBLE;
                   tc1.A0().u5(this.e, obj);
                }
             }
             break;
           default:
       }
    label_0224 :
       return;
    }
    public void d(LivePendantRelation p0){
       d tc;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "2")) {
          return;
       }
       a[] uoaArray = 1;
       Object[] objArray = null;
       switch (d$a.a[p0.ordinal()]){
           case 1:
             if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
                tc = this.c;
                if (tc != null) {
                   uoaArray = new a[0];
                   tc.A0().G5(this.f, uoaArray);
                }
             }
             break;
           case 2:
             if (!PatchProxy.applyVoid(objArray, this, uod, "10")) {
                tc = this.c;
                if (tc != null && tc.w() != null) {
                   this.c.w().a(this.h);
                }
             }
             break;
           case 3:
             if (!PatchProxy.applyVoid(objArray, this, uod, "8")) {
                tc = this.c;
                if (tc != null) {
                   uoaArray = new a[0];
                   tc.A0().G5(this.g, uoaArray);
                }
             }
             break;
           case 4:
             if (!PatchProxy.applyVoid(objArray, this, uod, "12")) {
                tc = this.d;
                if (tc != null) {
                   tc.Q0(this.i);
                }
             }
             break;
           case 5:
             if (!PatchProxy.applyVoid(objArray, this, uod, "19")) {
                tc = this.c;
                if (tc != null) {
                   uoaArray = new a[uoaArray];
                   uoaArray[0] = AudienceBizRelation.PK;
                   tc.A0().G5(this.j, uoaArray);
                }
             }
             break;
           case 6:
             if (!PatchProxy.applyVoid(objArray, this, uod, "25")) {
                tc = this.c;
                if (tc != null) {
                   uoaArray = new a[uoaArray];
                   uoaArray[0] = AudienceBizRelation.RECRUIT_EXPLAIN_PANEL;
                   tc.A0().G5(this.k, uoaArray);
                }
             }
             break;
           case 8:
             if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
                tc = this.c;
                if (tc != null) {
                   uoaArray = new a[0];
                   tc.A0().G5(this.e, uoaArray);
                }
             }
             break;
           default:
       }
    label_00d6 :
       return;
    }
    public final boolean g(){
       d obj = PatchProxy.apply(null, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (!obj.A0().r2(AudienceBizRelation.CHAT) && (!this.c.A0().r2(AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW) && (this.c.A0().r2(AudienceBizRelation.CHAT_VIDEO_VIEW) || this.c.A0().r2(AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW)))) {
          b = true;
       }
       return b;
    }
    public final boolean h(){
       d obj = PatchProxy.apply(null, this, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null && obj.A0().r2(AudienceBizRelation.PK))? true: false;
       return b;
    }
    public final boolean i(){
       d obj = PatchProxy.apply(null, this, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null && obj.A0().r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL))? true: false;
       return b;
    }
}
