package androidx.appcompat.widget.DropDownListView$b;
import java.lang.Runnable;
import androidx.appcompat.widget.DropDownListView;
import java.lang.Object;
import android.widget.ListView;

public class DropDownListView$b implements Runnable	// class@0005ff
{
    public final DropDownListView b;

    public void DropDownListView$b(DropDownListView p0){
       this.b = p0;
       super();
    }
    public void a(){
       DropDownListView$b tb = this.b;
       tb.o = null;
       tb.removeCallbacks(this);
    }
    public void b(){
       this.b.post(this);
    }
    public void run(){
       DropDownListView$b tb = this.b;
       tb.o = null;
       tb.drawableStateChanged();
    }
}
