package com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl;
import zi7.a;
import android.content.Context;
import aj7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mRuntimeMode$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mSplitSourceProvider$2;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mFeatureConfig$2;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mInitialFeatureConfig$2;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.util.Collection;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import java.lang.Number;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import java.util.Map;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;

public final class FeatureSourceImpl implements a	// class@000e79
{
    public final Context b;
    public final a c;
    public boolean d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;

    public void FeatureSourceImpl(Context p0,a p1){
       a.p(p0, "context");
       super();
       this.b = p0;
       this.c = p1;
       this.d = true;
       this.e = s.c(FeatureSourceImpl$mRuntimeMode$2.INSTANCE);
       this.f = s.c(new FeatureSourceImpl$mSplitSourceProvider$2(this));
       this.g = s.c(new FeatureSourceImpl$mFeatureConfig$2(this));
       this.h = s.c(new FeatureSourceImpl$mInitialFeatureConfig$2(this));
    }
    public List a(){
       List obj = PatchProxy.apply(null, this, FeatureSourceImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Dva.instance().getPluginInstallManager().b();
       a.o(obj, "instance\(\).pluginInstallManager.pluginConfigs");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          PluginConfig type = obj1.type;
          int i = 1;
          if (type != i && type != 2) {
             i = 0;
          }
          if (i) {
             uArrayList.add(obj1);
          }
       }
       return uArrayList;
    }
    public boolean b(){
       return this.d;
    }
    public void c(boolean p0){
       this.d = p0;
    }
    public FeatureDetails d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FeatureSourceImpl uFeatureSour = FeatureSourceImpl.class;
       Object obj = PatchProxy.apply(null, this, uFeatureSour, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFeatureSour, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.g.getValue();
       }
       return obj1;
    }
    public int e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FeatureSourceImpl uFeatureSour = FeatureSourceImpl.class;
       Object obj = PatchProxy.apply(null, this, uFeatureSour, "5");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       Number number = PatchProxy.apply(null, this, uFeatureSour, "1");
       if (number == patchProxyRe) {
          number = this.e.getValue();
       }
       return number.intValue();
    }
    public FeatureInfo f(String p0){
       FeatureDetails obj = PatchProxy.applyOneRefs(p0, this, FeatureSourceImpl.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       obj = this.d();
       if (obj == null) {
          return null;
       }
       return obj.getNameToSplitMap().get(p0);
    }
    public SplitSourceProvider g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FeatureSourceImpl uFeatureSour = FeatureSourceImpl.class;
       Object obj = PatchProxy.apply(null, this, uFeatureSour, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFeatureSour, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.f.getValue();
       }
       return obj1;
    }
    public FeatureDetails h(){
       Object obj = PatchProxy.apply(null, this, FeatureSourceImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i();
    }
    public final FeatureDetails i(){
       Object obj = PatchProxy.apply(null, this, FeatureSourceImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
}
