package i2.i;
import android.text.method.TransformationMethod;
import java.lang.Object;
import java.lang.CharSequence;
import android.view.View;
import androidx.emoji.text.EmojiCompat;
import android.graphics.Rect;

public class i implements TransformationMethod	// class@002171
{
    public final TransformationMethod b;

    public void i(TransformationMethod p0){
       super();
       this.b = p0;
    }
    public CharSequence getTransformation(CharSequence p0,View p1){
       if (p1.isInEditMode()) {
          return p0;
       }
       i tb = this.b;
       if (tb != null) {
          p0 = tb.getTransformation(p0, p1);
       }
       if (p0 != null && EmojiCompat.get().getLoadState() == 1) {
          p0 = EmojiCompat.get().process(p0);
       }
       return p0;
    }
    public void onFocusChanged(View p0,CharSequence p1,boolean p2,int p3,Rect p4){
       i tb = this.b;
       if (tb != null) {
          tb.onFocusChanged(p0, p1, p2, p3, p4);
       }
       return;
    }
}
