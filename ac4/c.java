package ac4.c;
import us3.f;
import f55.g;
import java.lang.Object;
import us3.h;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;

public final class c implements f	// class@000075
{
    public final g a;

    public void c(g p0){
       this.a = p0;
    }
    public final void a(h p0){
       c ta = this.a;
       h b = p0.b;
       if (b == null) {
          b = new HashMap();
       }
       b.put("__CODE__", Integer.valueOf(p0.a));
       ta.onSuccess(b);
       return;
    }
}
