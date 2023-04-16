package bc3.l;
import erd.g;
import com.kuaishou.live.lite.luckystar.b;
import java.lang.Object;
import java.lang.Long;
import z1.k;
import n91.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.luckystar.b$a;
import androidx.lifecycle.MutableLiveData;

public final class l implements g	// class@00037a
{
    public final b b;
    public final long c;

    public void l(b p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l tb = this.b;
       long l = this.c - tb.b.get().s();
       if (l - false <= 0) {
          tb.e();
          tb.c();
       }else {
          p0 = b.class;
          if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tb, p0, "11")) {
             p0 = tb.c.getValue();
             p0.a = 1;
             p0.d = l;
             tb.c.setValue(p0);
          }
       }
       return;
    }
}
