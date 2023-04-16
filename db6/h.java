package db6.h;
import io7.a;
import com.kwai.framework.network.cronet.k;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.util.Objects;
import ta6.c;
import q87.c;
import java.lang.Double;
import java.lang.reflect.Type;
import com.google.common.util.concurrent.AtomicDouble;

public final class h implements a	// class@0014a8
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void a(String p0,f p1){
       h tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       c.C().w("AegonCronetManager", "update upload ratio of connection data on config change.", objArray);
       tb.e.getAndSet(p1.d(Double.class, Double.valueOf(0)).doubleValue());
    }
}
