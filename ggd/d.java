package ggd.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ggd.a;
import ggd.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ggd.c;
import java.lang.Class;
import mm8.a;

public final class d implements b	// class@000f14
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       b uob = new b(this, p1);
       String str = "COMMENT_SETTING_FRAGMENT";
       try{
          p0.i(str, uob);
          p0.h(a.class, new c(this, p1));
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
