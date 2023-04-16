package com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$a;
import gd3.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Iterable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.sidebar.debuginfo.LiteDebugViewController;
import java.util.Map;

public final class LiveLiteSideBarPresenter$a implements a	// class@000b36
{
    public final LiveLiteSideBarPresenter b;

    public void LiveLiteSideBarPresenter$a(LiveLiteSideBarPresenter p0){
       this.b = p0;
       super();
    }
    public final void X1(String p0,Iterable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteSideBarPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "debugViews");
       LiveLiteSideBarPresenter$a tb = this.b;
       LiveLiteSideBarPresenter d = tb.D;
       if (d != null) {
          d.X1(p0, p1);
       }else {
          tb.C.put(p0, p1);
       }
       return;
    }
}
