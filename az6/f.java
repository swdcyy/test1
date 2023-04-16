package az6.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import az6.a;
import az6.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import az6.c;
import az6.d;
import az6.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@0003b1
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("DETAIL_FEED_POSITION", new b(this, p1));
       p0.i("DETAIL_PHOTO_INDEX", new c(this, p1));
       d uod = new d(this, p1);
       String str = "SLIDE_PLAY_FETCHER_ID";
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
