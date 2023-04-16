package cy9.v;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cy9.q;
import cy9.r;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cy9.s;
import com.yxcorp.gifshow.entity.QPhoto;
import cy9.t;
import java.lang.Class;
import cy9.u;
import mm8.a;

public final class v implements b	// class@001e48
{

    public void v(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("CO_CREATE_AUTHOR_CLICK_PANEL_EVENT", new r(this, p1));
       p0.i("CO_CREATE_AUTHOR_CLICK_PANEL_IS_MY_PHOTO", new s(this, p1));
       QPhoto qPhoto = QPhoto.class;
       t ot = new t(this, p1);
       try{
          p0.h(qPhoto, ot);
          p0.h(q.class, new u(this, p1));
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
