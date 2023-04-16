package com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.camera.record.base.b;
import ce9.l;
import ng9.d;
import yf9.b;
import com.yxcorp.gifshow.camera.record.CameraLogger$VideoRecStartType;
import java.lang.StringBuilder;
import tkd.b;
import tkd.d;
import om6.r;
import org.json.JSONObject;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProductionEditOperationPackage;
import java.lang.Long;
import voc.m;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEncodingDetailPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoSegmentPackage;
import km6.d;
import android.app.Activity;
import android.content.res.Configuration;
import java.lang.Float;
import lnc.q4;
import com.kwai.feature.post.api.util.g;
import q87.c;
import java.lang.Math;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import eh9.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFaceShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import kuaishou.perf.page.impl.d;
import android.view.View;
import zb9.k;
import zb9.k$a;
import fg6.a;
import com.yxcorp.gifshow.camera.record.CameraLogger$e;
import com.google.gson.Gson;
import com.yxcorp.gifshow.prettify.beauty.h$a;
import com.yxcorp.gifshow.prettify.beauty.h;
import java.lang.Enum;
import com.yxcorp.gifshow.camera.record.CameraLogger$c;
import com.yxcorp.gifshow.camera.record.CameraLogger$d;

public final class CameraLogger	// class@001c91
{
    public static long a = 0x0;
    public static float b = 0.428571;
    public static float c = 0.600000;

