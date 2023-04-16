package com.kuaishou.android.live.doublelist.danmaku.h$a;
import s99.i;
import com.kuaishou.android.live.doublelist.danmaku.h;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import s99.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.doublelist.danmaku.b;
import android.view.ViewGroup;

public class h$a implements i	// class@0007d1
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       return h.b(this, p0, p1);
    }
    public void a(){
       h.c(this);
    }
    public void b(){
       h.d(this);
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       h.h(this, p0, p1, p2, p3, p4, p5);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       this.b.B.D();
       return;
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
