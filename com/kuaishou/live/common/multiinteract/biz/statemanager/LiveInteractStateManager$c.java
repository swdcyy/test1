package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$c;
import ch3.c;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import ch3.b;

public final class LiveInteractStateManager$c implements c	// class@0017e9
{
    public final LiveInteractStateManager a;

    public void LiveInteractStateManager$c(LiveInteractStateManager p0){
       this.a = p0;
       super();
    }
    public void a(int p0,boolean p1,String p2,Throwable p3){
       if (PatchProxy.isSupport(LiveInteractStateManager$c.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, this, LiveInteractStateManager$c.class, "4")) {
          return;
       }
       this.a.U("onCancelMatchResponse", Integer.valueOf(p0));
       return;
    }
    public void b(int p0){
       b.c(this, p0);
    }
    public void c(int p0,int p1,String p2){
       if (PatchProxy.isSupport(LiveInteractStateManager$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LiveInteractStateManager$c.class, "2")) {
          return;
       }
       this.a.U("onMatchFailed", Integer.valueOf(p0));
       return;
    }
    public void d(int p0,boolean p1,String p2,String p3,Throwable p4){
       if (PatchProxy.isSupport(LiveInteractStateManager$c.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Boolean.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, LiveInteractStateManager$c.class, "3")) {
             return;
          }
       }
       this.a.U("onMatchResponse", Integer.valueOf(p0));
       return;
    }
    public void e(int p0,String p1){
       b.h(this, p0, p1);
    }
    public void f(int p0){
       LiveInteractStateManager$c uoc = LiveInteractStateManager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.U("onMatchStart", Integer.valueOf(p0));
       return;
    }
    public void g(int p0,String p1){
       b.g(this, p0, p1);
    }
    public void h(int p0,int p1,int p2){
       b.b(this, p0, p1, p2);
    }
}
