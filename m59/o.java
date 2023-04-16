package m59.o;
import l59.b;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import android.app.Activity;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import k59.j2;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import ekd.j0;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil$UrlTrackInfo;
import com.kwai.framework.activitycontext.ActivityContext;
import mxb.j0;
import mxb.i0;
import m59.l;
import erd.g;
import com.kuaishou.webkit.WebView;
import java.lang.Boolean;
import k59.e2;
import com.yxcorp.gifshow.ad.webview.AdWebInterceptUtil;
import p59.n;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import lnc.y0;
import java.util.Collection;
import ekd.q;
import java.util.List;
import v59.b;
import android.text.TextUtils;
import com.yxcorp.gifshow.ad.webview.blackurl.b;
import erd.o;
import m59.m;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.utility.TextUtils;
import m59.h;
import lnc.g;
import m59.k;
import m59.d;
import n49.s;
import java.lang.Runnable;
import ekd.k1;
import java.lang.System;
import m59.j;
import com.kwai.yoda.bridge.g;
import m59.g;
import com.kuaishou.webkit.WebResourceRequest;
import android.net.Uri;
import java.lang.StringBuilder;
import yx.j0;
import m59.i;
import r59.c;
import m59.b;
import m59.c;
import java.lang.Integer;
import android.view.View;
import yz7.n;
import o49.d;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import p49.f;
import p49.c;
import java.util.Objects;
import p49.f$a;
import o49.c;
import p49.a;
import m59.e;
import msd.a;
import tw.j;
import qw.f;
import oe6.b;
import m59.n;
import android.graphics.Bitmap;
import com.kuaishou.webkit.WebResourceResponse;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import com.kuaishou.webkit.URLUtil;
import mxb.c;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import m59.f;
import lnc.c3$a;
import lnc.c3;
import m59.a;
import com.yxcorp.gifshow.ad.util.k;
import android.content.Context;
import android.widget.AbsoluteLayout;
import com.yxcorp.utility.SystemUtil;
import e17.i;
import ekd.x0;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import agc.b;
import mxb.b0;
import ekd.w0;
import android.net.Uri$Builder;
import nf6.h;
import wkd.b;
import nf6.i;
import r59.a;

public class o extends g implements b	// class@002e0a
{
    public String A;
    public final Fragment B;
    public int C;
    public int D;
    public boolean E;
    public final BaseFeed j;
    public final Object k;
    public boolean l;
    public final Activity m;
    public final int n;
    public final int o;
    public int p;
    public final int q;
    public final AdDataWrapper$AdLogParamAppender r;
    public c s;
    public List t;
    public final j2 u;
    public final Handler v;
    public e2 w;
    public BlackUrlUtil$UrlTrackInfo x;
    public boolean y;
    public boolean z;
    public static final int F;

