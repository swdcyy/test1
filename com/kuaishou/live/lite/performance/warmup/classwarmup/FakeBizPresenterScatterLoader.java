package com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader;
import rc3.d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$createPresenterListFactory$list$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$createPresenterListFactory$list$2;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$createPresenterListFactory$list$3;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$a;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$createPresenterListFactory$1;
import java.util.Collection;
import com.kuaishou.android.live.log.b;
import en8.c;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;

public final class FakeBizPresenterScatterLoader extends BizPresenterScatterLoader	// class@000a4e
{
    public final List B;
    public final a C;
    public final a D;

    public void FakeBizPresenterScatterLoader(d p0,a p1,a p2){
       a.p(p0, "playerService");
       a.p(p1, "presenterRegistry");
       a.p(p2, "modelManager");
       super(false, p0, p1, p2);
       this.C = p1;
       this.D = p2;
       this.B = LiveLiteLogTag.LITE_CLASS_WARMUP.appendTag("FakeBizPresenterScatterLoader");
    }
    public List a(Context p0){
       LiveLiteAdapterPlugin$ScatterPriority scatterPrior;
       int i;
       Object obj1;
       LiveLitePresenterLoaderBase liveLitePres;
       LiveLiteAdapterPlugin$a[] obj = PatchProxy.applyOneRefs(p0, this, FakeBizPresenterScatterLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = new LiveLiteAdapterPlugin$a[]{LiveLitePresenterLoaderBase.d(this, "PlayerPresenter", null, FakeBizPresenterScatterLoader$createPresenterListFactory$list$1.INSTANCE, 2, null),LiveLitePresenterLoaderBase.d(liveLitePres, "EndPresenter", scatterPrior, FakeBizPresenterScatterLoader$createPresenterListFactory$list$2.INSTANCE, i, obj1),LiveLitePresenterLoaderBase.d(liveLitePres, "BackgroundPresenter", scatterPrior, FakeBizPresenterScatterLoader$createPresenterListFactory$list$3.INSTANCE, i, obj1)};
       scatterPrior = null;
       i = 2;
       obj1 = null;
       liveLitePres = this;
       List list = CollectionsKt__CollectionsKt.P(obj);
       if (!LiveLiteLongConnectionManager.D.a()) {
          list.add(1, LiveLitePresenterLoaderBase.d(this, "LongConnectionPresenter", null, FakeBizPresenterScatterLoader$createPresenterListFactory$1.INSTANCE, 2, null));
       }
       list.addAll(super.a(p0));
       return list;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, FakeBizPresenterScatterLoader.class, "4")) {
          return;
       }
       b.P(this.B, "destroy");
       this.p().l();
       return;
    }
}
