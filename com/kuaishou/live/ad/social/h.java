package com.kuaishou.live.ad.social.h;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.i;
import zl0.a1;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import java.lang.Object;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;
import java.lang.String;
import com.kuaishou.webkit.URLUtil;
import nl9.f;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import nsd.u;
import tkd.b;
import tkd.d;
import nl9.u;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import androidx.fragment.app.DialogFragment;
import zl0.q;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import xh7.b;
import com.kuaishou.live.ad.social.f;
import qh7.b;
import qh7.a;
import yx.j0;
import androidx.fragment.app.c;
import nl9.i0$b;
import nl9.i0;
import zl0.w;
import mxb.i;
import zl9.c;
import com.kuaishou.live.ad.social.g;
import erd.g;

public final class h implements Runnable	// class@000a12
{
    public final i b;
    public final a1 c;
    public final LiveAdConversionTaskDetail d;
    public final int e;

    public void h(i p0,a1 p1,LiveAdConversionTaskDetail p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       i d = tb.d;
       LiveAdLogParamAppender liveAdLogPar = f.a(tc);
       a1 e = tc.e;
       if (!e - 5) {
          if (URLUtil.isNetworkUrl(td.mH5Url) && tb.e != null) {
             f uof = new f(false, td.mHalfWebHeightRatio, liveAdLogPar, 0, 8, null);
             tb.f.A4(d.a(-1694791652).ST(tb.e, d, td.mH5Url, tc, null));
          }else {
             b.B(LiveLogTag.AD, "landing page url is not network url : "+td.mH5Url);
          }
       }else if(!e - 6){
          if (!TextUtils.x(td.mDeepLink)) {
             i e1 = tb.e;
             if (e1 != null) {
                a.b(b.j(e1, td.mDeepLink), f.a);
             }
          }
          Object[] objArray = new Object[0];
          j0.c("LiveAdAudienceConversionTaskFeedController", "cannot open deepLink, deepLink:"+td.mDeepLink+" activity:"+tb.e, objArray);
       }else {
          c uoc = tb.f.b();
          if (!TextUtils.x(td.mH5Url) && (tb.e != null && uoc != null)) {
             i0$b uob = i0.a();
             uob.b(tb.e);
             uob.g(uoc);
             uob.c(new w(tb, liveAdLogPar));
             uob.h(td.mH5Url);
             uob.f(d);
             i0 oi0 = uob.a();
             DialogFragment uDialogFragm = d.a(-1694791652).lp(oi0, tb.d(d, tc, te), d, new g(tb, tc, d));
             tb.f.A4(uDialogFragm);
          }else {
             b.B(LiveLogTag.AD, "landing page url is null ");
          }
       }
       tb.c = null;
       return;
    }
}
