package com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$c;
import z1.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.sidebar.e$a;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import fd3.o;
import java.lang.Runnable;
import java.util.concurrent.Future;
import ec3.d;

public final class LiveLiteSideBarViewController$c implements a	// class@000b41
{
    public final LiveLiteSideBarViewController a;

    public void LiveLiteSideBarViewController$c(LiveLiteSideBarViewController p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarViewController$c.class, "1")) {
       }else {
          LiveLiteSideBarViewController$c ta = this.a;
          a.o(p0, "it");
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveLiteSideBarViewController.class, "15")) {
             p0 = ta.Y2(p0);
             if (p0 != null) {
                p0.a();
                if (p0.c()) {
                   String logName = p0.getLogName();
                   a.o(logName, "sideBarItem.logName");
                   ClientContent$LiveStreamPackage liveStreamPa = ta.w.a();
                   a.o(liveStreamPa, "logPackageProvider.liveStreamPackage");
                   d.a(new o(ta, logName, p0.d(), liveStreamPa));
                }
             }
          }
       }
       return;
    }
}
