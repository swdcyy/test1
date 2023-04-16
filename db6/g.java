package db6.g;
import io7.a;
import com.kwai.framework.network.cronet.k;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.util.Objects;
import ta6.c;
import q87.c;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;

public final class g implements a	// class@0014a7
{
    public final k b;

    public void g(k p0){
       this.b = p0;
    }
    public final void a(String p0,f p1){
       g tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       c.C().w("AegonCronetManager", "update upload ratio of request data on config change.", objArray);
       tb.c(p1.d(JsonObject.class, null));
    }
}
