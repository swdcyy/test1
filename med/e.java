package med.e;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;

public class e extends RecyclerView$n	// class@001d12
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void e(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void e(int p0,int p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "1")) {
          return;
       }
       RecyclerView$Adapter adapter = p2.getAdapter();
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(adapter, Integer.valueOf(childAdapter), p0, this, e.class, "2")) {
          p0.top = this.a;
          p0.bottom = this.b;
          if (!childAdapter) {
             p0.left = this.d;
             p0.right = this.c / 2;
          }else if(childAdapter == (adapter.getItemCount() - 1)){
             p0.left = this.c / 2;
             p0.right = this.e;
          }else {
             childAdapter = this.c / 2;
             p0.left = childAdapter;
             p0.right = childAdapter;
          }
       }
       return;
    }
}
