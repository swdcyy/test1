package ia9.d;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import ga9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ja9.a;

public abstract class d extends RecyclerView$ViewHolder implements View$OnClickListener	// class@00265c
{
    public a b;
    public final b c;

    public void d(View p0,b p1){
       a.q(p0, "itemView");
       a.q(p1, "viewBinder");
       super(p0);
       this.c = p1;
    }
    public void a(Object p0,List p1,ViewModel p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "1")) {
          return;
       }
       a.q(p1, "payloads");
       return;
    }
    public b b(){
       return this.c;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.b().d(this);
       RecyclerView$ViewHolder titemView = this.itemView;
       a.h(titemView, "itemView");
       this.b().e(titemView);
       return;
    }
    public void onBindClickEvent(int p0,ViewModel p1){
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       d tb = this.b;
       if (tb != null) {
          tb.a(p0, this.getAdapterPosition());
       }
       return;
    }
}
