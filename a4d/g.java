package a4d.g;
import java.lang.Runnable;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.CycleInterpolator;
import android.animation.TimeInterpolator;

public final class g implements Runnable	// class@00008a
{
    public final EmotionFloatEditorFragment b;

    public void g(EmotionFloatEditorFragment p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       EmotionFloatEditorFragment e1 = tb.e1;
       e1.setPivotX(((float)e1.getWidth() / 2.00f));
       e1 = tb.e1;
       e1.setPivotY((float)e1.getHeight());
       tb.e1.animate().setDuration(300).rotation(-6.00f).setInterpolator(new CycleInterpolator(3.00f)).start();
    }
}
