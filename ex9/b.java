package ex9.b;
import com.yxcorp.gifshow.fragment.e;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import android.content.Context;
import android.widget.FrameLayout;
import g9c.d;
import i2b.a;
import ex9.a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$MarginLayoutParams;

public class b extends e	// class@002245
{
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public ViewGroup n;
    public static final int o;

    static {
       b.o = a1.e(60.00f);
    }
    public void b(RecyclerFragment p0){
       super(p0);
    }
    public void d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.j();
       this.f();
       this.n.addView(this.m, this.w());
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.n.removeView(this.j);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.n.removeView(this.i);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.x();
       this.n.addView(this.j, this.w());
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.n.removeView(this.k);
       this.n.removeView(this.l);
       return;
    }
    public void k(boolean p0,Throwable p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "6")) {
          return;
       }
       this.f();
       if (p1 instanceof KwaiException && p1.getErrorCode() == 0x4e93) {
          i.d(R.style.arg_RES_7f11066a, p1.getMessage());
          this.n.addView(this.k, this.w());
          return;
       }else {
          this.n.addView(this.l, this.w());
          return;
       }
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       this.n.addView(this.i);
       return;
    }
    public void u(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       FrameLayout uFrameLayout = new FrameLayout(p0);
       this.n = uFrameLayout;
       this.c.L0(uFrameLayout);
       this.m = a.i(this.n, 0x7f0d1610);
       this.j = a.i(this.n, 0x7f0d1609);
       this.k = a.i(this.n, 0x7f0d160c);
       View view = a.i(this.n, R.layout.arg_RES_7f0d072a);
       this.l = view;
       view.findViewById(R.id.retry_btn).setOnClickListener(new a(this));
       this.i = a.i(this.n, 0x7f0d01db);
       return;
    }
    public final ViewGroup$LayoutParams w(){
       ViewGroup$MarginLayoutParams obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ViewGroup$MarginLayoutParams(-1, -2);
       obj.topMargin = b.o;
       return obj;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.n.removeView(this.m);
       return;
    }
}
