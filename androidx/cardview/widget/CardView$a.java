package androidx.cardview.widget.CardView$a;
import c1.b;
import androidx.cardview.widget.CardView;
import java.lang.Object;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.view.View;

public class CardView$a implements b	// class@000651
{
    public Drawable a;
    public final CardView b;

    public void CardView$a(CardView p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1,int p2,int p3){
       this.b.g.set(p0, p1, p2, p3);
       CardView$a tb = this.b;
       CardView f = tb.f;
       CardView.d(tb, (p0 + f.left), (p1 + f.top), (p2 + f.right), (p3 + f.bottom));
    }
    public void b(int p0,int p1){
       CardView$a tb = this.b;
       if (p0 > tb.d) {
          CardView.e(tb, p0);
       }
       CardView$a tb1 = this.b;
       if (p1 > tb1.e) {
          CardView.g(tb1, p1);
       }
       return;
    }
    public void c(Drawable p0){
       this.a = p0;
       this.b.setBackgroundDrawable(p0);
    }
    public Drawable d(){
       return this.a;
    }
    public boolean e(){
       return this.b.getPreventCornerOverlap();
    }
    public View f(){
       return this.b;
    }
    public boolean g(){
       return this.b.getUseCompatPadding();
    }
}
