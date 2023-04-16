package bjc.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bjc.h$b;
import io.reactivex.subjects.PublishSubject;
import bjc.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import uo7.k;
import bjc.b;
import com.yxcorp.gifshow.entity.QPhoto;
import bjc.c;
import bjc.d;
import java.lang.String;
import bjc.e;
import mm8.a;

public final class f implements b	// class@000485
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(PublishSubject.class, new a(this, p1));
       p0.h(k.class, new b(this, p1));
       p0.h(QPhoto.class, new c(this, p1));
       d uod = new d(this, p1);
       String str = "DOWNLOAD_DIALOG_RETRY_SUBJECT";
       try{
          p0.i(str, uod);
          p0.h(h$b.class, new e(this, p1));
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
