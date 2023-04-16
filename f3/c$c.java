package f3.c$c;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.Context;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.Resources;
import f3.h;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import java.lang.Object;
import android.animation.Animator;
import androidx.collection.SimpleArrayMap;
import java.lang.String;
import android.animation.AnimatorSet;
import java.util.Collection;
import java.lang.IllegalStateException;

public class c$c extends Drawable$ConstantState	// class@001fbd
{
    public int a;
    public h b;
    public AnimatorSet c;
    public ArrayList d;
    public ArrayMap e;

    public void c$c(Context p0,c$c p1,Drawable$Callback p2,Resources p3){
       super();
       if (p1 != null) {
          this.a = p1.a;
          c$c b = p1.b;
          boolean b1 = false;
          if (b != null) {
             Drawable$ConstantState constantStat = b.getConstantState();
             this.b = (p3 != null)? constantStat.newDrawable(p3): constantStat.newDrawable();
             b = this.b;
             b.mutate();
             this.b = b;
             b.setCallback(p2);
             this.b.setBounds(p1.b.getBounds());
             this.b.k(b1);
          }
          b = p1.d;
          if (b != null) {
             int i = b.size();
             this.d = new ArrayList(i);
             this.e = new ArrayMap(i);
             for (; b1 < i; b1 = b1 + 1) {
                Animator uAnimator = p1.d.get(b1);
                Animator uAnimator1 = uAnimator.clone();
                String str = p1.e.get(uAnimator);
                uAnimator1.setTarget(this.b.g(str));
                this.d.add(uAnimator1);
                this.e.put(uAnimator1, str);
             }
             this.a();
          }
       }
       return;
    }
    public void a(){
       if (this.c == null) {
          this.c = new AnimatorSet();
       }
       this.c.playTogether(this.d);
       return;
    }
    public int getChangingConfigurations(){
       return this.a;
    }
    public Drawable newDrawable(){
       throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    public Drawable newDrawable(Resources p0){
       throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
