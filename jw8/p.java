package jw8.p;
import erd.o;
import y26.b$a;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.lang.Object;
import java.util.List;
import java.io.Serializable;

public final class p implements o	// class@0029c7
{
    public final b$a b;
    public final EncodeRequest$a c;

    public void p(b$a p0,EncodeRequest$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       p tc = this.c;
       if (p0.isEmpty()) {
          tb.v(null);
       }else {
          tb.v(p0);
       }
       return tc;
    }
}
