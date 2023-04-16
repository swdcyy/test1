package com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$h;
import wn1.e;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Object;
import wn1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import en1.c;
import p91.m;
import lnc.i3;
import java.lang.Boolean;
import qrd.l1;
import en1.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri$Builder;
import android.net.Uri;
import vq5.d;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;

public final class FixedEntranceViewController$h implements e	// class@001356
{
    public final FixedEntranceViewController a;

    public void FixedEntranceViewController$h(FixedEntranceViewController p0){
       this.a = p0;
       super();
    }
    public void a(f p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedEntranceViewController$h.class, "1")) {
          return;
       }
       a.p(p0, "info");
       b.Z(this.a.j, "click Marquee "+p0.a()+" !");
       c uoc = new c("LIVE_HOTSPOT_STATIC_ENTRANCE", this.a.x);
       i3 oi3 = i3.f();
       oi3.a("is_related_author", Boolean.valueOf(this.a.s));
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­ngBuilder\)\n      .build\(\)");
       uoc.a(str);
       uoc.b();
       a = d.a;
       Objects.requireNonNull(a);
       Uri$Builder uBuilder = PatchProxy.apply(null, a, d.class, "2");
       if (uBuilder != PatchProxyResult.class) {
       }else {
          uBuilder = new Uri$Builder().scheme("kwailive").authority("livehotspotranklist");
          a.o(uBuilder, "Uri.Builder\(\)\n      .sch¡­tants.HOT_SPOT_RANK_LIST\)");
       }
       uBuilder.appendQueryParameter("selectedHotSpotId", p0.a);
       String str1 = uBuilder.appendQueryParameter("authorId", this.a.x.d()).appendQueryParameter("liveStreamId", this.a.x.getLiveStreamId()).appendQueryParameter("entrySrc", String.valueOf(3)).build().toString();
       a.o(str1, "LiveHotSpotUtils.getHotS¡­ing\(\)\).build\(\).toString\(\)");
       if (this.a.y.P0(str1)) {
          FixedEntranceViewController$h ta = this.a;
          ta.y.r4(str1, ta.D2());
       }
       return;
    }
}
