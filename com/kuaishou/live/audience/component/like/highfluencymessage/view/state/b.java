package com.kuaishou.live.audience.component.like.highfluencymessage.view.state.b;
import k11.a;
import android.view.View;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.y0;
import android.widget.ProgressBar;
import k11.g;
import java.lang.Runnable;
import f11.i;
import ekd.m1;
import java.lang.Integer;

public class b extends a	// class@000b96
{
    public ProgressBar d;
    public y0 e;

    public void b(View p0,HighFluencyLikeViewStateController p1,long p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.e.e();
       return;
    }
    public void b(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       int i = 0;
       this.d.setVisibility(i);
       this.d.setMax(400);
       this.d.setProgress(i);
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          y0 oy0 = new y0(10, new g(this));
          this.e = oy0;
          oy0.b(i.a);
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a32db);
       return;
    }
    public int d(){
       return 2;
    }
    public void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       this.e.e();
       int progress = this.d.getProgress();
       if (progress >= 400) {
          this.b.c(3, p0);
       }else {
          this.d.setProgress((progress + 10));
          this.e.b(i.a);
       }
       return;
    }
}
