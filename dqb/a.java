package dqb.a;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import y8c.f$b;
import ml8.c;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dqb.c;

public class a extends a	// class@0024ee
{

    public void a(){
       super();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          p0.d.b = p1;
          Object[] objArray = new Object[]{this.N0(p1),this,p0.d};
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
          label_0033 :
             return uof;
          }
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new c());
       uof = new f(a.i(p0, 0x7f0d1012), presenterV2);
       goto label_0033 ;
    }
}
