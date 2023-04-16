package com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import mrd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Long;
import ekd.k1;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$b;
import erd.o;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$c;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$d;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$a;
import brd.y;

public final class LiveActivityRedPacketReserveQualificationManager	// class@000947
{
    public static final ConcurrentHashMap a;
    public static final ConcurrentHashMap b;
    public static c c;
    public static final LiveActivityRedPacketReserveQualificationManager d;

    static {
       LiveActivityRedPacketReserveQualificationManager.d = new LiveActivityRedPacketReserveQualificationManager();
       LiveActivityRedPacketReserveQualificationManager.a = new ConcurrentHashMap();
       LiveActivityRedPacketReserveQualificationManager.b = new ConcurrentHashMap();
    }
    public void LiveActivityRedPacketReserveQualificationManager(){
       super();
    }
    public final c a(){
       c obj = PatchProxy.apply(null, this, LiveActivityRedPacketReserveQualificationManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LiveActivityRedPacketReserveQualificationManager.c == null) {
          LiveActivityRedPacketReserveQualificationManager.c = PublishSubject.g();
       }
       obj = LiveActivityRedPacketReserveQualificationManager.c;
       if (obj == null) {
          PublishSubject publishSubje = PublishSubject.g();
          a.o(publishSubje, "PublishSubject.create\(\)");
       }
       return obj;
    }
    public final c b(String p0){
       ConcurrentHashMap obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReserveQualificationManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveActivityRedPacketReserveQualificationManager.b;
       if (!obj.containsKey(p0)) {
          PublishSubject publishSubje = PublishSubject.g();
          a.o(publishSubje, "PublishSubject.create\(\)");
          obj.put(p0, publishSubje);
       }
       c uoc = obj.get(p0);
       if (uoc == null) {
          uoc = PublishSubject.g();
          a.o(uoc, "PublishSubject.create\(\)");
       }
       return uoc;
    }
    public final Boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReserveQualificationManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return LiveActivityRedPacketReserveQualificationManager.a.get(p0);
       }
       return Boolean.FALSE;
    }
    public final void d(String p0,String p1,Long p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveActivityRedPacketReserveQualificationManager.class, "6")) {
          return;
       }
       a.p(p0, "reservationId");
       a.p(p1, "source");
       if (p2 != null) {
          p2.longValue();
          long l = 0;
          if (p2.longValue() - l > 0) {
             l = k1.k(p2.longValue());
          }
          int i = 1;
          if (a.g(this.c(p0), Boolean.TRUE) ^ i) {
             this.e(p0, i, LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.USER_ACTION);
             t.timer(l, TimeUnit.MICROSECONDS).flatMap(new LiveActivityRedPacketReserveQualificationManager$b(p0, p1)).subscribe(LiveActivityRedPacketReserveQualificationManager$c.b, LiveActivityRedPacketReserveQualificationManager$d.b);
          }
       }
       return;
    }
    public final void e(String p0,boolean p1,LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource p2){
       ConcurrentHashMap a;
       if (PatchProxy.isSupport(LiveActivityRedPacketReserveQualificationManager.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LiveActivityRedPacketReserveQualificationManager.class, "7")) {
          return;
       }
       a.p(p0, "reservationId");
       a.p(p2, "source");
       a = LiveActivityRedPacketReserveQualificationManager.a;
       if (a.g(a.get(p0), Boolean.TRUE)) {
          return;
       }
       a.put(p0, Boolean.valueOf(p1));
       LiveActivityRedPacketReserveQualificationManager$a uoa = new LiveActivityRedPacketReserveQualificationManager$a(p1, p2, p0);
       this.b(p0).onNext(uoa);
       this.a().onNext(uoa);
       return;
    }
}
