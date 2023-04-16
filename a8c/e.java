package a8c.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import a8c.h$b;
import a8c.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a8c.b;
import a8c.c;
import a8c.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@00009d
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SHARE_QR_CODE_PHOTO_MODE", new a(this, p1));
       p0.i("SHARE_QR_CODE_SHARE_DATA", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "SHARE_OPT_SUBJECT";
       try{
          p0.i(str, uoc);
          p0.h(h$b.class, new d(this, p1));
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
