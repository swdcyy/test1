package eub.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import eub.i$a;
import eub.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eub.d;
import eub.e;
import eub.f;
import eub.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@002821
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PUBLISH_FLOW_FEEDBACK", new c(this, p1));
       p0.i("ALREADY_REQUESTED_FEEDBACK", new d(this, p1));
       p0.i("TASK_ID", new e(this, p1));
       f uof = new f(this, p1);
       String str = "USE_FAKE_UPLOADER";
       try{
          p0.i(str, uof);
          p0.h(i$a.class, new g(this, p1));
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
