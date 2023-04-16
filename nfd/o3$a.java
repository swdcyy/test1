package nfd.o3$a;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class o3$a extends RecyclerView$n	// class@001deb
{
    public final int a;
    public final int b;
    public final int c;

    public void o3$a(int p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, o3$a.class, "1")) {
          return;
       }
       p0.left = (!p2.getChildLayoutPosition(p1))? a1.d(0x7f07054b): this.a / 2;
       p0.right = (p2.getChildLayoutPosition(p1) == (p2.getAdapter().getItemCount() - 1))? a1.d(0x7f070549): this.a / 2;
       p0.top = this.b;
       p0.bottom = this.c;
       return;
    }
}
