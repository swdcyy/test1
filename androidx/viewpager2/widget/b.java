package androidx.viewpager2.widget.b;
import androidx.viewpager2.widget.ViewPager2$j;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class b implements ViewPager2$j	// class@000a3f
{
    public final List a;

    public void b(){
       super();
       this.a = new ArrayList();
    }
    public void a(View p0,float p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(ViewPager2$j p0){
       this.a.add(p0);
    }
    public void c(ViewPager2$j p0){
       this.a.remove(p0);
    }
}
