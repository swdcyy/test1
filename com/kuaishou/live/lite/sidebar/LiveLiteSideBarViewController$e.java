package com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$e;
import z1.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import fd3.u;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.a;

public final class LiveLiteSideBarViewController$e implements a	// class@000b43
{
    public final LiveLiteSideBarViewController a;

    public void LiveLiteSideBarViewController$e(LiveLiteSideBarViewController p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarViewController$e.class, "1")) {
       }else {
          a.p(p0, "sideBarItemList");
          LiveLiteSideBarViewController$e ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveLiteSideBarViewController.class, "7")) {
             ta.j.a("postReloadSideBar", new u(ta, p0));
          }
       }
       return;
    }
}
