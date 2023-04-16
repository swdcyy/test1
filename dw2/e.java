package dw2.e;
import androidx.lifecycle.Observer;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.Object;
import dw2.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dw2.i$b;
import dw2.i$a;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimationDrawable;
import dw2.i$c;
import dw2.i$d;
import dw2.i$e;

public final class e implements Observer	// class@0025b2
{
    public final View b;
    public final TextView c;
    public final ImageView d;

    public void e(View p0,TextView p1,ImageView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          e tb = this.b;
          int i = (p0 instanceof i$b)? 8: 0;
          tb.setVisibility(i);
          AnimationDrawable uAnimationDr = null;
          if (p0 instanceof i$a) {
             this.c.setText(p0.toString());
             this.d.setImageResource(R.drawable.arg_RES_7f081544);
             p0 = this.d.getDrawable();
             if (p0 instanceof AnimationDrawable) {
                uAnimationDr = p0;
             }
             if (uAnimationDr != null) {
                uAnimationDr.start();
             }
          }else if(p0 instanceof i$c){
             this.c.setText(p0.toString());
             this.d.setImageResource(R.drawable.arg_RES_7f081523);
          }else if(p0 instanceof i$d){
             this.c.setText(p0.toString());
             this.d.setImageResource(R.drawable.arg_RES_7f081524);
          }else if(p0 instanceof i$e){
             this.c.setText(p0.toString());
             this.d.setImageResource(R.drawable.arg_RES_7f081525);
          }else {
             p0 = this.d.getDrawable();
             if (p0 instanceof AnimationDrawable) {
                uAnimationDr = p0;
             }
             if (uAnimationDr != null) {
                uAnimationDr.stop();
             }
          }
       }
       return;
    }
}
