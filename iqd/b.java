package iqd.b;
import hqd.a;
import java.lang.Object;
import java.lang.Enum;
import io.github.lizhangqu.corepatch.applier.a;
import io.github.lizhangqu.corepatch.applier.core.CoreApplierType;
import io.github.lizhangqu.corepatch.applier.core.e;
import iqd.b$a;
import io.github.lizhangqu.corepatch.applier.core.c;
import io.github.lizhangqu.corepatch.applier.core.d;
import io.github.lizhangqu.corepatch.applier.core.f;

public final class b implements a	// class@0014fd
{

    public void b(){
       super();
    }
    public a a(Enum p0){
       e uoe;
       if (p0 == null) {
          uoe = new e();
       }else {
          int i = b$a.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                uoe = (i != 3)? new e(): new c();
             }else {
                uoe = new d();
             }
          }else {
             uoe = new f();
          }
       }
       return uoe;
    }
}
