package g11.e;
import n52.t;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import df1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g11.c;
import androidx.lifecycle.LiveData;
import z1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import df1.c;

public class e	// class@0023ff
{
    public final MutableLiveData a;
    public int b;
    public boolean c;
    public boolean d;
    public a e;
    public final t f;

    public void e(t p0){
       super();
       this.a = new MutableLiveData(Integer.valueOf(0));
       this.b = 0;
       this.d = true;
       this.f = p0;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.a, new c(this));
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_LIKE, "onLikeNumberUpdate", "mDoubleClickNumber", Integer.valueOf(this.b));
       this.a.setValue(Integer.valueOf(this.b));
       if (this.b == 5 && this.d == null) {
          a uoa = this.a();
          this.e = uoa;
          this.f.b(uoa);
       }
       return;
    }
}
