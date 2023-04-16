package c66.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import c66.h;
import c66.a;
import com.google.gson.JsonObject;
import com.kwai.framework.config.b;
import e66.c;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import k2b.u1;
import java.util.Objects;

public final class g implements g	// class@000657
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       JsonObject jsonObject = a.a.b();
       if (jsonObject != null) {
          Object[] objArray = new Object[0];
          c.C().t("system_stat_error", p0+"\n"+jsonObject, objArray);
          u1.U("system_stat_error", p0+"\n"+jsonObject);
          Objects.requireNonNull(a.a);
       }
       return;
    }
}
