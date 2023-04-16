package b62.p0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.k;
import b62.n0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.o0;
import java.lang.Class;
import mm8.a;

public final class p0 implements b	// class@00034f
{

    public void p0(){
       super();
    }
    public void a(a p0,Object p1){
       n0 on0 = new n0(this, p1);
       String str = "FetchGrabResult";
       try{
          p0.i(str, on0);
          p0.h(k.class, new o0(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
