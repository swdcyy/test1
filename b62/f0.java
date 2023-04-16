package b62.f0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b62.z;
import b62.a0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.b0;
import b62.c0;
import b62.d0;
import b62.e0;
import java.lang.Class;
import mm8.a;

public final class f0 implements b	// class@00033a
{

    public void f0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ConditionRedPacketIsCoinEnable", new a0(this, p1));
       p0.i("ConditionRedPacketRecyclerContext", new b0(this, p1));
       p0.i("ConditionRedPacketKey", new c0(this, p1));
       d0 uod0 = new d0(this, p1);
       String str = "ConditionRedPacketRecyclerTips";
       try{
          p0.i(str, uod0);
          p0.h(z.class, new e0(this, p1));
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
