package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$b;
import bh3.d;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import bh3.c;

public final class LiveInteractStateManager$b implements d	// class@0017e8
{
    public final LiveInteractStateManager a;

    public void LiveInteractStateManager$b(LiveInteractStateManager p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2,String p3,boolean p4,Throwable p5){
       if (PatchProxy.isSupport(LiveInteractStateManager$b.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, LiveInteractStateManager$b.class, "3")) {
             return;
          }
       }
       this.a.U("onInviteResponse", Integer.valueOf(p0));
       return;
    }
    public void b(int p0,String p1,String p2){
       if (PatchProxy.isSupport(LiveInteractStateManager$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveInteractStateManager$b.class, "1")) {
          return;
       }
       this.a.U("onInviteStart", Integer.valueOf(p0));
       return;
    }
    public void c(int p0,String p1,String p2){
       c.e(this, p0, p1, p2);
    }
    public void d(int p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(LiveInteractStateManager$b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, LiveInteractStateManager$b.class, "2")) {
          return;
       }
       this.a.U("onInviteFailed", Integer.valueOf(p0));
       return;
    }
    public void e(int p0,String p1,String p2,boolean p3,Throwable p4){
       if (PatchProxy.isSupport(LiveInteractStateManager$b.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, LiveInteractStateManager$b.class, "4")) {
             return;
          }
       }
       this.a.U("onCancelInviteResponse", Integer.valueOf(p0));
       return;
    }
}
