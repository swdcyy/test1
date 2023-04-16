package dic.a;
import g9c.a;
import y8c.f$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import ml8.c;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import ekd.p1;
import eic.b;
import jp.a;
import y8c.a;

public class a extends a	// class@0021cc
{
    public f$b g;
    public int h;

    public void a(){
       super();
    }
    public void X0(f$b p0){
       this.g = p0;
    }
    public void Y0(int p0){
       this.h = p0;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          p0.itemView.setTag(R.id.item_view_position, Integer.valueOf(p1));
          Object[] objArray = new Object[]{this.N0(p1),this.g};
          p0.b.i(objArray);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f uof;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uof != PatchProxyResult.class) {
          label_0038 :
             return uof;
          }
       }
       uof = new f(p1.i(p0, 0x7f0d14e8, false), new b(a.e, this.h, this.g.f.f()));
       goto label_0038 ;
    }
}
