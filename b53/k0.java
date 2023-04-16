package b53.k0;
import java.lang.Runnable;
import com.kuaishou.live.gzone.barrage.p;
import java.lang.Object;
import java.util.Objects;
import pm8.a;
import t02.a0;
import jv1.b;

public final class k0 implements Runnable	// class@000313
{
    public final p b;

    public void k0(p p0){
       this.b = p0;
    }
    public final void run(){
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       if (a.p()) {
       }else if(tb.s.x.H2()){
          tb.y = true;
       }else {
          tb.V8();
       }
       return;
    }
}
