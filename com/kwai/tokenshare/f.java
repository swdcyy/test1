package com.kwai.tokenshare.f;
import m4d.b;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import com.yxcorp.plugin.kwaitoken.model.ReportKTInfo;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.security.KSecurity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ua6.b;
import ua6.b$a;
import ia0.c;
import ekd.a0;
import android.util.Base64;
import java.lang.Integer;
import java.lang.Boolean;
import wkd.b;
import tjc.c;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.app.Application;
import o56.a;
import android.content.Context;
import bu7.k;
import bu7.j0;
import zf6.k;
import du7.a;
import com.kwai.tokenshare.f$a;
import com.kwai.tokenshare.a$a;
import com.kwai.tokenshare.a;
import bu7.c0;
import java.lang.Runnable;
import ekd.k1;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.log.h;
import tkd.b;
import tkd.d;
import nl9.h0;
import ayb.i;
import cu7.b;
import mhc.r;
import brd.t;
import com.kwai.tokenshare.d;
import erd.o;
import bu7.b0;
import erd.g;
import com.kwai.tokenshare.e;
import t45.d;
import brd.z;
import bu7.a0;
import bu7.z;
import crd.b;
import com.kwai.tokenshare.model.TokenInfoModel;

public class f implements b	// class@001921
{
    public final KwaiTokenInitModule a;

    public void f(KwaiTokenInitModule p0){
       this.a = p0;
       super();
    }
    public String a(ReportKTInfo p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyTwoRefs(p0, p1, obj, KwaiTokenInitModule.class, "16");
       if (str != patchProxyRe) {
       }else {
          str = null;
          String securityValu = KSecurity.getSecurityValue(p0.mKeyIndex);
          if (!TextUtils.x(securityValu)) {
             str = Base64.encodeToString(a0.a(p1.getBytes(), securityValu.getBytes(), (a0.c(b.c.a().e().getDeviceId())).substring(0, 16)), 2);
          }
       }
       return str;
    }
    public boolean b(int p0,String p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uof, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = b.a(-1608526086).S();
       Log.g("KwaiTokenInitModule", "isAllowShowDialog hasSplash:"+b);
       if (b) {
          KwaiTokenInitModule.H = true;
          if (p0 == 3 && ("downloadVideo").equals(p1)) {
             j0.g(a.b()).d();
          }
       }
       return (b ^ 0x01);
    }
    public boolean c(){
       return KwaiTokenInitModule.D;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.d();
    }
    public boolean e(int p0,String p1,String p2){
       if (PatchProxy.isSupport(f.class)) {
          p2 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, f.class, "10");
          if (p2 != PatchProxyResult.class) {
             return p2.booleanValue();
          }
       }
       if (p0 == 1 && a.c().d(p1)) {
          if (!this.a.o0()) {
             this.a.z.a(new f$a(this, p1));
          }else {
             k1.o(new c0(p1));
          }
          return 1;
       }else {
          return false;
       }
    }
    public void f(String p0,String p1,String p2,JsonObject p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "1")) {
          return;
       }
       this.a.p0(p0, p1, p2, p3);
       return;
    }
    public boolean g(){
       return KwaiTokenInitModule.E;
    }
    public String getSessionId(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x4b316083).getSessionId();
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "9")) {
          return;
       }
       Log.g("KwaiTokenInitModule", "setClipBoardTokenShowed");
       d.a(-536296199).Vn(true);
       d.a(0x4f878389).xL(this.c(), p0);
       return;
    }
    public boolean i(int p0,String p1,String p2){
       b obj;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, f.class, "7");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = b.a(0x478f20b1);
       String a = r.a;
       String sessionId = b.a(0x4b316083).getSessionId();
       String str = PatchProxy.apply(null, this, uof, "5");
       if (str != patchProxyRe) {
       }else if(this.c() && (this.g() && !KwaiTokenInitModule.F)){
          str1 = "firstColdLaunchToday";
       }else if(this.c()){
          str1 = "coldLaunch";
       }else {
          str1 = "hotLaunch";
       }
       str = str1;
       KwaiTokenInitModule.F = true;
       obj.a(p1, a, sessionId, str).map(d.b).doOnNext(new b0(this, p1)).map(e.b).observeOn(d.a).subscribe(new a0(this, p0, p2, p1), new z(this, p0, p2, p1));
       return true;
    }
    public final void j(TokenInfoModel p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "6")) {
          return;
       }
       if (!KwaiTokenInitModule.G && (this.c() && this.g())) {
          KwaiTokenInitModule.G = true;
          String str = (p0 != null)? TextUtils.E(p0.mShareId): "";
          this.a.p0("", str, p1, null);
       }
    label_0030 :
       return;
    }
}
