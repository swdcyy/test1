package ged.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ged.g;
import ged.h;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.i;
import com.yxcorp.plugin.search.utils.f0$c;
import ged.j;
import java.lang.Class;
import ged.k;
import ged.l;
import mm8.a;

public final class m implements b	// class@002acb
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SEARCH_REDUCE_ANCHOR_RECT", new h(this, p1));
       p0.i("SEARCH_REDUCE_DIALOG_Y_DIS", new i(this, p1));
       p0.h(f0$c.class, new j(this, p1));
       k ok = new k(this, p1);
       String str = "SEARCH_REDUCE_SOURCE_VIEW_RECT";
       try{
          p0.i(str, ok);
          p0.h(g.class, new l(this, p1));
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
