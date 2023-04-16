package h92.p0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import h92.i0;
import h92.i0$d;
import h92.m0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h92.n0;
import java.lang.String;
import h92.o0;
import mm8.a;

public final class p0 implements b	// class@002d1f
{

    public void p0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(i0$d.class, new m0(this, p1));
       n0 on0 = new n0(this, p1);
       String str = "SEND_GUIDE_GIFT_OBSERVABLE_ACCESS_ID";
       try{
          p0.i(str, on0);
          p0.h(i0.class, new o0(this, p1));
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
