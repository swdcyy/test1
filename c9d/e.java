package c9d.e;
import java.lang.Runnable;
import c9d.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public class e implements Runnable	// class@000501
{
    public final i b;

    public void e(i p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       n.C(this.b.getActivity());
       return;
    }
}
