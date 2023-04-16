package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$d;
import fh3.d;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import fh3.c;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatCall;

public final class LiveInteractStateManager$d implements d	// class@0017ea
{
    public final LiveInteractStateManager a;

    public void LiveInteractStateManager$d(LiveInteractStateManager p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       LiveInteractStateManager$d uod = LiveInteractStateManager$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "3")) {
          return;
       }
       this.a.U("onCountdownFinish", Integer.valueOf(p0));
       return;
    }
    public void b(int p0,String p1,int p2,int p3){
       c.b(this, p0, p1, p2, p3);
    }
    public void c(int p0,String p1,boolean p2,Throwable p3){
       if (PatchProxy.isSupport(LiveInteractStateManager$d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, LiveInteractStateManager$d.class, "4")) {
          return;
       }
       if (!p2 || p3 != null) {
          this.a.U("onAcceptResponse", Integer.valueOf(p0));
       }
       return;
    }
    public void d(int p0,InteractiveChatUserInfoIdentity p1){
       LiveInteractStateManager$d uod = LiveInteractStateManager$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "2")) {
          return;
       }
       this.a.U("onReceiveCancelInvite", Integer.valueOf(p0));
       return;
    }
    public void e(int p0,String p1,SCInteractiveChatCall p2){
       if (PatchProxy.isSupport(LiveInteractStateManager$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveInteractStateManager$d.class, "1")) {
          return;
       }
       this.a.U("onReceiveInvite", Integer.valueOf(p0));
       return;
    }
    public void f(int p0,String p1,boolean p2,Throwable p3,boolean p4){
       if (PatchProxy.isSupport(LiveInteractStateManager$d.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Boolean.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveInteractStateManager$d.class, "5")) {
             return;
          }
       }
       this.a.U("onRejectResponse", Integer.valueOf(p0));
       return;
    }
}
