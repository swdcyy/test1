package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import zi7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitNames$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitActivities$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitServices$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitReceivers$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$getSplitEntryFragments$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitActivitiesMap$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitServicesMap$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$allServices$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$serviceProcessMap$2;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$allSplitInfos$2;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public final class SplitSourceProvider	// class@000e84
{
    public final a a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public final p k;

    public void SplitSourceProvider(a p0){
       a.p(p0, "mFeatureSource");
       super();
       this.a = p0;
       this.b = s.c(SplitSourceProvider$splitNames$2.INSTANCE);
       this.c = s.c(new SplitSourceProvider$splitActivities$2(this));
       this.d = s.c(new SplitSourceProvider$splitServices$2(this));
       this.e = s.c(new SplitSourceProvider$splitReceivers$2(this));
       this.f = s.c(new SplitSourceProvider$getSplitEntryFragments$2(this));
       this.g = s.c(new SplitSourceProvider$splitActivitiesMap$2(this));
       this.h = s.c(new SplitSourceProvider$splitServicesMap$2(this));
       this.i = s.c(new SplitSourceProvider$allServices$2(this));
       this.j = s.c(new SplitSourceProvider$serviceProcessMap$2(this));
       this.k = s.c(new SplitSourceProvider$allSplitInfos$2(this));
    }
    public final List a(){
       Object obj = PatchProxy.apply(null, this, SplitSourceProvider.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final a b(){
       return this.a;
    }
    public final Map c(){
       Object obj = PatchProxy.apply(null, this, SplitSourceProvider.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final List d(){
       Object obj = PatchProxy.apply(null, this, SplitSourceProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final Map e(){
       Object obj = PatchProxy.apply(null, this, SplitSourceProvider.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
}
