package gb1.b0;
import eb1.a;
import gb1.d0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import android.app.Activity;
import bb1.b;
import d61.y;

public final class b0 implements a	// class@00244a
{
    public final d0 a;

    public void b0(d0 p0){
       this.a = p0;
    }
    public final void run(){
       b0 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, d0.class, "4")) {
       }else if(y.d(ta.b.getActivity())){
          ta.b.getActivity().setRequestedOrientation(1);
          ta.j(1);
       }else {
          ta.j(false);
       }
       return;
    }
}
