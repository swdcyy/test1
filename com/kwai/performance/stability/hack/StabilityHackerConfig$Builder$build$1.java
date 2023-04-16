package com.kwai.performance.stability.hack.StabilityHackerConfig$Builder$build$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.stability.hack.b$a;
import android.content.SharedPreferences;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import oe6.o;
import java.lang.Object;

public final class StabilityHackerConfig$Builder$build$1 extends Lambda implements a	// class@00121d
{
    public final b$a this$0;

    public void StabilityHackerConfig$Builder$build$1(b$a p0){
       this.this$0 = p0;
       super(0);
    }
    public final SharedPreferences invoke(){
       b$a a = this.this$0.a;
       if (a == null) {
          a.S("mApplication");
       }
       SharedPreferences sharedPrefer = o.c(a, "performance", 0);
       a.h(sharedPrefer, "mApplication.getSharedPr¡­e\", Context.MODE_PRIVATE\)");
       return sharedPrefer;
    }
    public Object invoke(){
       return this.invoke();
    }
}
