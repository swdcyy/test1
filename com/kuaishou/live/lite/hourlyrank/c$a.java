package com.kuaishou.live.lite.hourlyrank.c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.hourlyrank.c;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri$Builder;
import android.net.Uri;
import e93.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import qb3.a;
import com.kuaishou.live.lite.tempplay.d;
import k2b.e0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import va3.a;

public class c$a extends m	// class@0009ba
{
    public final String c;
    public final c d;

    public void c$a(c p0,String p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.d.m.qc(new Uri$Builder().scheme("kwailive://hourlyranklist").appendQueryParameter("tab", this.c).appendQueryParameter("source", "LITE_HOURLY_RANK").build().toString(), false);
       ClientContent$LiveStreamPackage liveStreamPa = this.d.n.a();
       c$a tc = this.c;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, tc, null, a.class, "2")) {
          d.c(liveStreamPa, "SNAP_FUN", "HOUR_LIST", a.a(tc));
       }
       a.a(this.d.n.getPage(), this.d.o.j0(), this.d.n.c0(), "HOUR_LIST", this.d.n.a());
       return;
    }
}
