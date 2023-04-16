package bu7.d;
import erd.g;
import com.kwai.tokenshare.b;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import bu7.l;
import java.lang.String;
import q87.c;

public final class d implements g	// class@000482
{
    public final b b;

    public void d(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       l.C().w("ClipboardMonitor", "Observable remove listener", objArray);
       tb.a();
    }
}
