package com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import androidx.lifecycle.LiveData;
import msd.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import zh3.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$merge$2;
import msd.l;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$merge$1;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$mergeToPair$1;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$mergeToTriple$1;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$zip$1;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators$zipToPair$1;

public final class LiveDataOperators	// class@000d16
{

    public static final LiveData a(LiveData p0,LiveData p1,LiveData p2,q p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LiveDataOperators.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ldata1");
       a.p(p1, "ldata2");
       a.p(p2, "ldata3");
       a.p(p3, "mapper");
       LiveData[] liveDataArra = new LiveData[]{p0,p1,p2};
       return new a(CollectionsKt__CollectionsKt.L(liveDataArra), 0, new LiveDataOperators$merge$2(p3));
    }
    public static final LiveData b(LiveData p0,LiveData p1,p p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveDataOperators.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ldata1");
       a.p(p1, "ldata2");
       a.p(p2, "mapper");
       LiveData[] liveDataArra = new LiveData[]{p0,p1};
       return new a(CollectionsKt__CollectionsKt.L(liveDataArra), 0, new LiveDataOperators$merge$1(p2));
    }
    public static final LiveData c(LiveData p0,LiveData p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveDataOperators.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ldata1");
       a.p(p1, "ldata2");
       LiveData[] liveDataArra = new LiveData[]{p0,p1};
       return new a(CollectionsKt__CollectionsKt.L(liveDataArra), 0, LiveDataOperators$mergeToPair$1.INSTANCE);
    }
    public static final LiveData d(LiveData p0,LiveData p1,LiveData p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveDataOperators.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ldata1");
       a.p(p1, "ldata2");
       a.p(p2, "ldata3");
       LiveData[] liveDataArra = new LiveData[]{p0,p1,p2};
       return new a(CollectionsKt__CollectionsKt.L(liveDataArra), 0, LiveDataOperators$mergeToTriple$1.INSTANCE);
    }
    public static final LiveData e(LiveData p0,LiveData p1,p p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveDataOperators.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ldata1");
       a.p(p1, "ldata2");
       a.p(p2, "mapper");
       LiveData[] liveDataArra = new LiveData[]{p0,p1};
       return new a(CollectionsKt__CollectionsKt.L(liveDataArra), 1, new LiveDataOperators$zip$1(p2));
    }
    public static final LiveData f(LiveData p0,LiveData p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveDataOperators.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ldata1");
       a.p(p1, "ldata2");
       LiveData[] liveDataArra = new LiveData[]{p0,p1};
       return new a(CollectionsKt__CollectionsKt.L(liveDataArra), 1, LiveDataOperators$zipToPair$1.INSTANCE);
    }
}
