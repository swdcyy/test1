package dz1.a;
import java.lang.Object;
import lnc.i3;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import lnc.a1;
import java.lang.Boolean;
import android.content.res.Resources;
import android.content.res.Configuration;
import xp5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;

public final class a	// class@002070
{

    public void a(){
       super();
    }
    public static i3 a(i3 p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!SystemUtil.I() || (!TextUtils.x(p1) && !TextUtils.x(p2))) {
          p0.d("sub_tab_name", TextUtils.I(p1));
          p0.d("sub_tab_id", TextUtils.I(p2));
          p0.c("sub_tab_index", Integer.valueOf(p3));
          return p0;
       }else {
          throw new RuntimeException("sub tab illegal "+p1+","+p2+","+p3);
       }
    }
    public static i3 b(i3 p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!SystemUtil.I() || (!TextUtils.x(p1) && !TextUtils.x(p2))) {
          p0.d("tab_name", TextUtils.I(p1));
          p0.d("tab_id", TextUtils.I(p2));
          p0.c("tab_index", Integer.valueOf(p3));
          return p0;
       }else {
          throw new RuntimeException("tab illegal "+p1+","+p2+","+p3);
       }
    }
    public static i3 c(String p0,String p1,String p2,String p3,int p4,int p5){
       i3 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, uoa, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       if (p2 != null) {
          a.b(obj, p2, p3, p5);
       }
       return a.a(obj, p0, p1, p4);
    }
    public static ClientContent$ScreenPackage d(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, objArray, uoa, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = ActivityContext.g().e();
       if (!a1.i(obj)) {
          return objArray;
       }
       ClientContent$ScreenPackage screenPackag = new ClientContent$ScreenPackage();
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, uoa, "46");
       int i = 1;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.getResources().getConfiguration().orientation == 2){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          i = 2;
       }
       screenPackag.orientation = i;
       return screenPackag;
    }
    public static int e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (p0.f()) {
          i = 3;
       }else if(p0.g != null){
          i = 2;
       }
       return i;
    }
    public static String f(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.g(true, p0.getLivePlayConfig());
    }
    public static String g(boolean p0,QLivePlayConfig p1){
       String obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uoa, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       if (p1 == null) {
          return obj;
       }else if(p1.mPatternType == 1 && p0){
          QLivePlayConfig mSubType = p1.mSubType;
          if (mSubType == 101) {
             obj = "sports";
          }else if(mSubType == 102){
             obj = "health";
          }
       }else if(p1.isGamePatternType()){
          obj = "game";
       }
       return obj;
    }
    public static void h(String p0,String p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "24")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MEDAL_PANEL_ENSURE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("medal_name", p0);
       oi3.d("medal_id", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       uContentPack.screenPackage = a.d();
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void i(int p0,ClientContent$LiveStreamPackage p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BULLETSCREEN_ENTRANCE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("biz_type", Integer.valueOf(p0));
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u(6, uElementPack, uContentPack);
       return;
    }
    public static void j(ClientContent$LiveStreamPackage p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), null, a.class, "55")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.screenPackage = a.d();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_EVENT_BUBBLE";
       uElementPack.name = TextUtils.k(p1);
       i3 oi3 = i3.f();
       oi3.c("is_with_dot", Integer.valueOf(p3));
       oi3.d("name", uElementPack.name);
       oi3.c("index", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void k(String p0,String p1,String p2,int p3,String p4,String p5,int p6,boolean p7,boolean p8,ClientContent$LiveStreamPackage p9){
       object oobject = p0;
       object oobject1 = p9;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = oobject1;
          if (PatchProxy.applyVoid(objArray, null, uoa, "30")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AGGR_PANEL_SUB_TAB";
       i3 oi3 = a.c(p1, p2, p4, p5, p3, p6);
       String str = (p7)? "switch": "click";
       oi3.d("click_type", str);
       oi3.c("is_with_dot", Integer.valueOf(p8));
       oi3.d("panel_type", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject1;
       uContentPack.screenPackage = a.d();
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void l(int p0,String p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, a.class, "53")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AGGR_PANEL_CONTENT";
       i3 oi3 = i3.f();
       oi3.d("panel_type", p1);
       oi3.c("source", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       uContentPack.screenPackage = a.d();
       u1.u0(10, uElementPack, uContentPack);
       return;
    }
    public static void m(int p0,ClientContent$LiveStreamPackage p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BULLETSCREEN_ENTRANCE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("biz_type", Integer.valueOf(p0));
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
    public static void n(ClientContent$LiveStreamPackage p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), null, a.class, "54")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.screenPackage = a.d();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_EVENT_BUBBLE";
       uElementPack.name = TextUtils.k(p1);
       i3 oi3 = i3.f();
       oi3.c("is_with_dot", Integer.valueOf(p3));
       oi3.d("name", uElementPack.name);
       oi3.c("index", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       u1.u0(5, uElementPack, uContentPack);
       return;
    }
    public static void o(String p0,String p1,int p2,String p3,String p4,int p5,ClientContent$LiveStreamPackage p6,boolean p7,String p8,LiveGzoneTab$TabType p9,String p10,int p11){
       object oobject = p6;
       object oobject1 = p8;
       object oobject2 = p9;
       object oobject3 = p10;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = oobject;
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = oobject1;
          objArray[9] = oobject2;
          objArray[10] = oobject3;
          objArray[11] = Integer.valueOf(p11);
          if (PatchProxy.applyVoid(objArray, null, uoa, "33")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_WATCH_GAMETV_SUB_PANEL";
       i3 oi3 = a.c(p0, p1, p3, p4, p2, p5);
       oi3.d("source", oobject1);
       oi3.c("is_with_dot", Integer.valueOf(p7));
       uElementPack.params = a.q(oi3, oobject2, oobject3, p11).e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject;
       uContentPack.screenPackage = a.d();
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
    public static void p(String p0,String p1,int p2,String p3,String p4,int p5,boolean p6,boolean p7,ClientContent$LiveStreamPackage p8){
       object oobject = p8;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = oobject;
          if (PatchProxy.applyVoid(objArray, null, uoa, "29")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_WATCH_GAMETV_SUB_TAB";
       i3 oi3 = a.c(p0, p1, p3, p4, p2, p5);
       String str = (p6)? "switch": "click";
       oi3.d("click_type", str);
       oi3.c("is_with_dot", Integer.valueOf(p7));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject;
       uContentPack.screenPackage = a.d();
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static i3 q(i3 p0,LiveGzoneTab$TabType p1,String p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, a.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0.d("tab_type", p1.mTypeValue);
       p0.d("link", p2);
       p0.c("game_live_type", Integer.valueOf(p3));
       return p0;
    }
}
