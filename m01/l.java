package m01.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import m01.b;
import m01.h;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m01.i;
import m01.m;
import m01.j;
import java.lang.Class;
import m01.k;
import mm8.a;

public final class l implements b	// class@0030a5
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("current_sort_type_subject", new h(this, p1));
       p0.i("gift_tab_changed_subject", new i(this, p1));
       m om = m.class;
       j oj = new j(this, p1);
       try{
          p0.h(om, oj);
          p0.h(b.class, new k(this, p1));
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
