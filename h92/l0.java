package h92.l0;
import ht5.d;
import h92.i0;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class l0 implements d	// class@002d17
{
    public final i0 a;

    public void l0(i0 p0){
       this.a = p0;
       super();
    }
    public boolean onError(Throwable p0){
       return false;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "1")) {
       }else {
          k1.m(this.a.Q);
          k1.r(this.a.Q, 3000);
       }
       return;
    }
}
