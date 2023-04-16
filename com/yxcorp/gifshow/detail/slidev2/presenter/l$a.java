package com.yxcorp.gifshow.detail.slidev2.presenter.l$a;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d0a.n;
import brd.y;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView;
import java.lang.Float;
import java.util.List;

public class l$a implements ScaleCleanControllerView$a	// class@0019c2
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "2")) {
          return;
       }
       this.a.s.onNext(new n(1));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "6")) {
          return;
       }
       this.a.s.onNext(new n(5));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "4")) {
          return;
       }
       this.a.s.onNext(new n(3));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "5")) {
          return;
       }
       this.a.s.onNext(new n(4));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "1")) {
          return;
       }
       this.a.R8();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "3")) {
          return;
       }
       l$a ta = this.a;
       int i = ta.y.indexOf(Float.valueOf(ta.p.getSpeed()));
       float f = (i == (this.a.y.size() - 1))? this.a.y.get(0).floatValue(): this.a.y.get((i + 1)).floatValue();
       this.a.s.onNext(new n(2, f));
       return;
    }
}
