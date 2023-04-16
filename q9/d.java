package q9.d;
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
import java.lang.Integer;
import p9.b;

public class d extends a	// class@002981
{
    public a c;

    public void d(RecyclerView$LayoutManager p0,g p1){
       super(p0, p1);
       this.c = new a(p0);
    }
    public AnchorViewState b(){
       AnchorViewState uAnchorViewS = AnchorViewState.b();
       Iterator iterator = this.c.iterator();
       int i = Integer.MAX_VALUE;
       int i1 = Integer.MAX_VALUE;
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          View view = iterator1.next();
          AnchorViewState uAnchorViewS1 = this.d(view);
          int position = this.a.getPosition(view);
          int decoratedTop = this.a.getDecoratedTop(view);
          if (this.e().z(new Rect(uAnchorViewS1.a())) && !uAnchorViewS1.e()) {
             if (i1 > position) {
                uAnchorViewS = uAnchorViewS1;
                i1 = position;
             }
             if (i > decoratedTop) {
                i = decoratedTop;
             }
          }
       }
       if (!uAnchorViewS.d()) {
          uAnchorViewS.a().top = i;
          uAnchorViewS.f(Integer.valueOf(i1));
       }
       return uAnchorViewS;
    }
    public void c(AnchorViewState p0){
       if (!p0.d()) {
          Rect rect = p0.a();
          rect.left = this.e().p();
          rect.right = this.e().g();
       }
       return;
    }
}
