package androidx.transition.ChangeBounds$a;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.ChangeBounds;
import android.view.ViewGroup;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.animation.Animator;
import e3.v;
import e3.w;
import e3.u;
import android.graphics.drawable.Drawable;

public class ChangeBounds$a extends AnimatorListenerAdapter	// class@0009a3
{
    public final ViewGroup a;
    public final BitmapDrawable b;
    public final View c;
    public final float d;
    public final ChangeBounds e;

    public void ChangeBounds$a(ChangeBounds p0,ViewGroup p1,BitmapDrawable p2,View p3,float p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       w.c(this.a).d(this.b);
       w.i(this.c, this.d);
    }
}
