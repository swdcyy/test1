package com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ml5.a;

public abstract class IFeatureProvider	// class@0014ee
{
    public final String category;
    public final String name;

    public void IFeatureProvider(String p0,String p1){
       a.p(p0, "category");
       a.p(p1, "name");
       super();
       this.category = p0;
       this.name = p1;
    }
    public final String getCategory(){
       return this.category;
    }
    public final String getFeatureCategory(){
       return this.category;
    }
    public final String getFeatureName(){
       return this.name;
    }
    public abstract a getFeatureValue();
    public final String getName(){
       return this.name;
    }
}
