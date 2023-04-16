package com.kwai.framework.logger.b;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import com.kwai.framework.logger.LogManagerInitModule;
import w96.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import wkd.b;
import x96.a;
import x96.c;

public final class b implements g	// class@001659
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0 = b.a.edit();
       p0.putLong("AppUsedSize", p0.longValue());
       g.a(p0);
       b.a(-1877888124).h();
       b.a(-587602830).f();
    }
}
