package ek9.f;
import im8.g;
import java.lang.Object;
import xl8.b;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.HashSet;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import brd.t;
import ek9.k1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ek9.s0;
import java.util.Map;
import java.util.HashMap;

public class f implements g	// class@00217c
{
    public t A;
    public PublishSubject B;
    public y C;
    public t D;
    public final c E;
    public y F;
    public t G;
    public PublishSubject H;
    public y I;
    public t J;
    public PublishSubject K;
    public y L;
    public t M;
    public PublishSubject N;
    public y O;
    public t P;
    public k1 Q;
    public e R;
    public t0 S;
    public x T;
    public x U;
    public PublishSubject U0;
    public c V;
    public CommentsFragment V0;
    public PublishSubject W;
    public y X;
    public t Y;
    public a Z;
    public QPhoto b;
    public CommentParams c;
    public CommentConfig d;
    public a e;
    public d f;
    public boolean g;
    public int h;
    public b i;
    public List j;
    public Integer k;
    public Set l;
    public Set m;
    public Set n;
    public b o;
    public PublishSubject p;
    public y q;
    public t r;
    public PublishSubject s;
    public y t;
    public t u;
    public PublishSubject v;
    public y w;
    public t x;
    public PublishSubject y;
    public y z;

    public void f(){
       super();
       Integer integer = Integer.valueOf(0);
       this.i = new b(integer);
       this.j = new ArrayList();
       this.k = integer;
       this.l = new HashSet();
       this.m = new HashSet();
       this.n = new HashSet();
       PublishSubject publishSubje = PublishSubject.g();
       this.p = publishSubje;
       this.q = publishSubje;
       this.r = publishSubje;
       publishSubje = PublishSubject.g();
       this.s = publishSubje;
       this.t = publishSubje;
       this.u = publishSubje;
       publishSubje = PublishSubject.g();
       this.v = publishSubje;
       this.w = publishSubje;
       this.x = publishSubje;
       publishSubje = PublishSubject.g();
       this.y = publishSubje;
       this.z = publishSubje;
       this.A = publishSubje;
       publishSubje = PublishSubject.g();
       this.B = publishSubje;
       this.C = publishSubje;
       this.D = publishSubje;
       a uoa = a.g();
       this.E = uoa;
       this.F = uoa;
       this.G = uoa.hide();
       publishSubje = PublishSubject.g();
       this.H = publishSubje;
       this.I = publishSubje;
       this.J = publishSubje;
       publishSubje = PublishSubject.g();
       this.K = publishSubje;
       this.L = publishSubje;
       this.M = publishSubje;
       publishSubje = PublishSubject.g();
       this.N = publishSubje;
       this.O = publishSubje;
       this.P = publishSubje;
       this.Q = new k1();
       publishSubje = PublishSubject.g();
       this.W = publishSubje;
       this.X = publishSubje;
       this.Y = publishSubje;
       this.U0 = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new s0());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
}
