package vq.e;
import tq.d;
import com.kuaishou.android.vader.persistent.a;
import java.lang.Object;
import java.util.List;
import er.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.vader.Channel;
import java.lang.Enum;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.lang.Exception;
import java.util.Collection;

public final class e	// class@0026d8
{
    public final d a;
    public final a b;

    public void e(d p0,a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(List p0,g p1){
       List list;
       Exception uException;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p1.a().name();
       boolean b = false;
       int i = 500;
       if (p0.size() < i) {
          i = i - p0.size();
          Future uFuture = this.b.h(p1.a(), p1.c(), p1.d(), i);
          ArrayList uArrayList = new ArrayList();
          try{
             int i1 = 1;
             list = uFuture.get(i1, TimeUnit.SECONDS);
             try{
                list.size();
                if (list.size() < i) {
                   b = true;
                }
             }catch(java.util.concurrent.TimeoutException e0){
                int i2 = list;
                list = uArrayList;
             }catch(java.lang.Exception e1){
             }
             this.a.a(uException);
          }catch(java.util.concurrent.TimeoutException e0){
          }catch(java.lang.Exception e9){
             uException = e9;
             list = uArrayList;
             goto label_005c ;
          }
       }
       return e0;
    }
}
