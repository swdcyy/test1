package bf5.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bf5.e;
import k2b.e0;
import bf5.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import hf5.b;
import bf5.g;
import androidx.fragment.app.c;
import bf5.h;
import hf5.e;
import bf5.i;
import hf5.f;
import bf5.j;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import bf5.k;
import hf5.g;
import bf5.l;
import sy6.a;
import bf5.m;
import bf5.n;
import mm8.a;

public final class o implements b	// class@000484
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(e0.class, new f(this, p1));
       p0.h(b.class, new g(this, p1));
       p0.h(c.class, new h(this, p1));
       p0.h(e.class, new i(this, p1));
       p0.h(f.class, new j(this, p1));
       p0.h(MilanoContainerEventBus.class, new k(this, p1));
       p0.h(g.class, new l(this, p1));
       a uoa = a.class;
       m om = new m(this, p1);
       try{
          p0.h(uoa, om);
          p0.h(e.class, new n(this, p1));
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
