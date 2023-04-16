package b58.f;
import erd.g;
import b58.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.mini.d;
import java.util.Iterator;
import java.util.List;
import com.mini.engine.EngineCallback;

public final class f implements g	// class@000300
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.e = false;
       d.e("AppSoBackupDownloader", p0);
       Iterator iterator = tb.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().failed(p0);
       }
       tb.a.clear();
       return;
    }
}
