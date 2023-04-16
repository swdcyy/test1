package gqa.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import gqa.e;
import com.yxcorp.gifshow.entity.QPhoto;
import gqa.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.lang.String;
import gqa.g;
import gqa.h;
import mm8.a;

public final class i implements b	// class@002b6c
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(QPhoto.class, new f(this, p1));
       String str = String.class;
       g og = new g(this, p1);
       try{
          p0.h(str, og);
          p0.h(e.class, new h(this, p1));
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
