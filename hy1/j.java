package hy1.j;
import java.lang.Runnable;
import hy1.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j implements Runnable	// class@0027c5
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "8")) {
       }else {
          tb.f = false;
          tb.Uo();
       }
       return;
    }
}
