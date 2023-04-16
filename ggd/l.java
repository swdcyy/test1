package ggd.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ggd.i;
import ggd.j;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ggd.k;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@000f1c
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       j oj = new j(this, p1);
       String str = "COMMENT_SETTING_FRAGMENT";
       try{
          p0.i(str, oj);
          p0.h(i.class, new k(this, p1));
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
