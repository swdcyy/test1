package com.kuaishou.live.audience.component.follow.card.c;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ObjectAnimator;
import th0.c;
import android.animation.TimeInterpolator;

public final class c implements PopupInterface$c	// class@000acb
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.setPivotX(((float)p0.getWidth() / 2.00f));
       p0.setPivotY(((float)p0.getHeight() / 2.00f));
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f4ccccd}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f4ccccd}),j.b(new float[2]{0x3f800000,0})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setDuration(400);
       objectAnimat.setInterpolator(new c());
       objectAnimat.addListener(p1);
       objectAnimat.start();
    }
}
