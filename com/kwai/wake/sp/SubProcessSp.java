package com.kwai.wake.sp.SubProcessSp;
import com.kwai.wake.sp.SubProcessSp$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import kotlin.jvm.internal.a;
import java.util.Map;
import trd.t0;
import java.lang.CharSequence;
import com.kwai.middleware.azeroth.Azeroth2;
import com.google.gson.Gson;
import com.kwai.wake.sp.SubProcessSp$a;
import java.lang.reflect.Type;
import el.a;
import kotlin.Result;
import android.content.SharedPreferences$Editor;
import oe6.g;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;

public final class SubProcessSp	// class@001124
{
    public final SharedPreferences a;
    public final long b;
    public final long c;
    public final long d;
    public final Context e;
    public static final SubProcessSp$Companion f;

    static {
       SubProcessSp.f = new SubProcessSp$Companion(null);
    }
    public void SubProcessSp(Context p0){
       super();
       this.e = p0;
       SharedPreferences sharedPrefer = o.c(p0, "matrix_single", 0);
       a.o(sharedPrefer, "context.getSharedPrefere¡­SP, Context.MODE_PRIVATE\)");
       this.a = sharedPrefer;
       this.b = 0x1b7740;
       this.c = 0x927c0;
       this.d = 0x927c0;
    }
    public final Map a(){
       Map map = t0.z();
       String str = this.a.getString("all_active_infos", "");
       Azeroth2 uAzeroth2 = (str == null || !str.length())? 1: null;
       if (!uAzeroth2) {
          Object obj = Azeroth2.B.k().i(str, new SubProcessSp$a().getType());
          a.o(obj, "Azeroth2.gson.fromJson\(s¡­, ActiveInfo>>\(\) {}.type\)");
          map = obj;
       }
       return map;
    }
    public final void b(Map p0){
       a.p(p0, "map");
       g.a(this.a.edit().putString("all_active_infos", Azeroth2.B.k().q(p0)));
       Result.constructor-impl(l1.a);
       return;
    }
}
