package k81.h;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k81.f;
import android.view.View$OnTouchListener;

public class h extends RecyclerView$ViewHolder	// class@002cd9
{
    public d b;
    public j c;
    public QLiveMessage d;
    public int e;

    public void h(View p0){
       super(p0);
       this.c(p0);
    }
    public void a(View p0,QLiveMessage p1,int p2){
    }
    public void b(View p0,QLiveMessage p1){
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       p0.setOnTouchListener(new f(this));
       return;
    }
}
