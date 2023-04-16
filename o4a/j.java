package o4a.j;
import erd.g;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f4a.f;

public final class j implements g	// class@00328a
{
    public final b b;

    public void j(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uob, "9")) {
          tb.T = b;
          if (b) {
             k1.m(tb.Z);
             tb.m8().setVisibility(4);
          }else if(tb.W.d != null){
             tb.m8().setVisibility(0);
          }
       }
       return;
    }
}
