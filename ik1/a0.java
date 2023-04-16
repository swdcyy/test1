package ik1.a0;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import mk1.h;
import mk1.b;
import mk1.w;
import java.lang.Number;
import mk1.w$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;
import tk1.b;
import bl1.a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;
import d61.h0;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import q91.a;

public class a0	// class@00291b
{

    public void a0(){
       super();
    }
    public static ClientContent$GiftPackage a(Gift p0,int p1){
       ClientContent$GiftPackage obj;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa0, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$GiftPackage();
       if (p0 != null) {
          obj.type = Long.valueOf(p0.mGiftType).intValue();
          obj.identity = String.valueOf(p0.mId);
          p1++;
          obj.position = p1;
          obj.magicFaceId = p0.mMagicFaceId;
       }
       return obj;
    }
    public static ClientContent$GiftPackage b(Gift p0,boolean p1,int p2,int p3,boolean p4,boolean p5,boolean p6,int p7){
       Object[] objArray;
       Gift obj;
       ClientContent$GiftPackage giftPackage;
       object oobject = p0;
       boolean b = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a0 uoa0 = a0.class;
       int i = 8;
       int i1 = 7;
       int i2 = 6;
       int i3 = 5;
       int i4 = 0;
       if (PatchProxy.isSupport(uoa0)) {
          objArray = new Object[i];
          objArray[i4] = oobject;
          objArray[1] = Boolean.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[i3] = Boolean.valueOf(p5);
          objArray[i2] = Boolean.valueOf(p6);
          objArray[i1] = Integer.valueOf(p7);
          obj = PatchProxy.apply(objArray, null, uoa0, "23");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(uoa0)) {
          objArray = new Object[9];
          objArray[i4] = oobject;
          objArray[1] = Integer.valueOf(p3);
          objArray[2] = Boolean.valueOf(p5);
          objArray[3] = Boolean.valueOf(p1);
          objArray[4] = Boolean.valueOf(p4);
          objArray[i3] = Boolean.valueOf(p6);
          objArray[i2] = Integer.valueOf(p2);
          objArray[i1] = Integer.valueOf(p7);
          objArray[i] = Integer.valueOf(4);
          giftPackage = PatchProxy.apply(objArray, null, uoa0, "22");
          if (giftPackage != patchProxyRe) {
          }else {
          label_0099 :
             giftPackage = new ClientContent$GiftPackage();
             if (oobject != null) {
                giftPackage.identity = String.valueOf(oobject.mId);
                obj = oobject.mMagicFaceId;
                giftPackage.magicFaceId = obj;
                giftPackage.totalCount = p3;
                giftPackage.toAnchor = p5;
                giftPackage.isDrawingGift = b;
                giftPackage.isPacketGift = p4;
                giftPackage.isComboSend = p6;
                giftPackage.position = p2 + 1;
                giftPackage.sourceType = p7;
                giftPackage.giftEntryType = 4;
                if (b) {
                   giftPackage.type = 2;
                }else if(obj > 0){
                   giftPackage.type = 3;
                }else {
                   giftPackage.type = 1;
                }
             }
          }
       }else {
          goto label_0099 ;
       }
       return giftPackage;
    }
    public static ClientContent$ContentPackage c(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, a0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       if (p0 != null) {
          obj.liveStreamPackage = p0;
       }
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.kwaiId = QCurrentUser.me().getId();
       obj.userPackage = userPackage;
       return obj;
    }
    public static ClientContent$MoreInfoPackageV2 d(String p0,int p1,int p2,UserInfo p3,int p4){
       ClientContent$MoreInfoPackageV2 obj;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uoa0, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$MoreInfoPackageV2();
       obj.index = String.valueOf((p1 + 1));
       obj.type = p0;
       obj.id = String.valueOf(p2);
       obj.vlaue = String.valueOf(p4);
       obj.identity = p3.mId;
       return obj;
    }
    public static ClientContent$MoreInfoPackageV2 e(h p0,b p1,int p2,String p3,Integer p4){
       Object obj;
       int i1;
       object oobject = p0;
       object oobject1 = p3;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{oobject,p1,Integer.valueOf(p2),oobject1,p4};
          obj = PatchProxy.apply(objArray, null, uoa0, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = String.valueOf(p4);
       int i = p4.intValue();
       if (PatchProxy.isSupport(w.class)) {
          obj = PatchProxy.applyThreeRefs(p1, p0, Integer.valueOf(i), null, w.class, "16");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else {
          label_0061 :
             i1 = w$a.a[p1.d().ordinal()];
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 != 3) {
                      if (i1 != 4) {
                         if (i1 != 5) {
                            w.s();
                            i1 = -1;
                         }else {
                            i1 = oobject.E.x2(i);
                         }
                      }else {
                         i1 = oobject.D.x2(i);
                      }
                   }else {
                      i1 = oobject.C.x2(i);
                   }
                }else {
                   i1 = oobject.B.x2(i);
                }
             }else {
                i1 = oobject.o.x2(i);
             }
          }
       }else {
          goto label_0061 ;
       }
       moreInfoPack.index = String.valueOf(i1);
       moreInfoPack.vlaue = String.valueOf(p2);
       moreInfoPack.identity = oobject1;
       return moreInfoPack;
    }
    public static void f(e0 p0,boolean p1,String p2,ClientContent$LiveStreamPackage p3,ClientContent$LiveVoicePartyPackageV2 p4){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa0, "3")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_GIFT_USER";
       i3 oi3 = i3.f();
       String str = (p1)? "ALL": "SINGLE";
       oi3.d("item_type", str);
       if (!p1) {
          oi3.d("user_id", p2);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p4;
       uContentPack.liveStreamPackage = p3;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void g(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a0.class, "34")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIFT_PANEL_ICON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.name = p2;
       moreInfoPack.type = h0.a(p1);
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void h(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a0.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SELECT_SEND_GIFT_USER";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.liveStreamPackage = p1;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void i(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,String p3,int p4,int p5,String p6,int p7,int p8){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, null, uoa0, "40")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIFT_PANEL_SELECT_CHILD_GIFT_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("index", Integer.valueOf((p5 + 1)));
       oi3.d("reco_text", p6);
       uElementPack.params = oi3.e();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = String.valueOf(p4);
       moreInfoPack.type = p3;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.identity = String.valueOf(p4);
       giftPackage.position = p8 + 1;
       giftPackage.sourceType = p7;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.giftPackage = giftPackage;
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void j(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,String p3,int p4,int p5,String p6,int p7,int p8){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, null, uoa0, "41")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIFT_PANEL_SELECT_CHILD_GIFT_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("index", Integer.valueOf((p5 + 1)));
       oi3.d("reco_text", p6);
       uElementPack.params = oi3.e();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = String.valueOf(p4);
       moreInfoPack.type = p3;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.identity = String.valueOf(p4);
       giftPackage.position = p8 + 1;
       giftPackage.sourceType = p7;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.giftPackage = giftPackage;
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.moreInfoPackage = moreInfoPack;
       ShowMetaData showMetaData = new ShowMetaData();
       showMetaData.setContentPackage(uContentPack);
       showMetaData.setElementPackage(uElementPack);
       u1.B0(showMetaData);
       return;
    }
    public static void k(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3,int p4,String p5,Map p6,Gift p7,int p8){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, null, uoa0, "28")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 12;
       uElementPack.action2 = "GIFT_ITEM";
       if (p6 != null) {
          uElementPack.params = a.a.q(p6);
       }else {
          b.Z(LiveLogTag.GIFT, "[LiveGiftLogger] [logGiftItemsShownEvent]: params is null");
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.sourceType = p3;
       giftPackage.identity = String.valueOf(p7.mId);
       giftPackage.position = p8;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       uContentPack.moreInfoPackage = moreInfoPack;
       moreInfoPack.index = String.valueOf((p4 + 1));
       moreInfoPack.type = h0.a(p5);
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.giftPackage = giftPackage;
       u1.C0("", p0, 3, uElementPack, uContentPack);
       return;
    }
    public static void l(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3,List p4,int p5,int p6,String p7,Map p8){
       object oobject = p4;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = oobject;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uoa0, "26")) {
             return;
          }
       }
       if (q.f(p4)) {
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          int i = p5 * p6;
          int i1 = p6 + 1;
          i1 = i1 * p5;
          while (i < i1 && i < p4.size()) {
             Gift gift = p4.get(i).getGift();
             if (gift != null) {
                int i2 = i + 1;
                a0.k(p0, p1, p2, p3, p6, p7, p8, gift, i2);
             }
             i = i + 1;
          }
          return;
       }
    }
    public static void m(e0 p0,ClientContent$LiveStreamPackage p1,String p2,ClientContent$LiveVoicePartyPackageV2 p3,int p4){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoa0, "37")) {
             return;
          }
       }
       a0.n(p0, p1, p2, p3, p4, null);
       return;
    }
    public static void n(e0 p0,ClientContent$LiveStreamPackage p1,String p2,ClientContent$LiveVoicePartyPackageV2 p3,int p4,Map p5){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uoa0, "38")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 7;
       uElementPack.action2 = "GIFT_PANEL_TAB";
       if (p5 != null) {
          uElementPack.params = a.a.q(p5);
       }else {
          b.Z(LiveLogTag.GIFT, "[LiveGiftLogger] [logGiftPanelTabShowEvent]: params is null");
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = p2;
       uContentPack.moreInfoPackage = moreInfoPack;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.sourceType = p4;
       uContentPack.giftPackage = giftPackage;
       uContentPack.liveVoicePartyPackage = p3;
       u1.L("", p0, 6, uElementPack, uContentPack);
       return;
    }
    public static void o(e0 p0,ClientContent$LiveStreamPackage p1,String p2,ClientContent$LiveVoicePartyPackageV2 p3,int p4,Map p5){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uoa0, "36")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 7;
       uElementPack.action2 = "GIFT_PANEL_TAB";
       if (p5 != null) {
          uElementPack.params = a.a.q(p5);
       }else {
          b.Z(LiveLogTag.GIFT, "[LiveGiftLogger] [logGiftPanelTabShowEvent]: params is null");
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = p2;
       uContentPack.moreInfoPackage = moreInfoPack;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.sourceType = p4;
       uContentPack.giftPackage = giftPackage;
       uContentPack.liveVoicePartyPackage = p3;
       u1.C0("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void p(ClientContent$LiveStreamPackage p0,Gift p1,int p2){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidThreeRefs(p0, null, Integer.valueOf(p2), null, a0.class, "29")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       uElementPack.action2 = "SEND_GIFT_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
    public static void q(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a0.class, "21")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "expand_gift_dialog";
       uElementPack.action = 885;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void r(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a0.class, "13")) {
          return;
       }
       if (p0 != null) {
          p0.N2().i(true);
       }
       return;
    }
    public static void s(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a0.class, "12")) {
          return;
       }
       if (p0 != null) {
          p0.N2().i(false);
       }
       return;
    }
    public static void t(int p0,ClientContent$LiveStreamPackage p1){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa0, "15")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 7;
       uElementPack.name = String.valueOf(p0);
       uElementPack.action = 803;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void u(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,LiveStreamFeedWrapper p3,Gift p4,int p5,int p6,int p7,int p8,String p9,Map p10){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p10;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = oobject4;
          if (PatchProxy.applyVoid(objArray, null, uoa0, "11")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.name = "select_gift";
       uElementPack.action2 = "SELECT_GIFT";
       uElementPack.params = a.a.q(oobject4);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = a.b(p3, p6);
       ClientContent$GiftPackage giftPackage = a0.a(p4, p5);
       uContentPack.giftPackage = giftPackage;
       giftPackage.sourceType = p7;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       uContentPack.moreInfoPackage = moreInfoPack;
       moreInfoPack.type = h0.a(p9);
       uContentPack.moreInfoPackage.index = String.valueOf((p8 + 1));
       uContentPack.liveStreamPackage = oobject1;
       uContentPack.liveVoicePartyPackage = oobject2;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
}
