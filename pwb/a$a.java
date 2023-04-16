package pwb.a$a;
import android.os.Handler$Callback;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.util.SparseArray;

public final class a$a implements Handler$Callback	// class@002204
{
    public Handler$Callback b;
    public boolean c;
    public SparseArray d;

    public void a$a(){
       super();
    }
    public boolean handleMessage(Message p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "msg");
       if (this.c == null) {
          this.c = true;
          obj = this.d;
          if (obj != null) {
             a.m(obj);
             Handler$Callback uCallback = obj.get(p0.what);
             if (uCallback != null) {
                this.c = false;
                return uCallback.handleMessage(p0);
             }
          }
          obj = this.b;
          if (obj != null) {
             a.m(obj);
             this.c = false;
             return obj.handleMessage(p0);
          }else {
             this.c = false;
          }
       }
       return false;
    }
}
