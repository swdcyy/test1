package com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$b;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout;
import pfa.b;
import o17.i;

public final class SecondFloorControlPresenter$b implements RefreshLayout$h	// class@001001
{
    public final SecondFloorControlPresenter a;

    public void SecondFloorControlPresenter$b(SecondFloorControlPresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(SecondFloorControlPresenter$b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, SecondFloorControlPresenter$b.class, "1")) {
          return;
       }
       SecondFloorControlPresenter$b ta = this.a;
       ta.x = p0;
       if (SecondFloorControlPresenter.P8(ta).n1 != null && !SecondFloorControlPresenter.P8(this.a).O()) {
          SecondFloorControlPresenter.S8(this.a).j(this.a.x);
          if (SecondFloorControlPresenter.S8(this.a).b()) {
             return;
          }else if(p0 - (float)this.a.X8() < 0){
             ta = this.a;
             if (ta.v == null) {
                if (SecondFloorControlPresenter.S8(ta).a() != 4) {
                   SecondFloorControlPresenter.S8(this.a).f(5);
                }
                p0.v = true;
             }
          }
          if (p0 - (float)this.a.X8() >= 0 && p0 - (float)this.a.Y8() < 0) {
             ta = this.a;
             if (ta.v != null) {
                if (SecondFloorControlPresenter.S8(ta).a() != 4) {
                   SecondFloorControlPresenter.S8(this.a).f(7);
                }
                p0.v = false;
             }
          }
          if (p0 - (float)this.a.Y8() >= 0) {
             SecondFloorControlPresenter$b ta1 = this.a;
             if (ta1.v == null) {
                ta1.v = true;
                SecondFloorControlPresenter.S8(ta1).f(true);
             }
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SecondFloorControlPresenter$b.class, "2")) {
          return;
       }
       i.d(this);
       SecondFloorControlPresenter.S8(this.a).f(6);
       return;
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       i.c(this);
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
