package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$soSuccess$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nl5.b;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.lang.Throwable;

public final class EveFeatureCenter$soSuccess$2 extends Lambda implements a	// class@0014df
{
    public static final EveFeatureCenter$soSuccess$2 INSTANCE;

    static {
       EveFeatureCenter$soSuccess$2.INSTANCE = new EveFeatureCenter$soSuccess$2();
    }
    public void EveFeatureCenter$soSuccess$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, EveFeatureCenter$soSuccess$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.a();
       EveLog.i$default("EveFeatureCenter#loadLibrary success", false, 2, null);
       b = true;
       return b;
    }
}
