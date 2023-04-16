package bc.b;
import bb.a;
import android.text.SpannableStringBuilder;
import java.util.HashSet;
import bc.b$b;
import bc.b$a;
import java.lang.CharSequence;
import android.view.View;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;
import bc.a;
import cc.a;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import bc.b$c;
import ub.b;

public class b extends SpannableStringBuilder implements a	// class@000b13
{
    public final Set b;
    public final b$b c;
    public View d;
    public Drawable e;
    public b$d f;

    public void b(){
       super();
       this.b = new HashSet();
       this.c = new b$b(this, null);
    }
    public void b(CharSequence p0){
       super(p0);
       this.b = new HashSet();
       this.c = new b$b(this, null);
    }
    public void a(View p0){
       this.d(p0);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().h.j();
       }
       return;
    }
    public void b(View p0){
       b td = this.d;
       if (td != null) {
          this.d(td);
       }
       if (this.e != null) {
          this.e = null;
       }
       this.d = p0;
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().h.i();
       }
       return;
    }
    public void c(a p0,int p1,int p2,int p3,int p4,boolean p5,int p6){
       if (p2 >= this.length()) {
          return;
       }
       Drawable uDrawable = p0.g();
       if (uDrawable != null) {
          if (uDrawable.getBounds().isEmpty()) {
             uDrawable.setBounds(0, 0, p3, p4);
          }
          uDrawable.setCallback(this.c);
       }
       a uoa = new a(p0, p6);
       p0 = p0.f();
       if (p0 instanceof AbstractDraweeController) {
          p0.addControllerListener(new b$c(this, uoa, p5, p4));
       }
       this.b.add(uoa);
       p2++;
       this.setSpan(uoa, p1, p2, 33);
       return;
    }
    public void d(View p0){
       if (p0 != this.d) {
          return;
       }
       this.d = null;
       return;
    }
}
