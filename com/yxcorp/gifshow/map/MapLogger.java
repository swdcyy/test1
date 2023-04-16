package com.yxcorp.gifshow.map.MapLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Number;
import trb.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import fi5.s;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.map.MapLogger$MoveMapType;
import java.lang.Enum;
import java.util.Objects;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.yxcorp.gifshow.map.MapLogger$MapState;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.map.MapLogger$ClickState;
import com.yxcorp.gifshow.map.MapLogger$CardState;
import com.yxcorp.gifshow.map.MapLogger$CardStatus;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import org.json.JSONObject;
import u5b.b;
import kotlin.NoWhenBranchMatchedException;
import com.kwai.framework.model.user.User;
import lqb.a;
import com.yxcorp.gifshow.map.map.model.MomentFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import kp.w1;
import java.util.List;
import java.lang.Double;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import com.yxcorp.gifshow.map.MapLogger$a;
import java.lang.Runnable;
import t45.c;

public final class MapLogger	// class@001c62
{
    public static final MapLogger a;

    static {
       MapLogger.a = new MapLogger();
    }
    public void MapLogger(){
       super();
    }
    public static final void c(boolean p0,int p1,int p2,int p3,String p4){
       MapLogger mapLogger = MapLogger.class;
       if (PatchProxy.isSupport(mapLogger)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, mapLogger, "14")) {
             return;
          }
       }
       a.p(p4, "refreshType");
       i3 oi3 = i3.f();
       oi3.a("isSuccess", Boolean.valueOf(p0));
       oi3.c("feeds", Integer.valueOf(p1));
       oi3.c("validFeeds", Integer.valueOf(p2));
       oi3.c("errorCode", Integer.valueOf(p3));
       oi3.d("refreshType", p4);
       b.a("KSLocalPhotoMapFeedRequstResult", oi3.e());
       return;
    }
    public static final String d(BaseFeed p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, null, MapLogger.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feed");
       NearbyMapFeed nearbyMapFee = s.a.g(p0);
       if (nearbyMapFee != null) {
          nearbyMapFee = nearbyMapFee.mCardStyle;
          if (nearbyMapFee != 1) {
             if (nearbyMapFee != 2) {
                if (nearbyMapFee != 3) {
                   if (nearbyMapFee != 4) {
                      if (nearbyMapFee != 5) {
                      label_003e :
                         str = "";
                      }else {
                         str = "MAP_OTHER_HUMANOID";
                      }
                   }else {
                      str = "MAP_CIRCLE_POP_CARD";
                   }
                }else {
                   str = "MAP_POP_CARD";
                }
             }else {
                str = "MAP_BIG_CARD";
             }
          }else {
             str = "MAP_SMALL_CARD";
          }
       }else {
          goto label_003e ;
       }
       return str;
    }
    public static final void e(boolean p0,boolean p1,e0 p2){
       if (PatchProxy.isSupport(MapLogger.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, null, MapLogger.class, "25")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MESSAGE_SIDEBAR_LIST";
       i3 oi3 = i3.f();
       oi3.a("is_unread_message", Boolean.valueOf(p0));
       String str = (p1)? "EXPAND": "COLLECT";
       oi3.d("show_status", str);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(p2).setType(1).setDirection(0).setElementPackage(uElementPack).setIsRealTime(0));
       return;
    }
    public static final void f(MapLogger$MoveMapType p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MapLogger.class, "16")) {
          return;
       }
       a.p(p0, "type");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MOVE_MAP_CARD";
       i3 oi3 = i3.f();
       oi3.d("type", p0.name());
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(p1).setType(1).setDirection(0).setElementPackage(uElementPack).setIsRealTime(0));
       return;
    }
    public static final void g(e0 p0,boolean p1){
       MapLogger mapLogger = MapLogger.class;
       if (PatchProxy.isSupport(mapLogger) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, mapLogger, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "NEARBY_TOP_BAR_ROAMING_BUTTON";
       i3 oi3 = i3.f();
       String str = String.valueOf(p1);
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       str = str.toUpperCase();
       a.o(str, "\(this as java.lang.String\).toUpperCase\(\)");
       oi3.d("has_guide_pop", str);
       oi3.d("has_third_tab", "FALSE");
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(p0).setType(1).setDirection(0).setElementPackage(uElementPack).setIsRealTime(0));
       Rubas.f("nearby_map_enter", null, null, null, 14, null);
       return;
    }
    public static final void h(MapLogger$MapState p0,e0 p1,QPhoto p2,MapLogger$ClickState p3,String p4,MapLogger$CardState p5,MapLogger$CardStatus p6,boolean p7){
       MapLogger a;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p5;
       object oobject4 = p6;
       MapLogger mapLogger = MapLogger.class;
       BaseFeed uBaseFeed = null;
       if (PatchProxy.isSupport(mapLogger)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,oobject2,p4,oobject3,oobject4,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, uBaseFeed, mapLogger, "4")) {
             return;
          }
       }
       a.p(p0, "mCurrentState");
       a.p(p1, "iLogPage");
       a.p(oobject2, "clickState");
       a.p(oobject3, "cardState");
       a.p(oobject4, "cardStatus");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PHOTO_CARD";
       a = MapLogger.a;
       BaseFeed uBaseFeed1 = (p2 != null)? p2.getEntity(): uBaseFeed;
       String str = a.a(p0, uBaseFeed1, p4, p3, p5, p6, p7);
       if (str == null) {
          str = "";
       }
       uElementPack.params = str;
       if (p2 != null) {
          uBaseFeed = p2.getEntity();
       }
       ClickMetaData uClickMetaDa = new ClickMetaData().setLogPage(p1).setType(1).setDirection(0).setElementPackage(uElementPack).setContentPackage(a.b(uBaseFeed)).setIsRealTime(0);
       if (p2 != null) {
          uClickMetaDa.setFeedLogCtx(r1.O0(p2.getEntity()));
       }
       u1.B(uClickMetaDa);
       return;
    }
    public static final void i(MapLogger$MapState p0,e0 p1,QPhoto p2,String p3,MapLogger$CardState p4,MapLogger$CardStatus p5,boolean p6){
       MapLogger a;
       String obj1;
       ClientEvent$ElementPackage uElementPack;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       object oobject4 = p5;
       MapLogger mapLogger = MapLogger.class;
       String obj = null;
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       if (PatchProxy.isSupport(mapLogger)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,oobject3,oobject4,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, mapLogger, "3")) {
             return;
          }
       }
       a.p(oobject, "mCurrentState");
       a.p(oobject1, "logPage");
       a.p(oobject3, "cardState");
       a.p(oobject4, "cardStatus");
       a = MapLogger.a;
       QPhoto mEntity = (oobject2 != null)? oobject2.mEntity: obj;
       Objects.requireNonNull(a);
       obj = "";
       if (PatchProxy.isSupport(mapLogger)) {
          Object[] objArray1 = new Object[i];
          objArray1[0] = oobject;
          objArray1[1] = mEntity;
          objArray1[2] = p3;
          objArray1[i3] = oobject3;
          objArray1[i2] = oobject4;
          objArray1[i1] = Boolean.valueOf(p6);
          obj1 = PatchProxy.apply(objArray1, a, mapLogger, "7");
          if (obj1 != PatchProxyResult.class) {
             uElementPack = obj1;
          label_00a5 :
             mapLogger = MapLogger.a;
             QPhoto mEntity1 = (oobject2 != null)? oobject2.mEntity: null;
             u1.D0("2908581", p1, 3, uElementPack, mapLogger.b(mEntity1), null);
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
       uElementPack1.action2 = "PHOTO_CARD";
       uElementPack1.action = 0;
       MapLogger$ClickState uClickState = null;
       mapLogger = a;
       MapLogger$MapState mapState = p0;
       QPhoto qPhoto = mEntity;
       String str = p3;
       MapLogger$CardState uCardState = p4;
       MapLogger$CardStatus uCardStatus = p5;
       try{
          i2 = p6;
          obj1 = mapLogger.a(mapState, qPhoto, str, uClickState, uCardState, uCardStatus, i2);
          if (obj1 == null) {
             obj1 = obj;
          }
          uElementPack1.params = obj1;
       }catch(java.lang.Exception e0){
          uElementPack1.params = obj;
       }
       uElementPack = uElementPack1;
       goto label_00a5 ;
    }
    public static final void j(e0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MapLogger.class, "6")) {
          return;
       }
       a.p(p0, "iLogPage");
       a.p(p1, "tipsType");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TIPS_CARD";
       i3 oi3 = i3.f();
       oi3.d("tips_type", p1);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(p0).setType(1).setDirection(0).setElementPackage(uElementPack).setIsRealTime(0));
       return;
    }
    public static final void k(e0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MapLogger.class, "5")) {
          return;
       }
       a.p(p0, "iLogPage");
       a.p(p1, "tipsType");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TIPS_CARD";
       i3 oi3 = i3.f();
       oi3.d("tips_type", p1);
       uElementPack.params = oi3.e();
       u1.D0("3332454", p0, 3, uElementPack, null, null);
       return;
    }
    public final String a(MapLogger$MapState p0,BaseFeed p1,String p2,MapLogger$ClickState p3,MapLogger$CardState p4,MapLogger$CardStatus p5,boolean p6){
       JSONObject obj;
       String str;
       String id;
       MapLogger mapLogger = MapLogger.class;
       if (PatchProxy.isSupport(mapLogger)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, mapLogger, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new JSONObject();
          int i = b.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      obj.put("card_style", "MAP_MY_HUMANOID_UNSET");
                   }
                }else {
                   obj.put("card_style", "MAP_MY_HUMANOID");
                }
             }else {
                obj.put("card_style", "LIST_CARD");
             }
          }else if(p1 != null){
             obj.put("card_style", MapLogger.d(p1));
          }
          if (p2 != null) {
             obj.put("now_card", p2);
          }
          if (p3 != null) {
             i = b.b[p3.ordinal()];
             p2 = "click_type";
             if (i != 1) {
                if (i == 2) {
                   obj.put(p2, "PULL");
                }else {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                obj.put(p2, "CLICK");
             }
          }
          obj.put("card_state", p4.name());
          obj.put("card_status", p5.name());
          obj.put("is_now_air_bubble", p6);
          str = "passive_user_id";
          if (p1 != null) {
             User user = a.a(p1);
             if (user != null) {
                id = user.getId();
                if (id != null) {
                label_00b6 :
                   obj.put(str, id);
                   str = obj.toString();
                }
             }
          }
          id = "";
          goto label_00b6 ;
       }catch(java.lang.Exception e0){
          str = null;
       }
       return str;
    }
    public final ClientContent$ContentPackage b(BaseFeed p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MapLogger mapLogger = MapLogger.class;
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, mapLogger, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       if (p0 != null) {
          if (p0 instanceof MomentFeed) {
             ClientContent$PhotoPackage photoPackage = PatchProxy.applyOneRefs(p0, this, mapLogger, "9");
             if (photoPackage != patchProxyRe) {
             }else {
                photoPackage = new ClientContent$PhotoPackage();
                int i = 1;
                photoPackage.index = (long)(r1.y1(p0) + i);
                photoPackage.identity = TextUtils.I(s.a.d(p0));
                photoPackage.type = i;
                String str = r1.U1(p0);
                if (str != null) {
                   a.o(str, "it");
                   photoPackage.authorId = Long.parseLong(str);
                   photoPackage.sAuthorId = str;
                }
                CommonMeta uCommonMeta = p0.a(CommonMeta.class);
                photoPackage.expTag = TextUtils.I(uCommonMeta.mExpTag);
                photoPackage.serverExpTag = TextUtils.I(uCommonMeta.mServerExpTag);
                photoPackage.llsid = TextUtils.I(uCommonMeta.mListLoadSequenceID);
             }
             obj.photoPackage = photoPackage;
          }else {
             obj.photoPackage = w1.f(p0);
          }
       }
       return obj;
    }
    public final void l(List p0,Double p1,Double p2,Double p3,Double p4){
       MapLogger mapLogger = MapLogger.class;
       if (PatchProxy.isSupport(mapLogger)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, mapLogger, "23")) {
             return;
          }
       }
       if (p0 != null && p1 != null) {
          p1.doubleValue();
          if (p2 != null) {
             p2.doubleValue();
             if (p3 != null) {
                p3.doubleValue();
                if (p4 != null) {
                   p4.doubleValue();
                   if (!LocalConfigKeyHelper.c()) {
                      return;
                   }else {
                      MapLogger$a uoa = new MapLogger$a(p0, p3, p1, p2, p4);
                      c.a(mapLogger);
                   }
                }
             }
          }
       }
       return;
    }
}
