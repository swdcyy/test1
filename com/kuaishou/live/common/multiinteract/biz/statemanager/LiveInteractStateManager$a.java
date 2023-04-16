package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$a;
import ah3.d;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import ah3.c;

public final class LiveInteractStateManager$a implements d	// class@0017e7
{
    public final LiveInteractStateManager a;

    public void LiveInteractStateManager$a(LiveInteractStateManager p0){
       this.a = p0;
       super();
    }
    public void a(int p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(LiveInteractStateManager$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, LiveInteractStateManager$a.class, "4")) {
          return;
       }
       this.a.U("onCancelApplyResponse", Integer.valueOf(p0));
       return;
    }
    public void b(int p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(LiveInteractStateManager$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, LiveInteractStateManager$a.class, "3")) {
          return;
       }
       this.a.U("onApplyResponse", Integer.valueOf(p0));
       return;
    }
    public void c(int p0,int p1){
       LiveInteractStateManager$a uoa = LiveInteractStateManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.a.U("onApplyFailed", Integer.valueOf(p0));
       return;
    }
    public void d(int p0){
       LiveInteractStateManager$a uoa = LiveInteractStateManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.U("onApplyStart", Integer.valueOf(p0));
       return;
    }
    public void onApplySuccess(int p0){
       c.d(this, p0);
    }
}
