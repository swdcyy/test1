package com.kuaishou.live.lite.framework.root.BasicPresenterLoader;
import gb3.a;
import java.lang.String;
import android.content.Context;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import msd.a;
import com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2;
import com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$3;
import com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$4;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$a;
import com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$1;

public final class BasicPresenterLoader extends a	// class@00094f
{

    public void BasicPresenterLoader(){
       super("BasicPresenterLoader");
    }
    public List a(Context p0){
       LiveLiteAdapterPlugin$ScatterPriority scatterPrior;
       int i;
       Object obj1;
       LiveLitePresenterLoaderBase liveLitePres;
       Object obj = PatchProxy.applyOneRefs(p0, this, BasicPresenterLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       LiveLiteAdapterPlugin$a[] uoaArray = new LiveLiteAdapterPlugin$a[]{LiveLitePresenterLoaderBase.d(this, "PlayerPresenter", null, BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$1.INSTANCE, 2, null),LiveLitePresenterLoaderBase.d(liveLitePres, "EndPresenter", scatterPrior, BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2.INSTANCE, i, obj1),LiveLitePresenterLoaderBase.d(liveLitePres, "BackgroundPresenter", scatterPrior, BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$3.INSTANCE, i, obj1),LiveLitePresenterLoaderBase.d(this, "FeedCostReportPresenter", scatterPrior, BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$4.INSTANCE, i, obj1)};
       scatterPrior = null;
       i = 2;
       obj1 = null;
       liveLitePres = this;
       List list = CollectionsKt__CollectionsKt.P(uoaArray);
       if (!LiveLiteLongConnectionManager.D.a()) {
          list.add(1, LiveLitePresenterLoaderBase.d(this, "LongConnectionPresenter", null, BasicPresenterLoader$createPresenterListFactory$1.INSTANCE, 2, null));
       }
       return list;
    }
}
