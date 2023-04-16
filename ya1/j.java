package ya1.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import u07.t$a;
import ya1.j$b;
import v07.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.lang.CharSequence;
import ya1.j$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public class j extends RecyclerView$Adapter	// class@0047e7
{
    public t$a e;
    public j$b f;
    public View g;

    public void j(t$a p0,j$b p1){
       super();
       this.e = p0;
       this.f = p1;
    }
    public void J0(a p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "2")) {
          return;
       }
       TextView textView = p0.itemView.findViewById(R.id.live_checkbox_dialog_text_view);
       if (textView != null) {
          textView.setText(this.e.k0().get(p1));
       }
       View view = p0.itemView.findViewById(R.id.live_checkbox_dialog_checkbox_view);
       this.g = view;
       view.setSelected(false);
       this.g.setOnClickListener(new j$a(this));
       return;
    }
    public int getItemCount(){
       return 1;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.J0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a uoa;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "1");
          if (uoa != PatchProxyResult.class) {
          label_0029 :
             return uoa;
          }
       }
       uoa = new a(a.k(p0, this.e.j0(), false));
       goto label_0029 ;
    }
}
