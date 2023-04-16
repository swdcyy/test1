package com.kuaishou.commercial.search.live.d$b;
import s99.i;
import com.kuaishou.commercial.search.live.d;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import s99.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ekd.y0;
import vy.e;
import java.lang.Runnable;
import android.view.ViewGroup;

public class d$b implements i	// class@001568
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       return h.b(this, p0, p1);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$b.class, "2")) {
          return;
       }
       d$b tb = this.b;
       tb.q = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "6")) {
          tb.V8();
          tb.u = new y0(500, new e(tb));
       }
       this.b.R8(true);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       d$b tb = this.b;
       tb.q = false;
       tb.V8();
       this.b.R8(false);
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       h.h(this, p0, p1, p2, p3, p4, p5);
    }
    public void f(){
       h.e(this);
    }
    public boolean i(ViewGroup p0,int p1){
       return h.a(this, p0, p1);
    }
    public void n(){
       h.f(this);
    }
    public void onScrollStateChanged(int p0){
       h.g(this, p0);
    }
}
