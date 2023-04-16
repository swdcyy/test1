package e2.e;
import e2.a;
import android.widget.ListView;
import android.view.View;
import androidx.core.widget.ListViewCompat;

public class e extends a	// class@001ed4
{
    public final ListView t;

    public void e(ListView p0){
       super(p0);
       this.t = p0;
    }
    public boolean a(int p0){
       return false;
    }
    public boolean b(int p0){
       e tt = this.t;
       int count = tt.getCount();
       if (!count) {
          return false;
       }
       int childCount = tt.getChildCount();
       int firstVisible = tt.getFirstVisiblePosition();
       int i = firstVisible + childCount;
       if (p0 > 0) {
          if (i >= count && tt.getChildAt((childCount - 1)).getBottom() <= tt.getHeight()) {
             return false;
          }
       }else if(p0 < 0){
          if (firstVisible <= 0 && tt.getChildAt(false).getTop() >= 0) {
             return false;
          }
       }else {
          return false;
       }
       return 1;
    }
    public void j(int p0,int p1){
       ListViewCompat.b(this.t, p1);
    }
}
