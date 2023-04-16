package com.kwai.framework.network.util.b;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import zb6.d;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class b implements a	// class@000c57
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void a(String p0,f p1){
       Boolean fALSE = Boolean.FALSE;
       boolean b = p1.d(Boolean.class, fALSE).booleanValue();
       Objects.toString(p1.d(Boolean.class, fALSE));
       d.c.put(p0, Boolean.valueOf(b));
       g.a(d.b.edit().putBoolean(d.b("host_se_te_d_ks"), b));
    }
}
