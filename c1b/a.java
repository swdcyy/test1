package c1b.a;
import y0b.i;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public abstract class a extends i	// class@000496
{

    public void a(){
       super();
    }
    public boolean K(){
       return true;
    }
    public abstract int N();
    public final View u(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.i(p0, this.N());
    }
}
