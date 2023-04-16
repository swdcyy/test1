package mhc.n1;
import uo7.u;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.sharelib.exception.ForwardCancelException;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.a0;
import t45.d;
import brd.z;
import mhc.n1$b;
import erd.g;
import crd.b;
import mhc.n1$a;
import rq4.d;
import java.lang.Integer;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import zic.m0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f3b.o;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Exception;
import java.lang.Boolean;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;

public abstract class n1 implements u	// class@00358b
{

    public void n1(){
       super();
    }
    public int a(Throwable p0){
       int i;
       if (p0 == null) {
          i = 0;
       }else if(p0 instanceof ForwardCancelException){
          i = 1;
       }else {
          i = -1;
       }
       return i;
    }
    public final void d(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n1.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       this.o(p0, p1);
       a0.B("").T(d.c).Q(new n1$b(this, p0, p1));
       return;
    }
    public final void e(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n1.class, "2")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       a0.B("").T(d.c).Q(new n1$a(this, p0, p1, p2));
       if (p2 == null) {
          this.p(p0, p1);
       }else if(p2 instanceof ForwardCancelException){
          this.l(p0, p1);
       }else {
          this.m(p0, p1, p2);
       }
       this.n(p0, p1);
       return;
    }
    public abstract void f(k p0,d p1);
    public void g(k p0,d p1,ShareInitResponse$SharePanelElement p2,int p3){
       if (PatchProxy.isSupport(n1.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, n1.class, "4")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "log");
       a.p(p2, "panelElement");
       this.f(p0, p1);
       return;
    }
    public void h(k p0,HashMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n1.class, "11")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "logMap");
       return;
    }
    public final String i(k p0){
       String str1;
       String str2;
       String str3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n1.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "conf");
       obj = PatchProxy.apply(null, null, m0.class, "7");
       if (obj != patchProxyRe) {
       }else {
          obj = new HashMap();
          ClientEvent$UrlPackage urlPackage = u1.k();
          if (urlPackage != null) {
             str1 = (TextUtils.x(urlPackage.page2))? o.i(urlPackage.page): urlPackage.page2;
             str2 = TextUtils.I(urlPackage.entryPageSource);
          }else {
             str2 = "";
             str1 = str2;
          }
          ClientEvent$UrlPackage urlPackage1 = u1.p();
          if (urlPackage1 != null) {
             str3 = (TextUtils.x(urlPackage1.page2))? o.i(urlPackage1.page): urlPackage1.page2;
          }else {
             str3 = "";
          }
          obj.put("urlPage", TextUtils.I(str1));
          obj.put("referUrlPage", TextUtils.I(str3));
          obj.put("entryPageSource", TextUtils.I(str2));
       }
       a.o(obj, "logMap");
       try{
          this.h(p0, obj);
          String str = a.a.q(obj);
          a.o(str, "Gsons.KWAI_GSON.toJson\(logMap\)");
          return str;
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          return v2;
       }
    }
    public void j(k p0,d p1,boolean p2){
       if (PatchProxy.isSupport(n1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, n1.class, "3")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "dsUserShareClientLog");
       Activity uActivity = p0.k();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       m0.f(p1, p2, uActivity);
       return;
    }
    public boolean k(k p0,ShareInitResponse$SharePanelElement p1,int p2){
       Object obj;
       ShareAnyResponse$ShareAnyData mShareMethod;
       if (PatchProxy.isSupport(n1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, n1.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       ShareAnyResponse shareAnyResp = p0.r();
       if (shareAnyResp != null) {
          shareAnyResp = shareAnyResp.mShareAnyData;
          if (shareAnyResp != null) {
             mShareMethod = shareAnyResp.mShareMethod;
          label_003a :
             obj = 1;
             if (!(a.g(mShareMethod, "DOWNLOAD") ^ obj) || (a.g(p1.mId, "PRIVATE_MESSAGE") && p1.mExtraInfo == null)) {
                boolean b = false;
             }
             return obj;
          }
       }
       mShareMethod = null;
       goto label_003a ;
    }
    public void l(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n1.class, "9")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       return;
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n1.class, "10")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       a.p(p2, "err");
       return;
    }
    public void n(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n1.class, "7")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       return;
    }
    public void o(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n1.class, "6")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       return;
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n1.class, "8")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       return;
    }
}
