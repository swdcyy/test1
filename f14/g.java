package f14.g;
import android.content.Context;
import java.lang.Object;
import f14.f;
import java.util.HashSet;
import android.view.View;
import f14.d;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import f14.g$a;
import f14.g$c;
import f14.b;
import android.animation.Animator;
import f14.e;
import android.view.View$OnLayoutChangeListener;
import java.util.Iterator;
import f14.g$b;
import java.lang.Integer;
import android.view.ViewPropertyAnimator;
import ekd.k1;
import java.lang.Runnable;

public abstract class g	// class@0027b3
{
    public View b;
    public View c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public Runnable h;
    public HashSet i;
    public HashSet j;
    public g$b k;
    public View$OnLayoutChangeListener l;
    public b m;
    public Object n;
    public int o;

    public void g(Context p0){
       super();
       this.d = false;
       this.e = 0x2710;
       this.f = 0;
       this.g = 0;
       this.h = new f(this);
       this.i = new HashSet();
       this.j = new HashSet();
       View view = this.c(p0);
       this.b = view;
       view.setOnClickListener(new d(this));
    }
    public void A(long p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, og, "3")) {
          return;
       }
       if (!p0) {
          p0 = 0x2710;
       }
       this.e = p0;
       if (this.n()) {
          this.w();
       }
       return;
    }
    public void B(long p0){
       this.g = p0;
    }
    public void C(Object p0){
       this.n = p0;
    }
    public void a(g$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "19")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public void b(g$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "20")) {
          return;
       }
       this.j.add(p0);
       return;
    }
    public abstract View c(Context p0);
    public void d(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       g tm = this.m;
       if (tm != null) {
          tm.c(this);
       }
       return;
    }
    public abstract int e();
    public View f(){
       return this.b;
    }
    public Animator g(){
       return null;
    }
    public int h(){
       return 1;
    }
    public int i(){
       return this.o;
    }
    public Animator j(){
       return null;
    }
    public long k(){
       return this.g;
    }
    public Object l(){
       return this.n;
    }
    public boolean m(){
       return false;
    }
    public boolean n(){
       return this.d;
    }
    public void o(View p0){
    }
    public void p(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "12")) {
          return;
       }
       this.w();
       if (!PatchProxy.applyVoid(objArray, this, og, "2")) {
          og = this.c;
          if (og != null && this.l == null) {
             e uoe = new e(this);
             this.l = uoe;
             og.addOnLayoutChangeListener(uoe);
          }
       }
       this.u();
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().onClick();
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, g.class, "13")) {
          return;
       }
       this.s();
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, g.class, "15")) {
          return;
       }
       this.d = false;
       g tk = this.k;
       if (tk != null) {
          tk.onDismiss();
       }
       this.v();
       return;
    }
    public void t(int p0,int p1,int p2,int p3,Animator p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, og, "6")) {
             return;
          }
       }
       g tm = this.m;
       if (tm != null) {
          tm.a(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, g.class, "14")) {
          return;
       }
       this.d = true;
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().onShow();
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, g.class, "18")) {
          return;
       }
       this.d = false;
       this.b.animate().cancel();
       k1.n(this);
       g tc = this.c;
       if (tc != null) {
          g tl = this.l;
          if (tl != null) {
             tc.removeOnLayoutChangeListener(tl);
          }
       }
       this.c = null;
       this.l = null;
       this.k = null;
       this.j.clear();
       this.i.clear();
       return;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       if (this.e > 0) {
          k1.m(this.h);
          k1.s(this.h, this, this.e);
       }
       return;
    }
    public void x(long p0){
       this.f = p0;
    }
    public void y(g$b p0){
       this.k = p0;
    }
    public void z(int p0){
       this.o = p0;
    }
}
