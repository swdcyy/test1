package ik1.d0;
import u07.u;
import android.app.Activity;
import p91.m;
import java.lang.String;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.util.Map;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.recharge.d;

public final class d0 implements u	// class@002921
{
    public final Activity b;
    public final m c;
    public final String d;
    public final LiveBizParam e;
    public final Map f;

    public void d0(Activity p0,m p1,String p2,LiveBizParam p3,Map p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(t p0,View p1){
       d0 tb = this.b;
       d0 tc = this.c;
       d0 td = this.d;
       d0 te = this.e;
       d0 tf = this.f;
       if (tb instanceof GifshowActivity) {
          b.c0(LiveLogTag.LIVE_RECHARGE, "recharge_insufficient", "page url", tb.getUrl());
       }
       d.g(tc.getLiveStreamId(), tc.d(), tc.i(), tb, td, te, tf);
       return;
    }
}
