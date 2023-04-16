package com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$b;
import z1.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import com.kuaishou.live.lite.sidebar.e$a;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.lite.sidebar.d;
import com.google.gson.JsonObject;

public final class LiveLiteSideBarViewController$b implements a	// class@000b40
{
    public final LiveLiteSideBarViewController a;
    public final e$a b;

    public void LiveLiteSideBarViewController$b(LiveLiteSideBarViewController p0,e$a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarViewController$b.class, "1")) {
       }else {
          p0 = this.a;
          LiveLiteSideBarViewController$b tb = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tb, p0, LiveLiteSideBarViewController.class, "16") && (tb != null && tb.c() == true)) {
             ClientContent$LiveStreamPackage liveStreamPa = p0.w.a();
             p0 = p0.w.c0();
             if (!PatchProxy.applyVoidThreeRefs(tb, liveStreamPa, p0, null, d.class, "2")) {
                d.a(tb.b(), tb.getLogName(), liveStreamPa, p0);
             }
          }
       }
       return;
    }
}
