package com.kwai.framework.network.util.e;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import zb6.d;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.util.Objects;

public final class e implements a	// class@000c5a
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void a(String p0,f p1){
       Boolean fALSE = Boolean.FALSE;
       boolean b = p1.d(Boolean.class, fALSE).booleanValue();
       d.c.put(p0, Boolean.valueOf(b));
       g.a(d.b.edit().putBoolean(d.b("host_se_s_d_nebula"), b));
       Objects.toString(p1.d(Boolean.class, fALSE));
    }
}
