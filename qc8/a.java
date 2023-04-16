package qc8.a;
import z98.b;
import java.lang.Object;
import java.util.ArrayList;
import ma8.g;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.res.Configuration;
import java.util.List;
import fa8.a;
import ja8.e;
import yd8.b;
import ga8.e;
import ga8.g;
import com.mini.js.commonapitracer.c$b;
import com.mini.js.commonapitracer.c;
import zi8.p;
import java.lang.Math;
import java.util.Collections;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import android.view.View;
import java.lang.Integer;

public abstract class a implements b	// class@00298d
{
    public boolean b;
    public int c;
    public int d;
    public String e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public g m;
    public boolean n;
    public boolean o;
    public List p;
    public c q;

    public void a(){
       super();
       this.p = new ArrayList();
    }
    public void a(g p0,int p1,int p2,String p3){
       super();
       this.p = new ArrayList();
       this.x(p0, p1, p2, p3, false);
    }
    public void a(g p0,int p1,int p2,String p3,boolean p4){
       super();
       this.p = new ArrayList();
       this.x(p0, p1, p2, p3, p4);
    }
    public boolean A(){
       return this.o;
    }
    public boolean B(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.v() >= -2 && this.m() >= -2)? true: false;
       return b;
    }
    public void C(Configuration p0){
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.p.clear();
       return;
    }
    public void E(){
    }
    public void F(){
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.n().X1(this);
       return;
    }
    public void H(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.j(p0);
       this.n().n(this);
       return;
    }
    public void I(e p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "16")) {
          return;
       }
       int i = e.a(p1.a);
       a tq = this.q;
       if (tq == null) {
          return;
       }
       tq.h(tq.e(p0, i, p1.a, p1.b, p1.c()), p0);
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.G();
       if (p.d()) {
          this.m = null;
       }
       this.n = true;
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.n().V1(this);
       return;
    }
    public void j(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.f = Math.round(p0.a);
       this.g = Math.round(p0.b);
       this.h = Math.round(p0.c);
       this.i = Math.round(p0.d);
       p0 = this.n().T0(this.c);
       if (p0 != null && p0.r()) {
          a tf = this.f;
          this.k = tf;
          this.j = this.g;
          this.f = tf + p0.q();
          this.g = this.g + p0.t();
       }
       return;
    }
    public List k(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.p);
    }
    public String l(){
       return this.e;
    }
    public int m(){
       return this.i;
    }
    public g n(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       a obj = PatchProxy.apply(null, this, uoa, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          return obj;
       }
       String str = PatchProxy.apply(null, this, uoa, "12");
       if (str != patchProxyRe) {
       }else {
          str = "isInit="+this.A()+",isDestroy="+this.y();
       }
       throw new NullPointerException(str);
    }
    public int o(){
       a ti = this.i;
       if (ti == -1) {
          return -1;
       }
       if (ti < null) {
          ti = -2;
       }
       return ti;
    }
    public int p(){
       a th = this.h;
       if (th == -1) {
          return -1;
       }
       if (th < null) {
          th = -2;
       }
       return th;
    }
    public int q(){
       return this.f;
    }
    public int r(){
       return this.d;
    }
    public int s(){
       return this.c;
    }
    public int t(){
       return this.g;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getClass()+"{JSPageHost="+this.n()+", mParentNodeId="+this.c+", mNodeId="+this.d+", mComponentId=\'"+this.e+'''+", mLeft="+this.f+", mTop="+this.g+", mRelativeLeft="+this.k+", mRelativeTop="+this.j+", mWidth="+this.h+", mHeight="+this.i+", mFixed="+this.b+'}';
    }
    public abstract View u();
    public int v(){
       return this.h;
    }
    public void x(g p0,int p1,int p2,String p3,boolean p4){
       boolean b;
       int i = 0;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
             return;
          }
       }
       this.m = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       if (!p4) {
          if (PatchProxy.isSupport(a.class)) {
             p0 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, a.class, "2");
             if (p0 != PatchProxyResult.class) {
                b = p0.booleanValue();
             }else {
             label_0054 :
                a uoa = this.n().T0(p1);
                while (true) {
                   if (uoa != null) {
                      if (uoa.z()) {
                         b = true;
                      }else {
                         uoa = this.n().T0(uoa.s());
                      }
                   }else {
                      b = false;
                   }
                }
                this.b = i;
                this.o = true;
                return;
             }
          }else {
             goto label_0054 ;
          }
          if (!b) {
          }
       }
       i = true;
       goto label_0077 ;
    }
    public boolean y(){
       return this.n;
    }
    public boolean z(){
       return this.b;
    }
}
