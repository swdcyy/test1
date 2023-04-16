package com.kuaishou.commercial.search.b;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.sdk.switchconfig.a;
import java.lang.Double;
import java.lang.reflect.Type;
import com.yxcorp.utility.n;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import nx8.k;
import com.kuaishou.webkit.URLUtil;
import k59.b2;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import com.kwai.framework.model.ExtendableModelMap;
import yx.j0;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import java.lang.Number;
import da6.c;
import bm9.a;
import wkd.b;
import ip.b;
import tw.j;
import mxb.h0;
import com.kuaishou.android.model.feed.AdAggregateTemplateFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType;
import android.net.Uri;
import ekd.x0;
import java.util.Map;
import agc.b;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import xh7.b;
import py.f;
import qh7.b;
import qh7.a;
import mxb.j0;
import mxb.i0;
import py.g;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;

public class b	// class@001546
{

    public void b(){
       super();
    }
    public static void a(View p0,View p1,Activity p2,QPhoto p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "15")) {
          return;
       }
       if (p0 == null || (p1 == null || (p2 != null && p3 != null))) {
          if (k.B(p3) == null) {
             return;
          }else {
             int[] ointArray = new int[2];
             int[] ointArray1 = new int[2];
             p0.getLocationOnScreen(ointArray);
             p1.getLocationOnScreen(ointArray1);
             double d = 0;
             Double value = a.t().getValue("searchAdRateImpression", Double.class, Double.valueOf(d));
             if (value.doubleValue() - d <= 0) {
                return;
             }else {
                int i = 1;
                if ((ointArray1[i] + p0.getHeight()) > n.j(p2)) {
                   b.l(p3, value);
                }else if(ointArray[i] >= ointArray1[i] && (double)(n.j(p2) - ointArray[i]) - ((double)p0.getHeight() * value.doubleValue()) > 0){
                   b.l(p3, value);
                }
             }
          }
       }
       return;
    }
    public static boolean b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       if (a.t().a("searchAdPhotoImpressionExp", i) == p0) {
          i = true;
       }
       return i;
    }
    public static void c(String p0,Activity p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uob, "17")) {
          return;
       }
       if (!TextUtils.x(p0) && p1 != null) {
          p0 = k.d(p0, null);
          if (URLUtil.isNetworkUrl(p0)) {
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, uob, "18") && !TextUtils.x(p0)) {
                c.i(p1, new b2(p1, p0).a());
             }
          }else {
             b.k(p0, p1);
          }
       }
       return;
    }
    public static boolean d(PhotoAdvertisement p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (p0 == null) {
          return b;
       }
       if (a.t().getValue("searchAdRateImpression", Double.class, Double.valueOf(0)).doubleValue() <= 0) {
          return b;
       }
       if (p0.getExtraMap().getExtra("search_ad_has_rate_impression") != Boolean.TRUE) {
          b = false;
       }
       return b;
    }
    public static void e(String p0,QPhoto p1,Activity p2){
       Object[] objArray;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "11")) {
          return;
       }
       if (TextUtils.x(p0)) {
          objArray = new Object[0];
          j0.c("doJumpWebUrl", "url is empty", objArray);
          return;
       }else if(p2 == null){
          objArray = new Object[0];
          j0.c("doJumpWebUrl", "activity is empty", objArray);
          return;
       }else if(p1 == null){
          objArray = new Object[0];
          j0.c("doJumpWebUrl", "photo is empty", objArray);
          return;
       }else {
          b2 uob2 = new b2(p2, p0);
          uob2.g(p1.mEntity);
          c.i(p2, uob2.e("extra_photo_ad_url", null).a());
          return;
       }
    }
    public static int f(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       PhotoAdvertisement photoAdverti = k.A(p0);
       if (photoAdverti == null) {
          return 0;
       }
       photoAdverti = photoAdverti.getExtra("search_click_recommend_status");
       if (photoAdverti instanceof Integer) {
          return photoAdverti.intValue();
       }
       return 0;
    }
    public static int g(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(p0.mEntity);
    }
    public static boolean h(QPhoto p0,a p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null || (p1 != null && (p1.O0() && (p0.isAd() && (b.a(-570058679).b(p0.mEntity) && j.w(p0)))))) {
          b = true;
       }
    label_003e :
       return b;
    }
    public static boolean i(QPhoto p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null || (k.B(p0) != null && (h0.d(k.B(p0)) || p0.mEntity instanceof AdAggregateTemplateFeed))) {
          b = true;
       }
    label_002f :
       return b;
    }
    public static boolean j(QPhoto p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 != null && k.B(p0) != null) {
          if (b.a(0x5f22eaa1).n(p0)) {
             if (k.B(p0).mFansTopFeedFlameType != PhotoAdvertisement$FansTopFeedFlameType.NONE) {
                b = true;
             }
             return b;
          }else if(k.B(p0).mEnableShowFansTopFlame != null && k.B(p0).mFansTopFeedFlameType != PhotoAdvertisement$FansTopFeedFlameType.NONE){
             b = true;
          }
       }
       return b;
    }
    public static void k(String p0,Activity p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "19")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (p1 != null) {
          if (b.a(p1, x0.f(p0), null)) {
             return;
          }else {
             Object obj = PatchProxy.applyThreeRefs(p1, p0, null, null, AdProcessUtils.class, "13");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): AdProcessUtils.j(p1, p0, null, true);
             if (b) {
                return;
             }else {
                a.b(b.j(p1, p0), new f(p0));
             }
          }
       }
       return;
    }
    public static void l(QPhoto p0,Double p1){
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uob, "16")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       if (PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidTwoRefs(photoAdverti, Boolean.TRUE, obj, uob, "14") && photoAdverti != null)) {
          photoAdverti.getExtraMap().putExtra("search_ad_has_rate_impression", Boolean.TRUE);
       }
       i0.a().e(938, p0.mEntity).f(new g(p1)).a();
       return;
    }
    public static void m(BaseFeed p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uob, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.A(p0);
       if (photoAdverti == null) {
          return;
       }
       Object extra = photoAdverti.getExtra("search_click_recommend_status");
       if (extra instanceof Integer && extra.intValue() == 2) {
          return;
       }
       photoAdverti.putExtra("search_click_recommend_status", Integer.valueOf(p1));
       return;
    }
}
