package e8a.j1;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import d6a.u;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p1;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;

public final class j1 implements ScaleHelpView$a	// class@0020b6
{
    public int a;
    public int b;
    public final SlideVerticalAtlasExpandPresenter c;

    public void j1(SlideVerticalAtlasExpandPresenter p0){
       this.c = p0;
       super();
    }
    public void a(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j1.class, "1")) {
          return;
       }
       View view = this.e();
       view.getLocationOnScreen(p0);
       a.m(p0);
       p0[2] = view.getMeasuredWidth();
       int measuredHeig = view.getMeasuredHeight();
       this.b = measuredHeig;
       p0[3] = measuredHeig;
       if (u.a()) {
          p0[1] = p0[1] + p1.f(this.c.getContext());
       }
       return;
    }
    public void b(MotionEvent p0,boolean p1){
    }
    public void c(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j1.class, "2")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter u = this.c.u;
       a.m(u);
       u.setVisibility(4);
       InvalidGestureChecker.h.b(this.c.getContext(), AnswerType.SCALE_GESTURE);
       return;
    }
    public void d(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j1.class, "3")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter u = this.c.u;
       a.m(u);
       u.setVisibility(0);
       return;
    }
    public final View e(){
       SlideVerticalAtlasExpandPresenter obj = PatchProxy.apply(null, this, j1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.u;
       a.m(obj);
       return obj;
    }
    public Bitmap getBitmap(){
       View obj = PatchProxy.apply(null, this, j1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       int drawingCache = obj.getDrawingCacheBackgroundColor();
       int i = 0;
       obj.setBackgroundColor(i);
       if (this.c.Z == null || this.b != this.a) {
          Object[] objArray = new Object[i];
          o.C().s("NasaExpandLongAtlas", "w = "+obj.getMeasuredWidth()+" h = "+this.b, objArray);
          j1 tc = this.c;
          int i1 = 1;
          int measuredWidt = (obj.getMeasuredWidth() > 0)? obj.getMeasuredWidth(): 1;
          j1 tb = this.b;
          if (tb > null) {
             i1 = tb;
          }
          tc.Z = Bitmap.createBitmap(measuredWidt, i1, Bitmap$Config.ARGB_8888);
          SlideVerticalAtlasExpandPresenter z = this.c.Z;
          a.m(z);
          this.c.Y = new Canvas(z);
       }
       obj.draw(this.c.Y);
       obj.setBackgroundColor(drawingCache);
       this.a = this.b;
       SlideVerticalAtlasExpandPresenter z1 = this.c.Z;
       a.m(z1);
       return z1;
    }
}