    static {
       o.F = a.t().a("adReactionLogTimesLimit", 5);
    }
    public void o(Activity p0,YodaBaseWebView p1,Object p2,BaseFeed p3,int p4,int p5,int p6,AdDataWrapper$AdLogParamAppender p7,j2 p8,Fragment p9){
       super(p1);
       this.p = 2;
       BlackUrlUtil$UrlTrackInfo urlTrackInfo = null;
       this.x = urlTrackInfo;
       this.y = false;
       this.z = false;
       this.k = p2;
       this.m = p0;
       this.j = p3;
       this.n = p4;
       this.r = p7;
       p2 = 1;
       this.q = (p5 > 0)? p5: p2;
       this.o = (p6 > 0)? p6: j0.b(p0.getIntent(), "KEY_EXTRA_WEB_FORM_DETAIL_WEB", p2);
       this.u = p8;
       this.v = new Handler(Looper.getMainLooper());
       BlackUrlUtil$UrlTrackInfo urlTrackInfo1 = PatchProxy.apply(urlTrackInfo, urlTrackInfo, BlackUrlUtil.class, "1");
       if (urlTrackInfo1 != PatchProxyResult.class) {
       }else {
          urlTrackInfo1 = new BlackUrlUtil$UrlTrackInfo();
       }
       this.x = urlTrackInfo1;
       this.B = p9;
       return;
    }
    public static void C(o p0,String p1){
       p0.F(p1);
    }
    private void F(String p0){
       if (!ActivityContext.g().h()) {
          i0.a().e(803, this.j).q("deeplink", p0).f(this.r).d(new l(p0)).a();
       }
       return;
    }
    public final boolean D(WebView p0,String p1){
       boolean b;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.y != null || this.E(p1)) {
          this.P(p0, this.A, false);
          return true;
       }else {
          o tw = this.w;
          if (tw != null && tw.j()) {
             tw = PatchProxy.applyOneRefs(p1, null, AdWebInterceptUtil.class, "3");
             if (tw != patchProxyRe) {
                b = tw.booleanValue();
             }else {
                n on = AdWebInterceptUtil.c.a();
                if (on != null) {
                   on = on.preloadBlackUrlList;
                   if (on != null) {
                      iterator = on.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            String str = iterator.next();
                            Boolean uBoolean = (p1 != null)? Boolean.valueOf(StringsKt__StringsKt.O2(p1, str, false, 2, null)): null;
                            if (y0.p(uBoolean)) {
                               b = true;
                            }
                         }
                      }
                   }
                }
                b = false;
             }
             if (b) {
                this.w.f();
                return true;
             }
          }
       label_0079 :
          if (!q.f(this.t)) {
             iterator = this.t.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                if (uob != null && uob.a(p1)) {
                   return true;
                }else {
                   continue ;
                }
             }
          }
          return false;
       }
    }
    public final boolean E(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "24");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, BlackUrlUtil.class, "11");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(TextUtils.isEmpty(p0) || TextUtils.isEmpty(p0.trim())){
          b = false;
       }else {
          b = BlackUrlUtil.c(BlackUrlUtil.a, "landingPageBlackList", b.b).contains(BlackUrlUtil.f(p0));
       }
       if (b) {
          this.A = p0;
          this.y = true;
          return true;
       }else {
          return false;
       }
    }
    public final void G(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "11")) {
          return;
       }
       if (this.j != null) {
          i0.a().e(935, this.j).q("deeplink", p0).f(this.r).d(new m(p1, p0)).a();
          d.a(-1694791652).bC(this.j, p0, "2");
       }
       return;
    }
    public final void H(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "6")) {
          return;
       }
       if (this.j != null) {
          if (TextUtils.x(p0)) {
             p1 = "";
          }
          i0.a().e(385, this.j).q("deeplink", p0).f(this.r).d(new h(this, p1)).a();
       }
       return;
    }
    public final void I(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "10")) {
          return;
       }
       o tj = this.j;
       if (tj != null) {
          g.b(tj, "2", p0);
          i0.a().e(386, this.j).q("deeplink", p0).f(this.r).d(new k(this, p1, p0)).a();
          k1.r(new d(this, p0), s.h());
       }
       return;
    }
    public final void J(String p0){
       j2 c;
       j2 b;
       int i1;
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "22")) {
          return;
       }
       o tu = this.u;
       if (tu != null) {
          tu.c = System.currentTimeMillis();
       }
       tu = this.u;
       int i = 0;
       if (tu != null) {
          c = tu.c;
          if (c - i) {
             b = tu.b;
             if (b - i) {
                i1 = c - b;
             label_002b :
                l = i1;
             }
          }
          i1 = i;
          goto label_002b ;
       }else {
          l = i;
       }
       if (tu != null) {
          c = tu.c;
          if (c - i) {
             b = tu.a;
             if (b - i) {
                i = c - b;
             }
          }
       }
       long l1 = i;
       if (this.j != null) {
          j oj = new j(this, p0, l, l1);
          i0.a().e(51, this.j).f(this.r).d(i).a();
          if (this.i()) {
             i0.a().e(711, this.j).f(this.r).d(new g(this)).a();
          }
       }
       this.l = true;
       return;
    }
    public final void K(WebView p0,WebResourceRequest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "3")) {
          return;
       }
       if (!p1.isForMainFrame()) {
          return;
       }
       if (!p1.isRedirect()) {
          this.C = this.C + 1;
       }
       String str = p1.getUrl().toString();
       if (this.D < o.F && (str.length() < 4096 && str.startsWith("http"))) {
          this.D = this.D + 1;
          Object[] objArray = new Object[0];
          j0.f("PhotoAdvertisementWebViewClient", "reaction record, mReactionTimes: "+this.C+", mReactionLogTimes: "+this.D, objArray);
          if (this.j != null) {
             i0.a().e(942, this.j).f(this.r).d(new i(this, str)).a();
          }
       }
       return;
    }
    public void L(){
       this.l = false;
       this.y = false;
       this.z = false;
       this.E = false;
    }
    public void M(c p0){
       this.s = p0;
    }
    public void N(int p0){
       this.p = p0;
    }
    public void O(e2 p0){
       this.w = p0;
    }
    public final void P(WebView p0,String p1,boolean p2){
       int this;
       o m;
       o j;
       o q;
       o x;
       Object[] objArray;
       o oo = this;
       WebView webView = p0;
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, o.class, "23")) {
          return;
       }
       oo.v.post(new b(this, webView));
       oo.v.postDelayed(new c(this, webView), 1000);
       if (oo.z == null) {
          _monitor_enter(o.class);
          if (oo.z == null) {
             boolean b = true;
             oo.z = b;
             Object obj = null;
             int i = 4;
             int i1 = 3;
             this = 2;
             int i2 = 0;
             int i3 = 5;
             if (p2) {
                m = oo.m;
                j = oo.j;
                q = oo.q;
                x = oo.x;
                if (PatchProxy.isSupport(BlackUrlUtil.class)) {
                   objArray = new Object[i3];
                   objArray[i2] = m;
                   objArray[b] = p1;
                   objArray[this] = j;
                   objArray[i1] = Integer.valueOf(q);
                   objArray[i] = x;
                   if (!PatchProxy.applyVoid(objArray, obj, BlackUrlUtil.class, "12")) {
                   }
                }else {
                }
             }else {
                m = oo.m;
                j = oo.j;
                q = oo.q;
                x = oo.x;
                if (PatchProxy.isSupport(BlackUrlUtil.class)) {
                   objArray = new Object[i3];
                   objArray[i2] = m;
                   objArray[b] = p1;
                   objArray[this] = j;
                   objArray[i1] = Integer.valueOf(q);
                   objArray[i] = x;
                   if (!PatchProxy.applyVoid(objArray, obj, BlackUrlUtil.class, "13")) {
                   }
                }else {
                }
             }
          }
       label_00b8 :
          _monitor_exit(o.class);
       }
       return;
    }
    public final void Q(WebView p0,int p1,String p2,String p3){
       Integer this;
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, o.class, "19")) {
          return;
       }
       o tm = this.m;
       if (tm == null || (!tm.isFinishing() && !n.a(p0))) {
          if (!TextUtils.n(this.w(p0), p3)) {
             return;
          }else if(p1 == -1){
             return;
          }else {
             o tj = this.j;
             String str = this.w(p0);
             this = Integer.valueOf(p1);
             Boolean uBoolean = Boolean.valueOf(this.E);
             d uod = d.class;
             Object obj = null;
             if (PatchProxy.isSupport(uod)) {
                Object[] objArray = new Object[]{tj,str,p3,this,p2,uBoolean};
                if (!PatchProxy.applyVoid(objArray, obj, uod, "4")) {
                }
             }else if(tj != null){
                obj = tj.get("AD");
             }
             if (obj != null) {
                Objects.requireNonNull(c.Z);
                c uoc = new c(tj, str, p3, this, p2, uBoolean);
                f.a.a(c.s).b(0x3f800000).g(0x3f800000);
             }
          }
       }
       return;
    }
    public void a(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "27")) {
          return;
       }
       this.P(p0, p1, true);
       return;
    }
    public void onPageFinished(WebView p0,String p1){
       o oo = o.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oo, "21")) {
          return;
       }
       if (this.y != null) {
          return;
       }
       super.onPageFinished(p0, p1);
       if (this.l == null) {
          o tw = this.w;
          if (tw == null) {
             this.J(p1);
          }else {
             tw.m(new e(this, p1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oo, "25")) {
          o tj = this.j;
          if (tj != null && j.H(tj)) {
             tj = f.f();
             if (!TextUtils.isEmpty(tj) && !b.l()) {
                k1.o(new n(p0, tj));
             }
          }
       }
       return;
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "1")) {
          return;
       }
       super.onPageStarted(p0, p1, p2);
       this.E(p1);
       this.x.addUrlHistory(p1);
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, o.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("PhotoAdvertisementWebViewClient", "onReceivedError errorCode: "+p1+" description:"+p2, objArray);
       this.Q(p0, p1, p2, p3);
       this.x.addErrorInfo(p3, "onReceivedError\(old\):errCode="+p1+",desc="+p2);
       super.onReceivedError(p0, p1, p2, p3);
       return;
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "18")) {
          return;
       }
       int statusCode = (p2 != null)? p2.getStatusCode(): -1;
       String str = "null";
       String reasonPhrase = (p2 != null)? p2.getReasonPhrase(): str;
       Object[] objArray = new Object[0];
       j0.f("PhotoAdvertisementWebViewClient", "onReceivedHttpError errorCode: "+statusCode+" description:"+reasonPhrase, objArray);
       String str1 = (p1 != null)? String.valueOf(p1.getUrl()): "";
       o tx = this.x;
       StringBuilder str2 = "onReceivedHttpError:errResponse=";
       if (p2 != null) {
          str = Integer.valueOf(p2.getStatusCode());
       }
       tx.addErrorInfo(str1, str2+str);
       this.Q(p0, statusCode, reasonPhrase, str1);
       super.onReceivedHttpError(p0, p1, p2);
       return;
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "20")) {
          return;
       }
       this.x.addErrorInfo(p2.getUrl(), "onReceivedSslError:"+p2.toString());
       Object[] objArray = new Object[0];
       j0.f("PhotoAdvertisementWebViewClient", "onReceivedSslError sslError: "+p2, objArray);
       this.Q(p0, p2.getPrimaryError(), p2.toString(), p2.getUrl());
       super.onReceivedSslError(p0, p1, p2);
       return;
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,WebResourceRequest p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.D(p0, p1.getUrl().toString())) {
          return BlackUrlUtil.d();
       }
       return super.shouldInterceptRequest(p0, p1);
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.D(p0, p1)) {
          return BlackUrlUtil.d();
       }
       return super.shouldInterceptRequest(p0, p1);
    }
    public boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p1.getUrl().toString();
       boolean b = p1.isRedirect();
       Object[] objArray = new Object[0];
       j0.f("PhotoAdvertisementWebViewClient", "webview is shouldOverrideUrlLoading to: "+obj+", redirect: "+b+", isFroMainFrame: "+p1.isForMainFrame(), objArray);
       this.K(p0, p1);
       if (b && this.j != null) {
          if (!obj.startsWith("http")) {
             d.c(this.j, this.w(p0), obj);
          }else if(obj.endsWith(".apk")){
             d.c(this.j, this.w(p0), obj);
          }
       }
       return this.shouldOverrideUrlLoading(p0, obj);
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       int i;
       String str2;
       Object obj7;
       boolean b1;
       boolean b2;
       Uri$Builder str4;
       PhotoAdvertisement obj9;
       PhotoAdvertisement$AdData mDeepLinkFin;
       int this;
       String str8;
       PhotoAdvertisement photoAdverti1;
       Object obj = this;
       Uri obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, o.class, "4");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       obj.x.addUrlHistory(obj2);
       obj.E(obj2);
       if (URLUtil.isNetworkUrl(p1)) {
          return super.shouldOverrideUrlLoading(p0, p1);
       }
       obj3 = obj.j;
       Uri obj4 = null;
       Intent obj5 = PatchProxy.applyOneRefs(obj3, obj4, c.class, "68");
       String str = "AD";
       if (obj5 != patchProxyRe) {
          i = obj5.intValue();
       }else if(obj3 != null){
          photoAdverti1 = obj3.get(str);
       }else {
          photoAdverti1 = obj4;
       }
       if (photoAdverti1 != null) {
          photoAdverti1 = photoAdverti1.mAdData;
          if (photoAdverti1 != null) {
             PhotoAdvertisement$AdData mH5ControlIn = photoAdverti1.mH5ControlInfo;
             if (mH5ControlIn != null) {
                i = mH5ControlIn.mDeepLinkControlType;
             }
          }
       }
       i = null;
       boolean b = true;
       if (i == b) {
          return b;
       }else {
          c3.c(obj.w, f.a);
          c3.c(obj.w, new a(obj2));
          obj3 = obj.s;
          if (obj3 != null && obj3.g(obj2)) {
             return b;
          }else {
             o j = obj.j;
             if (j != null && k.c(j, obj.m, p0, p1, obj.q, obj.o, false)) {
                return b;
             }else {
                String str1 = "5";
                HashMap obj6 = PatchProxy.applyOneRefs(obj2, obj, o.class, str1);
                if (obj6 != patchProxyRe) {
                   str2 = obj6;
                   obj7 = null;
                }else if(!TextUtils.x(p1)){
                   str8 = ":";
                   if (obj2.contains(str8) && obj2.indexOf(str8) <= p1.length()) {
                      str8 = obj2.substring(0, obj2.indexOf(str8));
                   label_00bf :
                      str2 = str8;
                   }
                }
                str8 = "";
                goto label_00bf ;
                obj.H(obj2, str2);
                obj3 = obj.j;
                PhotoAdvertisement photoAdverti = (obj3 != null)? j.k(obj3): obj4;
                obj6 = PatchProxy.applyTwoRefs(obj1, obj2, obj, o.class, "7");
                if (obj6 != patchProxyRe) {
                   b1 = obj6.booleanValue();
                }else if(obj2.startsWith("weixin") && !SystemUtil.M(p0.getContext(), "com.tencent.mm")){
                   i.a(R.style.arg_RES_7f11066a, 0x7f103cee);
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (b1) {
                   return b;
                }else {
                   obj1 = PatchProxy.applyOneRefs(obj2, obj, o.class, "8");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else {
                      obj1 = x0.f(p1);
                      obj6 = new HashMap();
                      QPhoto qPhoto = (obj.j == null)? obj4: new QPhoto(obj.j);
                      obj6.put("QPhoto", qPhoto);
                      o m = obj.m;
                      b1 = (m != null && (obj1 != null && b.a(m, obj1, obj6)))? 1: 0;
                      b2 = b1;
                   }
                   if (b2) {
                      return b;
                   }else {
                      b1 = true;
                      String str3 = str;
                      obj7 = obj4;
                      PatchProxyResult patchProxyRe1 = patchProxyRe;
                      obj1 = PatchProxy.applyThreeRefs(p1, str2, photoAdverti, this, o.class, "9");
                      if (obj1 != patchProxyRe1) {
                         b2 = obj1.booleanValue();
                         patchProxyRe = 0;
                      }else if(photoAdverti == null || (photoAdverti.mConversionType == 3 || obj.j == null)){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                      if (b2) {
                         obj5 = PatchProxy.applyOneRefs(obj2, obj7, b0.class, str1);
                         if (obj5 != patchProxyRe1) {
                            obj4 = obj5;
                         }else if(TextUtils.isEmpty(p1)){
                            obj4 = obj7;
                         }else {
                            String str5 = "backURL";
                            this = obj2.indexOf(str5);
                            int i1 = -1;
                            if (this != i1) {
                               String str6 = obj2;
                               int i2 = str6.indexOf("&", this);
                               i1 = (i2 == i1)? str6.length(): i2 + 1;
                               str = str6.delete(this, i1);
                            }else {
                               str = obj2;
                            }
                            str4 = w0.f(str).buildUpon();
                            String str7 = "action";
                            String[] stringArray = new String[]{"bringToFront"};
                            Uri uri = PatchProxy.applyTwoRefs(str7, stringArray, obj7, h.class, "1");
                            if (uri != patchProxyRe1) {
                            }else {
                               Uri$Builder uBuilder = new Uri$Builder();
                               uBuilder.scheme("kwai").authority(str7);
                               for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                                  uBuilder.appendPath(stringArray[i1]);
                               }
                               uri = uBuilder.build();
                            }
                            str4.appendQueryParameter(str5, uri.toString());
                            obj4 = str4.build();
                         }
                      }else {
                         obj4 = x0.f(p1);
                      }
                      obj5 = b.a(0x66dce92a).c(obj.m, obj4, b1, b1);
                      str = (obj5 != null)? obj5.toString(): "null";
                      Object[] objArray = new Object[0];
                      j0.f("webview", str, objArray);
                      if (obj5 != null) {
                         obj5.addFlags(0x10000000);
                         a.a(str2, obj5);
                         obj.m.startActivity(obj5);
                         obj.I(obj2, str2);
                         o obj8 = PatchProxy.applyOneRefs(obj2, obj, o.class, "26");
                         if (obj8 != patchProxyRe1) {
                            b = obj8.booleanValue();
                         }else if(!TextUtils.x(this.b()) && ((this.b()).startsWith("http") && obj2.startsWith("kwai://"))){
                            b = true;
                         }else {
                            b = false;
                         }
                         if (!b) {
                            obj8 = obj.j;
                            str4 = PatchProxy.applyOneRefs(obj8, obj, o.class, "15");
                            if (str4 != patchProxyRe1) {
                               b = str4.booleanValue();
                            }else if(obj8 != null){
                               obj9 = obj8.get(str3);
                               if (obj9 != null) {
                                  obj9 = obj9.mAdData;
                                  if (obj9 != null) {
                                     mDeepLinkFin = obj9.mDeepLinkFinishWebView;
                                  }
                               }
                            }
                            mDeepLinkFin = null;
                            if (b == null) {
                               if (PatchProxy.isSupport(o.class)) {
                                  obj9 = PatchProxy.applyTwoRefs(Boolean.valueOf(b2), obj4, obj, o.class, "16");
                                  if (obj9 != patchProxyRe1) {
                                     b2 = obj9.booleanValue();
                                  }else if(!b2 || obj4 == null){
                                     b2 = false;
                                  }else {
                                     b2 = TextUtils.n("taobao", obj4.getScheme());
                                  }
                               }else {
                                  goto label_029b ;
                               }
                               if (!b2) {
                               label_0259 :
                                  b2 = true;
                               }
                            }
                            obj.m.finish();
                         }
                      }
                      b2 = false;
                      if (b2) {
                         return b1;
                      }else {
                         obj.G(obj2, str2);
                         if (obj.j == null || (photoAdverti != null && photoAdverti.mConversionType == 3)) {
                            b1 = false;
                         }
                      label_02c6 :
                         if (!b1) {
                            this.c();
                         }
                         return b1;
                      }
                   }
                }
             }
          }
       }
    }
}
