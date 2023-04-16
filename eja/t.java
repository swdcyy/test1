package eja.t;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import eja.q;
import eja.r;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eja.s;
import java.lang.Class;
import mm8.a;

public final class t implements b	// class@0026fb
{

    public void t(){
       super();
    }
    public void a(a p0,Object p1){
       r or = new r(this, p1);
       String str = "HOME_ENABLE_LIVE_AUTO_PLAY";
       try{
          p0.i(str, or);
          p0.h(q.class, new s(this, p1));
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
