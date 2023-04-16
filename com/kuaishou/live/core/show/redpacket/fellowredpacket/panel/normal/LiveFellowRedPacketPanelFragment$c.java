package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$c;
import qvb.f;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ug2.a;
import o02.e;
import p91.m;
import cjd.e;
import erd.o;
import java.lang.Throwable;
import android.widget.TextView;
import xg2.a;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketListResponse;
import la6.b;
import sg2.a;
import java.lang.Number;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import xg2.h;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.lang.Math;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zg2.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.LiveFellowRedPacketLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import hf1.f;
import java.lang.Integer;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import com.kuaishou.live.core.show.common.LiveColorSpanModel;
import va1.l0;
import android.text.style.ForegroundColorSpan;
import m62.f;
import m62.f$a;
import o56.c;
import o56.a;
import android.app.Application;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import xg2.i;
import erd.a;

public class LiveFellowRedPacketPanelFragment$c extends f	// class@000ea2
{
    public final LiveFellowRedPacketPanelFragment p;

    public void LiveFellowRedPacketPanelFragment$c(LiveFellowRedPacketPanelFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketPanelFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h().b(this.p.J.getLiveStreamId(), this.p.O).map(new e());
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketPanelFragment$c.class, "3")) {
          return;
       }
       this.p.I.setVisibility(8);
       LiveFellowRedPacketPanelFragment p = this.p.P;
       if (p != null) {
          p.b();
       }
       return;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(LiveFellowRedPacketListResponse p0,List p1){
       LiveFellowRedPacketPanelFragment obj3;
       LiveGiftPackage liveGiftPack;
       LiveFellowRedPacketPanelFragment$c p1;
       Object[] objArray1;
       LiveFellowRedPacketListResponse obj5;
       f$a a;
       Object[] objArray2;
       Object obj = this;
       LiveFellowRedPacketPanelFragment$c obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, LiveFellowRedPacketPanelFragment$c.class, str)) {
          return;
       }
       super.d2(p0, p1);
       LiveFellowRedPacketPanelFragment$c p = obj.p;
       Object[] objArray = null;
       int i = 0;
       if (p.K < null) {
          if (obj2 != null && a.a(p.O)) {
             obj3 = PatchProxy.apply(objArray, objArray, a.class, str);
             int i1 = (obj3 != patchProxyRe)? obj3.intValue(): a.a.getInt(b.d("user")+"liveFellowRedPacketLastSendGiftPackageId", i);
             obj.p.K = Math.max(y.o(obj2, new h(i1)), i);
          }else {
             obj.p.K = i;
          }
       }
       p = obj.p;
       String str1 = (obj1 == null)? "": obj1.mCurrentRedPackId;
       p.L = str1;
       p.M = TextUtils.x(obj1.mCurrentRedPackId) ^ 1;
       obj.p.T.k(obj1.mRuleUrl);
       b.a0(LiveFellowRedPacketLogTag.LIVE_FELLOW_RED_PACKET, "red packet list load success", c.j("mCurrentRedPackId", TextUtils.k(obj.p.L)));
       p = obj.p;
       Objects.requireNonNull(p);
       String str2 = "11";
       if (!PatchProxy.applyVoidOneRefs(obj1, p, LiveFellowRedPacketPanelFragment.class, str2) && p.G != null) {
          if (!q.f(obj1.mGuideDescriptionTextList)) {
             p.G.setVisibility(i);
             p.G.setTextColor(a1.a(R.color.arg_RES_7f061da4));
             obj3 = p.G;
             obj5 = obj1.mGuideDescriptionTextList;
             f uof1 = f.class;
             if (!PatchProxy.applyVoidTwoRefs(obj3, obj5, objArray, uof1, str2) && !q.f(obj5)) {
                int currentTextC = obj3.getCurrentTextColor();
                if (PatchProxy.isSupport(uof1)) {
                   objArray2 = PatchProxy.applyTwoRefs(obj5, Integer.valueOf(currentTextC), objArray, uof1, "12");
                   if (objArray2 != patchProxyRe) {
                   }else if(q.f(obj5)){
                      objArray2 = objArray;
                   }else {
                      objArray2 = new SpannableStringBuilder();
                      Iterator iterator = obj5.iterator();
                      while (iterator.hasNext()) {
                         LiveColorSpanModel liveColorSpa = iterator.next();
                         int i6 = objArray2.length();
                         objArray2.append(liveColorSpa.mText);
                         int i7 = objArray2.length();
                         int i8 = l0.l(liveColorSpa.mColor);
                         if (!i8) {
                            i8 = currentTextC;
                         }
                         objArray2.setSpan(new ForegroundColorSpan(i8), i6, i7, 33);
                         LiveColorSpanModel liveColorSpa1 = 1;
                      }
                   }
                }else {
                   goto label_00fd ;
                }
                if (objArray2 != null) {
                   obj3.setText(objArray2);
                }
             }
          }else {
             p.G.setVisibility(8);
          }
       }
       p = obj.p;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(obj1, p, LiveFellowRedPacketPanelFragment.class, "12") && p.H != null) {
          if (!TextUtils.x(obj1.mRuleDescription)) {
             p.H.setVisibility(i);
             p.H.setText(obj1.mRuleDescription);
          }else {
             p.H.setVisibility(8);
          }
       }
       p = obj.p;
       Objects.requireNonNull(p);
       if (PatchProxy.applyVoidOneRefs(obj1, p, LiveFellowRedPacketPanelFragment.class, "13") || p.F == null) {
          liveGiftPack = null;
       }else {
          f uof = f.class;
          liveGiftPack = null;
          f$a obj4 = PatchProxy.apply(liveGiftPack, liveGiftPack, uof, str);
          if (obj4 != patchProxyRe) {
          }else {
             obj4 = f.a();
             obj5 = PatchProxy.applyOneRefs(obj4, liveGiftPack, uof, "3");
             if (obj5 != patchProxyRe) {
                obj4 = obj5;
             }else {
                a = obj4.a;
                obj4 = obj4.b;
                int i4 = obj4 % 10;
                int i5 = (i4 >= 9)? (obj4 + (i4 - 10)) + 10: obj4 + (i4 - 10);
                if (i5 >= 60) {
                   a = a + 1;
                   if (a > 23) {
                      a = 0;
                   }
                   i5 = i5 - 60;
                }
                obj4 = new f$a(a, i5, i);
             }
          }
          int i3 = 2;
          if (!TextUtils.x(obj1.mGrabTimeDescription)) {
             objArray1 = new Object[i3];
             objArray1[i] = Integer.valueOf(obj4.a);
             objArray1[1] = Integer.valueOf(obj4.b);
             p.F.setText(String.format(obj1.mGrabTimeDescription, objArray1));
          }else {
             objArray1 = new Object[i3];
             objArray1[i] = Integer.valueOf(obj4.a);
             objArray1[1] = Integer.valueOf(obj4.b);
             p.F.setText(a.a().a().getString(R.string.arg_RES_7f102ba7, objArray1));
          }
       }
       p1 = obj.p;
       if (p1.N == null) {
          p1.I.setVisibility(i);
          p1 = obj.p;
          obj3 = p1.I;
          String str3 = (p1.M != null)? a1.p(R.string.arg_RES_7f1021c9): a1.p(R.string.arg_RES_7f1021df);
          obj3.setText(str3);
          LiveFellowRedPacketPanelFragment i2 = obj.p.I;
          if (!q.f(obj1.mLiveGiftPackages)) {
             i = true;
          }
          i2.setEnabled(i);
          if (obj.p.P != null && !q.f(p1)) {
             obj.p.P.b();
             i2 = obj.p.K;
             if (i2 >= null && i2 < p1.size()) {
                liveGiftPack = obj2.get(obj.p.K);
             }
             if (liveGiftPack != null) {
                obj.p.P.a(liveGiftPack.mTotalKsCoin);
             }
          }
       }
    label_0287 :
       if (p0.isNoAuthoritySendRedPacket()) {
          obj1 = obj.p;
          if (obj1.R == null) {
             obj1.R = true;
             if (!obj1.T.g()) {
                obj.p.T.j(new i(obj));
             }
          }
       }
       return;
    }
}
