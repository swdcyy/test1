package g7a.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import g7a.t0$a;
import g7a.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g7a.f;
import g7a.g;
import g7a.h;
import g7a.i;
import java.lang.Class;
import mm8.a;

public final class j implements b	// class@0023df
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NASA_BOTTOM_EDITOR_OPERATION_OBSERVABLE", new e(this, p1));
       p0.i("NASA_BOTTOM_EDITOR_OPERATION_OBSERVER", new f(this, p1));
       p0.i("NASA_BOTTOM_EDITOR_UPDATE_AT_BUTTON_ALPHA_OBSERVER", new g(this, p1));
       h oh = new h(this, p1);
       String str = "NASA_BOTTOM_EDITOR_UPDATE_AT_BUTTON_ALPHA_OBSERVABLE";
       try{
          p0.i(str, oh);
          p0.h(t0$a.class, new i(this, p1));
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
