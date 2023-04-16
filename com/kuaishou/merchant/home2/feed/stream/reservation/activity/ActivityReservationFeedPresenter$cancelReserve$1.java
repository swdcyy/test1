package com.kuaishou.merchant.home2.feed.stream.reservation.activity.ActivityReservationFeedPresenter$cancelReserve$1;
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
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;

public final class ActivityReservationFeedPresenter$cancelReserve$1 extends FunctionReferenceImpl implements l	// class@0017d1
{

    public void ActivityReservationFeedPresenter$cancelReserve$1(b p0){
       super(1, p0, b.class, "onReservationCanceled", "onReservationCanceled\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       CharSequence uCharSequenc;
       if (PatchProxy.isSupport(ActivityReservationFeedPresenter$cancelReserve$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ActivityReservationFeedPresenter$cancelReserve$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), treceiver, uob, "13")) {
          if (p0) {
             b p = treceiver.p;
             if (p == null) {
                a.S("reservationFeed");
             }
             ReservationInfo reservationI = p.getReservationInfo();
             if (reservationI != null) {
                reservationI.mReservationStatus = 1;
             }
             p = treceiver.r;
             if (p == null) {
                a.S("reserveButton");
             }
             b p1 = treceiver.p;
             if (p1 == null) {
                a.S("reservationFeed");
             }
             ReservationInfo reservationI1 = p1.getReservationInfo();
             reservationI1 = (reservationI1 != null)? reservationI1.mButtonContent: null;
             p.setText(reservationI1);
          }else {
             a.g(MerchantHomeLogBiz.Feed, "ActivityReservationFeed", "fail to cancel reserve");
          }
       }
       return;
    }
}
