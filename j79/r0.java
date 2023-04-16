package j79.r0;
import u79.o;
import java.lang.Object;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import u79.n;
import q79.d;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import o79.i;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public final class r0 implements o	// class@002791
{
    public final String b;
    public int c;
    public String d;
    public boolean e;
    public View f;
    public SubsamplingScaleImageView g;
    public CompatImageView h;

    public void r0(){
       super();
       this.b = "ImagePreviewItem";
    }
    public AbsPreviewItemViewBinder O1(){
       return n.d(this);
    }
    public void a(int p0){
       this.c = p0;
    }
    public void b(d p0){
       n.j(this, p0);
    }
    public void c(){
    }
    public void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "2")) {
          return;
       }
       Log.g(this.b, "bind image item called, index = "+this.c);
       this.f = p0;
       return;
    }
    public void e(float p0){
       n.a(this, p0);
    }
    public void f(){
       n.g(this);
    }
    public void g(boolean p0){
       n.c(this, p0);
    }
    public int getIndex(){
       return this.c;
    }
    public View getView(){
       return this.f;
    }
    public void h(AbsPreviewItemViewBinder p0){
       n.k(this, p0);
    }
    public void i(){
    }
    public boolean isPlaying(){
       return n.f(this);
    }
    public boolean isPrepared(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public int k(){
       return 3;
    }
    public void l(){
       n.h(this);
    }
    public void m(){
       n.l(this);
    }
    public void n(){
    }
    public View o(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "container");
       View view = i.m(p0.getContext(), R.layout.arg_RES_7f0d06fd, null);
       a.h(view, "CommonUtil.inflate\(conta¡­ia_preview_unknown, null\)");
       return view;
    }
    public void p(){
       this.e = false;
    }
    public void q(boolean p0){
       n.i(this, p0);
    }
    public void r(){
    }
    public boolean s(){
       return true;
    }
    public void t(){
       this.e = true;
    }
    public void u(int p0,float p1){
       n.e(this, p0, p1);
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, r0.class, "3")) {
          return;
       }
       r0 tg = this.g;
       if (tg != null) {
          if (tg == null) {
             a.L();
          }
          tg.recycle();
          this.g = null;
       }
       this.f = null;
       return;
    }
    public void v(){
    }
    public void w(boolean p0,boolean p1){
    }
}
