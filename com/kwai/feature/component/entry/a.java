package com.kwai.feature.component.entry.a;
import java.lang.Object;
import qy5.b;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.content.Context;
import oy5.e;
import oyb.b;
import iy5.d;
import q87.c;
import oy5.i;
import com.kwai.feature.component.entry.SearchEntryParams;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import java.lang.Long;
import k2b.e0;
import uy5.b;
import com.yxcorp.gifshow.events.realaction.RealActionUserSignal;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import lnc.o5;
import com.yxcorp.gifshow.action.c;
import ew8.e;
import gda.c;
import gda.b;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uy5.a;
import wkd.b;
import nyb.h;
import lyb.v;
import com.yxcorp.gifshow.plugin.impl.search.util.SearchLoadPolicy;
import brd.t;
import oyb.a;
import erd.g;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import crd.b;
import k2b.b;
import k2b.u1;
import com.yxcorp.gifshow.log.b;
import k2b.k2;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.Exception;
import java.lang.Boolean;
import android.view.View;
import android.graphics.Rect;
import lnc.a1;
import com.kwai.sdk.switchconfig.a;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import pkd.a;
import oe6.g;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.lang.Math;
import java.util.zip.GZIPOutputStream;
import android.util.Base64;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Throwable;
import java.lang.RuntimeException;
import j06.e;
import android.view.ViewGroup;
import oy5.g;
import java.lang.Runnable;
import t45.c;
import java.lang.Number;

public class a	// class@00120e
{

