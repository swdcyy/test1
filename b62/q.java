package b62.q;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import b62.o;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.p;
import java.lang.Class;
import mm8.a;

public final class q implements b	// class@000352
{

    public void q(){
       super();
    }
    public void a(a p0,Object p1){
       o oo = new o(this, p1);
       String str = "CONDITION_RED_PACKET_FETCH_CURRENT_INFO_ID";
       try{
          p0.i(str, oo);
          p0.h(i.class, new p(this, p1));
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
