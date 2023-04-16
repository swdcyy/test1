package nd9.l$d;
import nd9.l;
import java.lang.String;
import nd9.j;
import java.lang.Object;
import lnc.a1;
import java.lang.StringBuilder;
import q5b.f;
import android.animation.ObjectAnimator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.Keyframe;
import th0.e;
import android.animation.TimeInterpolator;
import th0.h;
import android.animation.PropertyValuesHolder;
import android.widget.ImageView;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.View;
import nd9.t;
import android.view.ViewOutlineProvider;
import android.util.Property;
import nd9.l$d$a;
import android.animation.Animator$AnimatorListener;

public final class l$d	// class@00314b
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public AnimatorSet g;
    public final l h;

    public void l$d(l p0,int p1,String p2,boolean p3,j p4){
       this.h = p0;
       super();
       this.a = 4000;
       this.b = a1.e(0x3f800000);
       this.c = a1.e(3.00f);
       this.d = a1.e(10.00f);
       this.e = p1;
       if (p3) {
          StringBuilder str = "";
          p1 = (f.a())? 0x7f103114: 0x7f103113;
          p2 = str+a1.p(p1)+"£º"+p2;
       }
       this.f = "   "+p2;
       return;
    }
    public final ObjectAnimator a(){
       Keyframe obj = PatchProxy.apply(null, this, l$d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Keyframe.ofFloat(0, 0x3f800000);
       obj.setInterpolator(new e());
       Keyframe keyframe = Keyframe.ofFloat(0.05f, 0x3fa00000);
       keyframe.setInterpolator(new h());
       Keyframe keyframe1 = Keyframe.ofFloat(0.10f, 0x3f800000);
       Keyframe keyframe2 = Keyframe.ofFloat(0x3f800000, 0x3f800000);
       Keyframe[] keyframeArra = new Keyframe[]{obj,keyframe,keyframe1,keyframe2};
       Keyframe[] keyframeArra1 = new Keyframe[]{obj,keyframe,keyframe1,keyframe2};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scaleX", keyframeArra),PropertyValuesHolder.ofKeyframe("scaleY", keyframeArra1)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.h.s, propertyValu);
       objectAnimat.setDuration(4000);
       objectAnimat.setRepeatCount((this.e - 2));
       objectAnimat.setStartDelay(4400);
       return objectAnimat;
    }
    public final ObjectAnimator b(ImageView p0){
       l$d uod = l$d.class;
       l$d obj = PatchProxy.applyOneRefs(p0, this, uod, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       l$d tb = this.b;
       l$d tc = this.c;
       l w = this.h.w;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(obj), Integer.valueOf(tb), Integer.valueOf(tc), w, this, l$d.class, "8")) {
          View parent = w.getParent();
          parent.setPadding(tc, tb, tc, tb);
          parent.setOutlineProvider(new t(this, tc, tb, obj));
          parent.setClipToOutline(1);
       }
       float f = (float)p0.getWidth();
       Keyframe keyframe = Keyframe.ofFloat(0, f);
       f = - f;
       Keyframe keyframe1 = Keyframe.ofFloat(0.15f, f);
       Keyframe[] keyframeArra = new Keyframe[]{keyframe,keyframe1,Keyframe.ofFloat(0x3f800000, f)};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, keyframeArra)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setDuration(4000);
       objectAnimat.addListener(new l$d$a(this, p0));
       objectAnimat.setStartDelay(800);
       objectAnimat.setRepeatCount((this.e - 1));
       return objectAnimat;
    }
}
