package com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import java.lang.Comparable;
import xrd.b;

public final class LiveLitePresenterLoaderBase$a implements Comparator	// class@000922
{

    public void LiveLitePresenterLoaderBase$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLitePresenterLoaderBase$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(p0.d(), p1.d());
    }
}
