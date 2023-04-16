package com.kuaishou.merchant.home2.feed.stream.reservation.activity.ActivityReservationFeedPresenter$reserve$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import gz3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.home2.feed.model.ReservationInfo;
import com.kuaishou.merchant.home2.feed.stream.reservation.activity.model.ActivityReservationFeed;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;

public final class ActivityReservationFeedPresenter$reserve$1 extends FunctionReferenceImpl implements l	// class@0017d2
{

    public void ActivityReservationFeedPresenter$reserve$1(b p0){
       super(1, p0, b.class, "onReservationResult", "onReservationResult\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(ActivityReservationFeedPresenter$reserve$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ActivityReservationFeedPresenter$reserve$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), treceiver, uob, "12")) {
          if (p0) {
             b p = treceiver.p;
             if (p == null) {
                a.S("reservationFeed");
             }
             ReservationInfo reservationI = p.getReservationInfo();
             if (reservationI != null) {
                reservationI.mReservationStatus = 2;
             }
             treceiver.P8();
          }else {
             a.g(MerchantHomeLogBiz.Feed, "ActivityReservationFeed", "fail to reserve");
          }
       }
       return;
    }
}
