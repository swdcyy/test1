package com.yxcorp.login.userlogin.pluginimpl.GrowthLoginPluginImpl$Companion$slideGuideLimit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import b3d.d0;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class GrowthLoginPluginImpl$Companion$slideGuideLimit$2 extends Lambda implements a	// class@001b8f
{
    public static final GrowthLoginPluginImpl$Companion$slideGuideLimit$2 INSTANCE;

    static {
       GrowthLoginPluginImpl$Companion$slideGuideLimit$2.INSTANCE = new GrowthLoginPluginImpl$Companion$slideGuideLimit$2();
    }
    public void GrowthLoginPluginImpl$Companion$slideGuideLimit$2(){
       super(0);
    }
    public final int invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, GrowthLoginPluginImpl$Companion$slideGuideLimit$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.apply(null, null, d0.class, "4");
       int i = (obj != patchProxyRe)? obj.intValue(): f.f("totalcap_login", -1);
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
