package bi9.g;
import java.lang.Runnable;
import bi9.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;

public final class g implements Runnable	// class@0004b1
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "8")) {
       }else {
          tb.p.removeCallbacks(tb.q);
          tb.h2();
          tb.p.postDelayed(tb.q, 1000);
       }
       return;
    }
}
