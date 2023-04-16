package bv8.e$a;
import v97.a;
import bv8.e;
import yb7.c;
import com.kwai.middleware.azeroth.net.response.AzerothApiError;
import com.kwai.middleware.leia.response.LeiaApiError;
import com.yxcorp.experiment.c;
import wu8.o;
import wu8.q;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;

public class e$a extends a	// class@000466
{
    public final c c;
    public final e d;

    public void e$a(e p0,c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void f(AzerothApiError p0){
       if (p0.httpCode == 401 || p0.resultCode == -401) {
          o oo = c.h().k.j();
          if (oo != null) {
             oo.a();
          }
       }
       this.c.onFailure(p0);
       return;
    }
    public void h(Object p0){
       this.c.onSuccess(p0);
    }
}
