package jg9.f$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import jg9.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.camera.record.widget.RoundedImageView;
import android.widget.FrameLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.utility.n;
import j8c.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import java.lang.StringBuilder;
import q87.c;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;

public final class f$b implements ValueAnimator$AnimatorUpdateListener	// class@002a93
{
    public final f a;
    public final int b;
    public final LinearLayoutManager c;
    public final int[] d;
    public final float e;
    public final float f;
    public final RoundedImageView g;
    public final FrameLayout h;
    public final int i;
    public final int j;
    public final int k;

    public void f$b(f p0,int p1,LinearLayoutManager p2,int[] p3,float p4,float p5,RoundedImageView p6,FrameLayout p7,int p8,int p9,int p10){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       int[] ointArray;
       View view1;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       a.o(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       f$b ta = this.a;
       f$b tb = this.b;
       f$b tc = this.c;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          ointArray = PatchProxy.applyTwoRefs(Integer.valueOf(tb), tc, ta, uof, "8");
          if (ointArray != PatchProxyResult.class) {
          }else {
          label_0041 :
             int i = tc.c();
             int i1 = 0x7f0a3093;
             View view = null;
             if (tc.i0() <= tb && i >= tb) {
                view1 = tc.findViewByPosition(tb);
                view1 = (view1 != null)? view1.findViewById(i1): view;
                if (view1 != null) {
                   ointArray = n.o(view1);
                   a.o(ointArray, "ViewUtil.getLocationInWindow\(view\)");
                }
             }
          label_006a :
             view1 = tc.findViewByPosition(i);
             if (view1 != null) {
                view = view1.findViewById(i1);
             }
             if (view != null) {
                ointArray = n.o(view);
                a.o(ointArray, "ViewUtil.getLocationInWindow\(lastView\)");
             }else {
                ointArray = new int[2]{0,0};
             }
          }
       }else {
          goto label_0041 ;
       }
       f$b td = this.d;
       float f1 = ((float)(ointArray[0] - td[0]) * f) + this.e;
       float f2 = ((float)(ointArray[1] - td[1]) * f) + this.f;
       MultiTakePictureController$b v = MultiTakePictureController.V;
       Object[] objArray = new Object[0];
       a.D().s(v.c(), "progress: "+f+" translationX: "+f1+' '+"translationY:"+f2, objArray);
       Objects.requireNonNull(v);
       this.g.setRadius(((float)MultiTakePictureController.S * f));
       this.g.invalidate();
       this.h.setTranslationX(f1);
       this.h.setTranslationY(f2);
       tc = this.j;
       this.h.getLayoutParams().width = (int)(((float)(this.i - tc) * f) + (float)tc);
       tc = this.k;
       this.h.getLayoutParams().height = (int)(((float)(this.i - tc) * f) + (float)tc);
       this.h.requestLayout();
       return;
    }
}
