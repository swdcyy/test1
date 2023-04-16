package jz8.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import jz8.j;
import jz8.k;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.l;
import java.lang.Class;
import mm8.a;

public final class m implements b	// class@002a2a
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       k ok = new k(this, p1);
       String str = "placeholder_key";
       try{
          p0.i(str, ok);
          p0.h(j.class, new l(this, p1));
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
