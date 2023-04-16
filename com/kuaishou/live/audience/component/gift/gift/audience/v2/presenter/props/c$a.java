package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c$a;
import vg1.m;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import b01.n;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lz0.c;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import d61.h0;
import k2b.u1;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import mk1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.e0;
import mk1.h;
import cl1.c;
import java.util.Collection;
import ekd.q;
import java.util.List;

public class c$a extends m	// class@000b5b
{
    public final c e;

    public void c$a(c p0){
       this.e = p0;
       super();
    }
    public void b(GiftPanelItem p0,int p1,boolean p2,View p3,boolean p4){
       ClientEvent$ElementPackage uElementPack;
       ClientContent$GiftPackage giftPackage;
       ClientContent$MoreInfoPackageV2 moreInfoPack;
       Object obj = this;
       object oobject = p0;
       int i = p1;
       c uoc = c.class;
       c$a uoa = c$a.class;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 0;
       String str = "1";
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i1];
          objArray[i5] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[i4] = Boolean.valueOf(p2);
          objArray[i3] = p3;
          objArray[i2] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, obj, uoa, str)) {
             return;
          }
       }
       b.c0(LiveLogTag.LIVE_PROPS, "onItemSelected", "index", Integer.valueOf(p1));
       uoa = obj.e;
       Objects.requireNonNull(uoa);
       n on = n.class;
       if (!PatchProxy.applyVoidOneRefs(oobject, uoa, uoc, "14")) {
          ClientContent$LiveVoicePartyPackageV2 obj1 = null;
          LiveProp liveProp = (oobject == null)? obj1: oobject.mProp;
          if (liveProp != null) {
             c t = uoa.T;
             if (t == null || !TextUtils.n(t.mPropId, liveProp.mPropId)) {
                int i6 = 6;
                if (liveProp.mIsWearable != null) {
                   ClientContent$LiveStreamPackage liveStreamPa = uoa.w.Z2.a();
                   if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, liveProp, obj1, on, str)) {
                      ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                      uElementPack1.action2 = "GIFT_PANEL_PROP_USE_BUTTON";
                      i3 oi3 = i3.f();
                      String str1 = (liveProp.isUsed())? "DISUSE": "USE";
                      oi3.d("btn_type", str1);
                      oi3.d("type", String.valueOf(liveProp.mPropType));
                      uElementPack1.params = oi3.toString();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      ClientContent$GiftPackage giftPackage1 = new ClientContent$GiftPackage();
                      giftPackage1.identity = h0.a(liveProp.mPropId);
                      giftPackage1.position = liveProp.mPropPosition;
                      uContentPack.giftPackage = giftPackage1;
                      u1.u0(i6, uElementPack1, uContentPack);
                   }
                }
                BaseFragment uBaseFragmen = uoa.w.Z2.b();
                ClientContent$LiveStreamPackage liveStreamPa1 = uoa.w.Z2.a();
                obj1 = uoa.w.Z2.y();
                int i7 = uoa.B.i();
                i1 = uoa.q.getCurrentPosition() + 1;
                if (PatchProxy.isSupport(on)) {
                   Object[] objArray1 = new Object[i6];
                   objArray1[i5] = uBaseFragmen;
                   objArray1[1] = liveStreamPa1;
                   objArray1[i4] = obj1;
                   objArray1[i3] = Integer.valueOf(i7);
                   objArray1[4] = liveProp;
                   objArray1[5] = Integer.valueOf(i1);
                   if (!PatchProxy.applyVoid(objArray1, null, on, "4")) {
                   }
                }else {
                }
             }
          }
          uoa.T = liveProp;
          uoa.v.t.d();
       }
       obj.e.q9(i);
       if (!obj.e.q.c()) {
          obj.e.x9();
       }else {
          c$a e = obj.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.isSupport(uoc) || (PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), e, uoc, "10") || (q.f(e.S) || (i < e.S.size() && e.S.get(i) != null)))) {
             n.a(e.w.Z2.b(), e.S.get(i), e.w.Z2.a(), e.w.Z2.y(), e.B.i(), (i + 1));
          }
       }
       return;
    }
}
