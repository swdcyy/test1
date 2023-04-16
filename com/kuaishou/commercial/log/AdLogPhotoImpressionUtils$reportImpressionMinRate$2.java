package com.kuaishou.commercial.log.AdLogPhotoImpressionUtils$reportImpressionMinRate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Double;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import java.lang.StringBuilder;
import yx.j0;

public final class AdLogPhotoImpressionUtils$reportImpressionMinRate$2 extends Lambda implements a	// class@0014f2
{
    public static final AdLogPhotoImpressionUtils$reportImpressionMinRate$2 INSTANCE;

    static {
       AdLogPhotoImpressionUtils$reportImpressionMinRate$2.INSTANCE = new AdLogPhotoImpressionUtils$reportImpressionMinRate$2();
    }
    public void AdLogPhotoImpressionUtils$reportImpressionMinRate$2(){
       super(0);
    }
    public final Double invoke(){
       Double obj = PatchProxy.apply(null, this, AdLogPhotoImpressionUtils$reportImpressionMinRate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.b("adImpressionRate", Double.TYPE, Double.valueOf(0));
       Object[] objArray = new Object[0];
       j0.a("AdLogImpressionUtils", "impression rate is "+obj, objArray);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