    public void a(){
       super();
    }
    public static void a(b p0,LinearLayout p1,ImageView p2,TextView p3,KwaiImageView p4,SelectShapeTextView p5){
       int[] ointArray;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       a uoa = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       if (oobject == null) {
          return;
       }else {
          int i1 = 0x7f061c31;
          if (oobject1 != null && !PatchProxy.applyVoidTwoRefs(oobject, oobject1, null, uoa, "3")) {
             if (p0.f() != null) {
                oobject1.setLayoutParams(p0.f());
             }
             if (p0.r()) {
                oobject1.setGravity(p0.r());
             }
             if (p0.a() != null) {
                int[] ointArray1 = p0.a();
                oobject1.setPadding(ointArray1[0], ointArray1[i], ointArray1[2], ointArray1[3]);
             }
             if (p0.m() != i1) {
                oobject1.setBackgroundResource(p0.m());
             }
             if (p0.s() != null) {
                oobject1.setBackground(p0.s());
             }
             if (p0.y() == 8) {
                oobject1.setVisibility(p0.y());
             }
          }
       label_009c :
          if (oobject2 != null && !PatchProxy.applyVoidTwoRefs(oobject, oobject2, null, uoa, "4")) {
             if (p0.t() != null) {
                oobject2.setLayoutParams(p0.t());
             }
             if (p0.q() != null) {
                oobject2.setImageDrawable(p0.q());
             }
             if (p0.p() != i1) {
                oobject2.setColorFilter(p0.p());
             }
             oobject2.setVisibility(p0.x());
          }
          oobject1 = 0;
          if (oobject3 != null && !PatchProxy.applyVoidTwoRefs(oobject, oobject3, null, uoa, "5")) {
             if (p0.i() != null) {
                oobject3.setLayoutParams(p0.i());
             }
             if (p0.j()) {
                oobject3.setText(p0.j());
             }
             if (p0.o()) {
                oobject3.setTextColor(p0.o());
             }
             if (p0.u() - oobject1) {
                oobject3.setTextSize(p0.u());
             }
             if (p0.e() != null) {
                ointArray = p0.e();
                oobject3.setPadding(ointArray[0], ointArray[1], ointArray[2], ointArray[3]);
             }
             if (p0.h() != null) {
                oobject3.setTypeface(p0.c());
             }
             if (!(p0.v()).isEmpty()) {
                oobject3.setHint(p0.v());
             }
          }
       label_014b :
          if (oobject4 != null && !PatchProxy.applyVoidTwoRefs(oobject, oobject4, null, uoa, "7")) {
             if (p0.l() != null) {
                oobject4.setLayoutParams(p0.l());
             }
             oobject4.setVisibility(p0.z());
          }
          if (oobject5 != null && !PatchProxy.applyVoidTwoRefs(oobject, oobject5, null, uoa, "6")) {
             if (p0.g() != null) {
                oobject5.setLayoutParams(p0.g());
             }
             oobject5.setBackground(p0.w());
             if (p0.k() != null) {
                ointArray = p0.k();
                oobject5.setPadding(ointArray[0], ointArray[1], ointArray[2], ointArray[3]);
             }
             if (p0.b()) {
                oobject5.setTextColor(p0.b());
             }
             if (p0.n() - oobject1) {
                oobject5.setTextSize(p0.n());
             }
             if (p0.h() != null) {
                oobject5.setTypeface(p0.h());
             }
             oobject5.setVisibility(p0.d());
          }
          return;
       }
    }
    public static String b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "8");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       Object obj2 = PatchProxy.applyTwoRefs(p0, obj, obj, uoa, "9");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = PatchProxy.applyThreeRefs(p0, p0, null, null, a.class, "10");
          if (obj2 != patchProxyRe) {
             p0 = obj2;
          }else {
             String str = a.d();
             if (!TextUtils.x(str)) {
                p0 = p0+"_"+TextUtils.L(str);
             }
          }
          obj2 = p0;
       }
       return obj2;
    }
    public static void c(Context p0,e p1){
       Object[] objArray;
       i a;
       Object obj = null;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, a.class, str)) {
          return;
       }
       b uob = b.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, uob, str)) {
          if (p1 == null) {
             objArray = new Object[0];
             d.C().t("SearchEntryLocalUtil", "entryContext is null", objArray);
          }else if(p0 == null){
             objArray = new Object[0];
             d.C().t("SearchEntryLocalUtil", "context is null", objArray);
          }else if(PatchProxy.applyVoidOneRefs(p1, obj, uob, "2")){
             i oi = p1.f();
             SearchEntryParams searchEntryP = p1.e();
             if (oi != null) {
                a = oi.a;
                if (a != null && (!a.isLiveStream() && (searchEntryP != null && !TextUtils.x(searchEntryP.mReferPlayDuration)))) {
                   RealAction$ExtParams.newInstance().mActualPlayDuration = Long.parseLong(searchEntryP.mReferPlayDuration);
                   a = oi.b;
                   String str1 = (a == null)? "DETAIL": a.o();
                   if (oi.b == null) {
                      b.i("\(logParams.mPage is null");
                   }
                   RealActionUserSignal realActionUs = new RealActionUserSignal();
                   realActionUs.mSignalType = "LEAVE_DETAIL_PLAY_DURATION";
                   realActionUs.mSignalValue = searchEntryP.mReferPlayDuration;
                   realActionUs.mAuthorId = o5.c(r1.U1(oi.a.mEntity));
                   realActionUs.mContentId = r1.t1(oi.a.mEntity);
                   realActionUs.mContentType = c.h(oi.a.mEntity);
                   if (!PatchProxy.applyVoidTwoRefs(str1, realActionUs, obj, e.class, str)) {
                      c uoc = PatchProxy.applyOneRefs(str1, obj, c.class, "2");
                      if (uoc != PatchProxyResult.class) {
                      }else {
                         uoc = new c();
                         uoc.a = new b(str1);
                      }
                      uoc.a(realActionUs);
                      e.a(uoc);
                   }
                }
             }
          }
       label_00d6 :
          Activity uActivity = a.b(p0);
          if (!uActivity instanceof GifshowActivity) {
             objArray = new Object[0];
             d.C().t("SearchEntryLocalUtil", "activity is wrong", objArray);
          }else {
             Object[] objArray1 = new Object[0];
             a.C().w("SearchEntryLocalUtil", "goToSearch activity : "+uActivity, objArray1);
             objArray1 = new Object[0];
             a.C().w("SearchEntryLocalUtil", "goToSearch entryParams : "+p1.e(), objArray1);
             b.a(0x560d43).g(v.class, SearchLoadPolicy.DIALOG).subscribe(new a(uActivity, p1), c.e());
          }
       }
       return;
    }
    public static String d(){
       b obj = PatchProxy.apply(null, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.h();
       if (obj != null && (obj.c() != null && obj.c().t != null)) {
          return u1.h().c().t.d;
       }
       return null;
    }
    public static String e(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement advertisemen = p0.getAdvertisement();
       if (advertisemen != null && (advertisemen.getAdData() != null && !q.f(advertisemen.getAdData().mTkTemplateData))) {
          return advertisemen.getAdData().mLiveStreamId;
       }
       return null;
    }
    public static String f(PlcEntryStyleInfo p0){
       PlcEntryStyleInfo$TagPackage mParams;
       PlcEntryStyleInfo obj = PatchProxy.applyOneRefs(p0, null, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mStyleInfo;
       if (obj == null) {
          return null;
       }
       PlcEntryStyleInfo$StyleInfo mStrongStyle = obj.mStrongStyleTemplateInfo;
       PlcEntryStyleInfo$StyleInfo mWeakStyleTe = obj.mWeakStyleTemplateInfo;
       if (p0.mBizType == 3) {
          String str = "item_id";
          if (mWeakStyleTe != null) {
             PlcEntryStyleInfo$WeakStyleInfo mTagPackage = mWeakStyleTe.mTagPackage;
             if (mTagPackage != null) {
                mParams = mTagPackage.mParams;
                if (mParams != null) {
                   return a.i(mParams, str);
                }
             }
          }
          if (mStrongStyle != null) {
             PlcEntryStyleInfo$StrongStyleInfo mTagPackage1 = mStrongStyle.mTagPackage;
             if (mTagPackage1 != null) {
                mParams = mTagPackage1.mParams;
                if (mParams != null) {
                   return a.i(mParams, str);
                }
             }
          }
       }
    label_003e :
       return null;
    }
    public static String g(PlcEntryStyleInfo p0){
       PlcEntryStyleInfo mStyleInfo = p0.mStyleInfo;
       if (mStyleInfo == null) {
          return null;
       }
       PlcEntryStyleInfo$StyleInfo mStrongStyle = mStyleInfo.mStrongStyleTemplateInfo;
       PlcEntryStyleInfo$StyleInfo mWeakStyleTe = mStyleInfo.mWeakStyleTemplateInfo;
       p0 = p0.mBizType;
       if (p0 == 3) {
          if (mWeakStyleTe != null) {
             return mWeakStyleTe.mTitle;
          }else if(mStrongStyle != null){
             return mStrongStyle.mTitle;
          }
       }
       if (p0 == 2) {
          if (mWeakStyleTe != null) {
             PlcEntryStyleInfo$WeakStyleInfo mTagPackage = mWeakStyleTe.mTagPackage;
             if (mTagPackage != null) {
                return mTagPackage.mName;
             }
          }
          if (mStrongStyle != null) {
             PlcEntryStyleInfo$StrongStyleInfo mTagPackage1 = mStrongStyle.mTagPackage;
             if (mTagPackage1 != null) {
                return mTagPackage1.mName;
             }
          }
       }
    label_002e :
       return null;
    }
    public static String h(PlcEntryStyleInfo p0){
       PlcEntryStyleInfo mStyleInfo = p0.mStyleInfo;
       if (mStyleInfo == null) {
          return null;
       }
       PlcEntryStyleInfo$StyleInfo mStrongStyle = mStyleInfo.mStrongStyleTemplateInfo;
       PlcEntryStyleInfo$StyleInfo mWeakStyleTe = mStyleInfo.mWeakStyleTemplateInfo;
       if (p0.mBizType == 2) {
          if (mWeakStyleTe != null) {
             PlcEntryStyleInfo$WeakStyleInfo mTagPackage = mWeakStyleTe.mTagPackage;
             if (mTagPackage != null) {
                return mTagPackage.mIdentity;
             }
          }
          if (mStrongStyle != null) {
             PlcEntryStyleInfo$StrongStyleInfo mTagPackage1 = mStrongStyle.mTagPackage;
             if (mTagPackage1 != null) {
                return mTagPackage1.mIdentity;
             }
          }
       }
    label_0021 :
       return null;
    }
    public static String i(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return a.a.h(p0, JsonObject.class).e0(p1).w();
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          obj = new Object[0];
          d.C().w("SearchEntryUtil", p0+"toJsonTree error", obj);
          return v1;
       }
    }
    public static boolean j(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!p1.equals("DETAIL_PAGE")) {
          if (!p1.equals("KS_STORE")) {
             return false;
          }else if(!("search_entrance_ksstore").equals(p0) && (!("search_entrance_ksstore_placehoder").equals(p0) && (("search_entrance_placehoder_mall").equals(p0) || ("search_entrance_bar_mall").equals(p0)))){
             b = false;
          }
       label_0049 :
          return b;
       }else if(!p0.contains("search_entrance_detail_placeholderBarV1") && (p0.contains("search_entrance_detail_barV1") || p0.contains("search_entrance_detail_placeholderKeywordV1"))){
          b = false;
       }
       return b;
    }
    public static void k(View p0,String p1,String p2,View p3){
       String str1;
       Boolean uBoolean;
       StringBuilder obj1;
       Object[] objArray1;
       View view = p0;
       String str = p2;
       Object obj = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "15")) {
          return;
       }
       if (!view) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("viewName", str);
       jsonObject.c0("entrySource", p1);
       int i = 0;
       boolean b = true;
       if (p0.getVisibility()) {
          jsonObject.H("isVisible", Boolean.FALSE);
          str1 = 1;
       }else {
          obj1 = null;
       }
       Rect rect = new Rect();
       boolean globalVisibl = view.getGlobalVisibleRect(rect);
       int i1 = rect.bottom - rect.top;
       int i2 = rect.right - rect.left;
       int measuredHeig = p0.getMeasuredHeight();
       int measuredWidt = p0.getMeasuredWidth();
       String str2 = (globalVisibl && (i1 >= measuredHeig && i2 >= measuredWidt))? 1: null;
       int i3 = (i1 && (measuredHeig && (!i2 || !measuredWidt)))? 1: 0;
       String str3 = "";
       if (!str2 && !i3) {
          str1 = "viewRect {"+i2+","+i1+"} "+"viewMeasure {"+measuredWidt+","+measuredHeig+"} ";
          jsonObject.H("isCover", Boolean.TRUE);
          uBoolean = 1;
       }else {
          uBoolean = str1;
          str1 = str3;
       }
       i1 = 2;
       if (str.equals("NaContainer")) {
          int[] ointArray = new int[i1];
          view.getLocationOnScreen(ointArray);
          if (ointArray[i] && ointArray[i] < a1.e(50.00f)) {
             jsonObject.H("isNaContainerFrameError", Boolean.TRUE);
             str1 = str1+"NaContainerLeftLocation{"+ointArray[i]+"} ";
             uBoolean = 1;
          }
       }
       if (!TextUtils.x(str1)) {
          jsonObject.c0("layoutInfo", str1);
       }
       if (a.t().d("enableSearchEntryScreenShot", i) && (uBoolean != null && (!p0.getVisibility() && obj))) {
          obj1 = null;
          SharedPreferences obj2 = PatchProxy.applyOneRefs(obj, obj1, a.class, "16");
          if (obj2 != PatchProxyResult.class) {
             obj1 = obj2;
          }else {
             obj2 = b.c("screenShotFrequency", i);
             SharedPreferences$Editor uEditor = obj2.edit();
             str = "lastAppVersion";
             if (!(a.e).equals(obj2.getString(str, str3))) {
                uEditor.clear();
                uEditor.putString(str, a.e);
                g.a(uEditor);
             }
             int intx = obj2.getInt("screenShotCount", i);
             if (intx < 6) {
                obj.setDrawingCacheEnabled(b);
                p3.buildDrawingCache();
                Bitmap drawingCache = p3.getDrawingCache();
                if (drawingCache == null) {
                   Object[] objArray = new Object[i];
                   d.C().w("SearchEntryUtil screenShot", "viewShotBitmap is null", objArray);
                   obj.setDrawingCacheEnabled(i);
                   p3.destroyDrawingCache();
                }else {
                   Bitmap uBitmap = Bitmap.createBitmap(drawingCache, i, i, p3.getMeasuredWidth(), a1.e(100.00f));
                   Matrix matrix = new Matrix();
                   matrix.postScale(0.25f, 0.25f);
                   drawingCache = Bitmap.createBitmap(uBitmap, 0, 0, uBitmap.getWidth(), uBitmap.getHeight(), matrix, true);
                   ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                   drawingCache.compress(Bitmap$CompressFormat.JPEG, 10, uByteArrayOu);
                   byte[] uobyteArray = uByteArrayOu.toByteArray();
                   try{
                      uByteArrayOu = new ByteArrayOutputStream(Math.max(4096, (uobyteArray.length / i1)));
                      GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
                      gZIPOutputSt.write(uobyteArray);
                      gZIPOutputSt.finish();
                      gZIPOutputSt.close();
                      uByteArrayOu.close();
                      String str4 = Base64.encodeToString(uByteArrayOu.toByteArray(), i1);
                      obj.setDrawingCacheEnabled(i);
                      p3.destroyDrawingCache();
                      if (TextUtils.x(str4)) {
                         objArray1 = new Object[i];
                         d.C().w("SearchEntryUtil screenShot", "base64String is empty", objArray1);
                      }else {
                         objArray1 = new Object[i];
                         d.C().w("SearchEntryUtil screenShot", str4, objArray1);
                         intx = intx + b;
                         uEditor.putInt("screenShotCount", intx);
                         g.a(uEditor);
                         obj1 = "{ time:"+DateUtils.b(System.currentTimeMillis())+"; count:"+intx+"} ";
                      }
                   }catch(java.io.IOException e0){
                      throw new RuntimeException(e0);
                   }
                }
             }
          }
          if (!TextUtils.x(obj1)) {
             jsonObject.c0("screenShotInfo", obj1);
          }
       }
    label_0268 :
       if (uBoolean != null) {
          e.a("search_entry", "error", "search_bar_tk_exception", jsonObject);
       }
       return;
    }
    public static void l(ViewGroup p0,String p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "14")) {
          return;
       }
       c.a(new g(p0, p1, p2));
       return;
    }
    public static String m(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p2)) {
          int i = p0.indexOf(p1+"=");
          if (i != -1) {
             StringBuilder str = p0.substring(0, i)+p1+"="+p2;
             int i1 = p0.indexOf("&", i);
             if (i1 != -1) {
                str = str+p0.substring(i1);
             }
             return str;
          }
       }
       return null;
    }
    public static int n(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.n(p0, "search_entrance_find_detail")) {
          return a.t().a("searchStyleInFindDetailPage", 0);
       }
       if (TextUtils.n(p0, "search_entrance_detail")) {
          return a.t().a("searchStyleInSearchDetailPage", 0);
       }
       if (TextUtils.n(p0, "search_entrance_nearby_detail")) {
          return a.t().a("searchStyleInNearbyDetailPage", 0);
       }
       if (TextUtils.n(p0, "search_entrance_hashtag_detail")) {
          return a.t().a("searchStyleInHashtagDetailPage", 0);
       }
       if (TextUtils.n(p0, "search_entrance_profile_detail")) {
          return a.t().a("searchStyleInProfileDetailPage", 0);
       }
       if (TextUtils.n(p0, "search_entrance_follow_detail")) {
          return a.t().a("searchStyleInFollowDetailPage", 0);
       }
       if (TextUtils.n(p0, "search_entrance_hotspot")) {
          return 0;
       }
       return a.t().a("searchStyleInOtherDetailPage", 0);
    }
}
