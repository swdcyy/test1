package co2.e1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.voiceparty.s;
import com.kuaishou.live.core.voiceparty.a;
import co2.w0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import co2.i0;
import co2.x0;
import lo2.d;
import co2.y0;
import co2.z0;
import java.lang.String;
import co2.a1;
import co2.n1;
import co2.b1;
import co2.f2;
import co2.c1;
import co2.d1;
import mm8.a;

public final class e1 implements b	// class@000582
{

    public void e1(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new w0(this, p1));
       p0.h(i0.class, new x0(this, p1));
       p0.h(d.class, new y0(this, p1));
       p0.i("audience_mic_seat_manager", new z0(this, p1));
       p0.i("mic_seat_switch", new a1(this, p1));
       p0.h(n1.class, new b1(this, p1));
       f2 uof2 = f2.class;
       c1 uoc1 = new c1(this, p1);
       try{
          p0.h(uof2, uoc1);
          p0.h(s.class, new d1(this, p1));
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
