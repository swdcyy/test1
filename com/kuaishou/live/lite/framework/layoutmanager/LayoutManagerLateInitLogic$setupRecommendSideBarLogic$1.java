package com.kuaishou.live.lite.framework.layoutmanager.LayoutManagerLateInitLogic$setupRecommendSideBarLogic$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import bb3.b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xc3.l;

public final class LayoutManagerLateInitLogic$setupRecommendSideBarLogic$1 extends Lambda implements a	// class@00090f
{
    public final LiveLiteRecommendSideBarService $recommendSideBarService;
    public final b $swipeListener;

    public void LayoutManagerLateInitLogic$setupRecommendSideBarLogic$1(LiveLiteRecommendSideBarService p0,b p1){
       this.$recommendSideBarService = p0;
       this.$swipeListener = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LayoutManagerLateInitLogic$setupRecommendSideBarLogic$1.class, "1")) {
          return;
       }
       this.$recommendSideBarService.j2(this.$swipeListener);
       return;
    }
}
