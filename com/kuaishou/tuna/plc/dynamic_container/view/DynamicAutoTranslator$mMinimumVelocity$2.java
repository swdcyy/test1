package com.kuaishou.tuna.plc.dynamic_container.view.DynamicAutoTranslator$mMinimumVelocity$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Integer;

public final class DynamicAutoTranslator$mMinimumVelocity$2 extends Lambda implements a	// class@001004
{
    public static final DynamicAutoTranslator$mMinimumVelocity$2 INSTANCE;

    static {
       DynamicAutoTranslator$mMinimumVelocity$2.INSTANCE = new DynamicAutoTranslator$mMinimumVelocity$2();
    }
    public void DynamicAutoTranslator$mMinimumVelocity$2(){
       super(0);
    }
    public final int invoke(){
       Application obj = PatchProxy.apply(null, this, DynamicAutoTranslator$mMinimumVelocity$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       Resources resources = obj.getResources();
       a.o(resources, "AppEnv.getAppContext\(\).resources");
       return (int)((float)400 * c.c(resources).density);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
