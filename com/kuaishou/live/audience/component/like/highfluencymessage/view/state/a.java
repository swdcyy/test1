package com.kuaishou.live.audience.component.like.highfluencymessage.view.state.a;
import k11.a;
import android.view.View;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e93.f;
import k11.e;
import java.lang.Runnable;
import k11.c;
import ekd.m1;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyLikeFinishView;
import java.lang.Integer;
import k11.d;
import android.view.ViewGroup;

public class a extends a	// class@000b95
{
    public View d;
    public HighFluencyLikeFinishView e;

    public void a(View p0,HighFluencyLikeViewStateController p1,long p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       f.g(this);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.d.post(new e(this));
       f.k("beforeStateChange", new c(this), this, this.c);
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a1787);
       this.e = m1.f(p0, 0x7f0a1781);
       return;
    }
    public int d(){
       return 3;
    }
    public void e(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       f.g(this);
       f.k("setLikeCount", new d(this), this, this.c);
       this.e.L();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.e.setVisibility(0);
       this.d.setVisibility(8);
       this.e.L();
       return;
    }
}
