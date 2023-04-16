package am0.b;
import am0.a;
import java.lang.Object;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.ViewGroup;
import am0.b$a;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import am0.e;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;

public final class b	// class@0000d4
{
    public View a;
    public int b;
    public b$a c;
    public int d;
    public int e;
    public final a f;

    public void b(a p0){
       super();
       this.f = p0;
       this.d = a1.e(16.00f);
       this.e = a1.e(11.00f);
    }
    public final void a(boolean p0){
       b tc;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "7")) {
          return;
       }
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, uob, "8")) {
             tc = this.c;
             if (tc != null) {
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0})};
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tc.a(), propertyValu);
                if (objectAnimat != null) {
                   objectAnimat.setDuration(240);
                   objectAnimat.addListener(new e(this));
                   objectAnimat.start();
                }
             }
          }
       }else {
          tc = this.f;
          if (tc != null) {
             tc.c3();
          }
       }
       return;
    }
    public final boolean b(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public final View c(){
       return this.a;
    }
    public final void d(View p0){
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       b tc = this.c;
       if (tc != null) {
          ViewGroup viewGroup = tc.a();
          Object[] objArray = null;
          b$a uoa = PatchProxy.apply(objArray, tc, b$a.class, "11");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = tc.g;
             if (uoa == null) {
                a.S("mArrowView");
             }
          }
          Object obj = uoa;
          if (!PatchProxy.applyVoidThreeRefs(viewGroup, obj, p0, this, b.class, "5") && p0 != null) {
             int[] ointArray = new int[2];
             p0.getLocationOnScreen(ointArray);
             if (this.b != ointArray[0]) {
                int[] ointArray1 = new int[2];
                viewGroup.getLocationOnScreen(ointArray1);
                float f = (float)(ointArray[0] - ointArray1[0]) + ((float)(p0.getWidth() - obj.getWidth()) / 2.00f);
                float f1 = (float)(viewGroup.getWidth() - obj.getWidth());
                ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof FrameLayout$LayoutParams) {
                   objArray = layoutParams;
                }
                if (objArray != null) {
                   if (f - (f1 - (float)this.d) > 0) {
                      b te = this.e;
                      i = (n.y(a1.c()) - viewGroup.getWidth()) - te;
                      i1 = i - te;
                   }else {
                      i = this.e;
                      i1 = 0;
                   }
                   objArray.leftMargin = i;
                   viewGroup.setLayoutParams(objArray);
                }else {
                   i1 = 0;
                }
                f = f - (float)i1;
                this.b = ointArray[0];
                obj.setX(f);
                viewGroup.setPivotX((f + (float)(obj.getWidth() / 2)));
                viewGroup.setPivotY((float)viewGroup.getHeight());
             }
          }
       }
    label_00c1 :
       return;
    }
}
