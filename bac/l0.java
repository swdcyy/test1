package bac.l0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bac.f0$a;
import bac.g0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fac.b;
import bac.h0;
import java.lang.Class;
import fac.c;
import bac.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import bac.j0;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import bac.k0;
import mm8.a;

public final class l0 implements b	// class@000410
{

    public void l0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADAPTER", new g0(this, p1));
       p0.h(b.class, new h0(this, p1));
       p0.h(c.class, new i0(this, p1));
       p0.h(QPhoto.class, new j0(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       try{
          p0.h(f0$a.class, new k0(this, p1));
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
