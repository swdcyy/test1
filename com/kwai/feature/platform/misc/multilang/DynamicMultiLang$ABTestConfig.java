package com.kwai.feature.platform.misc.multilang.DynamicMultiLang$ABTestConfig;
import java.io.Serializable;
import java.lang.Object;

public final class DynamicMultiLang$ABTestConfig implements Serializable	// class@0012b2
{
    public boolean blockUI;
    public int duration;
    public boolean enable;

    public void DynamicMultiLang$ABTestConfig(){
       super();
       this.enable = true;
       this.duration = 10;
    }
    public final boolean getBlockUI(){
       return this.blockUI;
    }
    public final int getDuration(){
       return this.duration;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final void setBlockUI(boolean p0){
       this.blockUI = p0;
    }
    public final void setDuration(int p0){
       this.duration = p0;
    }
    public final void setEnable(boolean p0){
       this.enable = p0;
    }
}
