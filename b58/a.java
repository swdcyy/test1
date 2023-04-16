package b58.a;
import erd.a;
import b58.l;
import b58.m;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import com.mini.d;
import java.util.Iterator;
import java.util.List;
import com.mini.engine.EngineCallback;

public final class a implements a	// class@0002fb
{
    public final l b;
    public final m c;

    public void a(l p0,m p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       d.c("AppSoBackupDownloader", "download success:"+this.c);
       tb.e = false;
       Iterator iterator = tb.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().success();
       }
       tb.a.clear();
       return;
    }
}
