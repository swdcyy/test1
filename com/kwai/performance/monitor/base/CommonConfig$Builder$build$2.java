package com.kwai.performance.monitor.base.CommonConfig$Builder$build$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.monitor.base.d$a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import oe6.o;

public final class CommonConfig$Builder$build$2 extends Lambda implements l	// class@0010fd
{
    public final d$a this$0;

    public void CommonConfig$Builder$build$2(d$a p0){
       this.this$0 = p0;
       super(1);
    }
    public final SharedPreferences invoke(String p0){
       a.q(p0, "it");
       SharedPreferences sharedPrefer = o.c(d$a.a(this.this$0), "performance", 0);
       a.h(sharedPrefer, "mApplication.getSharedPr¡­e\", Context.MODE_PRIVATE\)");
       return sharedPrefer;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
