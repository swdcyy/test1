package com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$Config;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class DynamicPendantSwitch$Config implements Serializable	// class@001342
{
    public String componentName;
    public int loadType;

    public void DynamicPendantSwitch$Config(){
       super();
    }
    public final String getComponentName(){
       return this.componentName;
    }
    public final int getLoadType(){
       return this.loadType;
    }
    public final void setComponentName(String p0){
       this.componentName = p0;
    }
    public final void setLoadType(int p0){
       this.loadType = p0;
    }
}
