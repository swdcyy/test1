package com.kuaishou.live.audience.component.follow.card.b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;

public final class b implements PopupInterface$c	// class@000aca
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.setPivotX(((float)p0.getWidth() / 2.00f));
       p0.setPivotY(((float)p0.getHeight() / 2.00f));
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000}),j.b(new float[2]{0,0x3f800000})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setDuration(400);
       objectAnimat.setInterpolator(new e());
       objectAnimat.addListener(p1);
       objectAnimat.start();
    }
}
