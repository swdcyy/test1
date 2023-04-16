package bcd.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bcd.d$a;
import bcd.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import bcd.b;
import java.lang.Class;
import mm8.a;

public final class c implements b	// class@0003de
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("guess_data", new a(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       try{
          p0.h(d$a.class, new b(this, p1));
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
