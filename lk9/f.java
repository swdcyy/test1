package lk9.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import lk9.a;
import lk9.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import lk9.c;
import lk9.d;
import lk9.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@002dfa
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("comment_id", new b(this, p1));
       p0.i("DETAIL_EMOTION_INFO", new c(this, p1));
       d uod = new d(this, p1);
       String str = "photo_id";
       try{
          p0.i(str, uod);
          p0.h(a.class, new e(this, p1));
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
