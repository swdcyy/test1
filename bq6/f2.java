package bq6.f2;
import erd.o;
import java.util.Map;
import com.kwai.imsdk.d;
import java.lang.Object;
import eq6.a;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;

public final class f2 implements o	// class@000583
{
    public final Map b;
    public final d c;

    public void f2(Map p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f2 tb = this.b;
       f2 tc = this.c;
       if (tb.containsKey(p0.c()) && tb.get(p0.c()) != null) {
          tb.get(p0.c()).add(tc);
       }else {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(tc);
          tb.put(p0.c(), uArrayList);
       }
       return p0;
    }
}
