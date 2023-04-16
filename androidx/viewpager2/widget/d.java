package androidx.viewpager2.widget.d;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2$j;
import java.lang.IllegalStateException;
import java.util.Locale;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public final class d extends ViewPager2$h	// class@000a41
{
    public final LinearLayoutManager a;
    public ViewPager2$j b;

    public void d(LinearLayoutManager p0){
       super();
       this.a = p0;
    }
    public void a(int p0){
    }
    public void b(int p0,float p1,int p2){
       if (this.b == null) {
          return;
       }
       p1 = - p1;
       p2 = 0;
       int i = 0;
       while (true) {
          if (i >= this.a.getChildCount()) {
             return;
          }
          View childAt = this.a.getChildAt(i);
          if (childAt != null) {
             int i1 = this.a.getPosition(childAt) - p0;
             float f = (float)i1 + p1;
             this.b.a(childAt, f);
             i = i + 1;
          }else {
             break ;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(this.a.getChildCount())};
       throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", objArray));
    }
    public void c(int p0){
    }
    public ViewPager2$j d(){
       return this.b;
    }
    public void e(ViewPager2$j p0){
       this.b = p0;
    }
}
