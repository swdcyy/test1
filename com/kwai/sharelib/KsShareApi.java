package com.kwai.sharelib.KsShareApi;
import com.kwai.sharelib.KsShareApi$appVersion$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sharelib.KsShareApi$appName$2;
import kotlin.LazyThreadSafetyMode;
import com.kwai.sharelib.KsShareApi$defaultShareInit$2;
import com.kwai.sharelib.KsShareApi$d;
import kp7.a;
import com.kwai.sharelib.KsShareApi$shareProhibitedScene$2;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.KsShareApi$c;
import java.util.Map;
import uo7.b0;
import com.kwai.sharelib.KsShareApi$b;
import uo7.s;
import android.app.Application;
import java.util.HashSet;

public final class KsShareApi	// class@001695
{
    public static Application a;
    public static boolean b;
    public static boolean c;
    public static String d;
    public static final p e;
    public static long f;
    public static final p g;
    public static final p h;
    public static String i;
    public static String j;
    public static KsShareApi$c k;
    public static b0 l;
    public static KsShareApi$a m;
    public static q n;
    public static s o;
    public static KsShareApi$b p;
    public static final p q;
    public static boolean r;
    public static final KsShareApi s;

    static {
       KsShareApi.s = new KsShareApi();
       KsShareApi.e = s.c(KsShareApi$appVersion$2.INSTANCE);
       KsShareApi.f = 0x2af8;
       KsShareApi.g = s.c(KsShareApi$appName$2.INSTANCE);
       KsShareApi.h = s.b(LazyThreadSafetyMode.NONE, KsShareApi$defaultShareInit$2.INSTANCE);
       KsShareApi.l = new KsShareApi$d();
       KsShareApi.o = new a();
       KsShareApi.q = s.c(KsShareApi$shareProhibitedScene$2.INSTANCE);
    }
    public void KsShareApi(){
       super();
    }
    public final Pair a(){
       KsShareApi$c obj = PatchProxy.apply(null, this, KsShareApi.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsShareApi.k;
       if (obj == null) {
          a.S("userInfo");
       }
       return obj.b();
    }
    public final Map b(){
       Object obj = PatchProxy.apply(null, this, KsShareApi.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsShareApi.h.getValue();
    }
    public final b0 c(){
       return KsShareApi.l;
    }
    public final KsShareApi$b d(){
       return KsShareApi.p;
    }
    public final s e(){
       return KsShareApi.o;
    }
    public final boolean f(){
       return KsShareApi.b;
    }
    public final String g(){
       String obj = PatchProxy.apply(null, this, KsShareApi.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsShareApi.i;
       if (obj == null) {
          a.S("kpf");
       }
       return obj;
    }
    public final String h(){
       String obj = PatchProxy.apply(null, this, KsShareApi.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsShareApi.j;
       if (obj == null) {
          a.S("kpn");
       }
       return obj;
    }
    public final Pair i(){
       KsShareApi$c obj = PatchProxy.apply(null, this, KsShareApi.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsShareApi.k;
       if (obj == null) {
          a.S("userInfo");
       }
       return obj.a();
    }
    public final String j(){
       return KsShareApi.d;
    }
    public final Application k(){
       Application obj = PatchProxy.apply(null, this, KsShareApi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsShareApi.a;
       if (obj == null) {
          a.S("context");
       }
       return obj;
    }
    public final HashSet l(){
       Object obj = PatchProxy.apply(null, this, KsShareApi.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsShareApi.q.getValue();
    }
    public final KsShareApi m(boolean p0){
       KsShareApi.b = p0;
       return this;
    }
}
