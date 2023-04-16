package mg.q;
import erd.g;
import mg.r;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Bundle;
import f55.g;

public final class q implements g	// class@002653
{
    public final r b;

    public void q(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       r c = this.b.c;
       if (c != null) {
          c.a(-1, "fetchMagicFaceBriefInfo error "+p0.getMessage()+0x300d, null);
       }
       return;
    }
}
