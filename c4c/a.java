package c4c.a;
import im8.g;
import g9c.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c4c.d;
import java.util.Map;
import java.util.HashMap;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Integer;
import y8c.f$b;
import ml8.c;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d4c.b;
import c4c.a$a;

public class a extends a implements g	// class@00051a
{
    public e0 g;

    public void a(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
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
          label_003b :
             return uof;
          }
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new b());
       presenterV2.U7(new a$a(this));
       uof = new f(a.i(p0, 0x7f0d1254), presenterV2);
       goto label_003b ;
    }
}
