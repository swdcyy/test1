package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$getSplitEntryFragments$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zi7.a;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;

public final class SplitSourceProvider$getSplitEntryFragments$2 extends Lambda implements a	// class@000e7c
{
    public final SplitSourceProvider this$0;

    public void SplitSourceProvider$getSplitEntryFragments$2(SplitSourceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object[] objArray = null;
       FeatureDetails obj = PatchProxy.apply(objArray, this, SplitSourceProvider$getSplitEntryFragments$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.b().d();
       if (obj != null) {
          objArray = obj.getSplitEntryFragments();
       }
       return objArray;
    }
}
