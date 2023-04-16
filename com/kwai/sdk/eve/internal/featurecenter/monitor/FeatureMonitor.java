package com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import trd.t0;
import android.os.Handler;
import com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import java.util.LinkedHashMap;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import qrd.l1;
import com.kwai.sdk.eve.internal.featurecenter.CachedFeatureProvider;

public abstract class FeatureMonitor	// class@00153c
{
    public final Context context;
    public Map providers;

    public void FeatureMonitor(Context p0){
       a.p(p0, "context");
       super();
       this.context = p0;
       this.providers = t0.z();
    }
    public final void checkNeedInit(Handler p0,FeaturesProvider p1){
       String obj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeatureMonitor.class, "1")) {
          return;
       }
       a.p(p0, "handler");
       a.p(p1, "featuresProvider");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.features().iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          int i = p1.containsProvider$eve_core_release(obj) ^ 0x01;
          if (i) {
             uArrayList.add(obj);
          }
       }
       if (uArrayList.isEmpty()) {
          return;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          obj = iterator1.next();
          linkedHashMa.put(obj, this.createFeatureProvider(obj));
       }
       Map map = t0.D0(linkedHashMa);
       this.providers = map;
       iterator = map.values().iterator();
       while (iterator.hasNext()) {
          p1.addFeatureProvider(iterator.next());
       }
       this.init(p0);
       return;
    }
    public abstract IFeatureProvider createFeatureProvider(String p0);
    public abstract List features();
    public final Context getContext(){
       return this.context;
    }
    public abstract void init(Handler p0);
    public final void notifyFeatureChange(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeatureMonitor.class, "2")) {
          return;
       }
       a.p(p0, "feature");
       p0 = this.providers.get(p0);
       if (!p0 instanceof CachedFeatureProvider) {
          p0 = null;
       }
       if (p0 != null) {
          p0.notifyFeatureChange();
       }
       return;
    }
}
