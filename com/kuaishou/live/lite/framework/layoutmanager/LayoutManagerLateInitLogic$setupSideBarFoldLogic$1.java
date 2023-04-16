package com.kuaishou.live.lite.framework.layoutmanager.LayoutManagerLateInitLogic$setupSideBarFoldLogic$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.sidebar.e;
import z1.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LayoutManagerLateInitLogic$setupSideBarFoldLogic$1 extends Lambda implements a	// class@000910
{
    public final e $liveSideBarService;
    public final a $sideBarListener;

    public void LayoutManagerLateInitLogic$setupSideBarFoldLogic$1(e p0,a p1){
       this.$liveSideBarService = p0;
       this.$sideBarListener = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LayoutManagerLateInitLogic$setupSideBarFoldLogic$1.class, "1")) {
          return;
       }
       this.$liveSideBarService.c(this.$sideBarListener);
       return;
    }
}
