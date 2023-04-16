package g19.o;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.side.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class o implements Runnable	// class@0023d0
{
    public final c b;

    public void o(c p0){
       this.b = p0;
    }
    public final void run(){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, c.class, "7")) {
       }else {
          c s = tb.S;
          if (s != null) {
             s.clearAnimation();
             tb.S.setVisibility(0);
          }
       }
       return;
    }
}
