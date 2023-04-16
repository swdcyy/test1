package d82.d;
import erd.g;
import d82.f;
import java.lang.Object;
import com.kwai.feature.api.live.merchant.escrow.model.LiveEscrowEntryModel;
import com.kuaishou.live.basic.escrow.LiveEscrowParam$a;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.escrow.LiveEscrowParam;
import qs5.d;
import java.lang.System;
import crd.b;
import lnc.b9;
import android.app.Activity;
import brd.t;
import t45.d;
import brd.z;
import d82.e;

public final class d implements g	// class@00248c
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       LiveEscrowParam$a uoa = new LiveEscrowParam$a();
       f e = tb.e;
       uoa.a = e.c.mEntity;
       uoa.d = p0.mLiveCommentsFoldMessageConfig;
       uoa.c = e.o;
       uoa.b = p0.mLiveEscrowConfig;
       p0 = PatchProxy.apply(null, uoa, LiveEscrowParam$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = new LiveEscrowParam();
          p0.mLiveStreamFeed = uoa.a;
          p0.mLiveEscrowConfig = uoa.b;
          p0.mLiveCommentsConfig = uoa.d;
          p0.mLiveAudienceParam = uoa.c;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, tb, f.class, "5")) {
          String str = "live_anchor_plugin";
          if (!d.d(str)) {
             tb.k = System.currentTimeMillis();
             tb.l = d.c(str);
          }
          b9.a(tb.j);
          tb.j = d.b(tb.f, str).observeOn(d.a).subscribe(new e(tb, p0));
       }
       return;
    }
}
