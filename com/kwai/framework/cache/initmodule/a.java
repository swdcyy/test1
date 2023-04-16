package com.kwai.framework.cache.initmodule.a;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import v56.g;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class a implements g	// class@0014ee
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       p0 = g.a.edit();
       p0.putLong("DyUsedSize", p0.longValue());
       g.a(p0);
    }
}
