package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;

public final class DynamicTabConfig$ActivityTabConfig implements Serializable	// class@000859
{
    public boolean mActive;
    public String mActivityId;
    public boolean mBottomAlpha;
    public String[] mConflictWidgetList;
    public String mKsOrderId;
    public String mLogActivityId;
    public String mPageName;
    public int mRedDotType;
    public List mResourceConfigTemplates;
    public int mTabType;
    public String mTabUrl;
    public static final long serialVersionUID = 0x704bb8538e3c8d1a;

    public void DynamicTabConfig$ActivityTabConfig(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig$ActivityTabConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || DynamicTabConfig$ActivityTabConfig.class != p0.getClass()) {
          return false;
       }
       if (this.mTabType != p0.mTabType || (this.mRedDotType != p0.mRedDotType || (this.mBottomAlpha != p0.mBottomAlpha || (!k.a(this.mTabUrl, p0.mTabUrl) || (!k.a(this.mKsOrderId, p0.mKsOrderId) || (!k.a(this.mActivityId, p0.mActivityId) || (!k.a(this.mLogActivityId, p0.mLogActivityId) || (!k.a(this.mPageName, p0.mPageName) || !k.a(this.mResourceConfigTemplates, p0.mResourceConfigTemplates))))))))) {
          b = false;
       }
       return b;
    }
}
