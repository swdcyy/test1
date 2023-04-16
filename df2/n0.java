package df2.n0;
import bb1.b;
import df2.m0;
import java.lang.Object;
import bb1.a;
import db1.b;
import bb1.d;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class n0 implements b	// class@0024ff
{
    public final m0 a;

    public void n0(m0 p0){
       this.a = p0;
       super();
    }
    public a a(){
       return this.a.K;
    }
    public b b(){
       return this.a.L;
    }
    public d c(){
       return this.a.O;
    }
    public Activity getActivity(){
       Object obj = PatchProxy.apply(null, this, n0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getActivity();
    }
}
