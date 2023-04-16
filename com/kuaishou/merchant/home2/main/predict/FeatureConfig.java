package com.kuaishou.merchant.home2.main.predict.FeatureConfig;
import java.io.Serializable;
import com.kuaishou.merchant.home2.main.predict.FeatureConfig$a;
import nsd.u;
import java.util.List;
import java.lang.Object;

public final class FeatureConfig implements Serializable	// class@001813
{
    public List corePages;
    public static final FeatureConfig$a Companion;
    public static final long serialVersionUID;

    static {
       FeatureConfig.Companion = new FeatureConfig$a(null);
    }
    public void FeatureConfig(){
       super(null, 1, null);
    }
    public void FeatureConfig(List p0){
       super();
       this.corePages = p0;
    }
    public void FeatureConfig(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public final List getCorePages(){
       return this.corePages;
    }
    public final void setCorePages(List p0){
       this.corePages = p0;
    }
}
