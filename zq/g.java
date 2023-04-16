package zq.g;
import upd.b;
import zq.f;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import upd.d;

public final class g implements b	// class@002962
{
    public final f a;
    public final Provider b;

    public void g(f p0,Provider p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static g a(f p0,Provider p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(p0, p1);
    }
    public static LogRecordDatabase c(f p0,Context p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LogRecordDatabase logRecordDat = p0.b(p1);
       d.c(logRecordDat, "Cannot return null from a non-@Nullable @Provides method");
       return logRecordDat;
    }
    public LogRecordDatabase b(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.c(this.a, this.b.get());
    }
    public Object get(){
       return this.b();
    }
}
