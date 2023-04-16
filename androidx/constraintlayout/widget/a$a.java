package androidx.constraintlayout.widget.a$a;
import java.lang.Object;
import androidx.constraintlayout.widget.a$d;
import androidx.constraintlayout.widget.a$c;
import androidx.constraintlayout.widget.a$b;
import androidx.constraintlayout.widget.a$e;
import java.util.HashMap;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.Barrier;

public class a$a	// class@0006be
{
    public int a;
    public final a$d b;
    public final a$c c;
    public final a$b d;
    public final a$e e;
    public HashMap f;

    public void a$a(){
       super();
       this.b = new a$d();
       this.c = new a$c();
       this.d = new a$b();
       this.e = new a$e();
       this.f = new HashMap();
    }
    public void a(ConstraintLayout$LayoutParams p0){
       a$a td = this.d;
       p0.d = td.h;
       p0.e = td.i;
       p0.f = td.j;
       p0.g = td.k;
       p0.h = td.l;
       p0.i = td.m;
       p0.j = td.n;
       p0.k = td.o;
       p0.l = td.p;
       p0.p = td.q;
       p0.q = td.r;
       p0.r = td.s;
       p0.s = td.t;
       p0.leftMargin = td.D;
       p0.rightMargin = td.E;
       p0.topMargin = td.F;
       p0.bottomMargin = td.G;
       p0.x = td.O;
       p0.y = td.N;
       p0.u = td.K;
       p0.w = td.M;
       p0.z = td.u;
       p0.A = td.v;
       p0.m = td.x;
       p0.n = td.y;
       p0.o = td.z;
       p0.B = td.w;
       p0.Q = td.A;
       p0.R = td.B;
       p0.F = td.P;
       p0.E = td.Q;
       p0.H = td.S;
       p0.G = td.R;
       p0.T = td.h0;
       p0.U = td.i0;
       p0.I = td.T;
       p0.J = td.U;
       p0.M = td.V;
       p0.N = td.W;
       p0.K = td.X;
       p0.L = td.Y;
       p0.O = td.Z;
       p0.P = td.a0;
       p0.S = td.C;
       p0.c = td.g;
       p0.a = td.e;
       p0.b = td.f;
       p0.width = td.c;
       p0.height = td.d;
       a$b g0 = td.g0;
       if (g0 != null) {
          p0.V = g0;
       }
       p0.setMarginStart(td.I);
       p0.setMarginEnd(this.d.H);
       p0.c();
       return;
    }
    public a$a b(){
       a$a uoa = new a$a();
       uoa.d.a(this.d);
       uoa.c.a(this.c);
       uoa.b.a(this.b);
       uoa.e.a(this.e);
       uoa.a = this.a;
       return uoa;
    }
    public void c(int p0,ConstraintLayout$LayoutParams p1){
       this.a = p0;
       a$a td = this.d;
       td.h = p1.d;
       td.i = p1.e;
       td.j = p1.f;
       td.k = p1.g;
       td.l = p1.h;
       td.m = p1.i;
       td.n = p1.j;
       td.o = p1.k;
       td.p = p1.l;
       td.q = p1.p;
       td.r = p1.q;
       td.s = p1.r;
       td.t = p1.s;
       td.u = p1.z;
       td.v = p1.A;
       td.w = p1.B;
       td.x = p1.m;
       td.y = p1.n;
       td.z = p1.o;
       td.A = p1.Q;
       td.B = p1.R;
       td.C = p1.S;
       td.g = p1.c;
       td.e = p1.a;
       td.f = p1.b;
       td.c = p1.width;
       td.d = p1.height;
       td.D = p1.leftMargin;
       td.E = p1.rightMargin;
       td.F = p1.topMargin;
       td.G = p1.bottomMargin;
       td.P = p1.F;
       td.Q = p1.E;
       td.S = p1.H;
       td.R = p1.G;
       td.h0 = p1.T;
       td.i0 = p1.U;
       td.T = p1.I;
       td.U = p1.J;
       td.V = p1.M;
       td.W = p1.N;
       td.X = p1.K;
       td.Y = p1.L;
       td.Z = p1.O;
       td.a0 = p1.P;
       td.g0 = p1.V;
       td.K = p1.u;
       td.M = p1.w;
       td.J = p1.t;
       td.L = p1.v;
       td.O = p1.x;
       td.N = p1.y;
       td.H = p1.getMarginEnd();
       td.I = p1.getMarginStart();
    }
    public Object clone(){
       return this.b();
    }
    public void d(int p0,Constraints$LayoutParams p1){
       this.c(p0, p1);
       p0.d = p1.p0;
       a$a te = this.e;
       te.b = p1.s0;
       te.c = p1.t0;
       te.d = p1.u0;
       te.e = p1.v0;
       te.f = p1.w0;
       te.g = p1.x0;
       te.h = p1.y0;
       te.i = p1.z0;
       te.j = p1.A0;
       te.k = p1.B0;
       te.m = p1.r0;
       te.l = p1.q0;
    }
    public void e(ConstraintHelper p0,int p1,Constraints$LayoutParams p2){
       this.d(p1, p2);
       if (p0 instanceof Barrier) {
          a$a td = this.d;
          td.d0 = 1;
          td.b0 = p0.getType();
          td.e0 = p0.getReferencedIds();
          td.c0 = p0.getMargin();
       }
       return;
    }
}
