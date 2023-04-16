package com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle;
import android.view.View;
import java.lang.Object;
import androidx.lifecycle.Lifecycle$State;
import k11.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.a;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.b;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.c;
import k11.b;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController$a;

public class HighFluencyLikeViewStateController implements LifecycleObserver	// class@000b94
{
    public final View b;
    public final long c;
    public a d;
    public HighFluencyLikeViewStateController$a e;

    public void HighFluencyLikeViewStateController(Lifecycle p0,View p1,long p2){
       super();
       this.b = p1;
       this.c = p2;
       if (p0.getCurrentState() == Lifecycle$State.DESTROYED) {
          return;
       }
       p0.addObserver(this);
       this.d = this.a(0);
       return;
    }
    public final a a(int p0){
       HighFluencyLikeViewStateController highFluencyL = HighFluencyLikeViewStateController.class;
       if (PatchProxy.isSupport(highFluencyL)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, highFluencyL, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                return new a(this.b, this, this.c);
             }else {
                return new b(this.b, this, this.c);
             }
          }else {
             return new c(this.b, this, this.c);
          }
       }else {
          return new b(this.b, this, this.c);
       }
    }
    public void b(int p0){
       HighFluencyLikeViewStateController highFluencyL = HighFluencyLikeViewStateController.class;
       if (PatchProxy.isSupport(highFluencyL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, highFluencyL, "2")) {
          return;
       }
       this.d.e(p0);
       return;
    }
    public void c(int p0,int p1){
       if (PatchProxy.isSupport(HighFluencyLikeViewStateController.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HighFluencyLikeViewStateController.class, "1")) {
          return;
       }
       int i = this.d.d();
       if (p0 == i) {
          return;
       }
       this.d.a();
       a uoa = this.a(p0);
       this.d = uoa;
       uoa.b();
       this.d.e(p1);
       if (!PatchProxy.isSupport(HighFluencyLikeViewStateController.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(p0), this, HighFluencyLikeViewStateController.class, "5")) {
          HighFluencyLikeViewStateController te = this.e;
          if (te != null) {
             te.a(i, p0);
          }
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, HighFluencyLikeViewStateController.class, "3")) {
          return;
       }
       this.d.a();
       this.d = null;
       return;
    }
}
