package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import rc3.d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yj3.a;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$taskQueueHelper$1;
import mrd.a;
import brd.t;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$a;
import android.content.Context;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$2;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$4;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$5;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$6;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$7;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$8;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$9;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$11;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$12;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$15;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$16;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$19;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$20;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$22;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$23;
import kotlin.collections.CollectionsKt__CollectionsKt;
import o56.a;
import xf6.f;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$1;
import tkd.b;
import tkd.d;
import v33.a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin;
import java.util.Collection;
import fs3.g;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.util.Pair;
import b93.d;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$2$1;
import nl9.q;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$3$1;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.concurrent.Future;

public class BizPresenterScatterLoader extends LiveLitePresenterScatterLoader	// class@00096c
{
    public final LiveLiteScatterLoadManager A;
    public final LiveTaskQueueHelper z;

    public void BizPresenterScatterLoader(boolean p0,d p1,a p2,a p3){
       a.p(p1, "playerService");
       a.p(p2, "presenterRegistry");
       a.p(p3, "modelManager");
       super("BizPresenterLoader", p0, a.a(), p1, p2, p3);
       this.z = new LiveTaskQueueHelper(new BizPresenterScatterLoader$taskQueueHelper$1(this), this.q());
       this.A = new BizPresenterScatterLoader$a(this);
    }
    public List a(Context p0){
       Iterator iterator;
       Map$Entry uEntry;
       Object key;
       LiveLiteAdapterPlugin$a[] obj = PatchProxy.applyOneRefs(p0, this, BizPresenterScatterLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = new LiveLiteAdapterPlugin$a[23];
       LiveLiteAdapterPlugin$ScatterPriority sideBarItem = LiveLiteAdapterPlugin$ScatterPriority.SideBarItem;
       obj[0] = this.c("AnchorInfoPresenter", sideBarItem, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$1.INSTANCE);
       obj[1] = this.c("LikePresenter", sideBarItem, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$2.INSTANCE);
       obj[2] = this.c("EntryDetailPresenter", sideBarItem, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3.INSTANCE);
       obj[3] = this.c("SharePresenter", sideBarItem, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$4.INSTANCE);
       obj[4] = this.c("SideBarPresenter", LiveLiteAdapterPlugin$ScatterPriority.SideBarContainer, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$5.INSTANCE);
       obj[5] = LiveLitePresenterLoaderBase.d(this, "GesturePresenter", null, new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$6(p0), 2, null);
       obj[6] = this.c("CommentPresenter", LiveLiteAdapterPlugin$ScatterPriority.Comment, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$7.INSTANCE);
       int i = 2;
       Object obj1 = null;
       obj[7] = LiveLitePresenterLoaderBase.d(this, "KrnPresenter", null, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$8.INSTANCE, i, obj1);
       obj[8] = LiveLitePresenterLoaderBase.d(this, "HourlyRankPresenter", null, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$9.INSTANCE, i, obj1);
       obj[9] = LiveLitePresenterLoaderBase.d(this, "FeedbackPresenter", null, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10.INSTANCE, i, obj1);
       obj[10] = this.c("BottomBarPresenter", LiveLiteAdapterPlugin$ScatterPriority.BottomBarContainer, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$11.INSTANCE);
       obj[11] = this.c("WatchingCountPresenter", LiveLiteAdapterPlugin$ScatterPriority.WatchingCount, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$12.INSTANCE);
       LiveLiteAdapterPlugin$ScatterPriority scatterPrior = null;
       obj[12] = LiveLitePresenterLoaderBase.d(this, "SquarePresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13.INSTANCE, i, obj1);
       obj[13] = LiveLitePresenterLoaderBase.d(this, "SquareNoticePresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14.INSTANCE, i, obj1);
       obj[14] = LiveLitePresenterLoaderBase.d(this, "TempPlayPresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$15.INSTANCE, i, obj1);
       obj[15] = LiveLitePresenterLoaderBase.d(this, "EndBizPresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$16.INSTANCE, i, obj1);
       obj[16] = LiveLitePresenterLoaderBase.d(this, "LuckyStarPresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17.INSTANCE, i, obj1);
       obj[17] = LiveLitePresenterLoaderBase.d(this, "HorizontalSwipePresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18.INSTANCE, i, obj1);
       obj[18] = LiveLitePresenterLoaderBase.d(this, "RedPackPresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$19.INSTANCE, i, obj1);
       obj[19] = LiveLitePresenterLoaderBase.d(this, "LiveLiteRecoGuidePresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$20.INSTANCE, i, obj1);
       obj[20] = LiveLitePresenterLoaderBase.d(this, "LiveLiteWebViewPopupPresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21.INSTANCE, i, obj1);
       obj[21] = LiveLitePresenterLoaderBase.d(this, "LiteGrowthPresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$22.INSTANCE, i, obj1);
       obj[22] = LiveLitePresenterLoaderBase.d(this, "LiveLiteQuestionnairePresenter", scatterPrior, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$23.INSTANCE, i, obj1);
       List list = CollectionsKt__CollectionsKt.P(obj);
       if (a.d() && f.h()) {
          list.add(LiveLitePresenterLoaderBase.d(this, "LiteDebugInfoPresenter", null, BizPresenterScatterLoader$createPresenterListFactory$1.INSTANCE, 2, null));
       }
       list.addAll(d.a(0x342530d1).getLiveLiteAdapterPlugin().eT());
       b uob = d.a(-1695065466);
       a.o(uob, "PluginManager.get\(MerchantLivePlugin::class.java\)");
       Map map = uob.a0();
       if (map != null) {
          iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             if (uEntry.getValue().second instanceof d) {
                key = uEntry.getKey();
                a.o(key, "it.key");
                Pair first = uEntry.getValue().first;
                a.o(first, "it.value.first");
                list.add(this.c(key, first, new BizPresenterScatterLoader$createPresenterListFactory$2$1(uEntry)));
             }
          }
       }
       uob = d.a(0x7b39c776);
       a.o(uob, "PluginManager.get\(Commer¡­veLitePlugin::class.java\)");
       map = uob.a0();
       if (map != null) {
          iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             if (uEntry.getValue() instanceof d) {
                key = uEntry.getKey();
                a.o(key, "it.key");
                list.add(this.c(key, LiveLiteAdapterPlugin$ScatterPriority.BottomBarItem, new BizPresenterScatterLoader$createPresenterListFactory$3$1(uEntry)));
             }
          }
       }
       return list;
    }
    public void b(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, BizPresenterScatterLoader.class, str)) {
          return;
       }
       super.b();
       BizPresenterScatterLoader tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.applyVoid(objArray, tz, LiveTaskQueueHelper.class, str)) {
          if (tz.d == null) {
             b.Z(LiveLiteLogTag.LIVE_LITE_TASK, "cancel MainThread task");
             tz.e.l();
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = tz.c.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i = obj.isDone() ^ 0x01;
             if (i) {
                uArrayList.add(obj);
             }
          }
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             iterator.next().cancel(false);
          }
       }
       return;
    }
}
