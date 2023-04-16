package com.kuaishou.commercial.search.live.b$a;
import s99.i;
import com.kuaishou.commercial.search.live.b;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import s99.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ekd.y0;
import vy.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public class b$a implements i	// class@001563
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       return h.b(this, p0, p1);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "2")) {
          return;
       }
       b$a tb = this.b;
       tb.q = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "8")) {
          tb.X8();
          tb.u = new y0(500, new b(tb));
       }
       this.b.R8(true);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       tb.q = false;
       tb.X8();
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
