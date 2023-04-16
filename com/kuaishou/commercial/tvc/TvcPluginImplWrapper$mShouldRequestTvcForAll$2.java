package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$mShouldRequestTvcForAll$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class TvcPluginImplWrapper$mShouldRequestTvcForAll$2 extends Lambda implements a	// class@0016a0
{
    public static final TvcPluginImplWrapper$mShouldRequestTvcForAll$2 INSTANCE;

    static {
       TvcPluginImplWrapper$mShouldRequestTvcForAll$2.INSTANCE = new TvcPluginImplWrapper$mShouldRequestTvcForAll$2();
    }
    public void TvcPluginImplWrapper$mShouldRequestTvcForAll$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, TvcPluginImplWrapper$mShouldRequestTvcForAll$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().c("tvcStreamIdWhiteList", "")).equals("all");
    }
}
