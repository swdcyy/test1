package b66.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import b66.k;
import b66.c;
import com.google.gson.JsonObject;
import com.kwai.framework.config.b;
import e66.c;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import k2b.u1;
import java.util.Objects;
import org.greenrobot.eventbus.a;
import b66.k$a;

public final class i implements g	// class@000422
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       k.a = 3;
       JsonObject jsonObject = c.a.b();
       if (jsonObject != null) {
          Object[] objArray = new Object[0];
          c.C().t("startup_error", p0+"\n"+jsonObject, objArray);
          u1.U("startup_error", p0+"\n"+jsonObject);
          Objects.requireNonNull(c.a);
       }
       a.d().k(new k$a(3));
       return;
    }
}
