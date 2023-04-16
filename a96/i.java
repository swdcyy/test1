package a96.i;
import io7.a;
import com.kwai.framework.krn.init.preload.b;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Collections;

public final class i implements a	// class@00004b
{
    public final b b;
    public final Type c;

    public void i(b p0,Type p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(String p0,f p1){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 == null) {
          tb.a.clear();
       }else {
          tb.a.clear();
          tb.a.putAll(p1.d(tc, Collections.emptyMap()));
       }
       return;
    }
}
