package cdd.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cdd.g$a;
import com.yxcorp.plugin.search.entity.SearchItem;
import cdd.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cdd.b;
import mm8.a;

public final class c implements b	// class@00052d
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       SearchItem searchItem = SearchItem.class;
       a uoa = new a(this, p1);
       try{
          p0.h(searchItem, uoa);
          p0.h(g$a.class, new b(this, p1));
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
