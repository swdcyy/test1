package im1.c;
import java.lang.Runnable;
import im1.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.transition.Transition;
import androidx.transition.Transition$f;
import e3.l;

public final class c implements Runnable	// class@002948
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "21")) {
       }else {
          tb.d9(3);
          tb.R8().a(tb.X);
          tb.X8(tb.P8(), tb.R8());
          tb.e9();
       }
       return;
    }
}
