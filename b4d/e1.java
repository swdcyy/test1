package b4d.e1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b4d.v0;
import b4d.c1;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b4d.d1;
import java.lang.Class;
import mm8.a;

public final class e1 implements b	// class@000362
{

    public void e1(){
       super();
    }
    public void a(a p0,Object p1){
       c1 uoc1 = new c1(this, p1);
       String str = "emotion_preview";
       try{
          p0.i(str, uoc1);
          p0.h(v0.class, new d1(this, p1));
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
