package f53.e;
import com.kwai.live.gzone.widget.f;
import f53.d;
import com.kwai.live.gzone.widget.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y43.a;

public class e extends f	// class@0028a6
{
    public final d G;

    public void e(d p0,f$b p1){
       this.G = p0;
       super(p1);
    }
    public int e0(){
       e obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G;
       return obj.s.S(obj.getActivity());
    }
}
