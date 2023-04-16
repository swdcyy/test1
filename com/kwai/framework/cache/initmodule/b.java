package com.kwai.framework.cache.initmodule.b;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import v56.g;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class b implements g	// class@0014ef
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0 = g.a.edit();
       p0.putLong("DyLiteUsedSize", p0.longValue());
       g.a(p0);
    }
}
