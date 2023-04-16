package cr8.b;
import cr8.a;
import br8.b;
import fr8.b;
import java.lang.Object;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;

public class b implements a	// class@001ff8
{
    public final b a;
    public final LongSparseArray b;
    public final b c;

    public void b(b p0,b p1){
       super();
       this.b = new LongSparseArray();
       this.a = p0;
       this.c = p1;
    }
    public View a(RecyclerView p0,int p1){
       RecyclerView$ViewHolder viewHolder;
       int i1;
       long l = this.a.E(p1);
       View view = this.b.get(l);
       if (view == null) {
          viewHolder = this.a.d(p0);
          this.a.t(viewHolder, p1);
          viewHolder = viewHolder.itemView;
          if (viewHolder.getLayoutParams() == null) {
             viewHolder.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          }
          int i = 0x40000000;
          if (this.c.a(p0) == 1) {
             p1 = View$MeasureSpec.makeMeasureSpec(p0.getWidth(), i);
             i1 = View$MeasureSpec.makeMeasureSpec(p0.getHeight(), 0);
          }else {
             p1 = View$MeasureSpec.makeMeasureSpec(p0.getWidth(), 0);
             i1 = View$MeasureSpec.makeMeasureSpec(p0.getHeight(), i);
          }
          viewHolder.measure(ViewGroup.getChildMeasureSpec(p1, (p0.getPaddingLeft() + p0.getPaddingRight()), viewHolder.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i1, (p0.getPaddingTop() + p0.getPaddingBottom()), viewHolder.getLayoutParams().height));
          viewHolder.layout(0, 0, viewHolder.getMeasuredWidth(), viewHolder.getMeasuredHeight());
          this.b.put(l, viewHolder);
       }
       return viewHolder;
    }
    public void invalidate(){
       this.b.clear();
    }
}
