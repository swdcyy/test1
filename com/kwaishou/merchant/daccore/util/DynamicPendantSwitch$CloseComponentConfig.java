package com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$CloseComponentConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public final class DynamicPendantSwitch$CloseComponentConfig implements Serializable	// class@001341
{
    public List anchorCloseComponent;
    public List audienceCloseComponent;

    public void DynamicPendantSwitch$CloseComponentConfig(){
       super();
    }
    public final List getAnchorCloseComponent(){
       return this.anchorCloseComponent;
    }
    public final List getAudienceCloseComponent(){
       return this.audienceCloseComponent;
    }
    public final void setAnchorCloseComponent(List p0){
       this.anchorCloseComponent = p0;
    }
    public final void setAudienceCloseComponent(List p0){
       this.audienceCloseComponent = p0;
    }
}
