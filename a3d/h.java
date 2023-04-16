package a3d.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import a3d.a;
import a3d.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a3d.c;
import a3d.d;
import a3d.e;
import a3d.f;
import a3d.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@00007d
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("KEY_CLICK_PROTOCOL_BUBBLE_SUBJECT", new b(this, p1));
       p0.i("KEY_CLOSE_LOGIN_BTN_CLICK", new c(this, p1));
       p0.i("LOGIN_PAGE_PARAMS", new d(this, p1));
       p0.i("KEY_MAIL_LOGIN_BTN_CLICK", new e(this, p1));
       f uof = new f(this, p1);
       String str = "KEY_THIRD_LOGIN_BTN_CLICK";
       try{
          p0.i(str, uof);
          p0.h(a.class, new g(this, p1));
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
