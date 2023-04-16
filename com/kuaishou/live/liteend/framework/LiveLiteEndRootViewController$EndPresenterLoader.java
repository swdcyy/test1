package com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$EndPresenterLoader;
import gb3.a;
import com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController;
import java.lang.String;
import android.content.Context;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import msd.a;
import com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class LiveLiteEndRootViewController$EndPresenterLoader extends a	// class@000bc8
{
    public final LiveLiteEndRootViewController i;

    public void LiveLiteEndRootViewController$EndPresenterLoader(LiveLiteEndRootViewController p0){
       this.i = p0;
       super("EndBizPresenterLoader");
    }
    public List a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteEndRootViewController$EndPresenterLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       LiveLiteAdapterPlugin$a[] uoaArray = new LiveLiteAdapterPlugin$a[]{LiveLitePresenterLoaderBase.d(this, "EndAutoRemoveFeed", null, LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1.INSTANCE, 2, null),LiveLitePresenterLoaderBase.d(this, "EndBaseInfo", null, LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2.INSTANCE, 2, null)};
       return CollectionsKt__CollectionsKt.L(uoaArray);
    }
}
