package cva.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cva.a;
import cva.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cva.c;
import cva.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@0023d6
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("HOME_LIVE_CLICK_SUBJECT", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "HOME_POPUP_VISIBILITY_LISTENER";
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
