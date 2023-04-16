package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d$a;
import oh1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d;
import java.lang.Object;
import lj1.b;
import oh1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a;

public class d$a implements c	// class@000b4a
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(b p0){
       b.d(this, p0);
    }
    public void c(){
       b.b(this);
    }
    public void d(){
       b.f(this);
    }
    public void e(int p0,b p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       d w = this.a.w;
       Objects.requireNonNull(w);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), w, a.class, "5")) {
          Objects.requireNonNull(w.d);
       }
       return;
    }
    public void f(int p0,b p1){
       b.c(this, p0, p1);
    }
    public void g(){
       b.e(this);
    }
}
