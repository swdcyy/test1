package fy0.f;
import androidx.recyclerview.widget.RecyclerView$n;
import fy0.i;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import fy0.i$a;

public class f extends RecyclerView$n	// class@0023d2
{
    public final i a;

    public void f(i p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "1")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (!childAdapter) {
          p0.left = a1.d(0x7f07029e);
          p0.right = a1.d(0x7f070271);
       }else if(childAdapter == (this.a.e.getItemCount() - 1)){
          p0.right = a1.d(0x7f07029e);
       }else {
          p0.right = a1.d(0x7f070271);
       }
       return;
    }
}
