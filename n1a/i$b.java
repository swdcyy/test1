package n1a.i$b;
import y8c.g;
import n1a.i;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import n1a.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import ml8.c;

public class i$b extends g	// class@0030c0
{
    public final i w;

    public void i$b(i p0){
       this.w = p0;
       super();
    }
    public int f0(int p0){
       return 2;
    }
    public int getItemCount(){
       return 1;
    }
    public f h1(ViewGroup p0,int p1){
       i$b uob = i$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d010a), new g(this.w.p));
    }
}