    public void CameraLogger(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CameraLogger.class, "32")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("light_boost_enabled", Boolean.TRUE);
       uElementPack.params = jsonObject.toString();
       u1.u(1, uElementPack, null);
       return;
    }
    public static String b(String p0,String p1,String p2,int p3,String p4,boolean p5){
       i3 obj;
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, uCameraLogge, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          obj = i3.f();
          obj.d("ai_record_type", p0);
          obj.d("ai_record_id", p1);
          obj.d("ai_record_name", p2);
          obj.c("ai_record_index", Integer.valueOf(p3));
          obj.d("ai_func_type", p4);
          if (p5) {
             obj.a("is_follow_shot", Boolean.TRUE);
          }
          return obj.e();
       }else {
          return null;
       }
    }
    public static String c(boolean p0){
       String str = (p0)? "mediamuxer": "ffmpeg";
       return str;
    }
    public static int d(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CameraLogger.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.d(l.i).c != null) {
          return 1;
       }
       if (p0.d(d.b).a != null) {
          return 2;
       }
       if (p0.d(b.b).a != null) {
          return 5;
       }
       return 0;
    }
    public static ClientEvent$ElementPackage e(int p0,CameraLogger$VideoRecStartType p1,boolean p2,boolean p3){
       ClientEvent$ElementPackage obj;
       if (PatchProxy.isSupport(CameraLogger.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, CameraLogger.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action = p0;
       obj.name = p1.mElementName;
       p0 = 1;
       obj.type = p0;
       obj.index = p2 ^ 0x01;
       if (!p3) {
          p0 = 2;
       }
       obj.status = p0;
       return obj;
    }
    public static String f(int p0,int p1){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uCameraLogge, "13");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       String str = "photo";
       if (p1 == 1) {
          if (5 == p0) {
             return str;
          }else {
             return "camera"+(d.a(-831446984).uK(p0) / 1000);
          }
       }else {
          p0 = 0;
          switch (p1){
              case 1:
              case 6:
              case 8:
                if (PatchProxy.isSupport(uCameraLogge)) {
                   str1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), null, uCameraLogge, "14");
                   if (str1 != patchProxyRe) {
                   label_00bc :
                      return str1;
                   }
                }
                if (p1 != 6) {
                   if (p1 == 8) {
                      p0 = 4;
                   }
                }else {
                   p0 = 2;
                }
                str1 = "camera"+(d.a(-831446984).uK(p0) / 1000);
                goto label_00bc ;
                break;
              case 2:
                return "live";
              case 3:
                return "k_song";
              case 5:
                return str;
              case 10:
                return "mood";
              case 11:
                return "library";
              case 12:
                return "camera"+(d.a(-831446984).uK(p0) / 1000);
              case 14:
                return "draft";
              case 15:
                return "imagetext";
              case 16:
              case 17:
                return "activity";
              default:
             label_004c :
                return "";
          }
       }
    }
    public static String g(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CameraLogger.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "forbid";
       }
       String str = (p0.booleanValue())? "on": "off";
       return str;
    }
    public static String h(){
       JSONObject obj = PatchProxy.apply(null, null, CameraLogger.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("use_ai_record", true);
          return obj.toString();
       }catch(org.json.JSONException e0){
          a.D().e("CameraLogger", "error", e0);
          return v1;
       }
    }
    public static void i(int p0,String p1){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uCameraLogge, "21")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       uElementPack.name = p1;
       u1.u(1, uElementPack, null);
       return;
    }
    public static void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CameraLogger.class, "20")) {
          return;
       }
       CameraLogger.k(p0, -1);
       return;
    }
    public static void k(String p0,int p1){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uCameraLogge, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 406;
       if (p0 != null) {
          uElementPack.name = p0;
       }
       if (p1 != -1) {
          uElementPack.index = p1;
       }
       u1.u(1, uElementPack, null);
       return;
    }
    public static void l(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, CameraLogger.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       u1.M("", p1, 1, uElementPack, null, null);
       return;
    }
    public static void m(String p0){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, uCameraLogge, "5")) {
          return;
       }
       if (!PatchProxy.isSupport(uCameraLogge) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(6), p0, null, uCameraLogge, "6") && !TextUtils.x(p0))) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = p0;
          u1.u0(6, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
    public static void n(int p0,int p1,String p2,String p3,String p4,e0 p5){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uCameraLogge, "12")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 406;
       uElementPack.name = p2;
       uElementPack.params = TextUtils.k(p3);
       uElementPack.type = 1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ProductionEditOperationPackage productionEd = new ClientContent$ProductionEditOperationPackage();
       uContentPack.productionEditOperationPackage = productionEd;
       productionEd.type = p0;
       productionEd.params = p4;
       u1.M("", p5, p1, uElementPack, uContentPack, null);
       return;
    }
    public static void o(long p0){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uCameraLogge, "26")) {
          return;
       }
       d.a(0x27ab2faf).DO(8, 440, p0, new ClientContent$ContentPackage(), "code:-2,msg:video or buffer file lost", null);
       return;
    }
    public static void onZoomEvent(int p0,int p1){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uCameraLogge, "34")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 2;
       uElementPack.name = "zoom_slider";
       uElementPack.value = (double)p0;
       uElementPack.action = 406;
       u1.u(p1, uElementPack, null);
       return;
    }
    public static void p(a p0,long p1,String p2){
       int i1;
       if (PatchProxy.isSupport(CameraLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, null, CameraLogger.class, "27")) {
          return;
       }
       int i = 0;
       if (("mediamuxer").equals(p2)) {
          i1 = 1;
       }else if(("ffmpeg").equals(p2)){
          i1 = 2;
       }else {
          i1 = 0;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$VideoEncodingDetailPackage videoEncodin = new ClientContent$VideoEncodingDetailPackage();
       a f = p0.f;
       if (f != null) {
          ClientContent$VideoSegmentPackage[] videoSegment = new ClientContent$VideoSegmentPackage[f.size()];
          for (; i < p0.f.size(); i = i + 1) {
             d uod = p0.f.get(i);
             ClientContent$VideoSegmentPackage videoSegment1 = new ClientContent$VideoSegmentPackage();
             videoSegment1.duration = (long)uod.a;
             videoSegment1.avgFps = uod.c;
             videoSegment1.maxFps = uod.d;
             videoSegment1.minFps = uod.e;
             videoSegment1.encodeType = i1;
             videoSegment1.height = p0.b;
             videoSegment1.width = p0.a;
             videoSegment[i] = videoSegment1;
          }
          videoEncodin.encodeSegmentPackage = videoSegment;
          videoEncodin.encodeType = i1;
          uContentPack.videoEncodingDetailPackage = videoEncodin;
       }
       d.a(0x27ab2faf).DO(7, 440, p1, uContentPack, "success", null);
       return;
    }
    public static void q(){
       if (PatchProxy.applyVoid(null, null, CameraLogger.class, "23")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "UHD_CAMERA";
       u1.u0(6, uElementPack, null);
       return;
    }
    public static void r(e0 p0,boolean p1){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uCameraLogge, "56")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_ENTRANCE_ICON";
       i3 oi3 = i3.f();
       String str = (p1)? "on": "off";
       oi3.d("status", str);
       uElementPack.params = oi3.e();
       u1.L(null, p0, 1, uElementPack, null);
       return;
    }
    public static void s(e0 p0,boolean p1){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uCameraLogge, "55")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_ENTRANCE_ICON";
       i3 oi3 = i3.f();
       String str = (p1)? "on": "off";
       oi3.d("status", str);
       uElementPack.params = oi3.e();
       u1.C0(null, p0, 6, uElementPack, null);
       return;
    }
    public static float t(Activity p0,Configuration p1,boolean p2,float p3){
       Configuration obj;
       float f1;
       float f2;
       Object[] objArray;
       if (PatchProxy.isSupport(CameraLogger.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Float.valueOf(p3), null, CameraLogger.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (p1 == null) {
          return p3;
       }else {
          obj = p1.screenWidthDp;
          float f = 0;
          if (obj != null) {
             Configuration screenHeight = p1.screenHeightDp;
             if (screenHeight != null) {
                f = (float)obj;
                f1 = (float)screenHeight;
                f2 = f1;
                f1 = f;
                f = q4.d(5, (double)(f / f1));
             label_0043 :
                a uoa = (g.m(p0) || g.n(p0))? 1: null;
                if (!uoa && (!p2 && (f - CameraLogger.b > 0 && f - CameraLogger.c < 0))) {
                   objArray = new Object[0];
                   a.D().w("CameraLogger", "logScreenRatio return, ratio:"+f, objArray);
                   return f;
                }else if(!p2 && Math.abs((p3 - f)) - 0x38d1b717 < 0){
                   objArray = new Object[0];
                   a.D().w("CameraLogger", "logScreenRatio return, sameRatio:"+f, objArray);
                   return f;
                }else {
                   i3 oi3 = i3.f();
                   oi3.c("ratio", Float.valueOf(f));
                   oi3.c("screenWidthDp", Float.valueOf(f1));
                   oi3.c("screenHeightDp", Float.valueOf(f2));
                   oi3.c("densityDpi", Integer.valueOf(p1.densityDpi));
                   oi3.a("isInMultiWindowMode", Boolean.valueOf(uoa));
                   oi3.a("isFinishing", Boolean.valueOf(p2));
                   String str = oi3.e();
                   Object[] objArray1 = new Object[0];
                   a.D().w("CameraLogger", "logScreenRatio, params:"+str, objArray1);
                   PostUtils.x("record_screen_ratio", str);
                   return f;
                }
             }
          }
          f1 = 0;
          f2 = 0;
          goto label_0043 ;
       }
    }
    public static void u(int p0,int p1,MagicEmoji$MagicFace p2,n p3,e0 p4,String p5){
       object oobject = p2;
       object oobject1 = p5;
       CameraLogger uCameraLogge = CameraLogger.class;
       ClientContent$ContentPackage uContentPack = null;
       if (PatchProxy.isSupport(uCameraLogge)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),oobject,p3,p4,oobject1};
          if (PatchProxy.applyVoid(objArray, uContentPack, uCameraLogge, "15")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = oobject1;
       uElementPack.name = CameraLogger.f(p0, p1);
       uElementPack.index = 1;
       if (oobject != null) {
          uContentPack = new ClientContent$ContentPackage();
          ClientContent$MagicFaceShowPackage magicFaceSho = new ClientContent$MagicFaceShowPackage();
          uContentPack.magicFaceShowPackage = magicFaceSho;
          ClientContent$MagicFacePackage[] magicFacePac = new ClientContent$MagicFacePackage[1];
          magicFaceSho.magicFacePackage = magicFacePac;
          ClientContent$MagicFacePackage magicFacePac1 = new ClientContent$MagicFacePackage();
          magicFacePac1.name = oobject.mName;
          magicFacePac1.id = oobject.mId;
          magicFacePac1.segmentIndex = oobject.mRowIndex;
          magicFacePac1.index = oobject.mColumnIndex;
          magicFacePac1.magicFaceParams = TextUtils.k(oobject.mTag);
          int i = (TextUtils.x(oobject.mGroupId))? -1: Integer.parseInt(oobject.mGroupId);
          magicFacePac1.groupId = i;
          MagicEmoji$MagicFace mMagicFaceIc = oobject.mMagicFaceIconTipMsg;
          if (mMagicFaceIc != null) {
             magicFacePac1.showCoverTag = oobject.mShouldShowMagicFaceTip;
             magicFacePac1.strategyId = String.valueOf(mMagicFaceIc.mStrategyId);
          }
          MagicEmoji$MagicFace mRequestId = oobject.mRequestId;
          if (mRequestId != null) {
             magicFacePac1.reqId = mRequestId;
          }
          uContentPack.magicFaceShowPackage.magicFacePackage[0] = magicFacePac1;
       }
       Object obj = uContentPack;
       if (p3 != null && !TextUtils.x(p3.getRightTopText())) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("button_up_text", p3.getRightTopText());
          uElementPack.params = jsonObject.toString();
       }
       u1.M("", p4, 1, uElementPack, obj, null);
       return;
    }
    public static void v(){
       if (PatchProxy.applyVoid(null, null, CameraLogger.class, "37")) {
          return;
       }
       long l = 0;
       if (CameraLogger.a - l <= 0) {
          Object[] objArray = new Object[0];
          a.D().w("CameraLogger", "invalid startTime ", objArray);
          CameraLogger.a = l;
          return;
       }else {
          d.d("postCameraOpenMonitor").h("cameraFragmentCreateToFirstFrame");
          d.d("postCameraOpenMonitor").c();
          return;
       }
    }
    public static void w(int p0,int p1,View p2,boolean p3,boolean p4,String p5,MagicEmoji$MagicFace p6,Boolean p7,boolean p8,boolean p9,String p10,k p11,e0 p12){
       Object[] objArray;
       boolean b;
       String str;
       String str1;
       int i1;
       String str2;
       String str3;
       String str4;
       object oobject = p2;
       object oobject1 = p6;
       object oobject2 = p11;
       CameraLogger uCameraLogge = CameraLogger.class;
       int i = 0;
       if (PatchProxy.isSupport(uCameraLogge)) {
          objArray = new Object[13];
          objArray[i] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = oobject1;
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = p10;
          objArray[11] = oobject2;
          objArray[12] = p12;
          if (PatchProxy.applyVoid(objArray, null, uCameraLogge, "4")) {
             return;
          }
       }
       CameraLogger$VideoRecStartType tag = (p2.getTag() instanceof CameraLogger$VideoRecStartType)? p2.getTag(): CameraLogger$VideoRecStartType.SingleClickRecord;
       ClientEvent$ElementPackage uElementPack = CameraLogger.e(p0, tag, p3, p4);
       SimpleMagicFace simpleMagicF = (oobject1 != null)? oobject1.mId: null;
       if (oobject2 != null && oobject2 != k.l.a()) {
          b = p11.i();
          str = p11.a();
          str1 = p11.c();
          i1 = p11.b();
          str2 = p11.d();
          str3 = p11.f();
       }else {
          str3 = "";
          str2 = null;
          str = str2;
          str1 = str;
          i1 = 0;
          b = false;
       }
       Gson a = a.a;
       if (p8) {
          str4 = (p9)? "on": "off";
       }else {
          str4 = "forbid";
       }
       CameraLogger$e uoe = new CameraLogger$e(str4, CameraLogger.g(p7), null, p5, p1, null, simpleMagicF, str2, str, str1, i1, str3, b, p10);
       uElementPack.params = a.q(objArray);
       h$a uoa = new h$a();
       uoa.e(oobject1);
       ClientContent$ContentPackage uContentPack = h.c(uoa);
       u1.M("1942", p12, 1, uElementPack, uContentPack, 0);
       oobject.setTag(null);
       return;
    }
    public static void x(int p0,int p1,View p2,boolean p3,boolean p4,String p5,MagicEmoji$MagicFace p6,Boolean p7,String p8,k p9,boolean p10,e0 p11,String p12){
       SimpleMagicFace simpleMagicF1;
       boolean b;
       String str;
       String str1;
       int i1;
       String str2;
       String str3;
       object oobject = p2;
       object oobject1 = p6;
       object oobject2 = p9;
       CameraLogger uCameraLogge = CameraLogger.class;
       int i = 0;
       if (PatchProxy.isSupport(uCameraLogge)) {
          Object[] objArray = new Object[13];
          objArray[i] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = oobject1;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = oobject2;
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = p11;
          objArray[12] = p12;
          if (PatchProxy.applyVoid(objArray, null, uCameraLogge, "2")) {
             return;
          }
       }
       CameraLogger$VideoRecStartType tag = (p2.getTag() instanceof CameraLogger$VideoRecStartType)? p2.getTag(): CameraLogger$VideoRecStartType.SingleClickRecord;
       ClientEvent$ElementPackage uElementPack = CameraLogger.e(p0, tag, p3, i);
       if (tag.equals(CameraLogger$VideoRecStartType.LongClickRecord)) {
          SimpleMagicFace simpleMagicF = (oobject1 != null)? oobject1.mId: null;
          CameraLogger$c uoc = new CameraLogger$c(CameraLogger.g(p7), p8, p4, p5, p1, Boolean.valueOf(p3), simpleMagicF, p12);
          uElementPack.params = a.a.q(tag);
       }else if(oobject1 != null){
          simpleMagicF1 = oobject1.mId;
       }else {
          simpleMagicF1 = null;
       }
       if (oobject2 != null && oobject2 != k.l.a()) {
          b = p9.i();
          str = p9.a();
          str1 = p9.c();
          i1 = p9.b();
          str2 = p9.d();
          str3 = p9.f();
       }else {
          str3 = "";
          str2 = null;
          str = str2;
          str1 = str;
          i1 = 0;
          b = false;
       }
       CameraLogger$d uod = new CameraLogger$d(CameraLogger.g(p7), p8, p5, p1, Boolean.valueOf(p3), simpleMagicF1, str2, str, str1, i1, str3, b, p10, p12);
       uElementPack.params = a.a.q(tag);
       h$a uoa = new h$a();
       uoa.e(oobject1);
       ClientContent$ContentPackage uContentPack = h.c(uoa);
       u1.M("", p11, 1, uElementPack, uContentPack, 0);
       oobject.setTag(null);
       return;
    }
    public static void y(int p0,String p1){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uCameraLogge, "30")) {
          return;
       }
       CameraLogger.z(p0, p1, null);
       return;
    }
    public static void z(int p0,String p1,String p2){
       CameraLogger uCameraLogge = CameraLogger.class;
       if (PatchProxy.isSupport(uCameraLogge) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, CameraLogger.class, "31")) {
          return;
       }
       if (PatchProxy.isSupport(uCameraLogge)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(1),Integer.valueOf(1),p2};
          if (PatchProxy.applyVoid(objArray, null, uCameraLogge, "29")) {
          label_005e :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       uElementPack.name = p1;
       uElementPack.type = 1;
       if (!TextUtils.x(p2)) {
          uElementPack.params = p2;
       }
       u1.u(1, uElementPack, null);
       goto label_005e ;
    }
}
