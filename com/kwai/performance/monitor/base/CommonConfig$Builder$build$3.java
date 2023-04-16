package com.kwai.performance.monitor.base.CommonConfig$Builder$build$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.content.SharedPreferences;
import java.util.Set;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class CommonConfig$Builder$build$3 extends Lambda implements l	// class@0010fe
{
    public static final CommonConfig$Builder$build$3 INSTANCE;

    static {
       CommonConfig$Builder$build$3.INSTANCE = new CommonConfig$Builder$build$3();
    }
    public void CommonConfig$Builder$build$3(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Set invoke(SharedPreferences p0){
       a.q(p0, "it");
       return p0.getAll().keySet();
    }
}
