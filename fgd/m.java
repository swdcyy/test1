package fgd.m;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import bgd.e;

public final class m implements Runnable	// class@000e2e
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       RxBus.f.b(new e());
       return;
    }
}
