package mn.d;
import mn.e;
import mn.d$k;
import java.lang.String;
import mn.d$v;
import mn.d$g0;
import mn.d$r0;
import mn.d$u0;
import mn.d$v0;
import mn.d$w0;
import mn.d$x0;
import mn.d$y0;
import mn.d$a;
import mn.d$b;
import mn.d$c;
import mn.d$d;
import mn.d$e;
import mn.d$f;
import mn.d$g;
import mn.d$h;
import mn.d$i;
import mn.d$j;
import mn.d$l;
import mn.d$m;
import mn.d$n;
import mn.d$o;
import mn.d$p;
import mn.d$q;
import mn.d$r;
import mn.d$s;
import mn.d$t;
import mn.d$u;
import mn.d$w;
import mn.d$x;
import mn.d$y;
import mn.d$z;
import mn.d$a0;
import mn.d$b0;
import mn.d$c0;
import mn.d$d0;
import mn.d$e0;
import mn.d$f0;
import mn.d$h0;
import mn.d$i0;
import mn.d$j0;
import mn.d$k0;
import mn.d$l0;
import mn.d$m0;
import mn.d$n0;
import mn.d$o0;
import mn.d$p0;
import mn.d$q0;
import mn.d$s0;
import mn.d$t0;
import mn.b;
import java.lang.Object;
import java.lang.IllegalStateException;

public abstract class d extends e	// class@00295b
{
    public static final d A0;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;
    public static final d J;
    public static final d K;
    public static final d L;
    public static final d M;
    public static final d N;
    public static final d O;
    public static final d P;
    public static final d Q;
    public static final d R;
    public static final d S;
    public static final d T;
    public static final d U;
    public static final d V;
    public static final d W;
    public static final d X;
    public static final d Y;
    public static final d Z;
    public static final d a0;
    public static final d b0;
    public static final d c0;
    public static final d d0;
    public static final d e0;
    public static final d f0;
    public static final d g0;
    public static final d h0;
    public static final d i0;
    public static final d j0;
    public static final d k0;
    public static final d l0;
    public static final d m0;
    public static final d n0;
    public static final d o0;
    public static final d p0;
    public static final d q0;
    public static final d r0;
    public static final d s0;
    public static final d t0;
    public static final d u0;
    public static final d v0;
    public static final d w0;
    public static final d x0;
    public static final d y0;
    public static final d z0;

    static {
       d.C = new d$k("max", 2);
       d.D = new d$v("min", 2);
       d.E = new d$g0("round", 1);
       d.F = new d$r0("ceil", 1);
       d.G = new d$u0("floor", 1);
       d.H = new d$v0("abs", 1);
       d.I = new d$w0("isNan", 1);
       d.J = new d$x0("length", 1);
       d.K = new d$y0("contains", 2);
       d.L = new d$a("startsWith", 2);
       d.M = new d$b("endsWith", 2);
       d.N = new d$c("toUpperCase", 1);
       d.O = new d$d("toLowerCase", 1);
       d.P = new d$e("split", 2);
       d.Q = new d$f("join", 2);
       d.R = new d$g("replace", 3);
       d.S = new d$h("regexMatches", 2);
       d.T = new d$i("regexFound", 2);
       d.U = new d$j("regexMatchGroup", 3);
       d.V = new d$l("regexFindGroup", 3);
       d.W = new d$m("arrayGet", 2);
       d.X = new d$n("arraySet", 3);
       d.Y = new d$o("arrayAdd", 2);
       d.Z = new d$p("arrayRemoveAt", 2);
       d.a0 = new d$q("arrayRemoveItem", 2);
       d.b0 = new d$r("arrayIndexOf", 2);
       d.c0 = new d$s("while", 2);
       d.d0 = new d$t("map", 2);
       d.e0 = new d$u("filter", 2);
       d.f0 = new d$w("filterFirst", 2);
       d.g0 = new d$x("sum", 1);
       d.h0 = new d$y("distinctCount", 1);
       d.i0 = new d$z("toString", 1);
       d.j0 = new d$a0("toInt", 1);
       d.k0 = new d$b0("toDouble", 1);
       d.l0 = new d$c0("toBool", 1);
       d.m0 = new d$d0("toJsonObject", 1);
       d.n0 = new d$e0("toJsonArray", 1);
       d.o0 = new d$f0("newList", 0);
       d.p0 = new d$h0("newMap", 0);
       d.q0 = new d$i0("newLRUMap", 1);
       d.r0 = new d$j0("time", 0);
       d.s0 = new d$k0("print", 1);
       d.t0 = new d$l0("eval", 1);
       d.u0 = new d$m0("eval2", 2);
       d.v0 = new d$n0("if", 3);
       d.w0 = new d$o0("coalesce", 2);
       d.x0 = new d$p0("getPath", 2);
       d.y0 = new d$q0("setPath", 3);
       d.z0 = new d$s0("ttl", 2, 4);
       d.A0 = new d$t0("random", 1);
    }
    public void d(String p0,int p1){
       super(p0, p1, 0);
    }
    public void d(String p0,int p1,int p2){
       super(p0, 0, 0, p1, (p2 | 0x01));
    }
    public Object a(b p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p1,p2};
       return this.b(p0, objArray);
    }
    public Object b(b p0,Object[] p1){
       throw new IllegalStateException("argc>2 not implemented");
    }
}