package gx9.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import gx9.a;
import s85.a;
import gx9.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.entity.QPhoto;
import gx9.c;
import gx9.d;
import mm8.a;

public final class e implements b	// class@0024f6
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new b(this, p1));
       QPhoto qPhoto = QPhoto.class;
       c uoc = new c(this, p1);
       try{
          p0.h(qPhoto, uoc);
          p0.h(a.class, new d(this, p1));
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
