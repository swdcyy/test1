package com.kuaishou.live.core.show.subscribe.dosubscribe.a;
import erd.g;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import tkd.b;
import tkd.d;
import u3a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import nl9.u;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import wk2.s;
import com.kuaishou.live.core.show.subscribe.dosubscribe.l;
import rk2.n;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import rk2.d;
import java.lang.Runnable;
import ekd.k1;

public final class a implements g	// class@0010de
{
    public final LiveSubscribeFragment b;
    public final String c;

    public void a(LiveSubscribeFragment p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       int i = 1;
       if (tb.t != null) {
          d.a(0x10cfd14a).Tj(tb.t.getPhotoId());
          d.a(-1694791652).Nb(tb.t.getPhotoId(), i, i);
       }
       j.i(tb.v, 2);
       tb.ih(R.string.arg_RES_7f102bcc);
       tb.fh(i);
       LiveSubscribeStatInfo mLiveSubscri = tb.s.mLiveSubscribeStat;
       mLiveSubscri.mBookStatus = LiveSubscribeBookStatus.BOOKED;
       mLiveSubscri.mRawTotalCount = mLiveSubscri.mRawTotalCount + 1;
       tb.lh();
       s.d(tb.t, i, tb.eh());
       new l(tb.w, tb.t).a(tb.getActivity(), p0, tc);
       if (tb.eh()) {
          k1.s(new d(tb), tb, 1000);
       }
       return;
    }
}
