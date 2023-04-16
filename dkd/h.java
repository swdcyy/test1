package dkd.h;
import ckd.a;
import java.lang.Object;
import ckd.a$a;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dkd.j;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import dkd.d;
import com.yxcorp.retrofit.a;
import dkd.i;
import com.yxcorp.retrofit.e;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import cjd.e;
import erd.o;
import brd.z;
import io.reactivex.android.schedulers.a;
import dkd.f;
import dkd.g;
import erd.g;
import crd.b;

public class h implements a	// class@000cd9
{

    public void h(){
       super();
    }
    public void a(a$a p0,CheckUpgradeRequestListener p1){
       a$a d;
       a$a e;
       a$a h;
       RequestTiming cOLD_START;
       Object obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, h.class, "1")) {
          return;
       }
       j oj = j.a();
       Objects.requireNonNull(oj);
       j oj1 = PatchProxy.apply(null, oj, j.class, "2");
       if (oj1 != PatchProxyResult.class) {
       }else if(oj.b == null){
          oj.b = e.b(oj.a.b(), d.class);
       }
       oj1 = oj.b;
       Object obj2 = oj1;
       String str = j.a().a.a();
       a$a a = obj.a;
       a$a b = obj.b;
       a$a c = obj.c;
       d = obj.d;
       e = obj.e;
       a$a f = obj.f;
       h = obj.h;
       switch (obj.g){
           case 1:
             cOLD_START = RequestTiming.COLD_START;
             break;
           case 2:
             cOLD_START = RequestTiming.ON_HOME_PAGE_CREATED;
             break;
           case 3:
             cOLD_START = RequestTiming.ON_FOREGROUND;
             break;
           case 4:
             cOLD_START = RequestTiming.ON_BACKGROUND;
             break;
           case 5:
             cOLD_START = RequestTiming.LOGIN;
             break;
           case 6:
             cOLD_START = RequestTiming.LOGOUT;
             break;
           case 7:
             cOLD_START = RequestTiming.AFTER_STARTUP;
             break;
           case 8:
             cOLD_START = RequestTiming.AFTER_ABTEST;
             break;
           case 9:
             cOLD_START = RequestTiming.NETWORK_CHANGED;
             break;
           default:
             cOLD_START = RequestTiming.DEFAULT;
       }
       Objects.requireNonNull(p1);
       obj2.a(str, a, b, c, d, e, f, h, cOLD_START, obj.i).map(new e()).subscribeOn(a.c()).subscribe(new f(obj1), new g(obj1));
       return;
    }
}
