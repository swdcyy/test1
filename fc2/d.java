package fc2.d;
import java.lang.Runnable;
import com.kuaishou.live.core.show.luckystar.pendant.a$d;
import com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantV2View;
import ks5.i;
import java.lang.Object;
import java.util.Objects;
import android.widget.RelativeLayout;
import lnc.a1;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kuaishou.live.core.show.luckystar.pendant.b;
import android.animation.Animator$AnimatorListener;
import ks5.m;

public final class d implements Runnable	// class@00292e
{
    public final a$d b;
    public final LiveLuckyStarNewPendantV2View c;
    public final i d;

    public void d(a$d p0,LiveLuckyStarNewPendantV2View p1,i p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       float f1;
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       tc.setVisibility(4);
       int i = a1.e(14.00f);
       tc.setScaleX(2.00f);
       tc.setScaleY(2.00f);
       float f = (float)a1.e(88.00f);
       tc.setTranslationY(f);
       tc.setAlpha(0x3f800000);
       float[] uofloatArray = new float[]{(float)i,f1};
       f1 = (float)(- i);
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tc, View.TRANSLATION_X, uofloatArray);
       objectAnimat.setDuration(200);
       float[] uofloatArray1 = new float[]{f,0};
       float[] uofloatArray2 = new float[]{f1,0};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x40000000,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x40000000,0x3f800000}),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray1),PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray2)};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(tc, propertyValu);
       objectAnimat1.setDuration(400);
       objectAnimat1.setStartDelay(1380);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       tb.e = uAnimatorSet;
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       uAnimatorSet.playSequentially(uAnimatorArr);
       tb.e.addListener(new b(tb, tc));
       this.d.rb(tb, tb.e);
    }
}
