package nfd.m3;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import lnc.a1;

public class m3 extends RecyclerView$n	// class@001dd1
{

    public void m3(){
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, m3.class, "1")) {
          return;
       }
       StaggeredGridLayoutManager$LayoutParams layoutParams = p1.getLayoutParams();
       int i = layoutParams.a();
       if (layoutParams.b()) {
          p0.left = a1.e(6.00f);
          p0.right = a1.e(6.00f);
       }else {
          float f = 3.00f;
          if (!i) {
             p0.left = a1.e(6.00f);
             p0.right = a1.e(f);
          }else if(i == 1){
             p0.left = a1.e(f);
             p0.right = a1.e(6.00f);
          }else {
             p0.left = a1.e(f);
             p0.right = a1.e(f);
          }
       }
       p0.top = a1.e(4.00f);
       p0.bottom = a1.e(4.00f);
       return;
    }
}
