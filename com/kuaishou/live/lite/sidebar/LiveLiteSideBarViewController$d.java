package com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$d;
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

public final class LiveLiteSideBarViewController$d implements a	// class@000b42
{
    public final LiveLiteSideBarViewController a;

    public void LiveLiteSideBarViewController$d(LiveLiteSideBarViewController p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarViewController$d.class, "1")) {
       }else {
          LiveLiteSideBarViewController$d ta = this.a;
          a.o(p0, "it");
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveLiteSideBarViewController.class, "14")) {
             ta.Z2(p0);
             p0 = ta.Y2(p0);
             if (p0 != null) {
                p0.e();
             }
          }
       }
       return;
    }
}
