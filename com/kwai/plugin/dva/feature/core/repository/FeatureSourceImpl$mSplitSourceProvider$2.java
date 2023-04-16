package com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl$mSplitSourceProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zi7.a;

public final class FeatureSourceImpl$mSplitSourceProvider$2 extends Lambda implements a	// class@000e78
{
    public final FeatureSourceImpl this$0;

    public void FeatureSourceImpl$mSplitSourceProvider$2(FeatureSourceImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public final SplitSourceProvider invoke(){
       Object obj = PatchProxy.apply(null, this, FeatureSourceImpl$mSplitSourceProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SplitSourceProvider(this.this$0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
