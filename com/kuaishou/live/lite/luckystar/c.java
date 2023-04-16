package com.kuaishou.live.lite.luckystar.c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.luckystar.d;
import com.kuaishou.live.lite.luckystar.b$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import z1.k;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qd3.r;
import com.kuaishou.live.lite.tempplay.d;
import k2b.e0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import va3.a;
import android.net.Uri$Builder;
import android.net.Uri;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import e93.b;

public class c extends m	// class@000a34
{
    public final b$a c;
    public final d d;

    public void c(d p0,b$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c td = this.d;
       b$a e = this.c.e;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(e, td, d.class, "5")) {
          i oi = td.e.get();
          d.c(oi.a(), "PROFIT_INFO", "LUCY_ASST", d.a(td.c.get()));
          e0 page = oi.getPage();
          FeedLogCtx uFeedLogCtx = oi.c0();
          a.a(page, td.f.get(), uFeedLogCtx, "LUCY_ASST", oi.a());
          Uri$Builder uBuilder = new Uri$Builder().scheme("kwailive").authority("openluckystarinfopanel");
          uBuilder.appendQueryParameter("luckystarid", e);
          Uri$Builder uBuilder1 = uBuilder;
          String str = uBuilder1.appendQueryParameter("popupsource", "LITE_LIVE_BUTTON").build().toString();
          b.c0(LiveLiteLogTag.LIVE_LITE_LUCKY_STAR, "onClickItem", "router", str);
          td.d.get().qc(str, false);
       }
       return;
    }
}
