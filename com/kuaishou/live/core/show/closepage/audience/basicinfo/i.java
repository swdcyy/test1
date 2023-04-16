package com.kuaishou.live.core.show.closepage.audience.basicinfo.i;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo;
import java.util.Objects;
import android.view.View;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.j;
import erd.o;
import f52.x;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$LiveReservation;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$PlaybackData;
import java.util.Collection;
import ekd.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.widget.TextView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import j52.b;

public final class i implements g	// class@000a3e
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       View[] viewArray;
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mEnableShowUserOperationModule == null) {
          tb.s.setVisibility(8);
       }else {
          tb.X7(tb.p.c.getUser().observable().distinctUntilChanged(j.b).subscribe(new x(tb)));
          int b = (("A").equals(p0.mCategoryType) || ("B").equals(p0.mCategoryType))? true: false;
          tb.B = b;
          tb.s.setVisibility(0);
          QLivePushEndInfo mLiveReserva = p0.mLiveReservationInfo;
          if (mLiveReserva != null && !TextUtils.x(mLiveReserva.mReservationId)) {
             tb.z = true;
             tb.x = p0.mLiveReservationInfo.mReservationId;
          }
          mLiveReserva = p0.mPlaybackData;
          if (mLiveReserva != null) {
             QLivePushEndInfo$PlaybackData mProductId = mLiveReserva.mProductId;
             if (mProductId != null) {
                tb.A = true;
                tb.y = mProductId;
             }
          }
          boolean b1 = tb.p.c.getUser().isFollowingOrFollowRequesting();
          tb.w = p0.mFollowText;
          tb.E = q.f(p0.mHighlightData) ^ true;
          p0 = tb.z;
          k a = tb.A;
          if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(a), Boolean.valueOf(b1), tb, k.class, "6")) {
             b = 2;
             if (b1) {
                tb.t.setVisibility(8);
                if (p0 != null && a != null) {
                   viewArray = new View[b];
                   viewArray[0] = tb.v;
                   viewArray[1] = tb.u;
                   tb.R8(viewArray);
                }else if(p0 != null){
                   tb.v.setVisibility(8);
                   viewArray = new View[true];
                   viewArray[0] = tb.u;
                   tb.R8(viewArray);
                }else if(a != null){
                   tb.u.setVisibility(8);
                   viewArray = new View[true];
                   viewArray[0] = tb.v;
                   tb.R8(viewArray);
                }else {
                   tb.t.setVisibility(8);
                   tb.v.setVisibility(8);
                   tb.u.setVisibility(8);
                }
             }else {
                tb.t.setText(tb.w);
                if (a != null) {
                   tb.u.setVisibility(8);
                   viewArray = new View[b];
                   viewArray[0] = tb.v;
                   viewArray[1] = tb.t;
                   tb.R8(viewArray);
                }else {
                   tb.v.setVisibility(8);
                   tb.u.setVisibility(8);
                   viewArray = new View[true];
                   viewArray[0] = tb.t;
                   tb.R8(viewArray);
                }
                b.f(tb.p.Z2.a());
             }
             if (a != null) {
                b.e(tb.p.Z2.a(), tb.E);
             }
             if (p0 != null && b1) {
                tb.F = true;
                b.d(tb.p.Z2.a());
             }
          }
       }
    label_0157 :
       return;
    }
}
