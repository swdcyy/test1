package com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider;
import com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider$Companion;
import nsd.u;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ml5.a;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import trd.s0;
import java.lang.Iterable;

public final class FeaturesProvider	// class@0014ec
{
    public final Map providers;
    public static final FeaturesProvider$Companion Companion;
    public static final FeaturesProvider DEFAULT;

    static {
       FeaturesProvider.Companion = new FeaturesProvider$Companion(null);
       FeaturesProvider.DEFAULT = new FeaturesProvider();
    }
    public void FeaturesProvider(){
       super();
       this.providers = new LinkedHashMap();
    }
    public final void addFeatureProvider(IFeatureProvider p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturesProvider.class, "1")) {
          return;
       }
       a.p(p0, "value");
       this.providers.put(p0.getName(), p0);
       return;
    }
    public final boolean containsProvider$eve_core_release(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeaturesProvider.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       return this.providers.containsKey(p0);
    }
    public final a getFeature$eve_core_release(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeaturesProvider.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       IFeatureProvider iFeatureProv = this.providers.get(p0);
       a featureValue = (iFeatureProv != null)? iFeatureProv.getFeatureValue(): null;
       return featureValue;
    }
    public final a getFeatures$eve_core_release(List p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, FeaturesProvider.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "keys");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       obj = this.providers.entrySet().iterator();
       while (obj.hasNext()) {
          Map$Entry uEntry = obj.next();
          if (p0.contains(uEntry.getKey())) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       LinkedHashMap linkedHashMa1 = new LinkedHashMap(s0.j(linkedHashMa.size()));
       obj = linkedHashMa.entrySet().iterator();
       while (obj.hasNext()) {
          Map$Entry uEntry1 = obj.next();
          Object key = uEntry1.getKey();
          a featureValue = uEntry1.getValue().getFeatureValue();
          Object obj1 = (featureValue != null)? featureValue.e(): null;
          linkedHashMa1.put(key, obj1);
       }
       return new a(linkedHashMa1);
    }
    public final Map getProviders$eve_core_release(){
       return this.providers;
    }
    public final FeaturesProvider merge$eve_core_release(FeaturesProvider p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeaturesProvider.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "featuresProvider");
       this.providers.putAll(p0.providers);
       return this;
    }
}
