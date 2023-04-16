package com.yxcorp.gifshow.photoad.IpdxHelper$mIsIpdxValid$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class IpdxHelper$mIsIpdxValid$2 extends Lambda implements a	// class@000f5d
{
    public static final IpdxHelper$mIsIpdxValid$2 INSTANCE;

    static {
       IpdxHelper$mIsIpdxValid$2.INSTANCE = new IpdxHelper$mIsIpdxValid$2();
    }
    public void IpdxHelper$mIsIpdxValid$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, IpdxHelper$mIsIpdxValid$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().d("disableIpdxService", false) ^ 0x01);
    }
}
