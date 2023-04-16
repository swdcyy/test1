package nj.f;
import java.lang.Runnable;
import com.gifshow.tuna.player.component.TunaPlayFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import nj.c;

public final class f implements Runnable	// class@002712
{
    public final TunaPlayFragment b;

    public void f(TunaPlayFragment p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, TunaPlayFragment.class, "10")) {
       }else {
          tb.k = true;
          Iterator iterator = tb.q.iterator();
          while (iterator.hasNext()) {
             iterator.next().A();
          }
       }
       return;
    }
}
