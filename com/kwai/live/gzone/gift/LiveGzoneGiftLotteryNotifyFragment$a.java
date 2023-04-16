package com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment$a;
import qvb.n0;
import com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneGiftLotteryNotify;
import kotlin.jvm.internal.a;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Iterator;
import com.kuaishou.protobuf.gamezone.nano.GzoneGiftLotteryPrize;

public final class LiveGzoneGiftLotteryNotifyFragment$a extends n0	// class@000d03
{
    public final LiveGzoneGiftLotteryNotifyFragment m;

    public void LiveGzoneGiftLotteryNotifyFragment$a(LiveGzoneGiftLotteryNotifyFragment p0){
       this.m = p0;
       super();
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       SCGzoneGiftLotteryNotify obj = PatchProxy.apply(null, this, LiveGzoneGiftLotteryNotifyFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m.F.prize;
       a.o(obj, "mSCGzoneGiftLotteryNotify.prize");
       t ot = t.just(ArraysKt___ArraysKt.uy(obj));
       a.o(ot, "Observable.just\(mSCGzone¡­eryNotify.prize.toList\(\)\)");
       return ot;
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneGiftLotteryNotifyFragment$a.class, "2")) {
       }else if(p0 != null){
          if (p1 != null) {
             p1.clear();
          }
          p0 = p0.iterator();
          while (p0.hasNext()) {
             GzoneGiftLotteryPrize gzoneGiftLot = p0.next();
             if (p1 != null) {
                p1.add(gzoneGiftLot);
             }
          }
       }
       return;
    }
    public boolean hasMore(){
       return false;
    }
}
