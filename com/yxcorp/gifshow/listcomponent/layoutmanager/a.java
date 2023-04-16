package com.yxcorp.gifshow.listcomponent.layoutmanager.a;
import java.lang.Integer;
import java.lang.Comparable;
import w0b.g;
import java.lang.Object;
import java.util.LinkedList;
import com.yxcorp.gifshow.listcomponent.layoutmanager.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.listcomponent.layoutmanager.MismatchChildCountException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.View;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$d;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$f;
import x0b.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;

public abstract class a	// class@001a82
{
    public Long a;
    public g b;
    public int c;
    public final List d;
    public static final g e;
    public static final g f;

    static {
       a.e = g.b(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE));
       a.f = g.b(Integer.valueOf(-1), Integer.valueOf(-1));
    }
    public void a(){
       super();
       this.b = a.f;
       this.c = 0;
       this.d = new LinkedList();
    }
    public void A(int p0,int p1,int p2,b p3){
    }
    public abstract boolean B();
    public abstract void C(int p0);
    public void D(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (p1 < p0) {
          throw new IllegalArgumentException("end should be larger or equeal then start position");
       }
       int i = -1;
       if (p0 == i && p1 == i) {
          this.b = a.f;
          return;
       }else if(((p1 - p0) + 1) == this.m()){
          if (p0 == this.b.d().intValue() && p1 == this.b.c().intValue()) {
             return;
          }
          this.b = g.b(Integer.valueOf(p0), Integer.valueOf(p1));
          return;
       }else {
          throw new MismatchChildCountException("ItemCount mismatch when range: "+this.b.toString()+" childCount: "+this.m());
       }
    }
    public abstract void a(int p0,int p1,b p2);
    public abstract void b(RecyclerView$t p0,RecyclerView$y p1,int p2,int p3,int p4,b p5);
    public abstract void c(RecyclerView$t p0,RecyclerView$y p1,b p2);
    public abstract void d(View p0);
    public void e(RecyclerView$y p0,VirtualLayoutManager$d p1,b p2){
    }
    public abstract void f(b p0);
    public abstract int g(int p0,boolean p1,boolean p2,b p3);
    public abstract int h(int p0,boolean p1,boolean p2,b p3);
    public abstract int i(int p0,boolean p1,boolean p2,b p3);
    public abstract int j(int p0,boolean p1,boolean p2,b p3);
    public abstract int k(int p0,boolean p1,boolean p2,b p3);
    public abstract void l(RecyclerView$t p0,RecyclerView$y p1,VirtualLayoutManager$f p2,c p3,b p4);
    public abstract int m();
    public final g n(){
       return this.b;
    }
    public abstract int o();
    public abstract boolean p();
    public boolean q(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return (this.b.a(Integer.valueOf(p0)) ^ 0x01);
    }
    public boolean r(int p0,int p1,int p2,b p3,boolean p4){
       return true;
    }
    public void s(b p0){
    }
    public void t(RecyclerView p0,int p1,int p2){
    }
    public void u(RecyclerView p0,int p1,int p2){
    }
    public void v(RecyclerView p0,int p1,int p2,int p3,int p4){
    }
    public void w(int p0,b p1){
    }
    public void x(int p0,b p1){
    }
    public abstract void y();
    public void z(RecyclerView$y p0,VirtualLayoutManager$d p1,b p2){
    }
}
