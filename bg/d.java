package bg.d;
import android.view.View;
import java.lang.Object;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.graphics.drawable.Drawable;
import a2.i0;
import android.graphics.drawable.LayerDrawable;
import java.lang.Integer;
import java.lang.Float;

public class d	// class@000b2a
{
    public ReactViewBackgroundDrawable a;
    public View b;

    public void d(View p0){
       super();
       this.b = p0;
    }
    public final ReactViewBackgroundDrawable a(){
       Object[] objArray = null;
       Drawable obj = PatchProxy.apply(objArray, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.a = new ReactViewBackgroundDrawable(this.b.getContext());
          obj = this.b.getBackground();
          i0.v0(this.b, objArray);
          if (obj == null) {
             i0.v0(this.b, this.a);
          }else {
             Drawable[] uDrawableArr = new Drawable[]{this.a,obj};
             i0.v0(this.b, new LayerDrawable(uDrawableArr));
          }
       }
       return this.a;
    }
    public void b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       if (p0 || this.a != null) {
          this.a().r(p0);
       }
       return;
    }
    public void c(int p0,float p1,float p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, d.class, "4")) {
          return;
       }
       this.a().o(p0, p1, p2);
       return;
    }
    public void d(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "5")) {
          return;
       }
       this.a().s(p0);
       return;
    }
    public void e(float p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, uod, "6")) {
          return;
       }
       this.a().t(p0, p1);
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       this.a().p(p0);
       return;
    }
    public void g(int p0,float p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uod, "3")) {
          return;
       }
       this.a().q(p0, p1);
       return;
    }
}
