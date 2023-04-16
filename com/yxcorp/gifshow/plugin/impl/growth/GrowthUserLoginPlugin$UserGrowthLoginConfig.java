package com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$UserGrowthLoginConfig;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$UserGrowthLoginConfig$Config;

public final class GrowthUserLoginPlugin$UserGrowthLoginConfig implements Serializable	// class@000fc2
{
    public GrowthUserLoginPlugin$UserGrowthLoginConfig$Config config;
    public boolean showEveryDay;

    public void GrowthUserLoginPlugin$UserGrowthLoginConfig(){
       super();
    }
    public final GrowthUserLoginPlugin$UserGrowthLoginConfig$Config getConfig(){
       return this.config;
    }
    public final boolean getShowEveryDay(){
       return this.showEveryDay;
    }
    public final void setConfig(GrowthUserLoginPlugin$UserGrowthLoginConfig$Config p0){
       this.config = p0;
    }
    public final void setShowEveryDay(boolean p0){
       this.showEveryDay = p0;
    }
}
