package fk9.b;
import y8c.g;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.f;
import fk9.c;
import fk9.b$a;
import fk9.b$c;
import a9c.e;
import java.lang.Runnable;
import java.util.HashMap;
import java.util.ArrayList;
import flb.a;
import java.util.List;
import a9c.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import qvb.q;
import com.kwai.robust.PatchProxyResult;
import fk9.b$b;
import y8c.f$b;
import cl9.h0;
import com.yxcorp.gifshow.comment.CommentParams;
import java.lang.Integer;
import java.lang.Number;
import g9c.a;
import com.kuaishou.android.model.mix.QComment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Boolean;
import qvb.i;
import al9.a;
import androidx.recyclerview.widget.RecyclerView;
import fk9.a;
import erd.g;
import crd.b;
import brd.t;
import lnc.b9;

public class b extends g	// class@002326
{
    public final c A;
    public final f B;
    public final List C;
    public final Map D;
    public final Map E;
    public final Map F;
    public final List G;
    public boolean H;
    public boolean I;
    public boolean J;
    public b K;
    public final CommentsFragment w;
    public final QPhoto x;
    public i y;
    public QComment z;

    public void b(CommentsFragment p0,QPhoto p1,f p2,c p3){
       super(new b$a(), new b$c(p0));
       this.D = new HashMap();
       this.E = new HashMap();
       this.F = new HashMap();
       this.G = new ArrayList();
       this.I = true;
       this.w = p0;
       this.x = p1;
       this.B = p2;
       this.A = p3;
       this.C = a.e.a();
       p0.f = true;
    }
    public void W0(List p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "8")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "9")) {
          this.m.c(new ArrayList(p0));
       }
       return;
    }
    public q X0(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b$b(this);
    }
    public f$b d1(f$b p0){
       h0 oh0 = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (oh0 != PatchProxyResult.class) {
       }else {
          oh0 = new h0(p0);
          oh0.i = this.x;
          f c = this.B.c;
          oh0.k = c.mPreInfo;
          oh0.j = Integer.valueOf(c.mPhotoIndex);
          oh0.l = this.C;
          b tB = this.B;
          oh0.n = tB.f;
          oh0.m = tB.e;
          oh0.o = this.H;
          oh0.E = tB.d;
          oh0.p = tB.L;
          oh0.t = tB.x;
          oh0.u = tB.A;
          oh0.B = tB.R;
          oh0.C = tB.S;
          oh0.D = tB.c;
          oh0.h = tB.i;
          oh0.w = this.D;
          oh0.x = this.F;
          oh0.y = this.E;
          oh0.A = tB.Q;
          oh0.v = tB.X;
          oh0.F = tB.Z;
          oh0.G = tB.U0;
          oh0.H = tB.u;
       }
       return oh0;
    }
    public int f0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.N0(p0).mType;
    }
    public f h1(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.A.a(p0, p1);
    }
    public void j1(boolean p0,boolean p1,List p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "6")) {
          return;
       }
       this.W0(p2);
       return;
    }
    public void q1(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.q1(p0);
       this.y = p0;
       return;
    }
    public List r1(){
       return this.G;
    }
    public boolean s1(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.y;
       b = false;
       if (!obj instanceof a) {
          return b;
       }
       if (obj.J0() && this.y.s1()) {
          if (this.y.getCount() > 2) {
             b = true;
          }
          return b;
       }else if(this.y.J0() || this.y.s1()){
          if (this.y.getCount() > 1) {
             b = true;
          }
          return b;
       }else if(this.y.getCount() > 0){
          b = true;
       }
       return b;
    }
    public int t1(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       return this.e.indexOf(p0);
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.u0(p0);
       this.K = this.B.D.subscribe(new a(this));
       return;
    }
    public boolean u1(){
       boolean b = (this.m != null)? true: false;
       return b;
    }
    public void v1(QComment p0){
       this.z = p0;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       super.z0(p0);
       this.G.clear();
       b9.a(this.K);
       return;
    }
}
