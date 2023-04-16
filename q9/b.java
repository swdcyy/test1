package q9.b;
import q9.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import t9.g;
import p9.a;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import java.util.Iterator;
import p9.a$a;
import java.lang.Object;
import android.view.View;
import android.graphics.Rect;
import java.lang.Math;
import java.lang.Integer;
import p9.b;

public class b extends a	// class@00297f
{
    public a c;

    public void b(RecyclerView$LayoutManager p0,g p1){
       super(p0, p1);
       this.c = new a(p0);
    }
    public AnchorViewState b(){
       AnchorViewState uAnchorViewS = AnchorViewState.b();
       Iterator iterator = this.c.iterator();
       int i = Integer.MAX_VALUE;
       int i1 = Integer.MAX_VALUE;
       int i2 = Integer.MIN_VALUE;
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          View view = iterator1.next();
          AnchorViewState uAnchorViewS1 = this.d(view);
          int position = this.a.getPosition(view);
          int decoratedLef = this.a.getDecoratedLeft(view);
          int decoratedRig = this.a.getDecoratedRight(view);
          if (this.e().z(new Rect(uAnchorViewS1.a())) && !uAnchorViewS1.e()) {
             if (i1 > position) {
                uAnchorViewS = uAnchorViewS1;
                i1 = position;
             }
             if (i > decoratedLef) {
                i2 = decoratedRig;
                i = decoratedLef;
             }else if(i == decoratedLef){
                i2 = Math.max(i2, decoratedRig);
             }
          }
       }
       if (!uAnchorViewS.d()) {
          uAnchorViewS.a().left = i;
          uAnchorViewS.a().right = i2;
          uAnchorViewS.f(Integer.valueOf(i1));
       }
       return uAnchorViewS;
    }
    public void c(AnchorViewState p0){
       if (!p0.d()) {
          Rect rect = p0.a();
          rect.top = this.e().e();
          rect.bottom = this.e().C();
       }
       return;
    }
}
