package mg.a0;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import android.os.Bundle;

public final class a0 implements g	// class@0025c9
{
    public final g b;

    public void a0(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       p0 = this.b;
       if (p0 != null) {
          p0.a(-1, "plugin load error", null);
       }
       return;
    }
}
