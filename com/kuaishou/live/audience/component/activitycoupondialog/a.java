package com.kuaishou.live.audience.component.activitycoupondialog.a;
import erd.g;
import com.kuaishou.live.audience.component.activitycoupondialog.c;
import java.lang.Object;
import com.kuaishou.live.audience.component.activitycoupondialog.LiveCoinCouponResponse;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import xw0.b;
import java.lang.String;
import java.lang.Runnable;
import e93.f;
import com.kuaishou.live.audience.component.activitycoupondialog.LiveCoinRewardInfo;

public final class a implements g	// class@000a3d
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mLiveCoinRewardInfo != null) {
          if (y.d(tb.getActivity()) && tb.getActivity() != null) {
             tb.getActivity().setRequestedOrientation(1);
             f.k("showActivityCouponRNDialog", new b(tb, p0), tb, 500);
          }else {
             tb.V8(p0.mLiveCoinRewardInfo);
          }
       }
       return;
    }
}
