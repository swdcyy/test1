package mf5.w0;
import mf5.t0;
import mf5.x0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import m2a.f;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kf5.g;
import crd.b;
import java.lang.Number;
import java.lang.Float;
import java.lang.CharSequence;
import android.text.TextUtils;

public abstract class w0 implements t0, x0	// class@0030d2
{
    public int A;
    public final String B;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public a m;
    public final a n;
    public g o;
    public boolean p;
    public boolean q;
    public boolean r;
    public a s;
    public int t;
    public a u;
    public int v;
    public a w;
    public String x;
    public boolean y;
    public int z;

    public void w0(String p0){
       a.p(p0, "type");
       super();
       this.B = p0;
       this.a = "";
       this.b = "";
       this.c = "";
       this.e = "";
       this.f = "";
       this.g = 0x7f061981;
       this.n = new a();
       this.x = "";
       this.y = true;
    }
    public final String A(){
       return this.B;
    }
    public final int B(){
       return this.v;
    }
    public int C(){
       return 0;
    }
    public boolean D(){
       return this instanceof f;
    }
    public boolean E(){
       return true;
    }
    public final a F(){
       return this.m;
    }
    public final boolean G(){
       boolean b;
       w0 obj = PatchProxy.apply(null, this, w0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.m;
       if (obj != null) {
          Boolean uBoolean = obj.invoke();
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_0026 :
             return b;
          }
       }
       b = true;
       goto label_0026 ;
    }
    public final void H(boolean p0){
       this.p = p0;
    }
    public final void I(int p0){
       this.t = p0;
    }
    public final void J(boolean p0){
       this.y = p0;
    }
    public final void K(boolean p0){
       this.d = p0;
    }
    public final void L(int p0){
       this.i = p0;
    }
    public final void M(int p0){
       this.z = p0;
    }
    public final void N(int p0){
       this.A = p0;
    }
    public final void O(a p0){
       this.m = p0;
    }
    public final void P(int p0){
       this.j = p0;
    }
    public final void Q(a p0){
       this.u = p0;
    }
    public final void R(boolean p0){
       this.q = p0;
    }
    public final void S(int p0){
       this.g = p0;
    }
    public final void T(int p0){
       this.k = p0;
    }
    public final void U(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void V(int p0){
       this.v = p0;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w0.class, "20")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       return;
    }
    public final void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "7")) {
          return;
       }
       if (p0 != null) {
          this.n.c(p0);
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof w0) {
          return false;
       }
       return a.g(this.B, p0.B);
    }
    public final void f(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "13")) {
          return;
       }
       a.p(p0, "panel");
       this.o = p0;
       return;
    }
    public final float g(){
       float f;
       w0 obj = PatchProxy.apply(null, this, w0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.w;
       if (obj != null) {
          Float uFloat = obj.invoke();
          if (uFloat != null) {
             f = uFloat.floatValue();
          label_0027 :
             return f;
          }
       }
       f = 0x3f800000;
       goto label_0027 ;
    }
    public void h(){
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, w0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.B).hashCode();
    }
    public final boolean i(){
       return this.p;
    }
    public final a j(){
       return this.n;
    }
    public final int k(){
       return this.t;
    }
    public final boolean l(){
       return this.y;
    }
    public final boolean m(){
       return this.d;
    }
    public final String n(){
       w0 obj = PatchProxy.apply(null, this, w0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.G() && !TextUtils.isEmpty(this.c))? this.c: this.b;
       return obj;
    }
    public final int o(){
       return this.i;
    }
    public void onShow(){
    }
    public final int p(){
       w0 obj = PatchProxy.apply(null, this, w0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.G()) {
          obj = this.j;
          if (obj != null) {
          label_0021 :
             return obj;
          }
       }
       obj = this.i;
       goto label_0021 ;
    }
    public final g q(){
       return this.o;
    }
    public final int r(){
       return this.z;
    }
    public final int s(){
       return this.A;
    }
    public final a t(){
       return this.u;
    }
    public final boolean u(){
       return this.q;
    }
    public final int v(){
       return this.k;
    }
    public final String w(){
       w0 obj = PatchProxy.apply(null, this, w0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.G() && !TextUtils.isEmpty(this.f))? this.f: this.e;
       return obj;
    }
    public final int x(){
       w0 obj = PatchProxy.apply(null, this, w0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.G()) {
          obj = this.h;
          if (obj != null) {
          label_0021 :
             return obj;
          }
       }
       obj = this.g;
       goto label_0021 ;
    }
    public final int y(){
       w0 obj = PatchProxy.apply(null, this, w0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.G()) {
          obj = this.l;
          if (obj != null) {
          label_0021 :
             return obj;
          }
       }
       obj = this.k;
       goto label_0021 ;
    }
    public final String z(){
       return this.e;
    }
}
