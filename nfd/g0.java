package nfd.g0;
import androidx.lifecycle.ViewModel;
import nfd.g0$a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalArgumentException;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.lang.Boolean;
import yr4.d$a;
import wkd.b;
import ped.y;
import com.yxcorp.gifshow.util.rx.RxBus;
import w7d.c;
import com.google.gson.JsonObject;
import oy5.j;

public final class g0 extends ViewModel	// class@001dab
{
    public boolean a;
    public String b;
    public JsonObject c;
    public String d;
    public String e;
    public d$a f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public static final g0 s;
    public static final ViewModelProvider$Factory t;

    static {
       g0.s = new g0();
       g0.t = new g0$a();
    }
    public void g0(){
       super();
       this.g = 0;
    }
    public static g0 s0(FragmentActivity p0){
       g0 og0 = g0.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, og0, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return ViewModelProviders.of(p0, g0.t).get(og0);
       }
       if (!SystemUtil.I()) {
          return g0.s;
       }
       throw new IllegalArgumentException("activity is null ");
    }
    public void A0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "2")) {
          return;
       }
       this.g = (p0)? this.p0() + 1: this.p0() - 1;
       return;
    }
    public void C0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "22")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.q = p0;
       return;
    }
    public void D0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "21")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.p = p0;
       return;
    }
    public void E0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "19")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.o = p0;
       return;
    }
    public void F0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "14")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.j = p0;
       return;
    }
    public void G0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "7")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.a = p0;
       return;
    }
    public void H0(String p0){
       this.e = p0;
    }
    public void I0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "16")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.l = p0;
       return;
    }
    public void J0(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "3")) {
          return;
       }
       this.f = p0;
       b.a(-580566064).g(this.f);
       RxBus.f.b(new c(true));
       return;
    }
    public void K0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "18")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.n = p0;
       return;
    }
    public void L0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "15")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.k = p0;
       return;
    }
    public void M0(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "17")) {
          return;
       }
       if (this.o0()) {
          return;
       }
       this.m = p0;
       return;
    }
    public final boolean o0(){
       boolean b = (this == g0.s)? true: false;
       return b;
    }
    public int p0(){
       return this.g;
    }
    public String q0(){
       return this.q;
    }
    public String r0(){
       return this.p;
    }
    public JsonObject t0(){
       return this.c;
    }
    public d$a u0(){
       g0 obj = PatchProxy.apply(null, this, g0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          return obj;
       }
       return b.a(-1585478370).c();
    }
    public boolean v0(){
       return this.o;
    }
    public boolean w0(){
       return this.j;
    }
    public boolean x0(){
       return this.n;
    }
    public boolean y0(){
       return this.k;
    }
    public boolean z0(){
       return this.m;
    }
}
