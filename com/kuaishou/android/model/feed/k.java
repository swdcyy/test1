package com.kuaishou.android.model.feed.k;
import ip.b;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tl8.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import da6.c;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import org.json.JSONObject;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import o35.b;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import java.util.HashMap;
import o56.a;
import java.lang.RuntimeException;
import yp.m;
import ok.h;
import tl8.e;
import yp.n;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import android.net.Uri$Builder;
import java.util.Iterator;
import java.util.List;
import wkd.b;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.android.model.feed.j;
import java.lang.Integer;
import yp.l;
import java.lang.Number;
import com.kuaishou.android.model.mix.ImageMeta;
import kp.l0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import kp.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kwai.sdk.switchconfig.a;

public class k implements b	// class@00061e
{

    public void k(){
       super();
    }
    public static PhotoAdvertisement A(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0.get("AD");
       }
       return null;
    }
    public static PhotoAdvertisement B(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return k.z(p0.getAdvertisement());
       }
       return null;
    }
    public static Boolean H(PhotoAdvertisement p0){
       p0 = p0.mCaptionUrls;
       boolean b = (p0 != null && p0.size())? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean I(PhotoAdvertisement$AdGroup p0,PhotoAdvertisement p1){
       boolean b = (p1.mAdGroup == p0)? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean J(int p0,PhotoAdvertisement p1){
       boolean b;
       if (p1 != null) {
          p1 = p1.mAdData;
          if (p1 != null && p1.isAdPageButtonControlDisable(p0)) {
             b = true;
          label_000f :
             return Boolean.valueOf(b);
          }
       }
       b = false;
       goto label_000f ;
    }
    public static Boolean K(PhotoAdvertisement$FansTopDetailPageFlameType p0,PhotoAdvertisement p1){
       boolean b = (p1.mFansTopDetailPageFlameType == p0)? true: false;
       return Boolean.valueOf(b);
    }
    public static void M(BaseFeed p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, k.class, "28")) {
          return;
       }
       if (p0 instanceof c) {
          p0.getExtraMap().putExtra(p1, p2);
       }
       return;
    }
    public static Boolean q(int p0,PhotoAdvertisement p1){
       return k.J(p0, p1);
    }
    public static Boolean r(PhotoAdvertisement$AdGroup p0,PhotoAdvertisement p1){
       return k.I(p0, p1);
    }
    public static Boolean s(PhotoAdvertisement p0){
       return k.H(p0);
    }
    public static Boolean t(PhotoAdvertisement$FansTopDetailPageFlameType p0,PhotoAdvertisement p1){
       return k.K(p0, p1);
    }
    public static String u(String p0,String p1){
       Uri obj = PatchProxy.applyTwoRefs(p0, p1, null, k.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          obj = x0.f(p0);
          if (obj == null) {
             return p0;
          }else {
             String host = obj.getHost();
             if (TextUtils.n(obj.getScheme(), "kwai") && TextUtils.n("chat", host)) {
                String str = x0.a(obj, "subbizContext");
                boolean b = TextUtils.x(str);
                JSONObject jSONObject = (b)? new JSONObject(): new JSONObject(str);
                if (TextUtils.x(jSONObject.optString("adCallback"))) {
                   jSONObject.put("adCallback", p1);
                   p1 = URLEncoder.encode(jSONObject.toString(), "UTF-8");
                   if (b) {
                      return k.v(p0, "subbizContext"+"="+p1);
                   }else {
                      return TextUtils.F(p0, "subbizContext", p1);
                   }
                }
             }else if(TextUtils.x(x0.a(obj, "adCallback"))){
                p0 = k.v(p0, "adCallback"+"="+p1);
             }
          }
       }
       return p0;
    }
    public static String v(String p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, k.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          obj = "?";
          if (p0.contains(obj)) {
             return p0+"&"+p1;
          }else {
             String str = "#";
             if (p0.contains(str)) {
                int i = p0.indexOf(str);
                return p0.substring(0, i)+obj+p1+p0.substring(i);
             }else {
                p0 = p0+obj+p1;
             }
          }
       }
       return p0;
    }
    public static AdLogAltData x(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof c && p0.getExtraMap().getExtra("adAltData") instanceof AdLogAltData) {
          return p0.getExtraMap().getExtra("adAltData");
       }
       return null;
    }
    public static boolean y(QPhoto p0,String p1,boolean p2){
       PhotoAdvertisement obj;
       if (PatchProxy.isSupport(k.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, k.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       if (photoAdverti != null) {
          obj = photoAdverti.mBizSwitchInfo;
          if (obj != null && obj.containsKey(p1)) {
             return photoAdverti.mBizSwitchInfo.get(p1).booleanValue();
          }
       }
       return p2;
    }
    public static PhotoAdvertisement z(PhotoAdvertisementInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof PhotoAdvertisement) {
          return p0;
       }
       if (p0 != null) {
          String str = p0.getClass()+" is not PhotoAdvertisement! Do not impl this interface!";
          if (!a.d()) {
             Object[] objArray = new Object[0];
             b.g().d("CommercialFeedExt", str, objArray);
          }else {
             throw new RuntimeException(str);
          }
       }
       return null;
    }
    public boolean C(BaseFeed p0,PhotoAdvertisement$AdGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.b(p0, "AD", new m(p1));
    }
    public boolean D(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d(p0) && k.B(p0).mHideLabel == null)? true: false;
       return b;
    }
    public boolean E(PhotoAdvertisement p0){
       boolean b;
       if (p0 != null) {
          p0 = p0.mAdGroup;
          if (p0 == PhotoAdvertisement$AdGroup.AD_SOCIAL || p0 == PhotoAdvertisement$AdGroup.AD_SOCIAL_MERCHANT) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
    public boolean F(PhotoAdvertisement$FansTopDetailPageFlameType p0,BaseFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.b(p1, "AD", new n(p0));
    }
    public boolean G(PhotoAdvertisement p0){
       boolean b;
       if (p0 != null) {
          p0 = p0.mAdGroup;
          if (p0 == PhotoAdvertisement$AdGroup.FANS_TOP || p0 == PhotoAdvertisement$AdGroup.FANS_TOP_MERCHANT) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
    public final String L(String p0){
       String str1;
       Uri obj = PatchProxy.applyOneRefs(p0, this, k.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = x0.f(p0);
       Set set = x0.c(obj);
       if (q.f(set)) {
          return p0;
       }
       Uri$Builder uBuilder = obj.buildUpon().clearQuery();
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          List list = x0.d(obj, str);
          if (q.f(list)) {
             str1 = null;
          }else {
             int i = list.size() - 1;
             str1 = list.get(i);
          }
          uBuilder.appendQueryParameter(str, TextUtils.k(str1));
       }
       return uBuilder.build().toString();
    }
    public boolean a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.C(p0, PhotoAdvertisement$AdGroup.FANS_TOP) || this.C(p0, PhotoAdvertisement$AdGroup.FANS_TOP_MERCHANT))? true: false;
       return b;
    }
    public boolean b(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.C(p0, PhotoAdvertisement$AdGroup.DSP) && (this.C(p0, PhotoAdvertisement$AdGroup.THIRD_PLATFORM) || this.C(p0, PhotoAdvertisement$AdGroup.ALI_DONG_FENG)))? true: false;
       return b;
    }
    public boolean c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.m(p0.mEntity, b, b) != -1) {
          b = true;
       }
       return b;
    }
    public boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.E(k.B(p0));
    }
    public boolean e(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(-570058679).a(p0) && !this.F(PhotoAdvertisement$FansTopDetailPageFlameType.NONE, p0))? true: false;
       return b;
    }
    public boolean f(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       PhotoAdvertisement photoAdverti = p0.get("AD");
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData mSplashInfo = photoAdverti.mSplashInfo;
             if (mSplashInfo != null && mSplashInfo.mSplashAdType == 1) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean g(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          String str = "AD";
          if (p0.get(str) != null) {
             PhotoAdvertisement mAdGroup = p0.get(str).mAdGroup;
             if (mAdGroup == PhotoAdvertisement$AdGroup.AD_MERCHANT || mAdGroup == PhotoAdvertisement$AdGroup.FANS_TOP_MERCHANT) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean h(PhotoAdvertisementInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.G(k.z(p0));
    }
    public boolean i(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       boolean b = false;
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null && photoAdverti.mSplashInfo != null) {
             b = true;
          }
       }
       return b;
    }
    public boolean j(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.b(p0, "AD", j.b);
    }
    public PhotoAdvertisementInterface k(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0.a(PhotoAdvertisement.class);
       }
       return null;
    }
    public boolean l(BaseFeed p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return e.b(p0, "AD", new l(p1));
    }
    public int m(BaseFeed p0,boolean p1,boolean p2){
       String obj;
       PhotoAdvertisement$AdGroup aD_SOCIAL;
       if (PatchProxy.isSupport(k.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, k.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = "AD";
       int i = -1;
       if (p0.get(obj) == null) {
          return i;
       }else if(p1 && (this.g(p0) || e.a(p0, ImageMeta.class, l0.b))){
          return i;
       }else {
          PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.GR,aD_SOCIAL,PhotoAdvertisement$AdGroup.FANS_TOP,PhotoAdvertisement$AdGroup.AD_DSP_SOFT,PhotoAdvertisement$AdGroup.DSP_NATURE};
          aD_SOCIAL = PhotoAdvertisement$AdGroup.AD_SOCIAL;
          if (p0.get(obj).isAdGroup(uAdGroupArra)) {
             return i;
          }else if(p0 instanceof LiveStreamFeed){
             return i;
          }else if(p2){
             PhotoAdvertisement$AdGroup[] uAdGroupArra1 = new PhotoAdvertisement$AdGroup[]{aD_SOCIAL,PhotoAdvertisement$AdGroup.AD_MERCHANT,PhotoAdvertisement$AdGroup.FANS_TOP_MERCHANT,PhotoAdvertisement$AdGroup.AD_SOCIAL_MERCHANT};
             if (p0.get(obj).isAdGroup(uAdGroupArra1)) {
                return i;
             }
          }
          if (!e.a(p0, ImageMeta.class, l0.b)) {
             if (e.a(p0, ImageMeta.class, j0.b)) {
                if (!this.g(p0)) {
                   i = 1;
                }
             }else {
                i = 0;
             }
          }
          return i;
       }
    }
    public boolean n(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && this.G(k.B(p0)))? true: false;
       return b;
    }
    public boolean o(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.l(p0, 1) ^ 1);
    }
    public boolean p(QPhoto p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdGroup;
          if (photoAdverti == PhotoAdvertisement$AdGroup.AD_MERCHANT || photoAdverti == PhotoAdvertisement$AdGroup.FANS_TOP_MERCHANT) {
             b = true;
          label_0026 :
             return b;
          }
       }
       b = false;
       goto label_0026 ;
    }
    public String w(String p0,PhotoAdvertisement p1){
       PhotoAdvertisement obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0) && p1 != null) {
          obj = p1.mAdLiveForFansTop;
          PhotoAdvertisement$FanstopLiveInfo mMerchantURL = (obj != null)? obj.mMerchantURLParamsStr: p1.mMerchantURLParamsStr;
          if (TextUtils.x(mMerchantURL)) {
             return p0;
          }else {
             p0 = k.v(p0, mMerchantURL);
             if (a.t().d("enableAdReplaceExpTag", false)) {
                p0 = this.L(p0);
             }
          }
       }
    label_003d :
       return p0;
    }
}
