package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$mCleanerConfiguration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthCleanerService$mCleanerConfiguration$2 extends Lambda implements a	// class@001339
{
    public static final GrowthCleanerService$mCleanerConfiguration$2 INSTANCE;

    static {
       GrowthCleanerService$mCleanerConfiguration$2.INSTANCE = new GrowthCleanerService$mCleanerConfiguration$2();
    }
    public void GrowthCleanerService$mCleanerConfiguration$2(){
       super(0);
    }
    public final CleanerConfigurationWrapper invoke(){
       Object obj = PatchProxy.apply(null, this, GrowthCleanerService$mCleanerConfiguration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CleanerConfigurationWrapper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
