package ava.a;
import hn5.j;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ava.b;
import ava.c;

public class a implements j	// class@00031f
{

    public void a(){
       super();
    }
    public i RD(List p0,int p1,QPhoto p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "photo");
       return new b(p0, p1, p2);
    }
    public boolean isAvailable(){
       return true;
    }
    public i yE(QPhoto p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       return new c(p0, p1);
    }
}
