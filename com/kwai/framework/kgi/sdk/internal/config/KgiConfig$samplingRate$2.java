package com.kwai.framework.kgi.sdk.internal.config.KgiConfig$samplingRate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import java.lang.Float;

public final class KgiConfig$samplingRate$2 extends Lambda implements a	// class@001589
{
    public static final KgiConfig$samplingRate$2 INSTANCE;

    static {
       KgiConfig$samplingRate$2.INSTANCE = new KgiConfig$samplingRate$2();
    }
    public void KgiConfig$samplingRate$2(){
       super(0);
    }
    public final float invoke(){
       float f;
       Object[] objArray = null;
       KgiConfigItem obj = PatchProxy.apply(objArray, this, KgiConfig$samplingRate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = KgiConfig.g.c();
       if (obj != null) {
          Float uFloat = Float.valueOf(obj.samplingRate);
          int i = 0;
          if (uFloat.floatValue() - (float)i >= 0) {
             i = 1;
          }
          if (i) {
             objArray = uFloat;
          }
          if (objArray != null) {
             f = objArray.floatValue();
          label_0038 :
             return f;
          }
       }
       f = 0;
       goto label_0038 ;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
