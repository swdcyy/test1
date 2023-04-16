package com.kwai.kxb.service.ExpConfig$isBundleLoadRecordEnabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.service.ExpConfig;
import java.lang.reflect.Type;

public final class ExpConfig$isBundleLoadRecordEnabled$2 extends Lambda implements a	// class@0007e4
{
    public static final ExpConfig$isBundleLoadRecordEnabled$2 INSTANCE;

    static {
       ExpConfig$isBundleLoadRecordEnabled$2.INSTANCE = new ExpConfig$isBundleLoadRecordEnabled$2();
    }
    public void ExpConfig$isBundleLoadRecordEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ExpConfig$isBundleLoadRecordEnabled$2.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = ExpConfig.f.e("kds_bundle_load_record", Boolean.TYPE, Boolean.TRUE);
       }
       return obj.booleanValue();
    }
}
