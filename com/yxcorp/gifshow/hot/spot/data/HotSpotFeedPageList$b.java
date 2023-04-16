package com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import brd.t;
import wkd.b;
import com.yxcorp.gifshow.w;
import bva.a;
import bva.b;
import ava.d;
import erd.c;
import kotlin.jvm.internal.a;
import u2b.c;
import erd.o;
import cjd.e;
import com.yxcorp.gifshow.hot.spot.data.a;
import erd.g;
import com.yxcorp.gifshow.hot.spot.data.c;
import com.yxcorp.gifshow.hot.spot.data.d;

public final class HotSpotFeedPageList$b implements Callable	// class@001822
{
    public final HotSpotFeedPageList b;
    public final String c;

    public void HotSpotFeedPageList$b(HotSpotFeedPageList p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       t ot1;
       a a;
       HotSpotFeedPageList hotSpotFeedP = HotSpotFeedPageList.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.apply(null, this, HotSpotFeedPageList$b.class, "1");
       if (ot != patchProxyRe) {
       }else {
          HotSpotFeedPageList$b tb = this.b;
          if (tb.C == 1) {
             ot1 = PatchProxy.apply(null, tb, hotSpotFeedP, "4");
             if (ot1 != patchProxyRe) {
             }else {
                b.a(-1343064608).H("hot_spot");
                a = a.a;
                ot1 = t.zip(a.a().c(), a.a().b(), d.a);
                a.o(ot1, "Observable.zip\(\n      Ho¡­eturn@zip response1\n    }");
             }
          }else {
             ot1 = PatchProxy.apply(null, tb, hotSpotFeedP, "5");
             if (ot1 != patchProxyRe) {
             }else {
                b.a(-1343064608).H("hot_spot");
                ot1 = a.a.a().c();
             }
          }
          ot = ot1.to(new c("hot_spot")).map(new e()).doOnSubscribe(new a(this)).doOnNext(new c(this)).doOnError(new d(this));
       }
       return ot;
    }
}
