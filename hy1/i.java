package hy1.i;
import java.lang.Runnable;
import hy1.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i implements Runnable	// class@0027c4
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "6")) {
       }else {
          tb.e = null;
          tb.Uo();
       }
       return;
    }
}
