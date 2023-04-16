package qp7.d;
import dtd.a;
import java.lang.Object;
import qp7.x0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Exception;
import android.view.ViewGroup;
import qp7.c;
import java.lang.Integer;
import java.lang.Float;
import android.content.Context;
import android.view.View;
import qp7.t0;
import com.kwai.robust.PatchProxyResult;

public abstract class d implements a	// class@00341f
{
    public t0 b;
    public boolean c;
    public int d;
    public int e;
    public View f;
    public ViewGroup g;
    public Context h;
    public c i;
    public boolean j;
    public HashMap k;

    public void d(){
       super();
       this.d = -1;
       this.e = -1;
    }
    public final void g(x0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "13")) {
          return;
       }
       a.p(p0, "viewModel");
       if (this.c != null) {
          throw new Exception("Already bind");
       }
       this.c = true;
       this.q(p0);
       return;
    }
    public final void h(ViewGroup p0,c p1,int p2,float p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Float.valueOf(p3), this, d.class, "12")) {
          return;
       }
       a.p(p0, "parentView");
       a.p(p1, "eventObserver");
       if (this.j != null) {
          throw new Exception("Already created");
       }
       this.j = true;
       this.g = p0;
       Context context = p0.getContext();
       a.o(context, "parentView.context");
       this.h = context;
       this.i = p1;
       View view = this.i();
       this.f = view;
       String str = "view";
       if (view == null) {
          a.S(str);
       }
       view.setTag(R.id.category_bottom_margin, Integer.valueOf(p2));
       d tf = this.f;
       if (tf == null) {
          a.S(str);
       }
       tf.setTag(R.id.category_width_ratio, Float.valueOf(p3));
       this.r();
       return;
    }
    public abstract View i();
    public final t0 j(){
       d obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("config");
       }
       return obj;
    }
    public View j0(){
       d obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("view");
       }
       return obj;
    }
    public final Context k(){
       d obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          a.S("context");
       }
       return obj;
    }
    public final c l(){
       d obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("eventBus");
       }
       return obj;
    }
    public final ViewGroup m(){
       d obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("parentView");
       }
       return obj;
    }
    public final int n(){
       return this.e;
    }
    public final int o(){
       return this.d;
    }
    public final View p(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("view");
       }
       return obj;
    }
    public abstract void q(x0 p0);
    public void r(){
    }
    public final void s(t0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void t(int p0){
       this.e = p0;
    }
    public final void u(int p0){
       this.d = p0;
    }
}
