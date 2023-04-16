package f3a.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import f3a.a$a;
import f3a.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f3a.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@00227f
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       d uod = new d(this, p1);
       String str = "OCR_SELECTED_ITEMS";
       try{
          p0.i(str, uod);
          p0.h(a$a.class, new e(this, p1));
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
