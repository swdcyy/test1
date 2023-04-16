package ae3.i;
import java.lang.Runnable;
import com.kuaishou.live.liteend.baseinfo.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z1.a;

public final class i implements Runnable	// class@0000a4
{
    public final g b;

    public void i(g p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, g.class, "4")) {
       }else {
          tb.c.accept(null);
       }
       return;
    }
}
