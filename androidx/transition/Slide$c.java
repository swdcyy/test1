package androidx.transition.Slide$c;
import androidx.transition.Slide$i;
import androidx.transition.Slide$a;
import android.view.ViewGroup;
import android.view.View;

public final class Slide$c extends Slide$i	// class@0009c8
{

    public void Slide$c(){
       super(null);
    }
    public float a(ViewGroup p0,View p1){
       return (p1.getTranslationY() - (float)p0.getHeight());
    }
}
