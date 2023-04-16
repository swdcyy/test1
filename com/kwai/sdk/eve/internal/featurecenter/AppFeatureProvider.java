package com.kwai.sdk.eve.internal.featurecenter.AppFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.FeatureProvider;
import java.lang.String;
import ml5.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import msd.a;

public final class AppFeatureProvider extends FeatureProvider	// class@0014c5
{

    public void AppFeatureProvider(String p0,a p1){
       a.p(p0, "name");
       a.p(p1, "inValue");
       super("APP", p0, p1);
    }
    public void AppFeatureProvider(String p0,a p1){
       a.p(p0, "name");
       a.p(p1, "inAction");
       super("APP", p0, p1);
    }
}
