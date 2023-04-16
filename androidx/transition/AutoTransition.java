package androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.ChangeBounds;

public class AutoTransition extends TransitionSet	// class@0009a2
{

    public void AutoTransition(){
       super();
       this.x0();
    }
    public void AutoTransition(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x0();
    }
    public final void x0(){
       this.t0(1);
       this.l0(new Fade(2));
       this.l0(new ChangeBounds());
       this.l0(new Fade(1));
    }
}
