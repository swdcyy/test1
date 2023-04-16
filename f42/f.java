package f42.f;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import erd.g;
import com.kuaishou.android.model.feed.PhotoType;
import com.kwai.framework.model.user.User$FollowStatus;
import y41.i$a;
import y41.i;
import java.util.Locale;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import java.lang.Number;
import ekd.k1;
import t02.a0;
import f42.c;
import f42.b;
import f42.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Math;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import android.net.Uri;
import ekd.w0;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class f	// class@002866
{
    public boolean a;
    public static final long b;
    public static final int c;

    static {
       f.b = TimeUnit.DAYS.toMillis(1);
    }
    public void f(){
       super();
       this.a = true;
    }
    public static boolean a(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uof, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 != 278 && (p0 != 4 && (p0 != 47 && (p0 != 5 && (p0 != 97 && (p0 != 153 && (p0 != 74 && (p0 == 205 || (p0 == 301 && a.t().d("enableLiveEndAutoJump", b)))))))))) {
          b = true;
       }
       return b;
    }
    public static void b(GifshowActivity p0,String p1,User p2,int p3,g p4){
       Object[] objArray;
       int i = 2;
       int i1 = 1;
       int i2 = 3;
       if (PatchProxy.isSupport2(f.class, "10")) {
          objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, f.class, "10")) {
             return;
          }
       }
       objArray = new Object[i2];
       objArray[0] = p2.mId;
       objArray[i1] = p1;
       objArray[i] = Integer.valueOf(PhotoType.LIVESTREAM.toInt());
       String str = String.format("%s_%s_l%s", objArray);
       if (p2.isPrivate()) {
          p2.setFollowStatus(User$FollowStatus.FOLLOW_REQUESTING);
       }else {
          p2.setFollowStatus(User$FollowStatus.FOLLOWING);
       }
       p2.mPage = "live";
       i$a uoa = new i$a(p1);
       uoa.o(p2);
       uoa.h(p0.Q2());
       uoa.d(str);
       uoa.m(f.c(p1));
       uoa.n(p3);
       uoa.r(0);
       uoa.j(p4);
       uoa.a().c();
       PatchProxy.onMethodExit(f.class, "10");
       return;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{QCurrentUser.me().getId(),p0,Integer.valueOf(PhotoType.LIVESTREAM.toInt())};
       return String.format(Locale.US, "ks://live/%s/%s/%d", objArray);
    }
    public static long d(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uof, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (p0 > 0) {
          return k1.k(p0);
       }else {
          return 0;
       }
    }
    public static long e(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.max(0, k0.c(p0, c.a, b.a, e.a).or(Long.valueOf(0)).longValue());
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean(b.d("user")+"liveClosePageAnchorEnterFirstShow", true);
    }
    public static boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && p0.startsWith("variety_"))? true: false;
       return b;
    }
    public static void h(String p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "2")) {
          return;
       }
       if (!TextUtils.x(p0) && p1 != null) {
          if (p0.startsWith("kwai://")) {
             Uri uri = w0.f(p0);
             if (uri != null) {
                p1.startActivity(new Intent("android.intent.action.VIEW", uri));
             }
          }else {
             c.i(p1, KwaiWebViewActivity.N3(p1, p0).a());
          }
       }
       return;
    }
    public static void i(String p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "3")) {
          return;
       }
       p1.startActivity(new Intent("android.intent.action.VIEW", w0.f("kwai://message/"+p0)));
       return;
    }
    public static void j(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uof, "14")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"liveClosePageAnchorEnterFirstShow", p0);
       g.a(uEditor);
       return;
    }
}
