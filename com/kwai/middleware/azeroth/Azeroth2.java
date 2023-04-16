package com.kwai.middleware.azeroth.Azeroth2;
import com.kwai.middleware.azeroth.Azeroth2$baseUrlList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.middleware.azeroth.Azeroth2$appNetworkConfig$2;
import com.kwai.middleware.azeroth.Azeroth2$network$2;
import q97.a;
import q97.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import n97.b;
import com.kwai.middleware.azeroth.Azeroth2$gson$2;
import z97.d;
import com.kwai.middleware.azeroth.Azeroth2$mDefaultBaseUrl$2;
import com.kwai.middleware.azeroth.Azeroth2$mDefaultStagingBaseUrl$2;
import com.kwai.middleware.azeroth.Azeroth2$mDefaultTestBaseUrl$2;
import android.content.Intent;
import com.kwai.middleware.azeroth.Azeroth2$e;
import java.lang.Runnable;
import f97.a;
import xb7.a;
import android.content.Context;
import xb7.b;
import com.kwai.middleware.azeroth.AzerothAccount;
import com.kwai.middleware.azeroth.AzerothStorage;
import com.google.gson.Gson;
import java.lang.Class;
import t97.c;
import java.util.List;
import i97.a;
import k97.b;
import r97.a0;
import u97.d;
import java.lang.reflect.Type;
import java.util.Objects;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import java.lang.StringBuilder;
import java.lang.Throwable;
import o97.a;
import aa7.a;
import android.os.Parcelable;
import com.kwai.middleware.azeroth.AzerothConfig;
import java.lang.IllegalArgumentException;
import com.kwai.middleware.azeroth.Azeroth2$a;
import q97.e;
import qb7.a;
import com.kwai.middleware.azeroth.Azeroth2$b;
import wb7.a;
import com.kwai.middleware.azeroth.Azeroth2$c;
import y97.a;
import com.kwai.middleware.azeroth.Azeroth2$d;
import tb7.b;
import com.kwai.middleware.azeroth.Azeroth2$initAppLifecycle$1;
import brd.t;
import rb7.c;
import l97.b;
import l97.c;
import y97.e;
import erd.o;

public final class Azeroth2	// class@000d4d
{
    public static final p A;
    public static final Azeroth2 B;
    public static final String a;
    public static boolean b;
    public static Context c;
    public static final p d;
    public static f e;
    public static final p f;
    public static final p g;
    public static boolean h;
    public static c i;
    public static a0 j;
    public static a k;
    public static a l;
    public static b m;
    public static a n;
    public static a o;
    public static a p;
    public static a q;
    public static a r;
    public static final p s;
    public static boolean t;
    public static AzerothStorage u;
    public static SDKHandler v;
    public static e w;
    public static c x;
    public static final p y;
    public static final p z;

