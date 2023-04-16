package cy9.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cy9.i;
import cy9.j;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cy9.k;
import com.yxcorp.gifshow.entity.QPhoto;
import cy9.l;
import java.lang.Class;
import cy9.m;
import mm8.a;

public final class n implements b	// class@001e40
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("CO_CREATE_AUTHOR_CLICK_PANEL_EVENT", new j(this, p1));
       p0.i("CO_CREATE_AUTHOR_CLICK_PANEL_IS_MY_PHOTO", new k(this, p1));
       QPhoto qPhoto = QPhoto.class;
       l ol = new l(this, p1);
       try{
          p0.h(qPhoto, ol);
          p0.h(i.class, new m(this, p1));
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
