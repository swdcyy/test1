package com.kuaishou.live.report.e;
import java.lang.Object;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import ap3.b;
import ap3.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.app.Activity;
import androidx.fragment.app.c;
import lp3.e;
import d61.g;
import kq3.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.x0;
import java.lang.Float;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.a1;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;
import o63.a;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import ap3.f;
import android.content.Context;
import n3d.a;
import cjd.e;
import erd.o;
import ap3.g;
import sfc.a;
import erd.g;
import crd.b;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import java.lang.Integer;
import com.kuaishou.live.report.e$a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.report.c;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.report.d;

public class e	// class@000f5d
{

    public void e(){
       super();
    }
    public static t a(ReportInfo p0,String p1,String p2,LiveStreamFeed p3,long p4){
       object oobject = p0;
       e uoe = e.class;
       String str = null;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{oobject,p1,p2,p3,Long.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, str, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b uob = a.b();
       ReportInfo mSourceType = oobject.mSourceType;
       ReportInfo mReportedUse = oobject.mReportedUserId;
       ReportInfo mLiveId = oobject.mLiveId;
       ReportInfo mEntrySource = oobject.mEntrySource;
       ReportInfo mRefer = oobject.mRefer;
       ReportInfo mPreRefer = oobject.mPreRefer;
       String str1 = (p3 != null)? r1.M0(p3): str;
       if (p3 != null) {
          str = r1.I1(p3);
       }
       return uob.b(mSourceType, mReportedUse, mLiveId, mEntrySource, mRefer, mPreRefer, p1, p2, str1, str, p4);
    }
    public static void b(Activity p0,c p1,e p2,String p3){
       float f;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, e.class, "12")) {
          return;
       }
       if (g.h(p0)) {
          return;
       }
       a uoa = a.d(p0, p1, p2);
       uoa.g("live_report_h5_dialog_half_screen");
       uoa.f("live_report_h5_dialog_tag");
       uoa.b.setLayoutType("5");
       p1 = PatchProxy.applyOneRefs(p3, null, e.class, "13");
       if (p1 != PatchProxyResult.class) {
          f = p1.floatValue();
       }else if(!TextUtils.isEmpty(p3)){
          String str = x0.a(Uri.parse(p3), "heightRatio");
          if (!TextUtils.isEmpty(str)) {
             try{
                f = Float.parseFloat(str);
             }catch(java.lang.NumberFormatException e0){
                b.Z(LiveLogTag.LIVE_REPORT, "parse heightRatio failed");
             }
          }
       }
       if (f > 0 && f - 0x3f800000 <= 0) {
          uoa.b.setPortraitHeightRatio(f);
       }else {
          uoa.b.setPortraitHeightPixel(a1.e(0x43fa0000));
       }
       a.c().h(p3, uoa);
       return;
    }
    public static void c(Activity p0,ReportInfo p1,LiveStreamFeed p2,long p3,a p4){
       object oobject = p0;
       object oobject1 = p4;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{oobject,p1,p2,Long.valueOf(p3),oobject1};
          if (PatchProxy.applyVoid(objArray, null, uoe, "8")) {
             return;
          }
       }
       if (!QCurrentUser.ME.isLogined()) {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(a1.p(R.string.arg_RES_7f103077));
          LoginParams loginParams = uoa.a();
          f uof = new f(p0, p1, p2, p3, p4);
          d.a(-1712118428).x00(p0, 160, loginParams, v11);
          return;
       }else {
          e.a(p1, null, null, p2, p3).map(new e()).subscribe(new g(p0, oobject1), new a());
          return;
       }
    }
    public static void d(Activity p0,c p1,ReportInfo p2,e p3,LiveSceneInfoService$LiveSceneInfo p4,LiveStreamFeed p5,String p6,String p7,int p8){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, null, uoe, "3")) {
             return;
          }
       }
       e.e(p0, p1, p2, p3, p4, p5, p6, p7, p8, 0);
       return;
    }
    public static void e(Activity p0,c p1,ReportInfo p2,e p3,LiveSceneInfoService$LiveSceneInfo p4,LiveStreamFeed p5,String p6,String p7,int p8,int p9){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, null, uoe, "2")) {
             return;
          }
       }
       e.g(p0, p1, p2, p3, p4, p5, p6, p7, p8, null, p9).subscribe(Functions.d(), Functions.d());
       return;
    }
    public static t f(Activity p0,c p1,ReportInfo p2,e p3,LiveSceneInfoService$LiveSceneInfo p4,LiveStreamFeed p5,String p6,String p7,int p8,e$a p9){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          object oobject = null;
          objArray[5] = oobject;
          objArray[6] = p6;
          objArray[7] = oobject;
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = p9;
          Object obj = PatchProxy.apply(objArray, oobject, uoe, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return e.g(p0, p1, p2, p3, p4, null, p6, null, p8, p9, 0);
    }
    public static t g(Activity p0,c p1,ReportInfo p2,e p3,LiveSceneInfoService$LiveSceneInfo p4,LiveStreamFeed p5,String p6,String p7,int p8,e$a p9,int p10){
       LoginParams$a obj1;
       String str;
       object oobject = p0;
       object oobject1 = p4;
       e uoe = e.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = oobject1;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = Integer.valueOf(p10);
          obj1 = PatchProxy.apply(objArray, obj, uoe, "5");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (!QCurrentUser.ME.isLogined()) {
          PublishSubject publishSubje = PublishSubject.g();
          obj1 = new LoginParams$a();
          obj1.d(a1.p(R.string.arg_RES_7f103077));
          LoginParams loginParams = obj1.a();
          c uoc = v11;
          Activity uActivity = p0;
          c uoc1 = v11;
          p1 = uoc1;
          LoginParams loginParams1 = loginParams;
          uoc = new c(uActivity, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, publishSubje);
          d.a(-1712118428).x00(uActivity, p8, loginParams1, p1);
          return publishSubje.hide();
       }else if(oobject1 != null){
          str = a.a.q(oobject1);
       }else {
          str = obj;
       }
       ReportInfo reportInfo = p2;
       d uod = new d(p0, p1, p3, reportInfo, p5, str, p7, p6, p9, p10);
       return e.a(reportInfo, str, p7, p5, 0).map(new e()).doOnNext(v12).doOnError(new a());
    }
    public static void h(Activity p0,ReportInfo p1,LiveStreamFeed p2,a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, e.class, "6")) {
          return;
       }
       e.c(p0, p1, p2, 0, p3);
       return;
    }
}
