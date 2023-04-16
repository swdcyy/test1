package d69.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import d69.b;
import d69.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d69.g;
import d69.h;
import d69.i;
import d69.j;
import d69.k;
import d69.l;
import d69.m;
import d69.n;
import d69.c;
import ol5.a;
import d69.d;
import java.lang.Class;
import d69.e;
import mm8.a;

public final class o implements b	// class@002079
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("RELATION_CLICK_ITEM_POSITION", new f(this, p1));
       p0.i("RELATION_USER_FOLLOW_REFER", new g(this, p1));
       p0.i("RELATION_USER_FRAGMENT", new h(this, p1));
       p0.i("MATERIAL_TITLE", new i(this, p1));
       p0.i("MATERIAL_TYPE", new j(this, p1));
       p0.i("MATERIAL_URL", new k(this, p1));
       p0.i("RELATION_USER_PAGE_LIST", new l(this, p1));
       p0.i("RELATION_AGGREGATE_QUERY_URL", new m(this, p1));
       p0.i("RELATION_USER_TITLE", new n(this, p1));
       p0.i("RELATION_USER_TYPE", new c(this, p1));
       a uoa = a.class;
       d uod = new d(this, p1);
       try{
          p0.h(uoa, uod);
          p0.h(b.class, new e(this, p1));
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
