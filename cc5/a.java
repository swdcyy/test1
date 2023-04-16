package cc5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zb5.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import xf6.l;
import java.lang.CharSequence;
import android.util.Pair;
import java.lang.Number;
import java.lang.System;
import java.lang.Math;
import xp6.k;
import wkd.b;
import ac5.a;
import brd.t;
import cjd.e;
import erd.o;
import cc5.a$a;
import erd.g;
import cc5.a$b;
import cc5.a$c;
import cc5.a$d;
import dc5.d;
import brd.z;
import cc5.a$e;
import cc5.a$f;
import crd.b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Long;

public final class a	// class@000695
{
    public static long a = 0x240c8400;
    public static boolean b;
    public static final a c;

    static {
       a.c = new a();
    }
    public void a(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       this.h(null);
       this.g(null);
       this.i(0);
       return;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.getString(b.d("user")+"message_login_security", "");
    }
    public final String c(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a();
    }
    public final a0 d(boolean p0,RequestTiming p1){
       Ref$BooleanRef obj;
       int i;
       Pair pair;
       a0 obj1;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "9");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p1, "requestTiming");
       obj = new Ref$BooleanRef();
       obj.element = p0;
       boolean b = false;
       if (SystemUtil.K()) {
          if (i.b == null) {
             i.b = Boolean.valueOf(l.c("force_stop_im_token_refresh", b));
          }
          if (i.b.booleanValue()) {
             obj.element = b;
          }
       }
       String str = this.c();
       String str1 = this.b();
       i = (str == null || !str.length())? 1: 0;
       if (!i) {
          if (str1 == null || !str1.length()) {
             b = true;
          }
          if (!b) {
             pair = new Pair(str, str1);
          label_0070 :
             if (obj.element == null && pair != null) {
                obj1 = PatchProxy.apply(null, this, uoa, "5");
                l = (obj1 != patchProxyRe)? obj1.longValue(): a.a.getLong(b.d("user")+"message_login_toke_update_time", 0);
                if (Math.abs((l - System.currentTimeMillis())) - a.a < 0) {
                   k.a("IMLogin token is reused");
                   obj1 = a0.B(pair);
                   a.o(obj1, "Single.just\(tokenPair as¡­til.Pair<String, String>\)");
                   return obj1;
                }
             }
          label_00c2 :
             l = System.currentTimeMillis();
             obj1 = b.a(-2142134456).getPassportServiceToken("kuaishou.sixin.login", p1).map(new e()).doOnNext(new a$a(obj, l)).doOnError(new a$b(l)).map(a$c.b).firstOrError().H(new a$d(pair)).T(d.a);
             a.o(obj1, "Singleton\n        .get\(L¡­\(LinkSchedulers.KWAILINK\)");
             return obj1;
          }
       }
       pair = null;
       goto label_0070 ;
    }
    public final void e(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a.p(p0, "requestTiming");
       k.a("IMLogin token getRequest refreshToken");
       this.d(true, p0).R(a$e.b, a$f.b);
       return;
    }
    public final void f(boolean p0){
       a.b = p0;
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"message_login_security", p0);
       g.a(uEditor);
       return;
    }
    public final void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"message_login_service_token", p0);
       g.a(uEditor);
       return;
    }
    public final void i(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "6")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong(b.d("user")+"message_login_toke_update_time", p0);
       g.a(uEditor);
       return;
    }
}
