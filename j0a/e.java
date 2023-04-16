package j0a.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import j0a.a;
import j0a.f;
import j0a.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import j0a.c;
import java.lang.String;
import j0a.d;
import mm8.a;

public final class e implements b	// class@0028e2
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(f.class, new b(this, p1));
       if (p1.m != null) {
          Accessors.d().b(p1.m).a(p0, p1.m);
       }
       c uoc = new c(this, p1);
       String str = "DETAIL_ACTION_BAR_PARAM";
       try{
          p0.i(str, uoc);
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
