package cy1.a;
import y8c.g;
import y8c.f;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import cy1.a$a;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.h$b;
import n17.a;

public abstract class a extends g	// class@001eaa
{
    public a w;

    public void a(){
       super();
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "1")) {
          return;
       }
       super.g1(p0, p1, p2);
       p0.itemView.setOnClickListener(new a$a(this, p0));
       return;
    }
    public abstract h$b r1(List p0);
    public void s1(a p0){
       this.w = p0;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
