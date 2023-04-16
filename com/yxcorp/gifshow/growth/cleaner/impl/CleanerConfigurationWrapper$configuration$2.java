package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$configuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfiguration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$configuration$2$a;
import java.lang.reflect.Type;
import el.a;
import vma.a;

public final class CleanerConfigurationWrapper$configuration$2 extends Lambda implements a	// class@001301
{
    public static final CleanerConfigurationWrapper$configuration$2 INSTANCE;

    static {
       CleanerConfigurationWrapper$configuration$2.INSTANCE = new CleanerConfigurationWrapper$configuration$2();
    }
    public void CleanerConfigurationWrapper$configuration$2(){
       super(0);
    }
    public final CleanerConfiguration invoke(){
       Object obj = PatchProxy.apply(null, this, CleanerConfigurationWrapper$configuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(new CleanerConfigurationWrapper$configuration$2$a().getType());
    }
    public Object invoke(){
       return this.invoke();
    }
}
