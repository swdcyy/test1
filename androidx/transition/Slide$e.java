package androidx.transition.Slide$e;
import androidx.transition.Slide$h;
import androidx.transition.Slide$a;
import android.view.ViewGroup;
import android.view.View;
import a2.i0;

public final class Slide$e extends Slide$h	// class@0009ca
{

    public void Slide$e(){
       super(null);
    }
    public float b(ViewGroup p0,View p1){
       int i = 1;
       if (i0.B(p0) == i) {
       }else {
          i = 0;
       }
       float f = (i)? p1.getTranslationX() - (float)p0.getWidth(): p1.getTranslationX() + (float)p0.getWidth();
       return f;
    }
}
