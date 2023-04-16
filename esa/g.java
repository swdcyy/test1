package esa.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import esa.a;
import esa.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import esa.c;
import esa.d;
import esa.e;
import esa.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@0027c6
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("HOME_CAMERA_BTN_CLICK_DELEGATES", new b(this, p1));
       p0.i("HOME_IS_FROM_PUSH", new c(this, p1));
       p0.i("ON_MULTI_WINDOW_MODE_CHANGED_EVENT", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "HOME_PANEL_SLIDE_OPEN";
       try{
          p0.i(str, uoe);
          p0.h(a.class, new f(this, p1));
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
