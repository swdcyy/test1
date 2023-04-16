package qp7.b;
import qp7.b$a;
import nsd.u;
import rp7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import pp7.b;
import java.lang.Boolean;
import java.util.ArrayList;
import qp7.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qp7.d;
import qp7.g;
import qp7.x0;
import java.util.List;
import qp7.t0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import qp7.a;
import uy6.h;
import uy6.b;
import as7.b;
import android.os.SystemClock;
import android.view.View;
import android.graphics.Paint;
import qp7.b1;
import crd.b;
import java.util.Iterator;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;

public abstract class b	// class@00341a
{
    public boolean b;
    public boolean c;
    public boolean d;
    public a e;
    public boolean f;
    public t0 g;
    public d h;
    public c i;
    public g j;
    public x0 k;
    public b l;
    public boolean m;
    public final List n;
    public a o;
    public static final b$a p;

    static {
       b.p = new b$a(null);
    }
    public void b(a p0){
       a.p(p0, "bizType");
       super();
       this.o = p0;
       this.e = new a();
       this.l = new b(Boolean.FALSE);
       this.n = new ArrayList();
    }
    public final c A(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("elementEventBus");
       }
       return obj;
    }
    public String B(){
       return null;
    }
    public final d C(){
       return this.h;
    }
    public final g D(){
       b obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("groupEventBus");
       }
       return obj;
    }
    public final x0 E(){
       b obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("model");
       }
       return obj;
    }
    public final List F(){
       return this.n;
    }
    public final t0 H(){
       b obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("pageConfig");
       }
       return obj;
    }
    public final b I(){
       return this.l;
    }
    public final boolean J(){
       return this.d;
    }
    public final boolean K(){
       return this.c;
    }
    public final boolean L(){
       return this.b;
    }
    public final boolean M(){
       Object obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj == PatchProxyResult.class) {
          obj = this.l.a();
          a.m(obj);
       }
       return obj.booleanValue();
    }
    public final void N(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "12")) {
          return;
       }
       a.p(p0, "owner");
       a.p(p1, "observer");
       if (ExperimentUtils.b()) {
          this.l.e(p0, p1);
       }else {
          this.l.d(p0, p1);
       }
       return;
    }
    public void O(){
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "27")) {
          return;
       }
       a.p(p0, "callerContext");
       return;
    }
    public void Q(){
    }
    public void R(){
    }
    public void S(){
    }
    public void T(){
    }
    public final void U(boolean p0){
       this.d = p0;
    }
    public final void V(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void W(boolean p0){
       this.c = p0;
    }
    public final void X(boolean p0){
       this.b = p0;
    }
    public final void Y(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a.p(p0, "view");
       this.h = p0;
       return;
    }
    public final void Z(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       a.p(p0, "groupEventBus");
       this.j = p0;
       return;
    }
    public final void a0(t0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       a.p(p0, "config");
       this.g = p0;
       return;
    }
    public final void b0(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       if (ExperimentUtils.a() && !this.M()) {
          return;
       }
       this.l.f(Boolean.FALSE);
       return;
    }
    public final void c0(){
       if (PatchProxy.applyVoid(null, this, b.class, "16")) {
          return;
       }
       if (ExperimentUtils.a() && this.M()) {
          return;
       }
       if (h.a.l == null) {
          String str = this.y();
          String str1 = this.s();
          if (str1 == null) {
             str1 = "";
          }
          b.d("BaseElement", "tryShow", str, str1);
       }
       this.l.f(Boolean.TRUE);
       return;
    }
    public void d0(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "21")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       b = false;
       this.b = b;
       if (h.a.l == null) {
          String str = this.y();
          String str1 = this.s();
          if (str1 == null) {
             str1 = "";
          }
          b.d("BaseElement", "unbind", str, str1);
       }
       long l = SystemClock.elapsedRealtime();
       b th = this.h;
       if (th != null) {
          View view = th.p();
          if (view != null) {
             view.setLayerType(b, objArray);
          }
       }
       this.T();
       b.c.a("unbind", this.y(), (SystemClock.elapsedRealtime() - l));
       this.n.clear();
       this.e.dispose();
       this.e = new a();
       return;
    }
    public final void i(b1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       a.p(p0, "listener");
       if (!this.n.contains(p0)) {
          this.n.add(p0);
       }
       return;
    }
    public final void j(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       a.p(p0, "disposable");
       this.e.c(p0);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "25")) {
          return;
       }
       this.d = true;
       String str = this.y();
       String str1 = this.s();
       if (str1 == null) {
          str1 = "";
       }
       b.d("BaseElement", "attached", str, str1);
       long l = SystemClock.elapsedRealtime();
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       b.c.a("attached", this.y(), (SystemClock.elapsedRealtime() - l));
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "23")) {
          return;
       }
       this.c = true;
       String str = this.y();
       String str1 = this.s();
       if (str1 == null) {
          str1 = "";
       }
       b.d("BaseElement", "becomesAttached", str, str1);
       long l = SystemClock.elapsedRealtime();
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().h();
       }
       b.c.a("becomesAttached", this.y(), (SystemClock.elapsedRealtime() - l));
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "24")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       this.c = false;
       String str = this.y();
       String str1 = this.s();
       if (str1 == null) {
          str1 = "";
       }
       b.d("BaseElement", "becomesDetached", str, str1);
       long l = SystemClock.elapsedRealtime();
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       b.c.a("becomesDetached", this.y(), (SystemClock.elapsedRealtime() - l));
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, b.class, "20")) {
          return;
       }
       this.b = true;
       if (h.a.l == null) {
          String str = this.y();
          String str1 = this.s();
          if (str1 == null) {
             str1 = "";
          }
          b.d("BaseElement", "bind", str, str1);
       }
       this.O();
       b.c.a("onBind", this.y(), (SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()));
       return;
    }
    public void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       a.p(p0, "callerContext");
       this.P(p0);
       b.c.a("onBindData", this.y(), (SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()));
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       String str = this.y();
       String str1 = this.s();
       if (str1 == null) {
          str1 = "";
       }
       b.d("BaseElement", "create", str, str1);
       if (this.f == null) {
          this.f = true;
          this.k = this.t();
          this.i = this.r();
          long l = SystemClock.elapsedRealtime();
          this.Q();
          if (!this instanceof DispatchBaseElement) {
             b.c.a("onCreate", this.y(), (SystemClock.elapsedRealtime() - l));
          }
          return;
       }else {
          throw new Exception("Already created");
       }
    }
    public abstract d q();
    public abstract c r();
    public String s(){
       return null;
    }
    public abstract x0 t();
    public void u(){
       if (PatchProxy.applyVoid(null, this, b.class, "22")) {
          return;
       }
       String str = this.y();
       String str1 = this.s();
       if (str1 == null) {
          str1 = "";
       }
       b.d("BaseElement", "destroy", str, str1);
       long l = SystemClock.elapsedRealtime();
       this.R();
       this.n.clear();
       if (this.e.f() > 0) {
          this.e.dispose();
          this.e = new a();
       }
       b.c.a("destroy", this.y(), (SystemClock.elapsedRealtime() - l));
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, b.class, "26")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       this.d = false;
       String str = this.y();
       String str1 = this.s();
       if (str1 == null) {
          str1 = "";
       }
       b.d("BaseElement", "detached", str, str1);
       long l = SystemClock.elapsedRealtime();
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       b.c.a("detached", this.y(), (SystemClock.elapsedRealtime() - l));
       return;
    }
    public final a w(){
       return this.e;
    }
    public final a x(){
       return this.o;
    }
    public final String y(){
       String obj = PatchProxy.apply(null, this, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.B())) {
          obj = this.getClass().getName();
          a.o(obj, "this::class.java.name");
       }else {
          obj = this.B();
          a.m(obj);
       }
       return obj;
    }
    public final View z(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          objArray = obj.p();
       }
       return objArray;
    }
}
