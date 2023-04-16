package mg.s;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Bundle;

public final class s implements g	// class@002660
{
    public final g b;

    public void s(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       s tb = this.b;
       if (tb != null) {
          tb.a(-1, "fetchMagicFaceBriefInfo error "+p0.getMessage()+0x300d, null);
       }
       return;
    }
}
