package com.kuaishou.live.audience.component.like.highfluencymessage.view.state.c;
import k11.a;
import android.view.View;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e93.f;
import android.widget.TextView;
import java.lang.CharSequence;
import ekd.m1;
import java.lang.Integer;
import k11.h;
import f11.i;
import java.lang.Runnable;

public class c extends a	// class@000b97
{
    public TextView d;

    public void c(View p0,HighFluencyLikeViewStateController p1,long p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       f.g(this);
       this.d.setVisibility(8);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.d.setVisibility(0);
       this.d.setText("继续点赞，点赞不停歇");
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a3bf5);
       return;
    }
    public int d(){
       return 1;
    }
    public void e(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       f.g(this);
       if (p0 >= 10) {
          this.b.c(2, p0);
       }else {
          f.k("ViewStateController.setState", new h(this, p0), this, i.a);
       }
       return;
    }
}
