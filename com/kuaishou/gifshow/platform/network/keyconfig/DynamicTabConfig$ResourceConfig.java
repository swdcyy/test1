package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ResourceConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;

public final class DynamicTabConfig$ResourceConfig implements Serializable	// class@00085b
{
    public ActionBarSkinConfig mActionBarSkinConfig;
    public String mResourceName;
    public TabViewInfo mTabViewInfo;
    public String mWebviewBackgroundColor;
    public String mXTabBackgroundColor;
    public static final long serialVersionUID = 0x86f6f07af3811d2a;

    public void DynamicTabConfig$ResourceConfig(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig$ResourceConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || DynamicTabConfig$ResourceConfig.class != p0.getClass()) {
          return false;
       }
       return k.a(this.mResourceName, p0.mResourceName);
    }
}
