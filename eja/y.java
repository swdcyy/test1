package eja.y;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import eja.v;
import eja.w;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eja.x;
import java.lang.Class;
import mm8.a;

public final class y implements b	// class@002707
{

    public void y(){
       super();
    }
    public void a(a p0,Object p1){
       w ow = new w(this, p1);
       String str = "AUDIENCE_COUNT_VIEW_STUB_INFLATER";
       try{
          p0.i(str, ow);
          p0.h(v.class, new x(this, p1));
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