    static {
       Azeroth2.B = new Azeroth2();
       Azeroth2.d = s.c(Azeroth2$baseUrlList$2.INSTANCE);
       Azeroth2.f = s.c(Azeroth2$appNetworkConfig$2.INSTANCE);
       Azeroth2.g = s.c(Azeroth2$network$2.INSTANCE);
       c uoc = new a().create();
       a.h(uoc, "DefaultLogcatFactory\(\).create\(\)");
       Azeroth2.i = uoc;
       Azeroth2.r = new b();
       Azeroth2.s = s.c(Azeroth2$gson$2.INSTANCE);
       Azeroth2.w = new a();
       Azeroth2.x = new d();
       Azeroth2.y = s.c(Azeroth2$mDefaultBaseUrl$2.INSTANCE);
       Azeroth2.z = s.c(Azeroth2$mDefaultStagingBaseUrl$2.INSTANCE);
       Azeroth2.A = s.c(Azeroth2$mDefaultTestBaseUrl$2.INSTANCE);
    }
    public void Azeroth2(){
       super();
    }
    public static void B(Azeroth2 p0,Intent p1,String p2,int p3,Object p4){
       p0.A(p1, null);
    }
    public static final void a(Azeroth2 p0,boolean p1){
       Azeroth2.h = p1;
    }
    public final void A(Intent p0,String p1){
       a.q(p0, "intent");
       a.a(new Azeroth2$e(p0, p1));
    }
    public final a b(String p0){
       a.q(p0, "name");
       c x = Azeroth2.x;
       Context c = Azeroth2.c;
       if (c == null) {
          a.S("appContext");
       }
       return x.a(c, p0);
    }
    public final AzerothAccount c(){
       AzerothStorage u = Azeroth2.u;
       if (u == null) {
          a.S("mStorage");
       }
       String str = u.a().b("KEY_ACCOUNT");
       Azeroth2 uAzeroth2 = (!str.length())? 1: null;
       AzerothAccount uAzerothAcco = (uAzeroth2)? null: Azeroth2.B.k().h(str, AzerothAccount.class);
       return uAzerothAcco;
    }
    public final Context d(){
       Context c = Azeroth2.c;
       if (c == null) {
          a.S("appContext");
       }
       return c;
    }
    public final c e(){
       return Azeroth2.f.getValue();
    }
    public final List f(){
       return Azeroth2.d.getValue();
    }
    public final a g(){
       return Azeroth2.n;
    }
    public final c h(){
       return Azeroth2.i;
    }
    public final b i(){
       return Azeroth2.m;
    }
    public final String j(){
       return this.e().b;
    }
    public final Gson k(){
       return Azeroth2.s.getValue();
    }
    public final a0 l(){
       return Azeroth2.j;
    }
    public final d m(){
       return this.e().a();
    }
    public final Object n(String p0,Type p1){
       String str = "name";
       a.q(p0, str);
       String str1 = "typeOfT";
       a.q(p1, str1);
       SDKHandler v = Azeroth2.v;
       if (v == null) {
          a.S("mSDKHandler");
       }
       Objects.requireNonNull(v);
       a.q(p0, str);
       a.q(p1, str1);
       str = v.b(p0);
       Azeroth2 uAzeroth2 = (!str.length())? 1: null;
       Object obj = null;
       if (!uAzeroth2) {
          try{
             obj = Azeroth2.B.k().i(str, p1);
          }catch(java.lang.Exception e6){
             Azeroth2.B.h().a("Get sdk config "+p0+" fail.", e6);
          }
       }
    }
    public final String o(String p0){
       a.q(p0, "name");
       SDKHandler v = Azeroth2.v;
       if (v == null) {
          a.S("mSDKHandler");
       }
       return v.b(p0);
    }
    public final AzerothStorage p(){
       AzerothStorage u = Azeroth2.u;
       if (u == null) {
          a.S("mStorage");
       }
       return u;
    }
    public final a q(){
       return Azeroth2.o;
    }
    public final a r(){
       return Azeroth2.q;
    }
    public final void s(String p0,AzerothAccount p1){
       if (a.g(this.c(), p1)) {
          return;
       }
       Intent intent = new Intent("com.kwai.middleware.azeroth.ACCOUNT_CHANGED");
       intent.putExtra("KEY_ACCOUNT_CHANGED_TYPE", p0);
       intent.putExtra("KEY_ACCOUNT", p1);
       Azeroth2.B(this, intent, null, 2, null);
       return;
    }
    public final boolean t(){
       return Azeroth2.h;
    }
    public final boolean u(){
       return Azeroth2.t;
    }
    public final void v(Throwable p0){
       a.q(p0, "e");
       if (Azeroth2.t) {
          throw p0;
       }
       Azeroth2.i.c(p0);
       return;
    }
    public synchronized final void w(Context p0,AzerothConfig p1){
       c uoc;
       Azeroth2$b a;
       if (Azeroth2.b) {
          this.v(new IllegalArgumentException("The azeroth is only allowed to be initialized once."));
          return;
       }else {
          Azeroth2.c = p0;
          Azeroth2.t = p1.b;
          Azeroth2.j = p1.e;
          Azeroth2.e = new Azeroth2$a(p1);
          Azeroth2.k = p1.f;
          Azeroth2.m = p1.g;
          Azeroth2.n = p1.h;
          Azeroth2.r = p1.i;
          Azeroth2.x = p1.j;
          AzerothConfig d = p1.d;
          Azeroth2.w = d;
          if (!d instanceof a) {
             uoc = d.create();
             a.h(uoc, "mDebuggerFactory.create\(\)");
             Azeroth2.i = uoc;
          }
          a = Azeroth2$b.a;
          Objects.requireNonNull(a.c);
          a.q(a, "<set-?>");
          a.a = a;
          Objects.requireNonNull(a.b);
          a.a = new Azeroth2$c();
          Azeroth2.u = new AzerothStorage();
          Azeroth2.v = new SDKHandler(p1.c);
          a.a(Azeroth2$d.b);
          uoc = Azeroth2.c;
          if (uoc == null) {
             a.S("appContext");
          }
          if (b.i(uoc)) {
             b.j(Azeroth2$initAppLifecycle$1.INSTANCE);
          }
          Azeroth2.b = true;
          return;
       }
    }
    public final t x(){
       return c.c.b(b.class);
    }
    public final t y(String p0){
       String str = "name";
       a.q(p0, str);
       SDKHandler v = Azeroth2.v;
       if (v == null) {
          a.S("mSDKHandler");
       }
       Objects.requireNonNull(v);
       a.q(p0, str);
       t ot = c.c.b(c.class).map(new e(v, p0));
       a.h(ot, "mSDKHandler.registerSDKConfigEvent\(name\)");
       return ot;
    }
    public final void z(String p0){
       Intent intent = new Intent("com.kwai.middleware.azeroth.APP_LIFE");
       intent.putExtra("KEY_APP_LIFE_STATE", p0);
       Azeroth2.B(this, intent, null, 2, null);
    }
}
