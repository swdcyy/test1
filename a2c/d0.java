package a2c.d0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import a2c.y;
import a2c.z;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a2c.a0;
import a2c.b0;
import a2c.c0;
import java.lang.Class;
import mm8.a;

public final class d0 implements b	// class@00003e
{

    public void d0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PROFILE_PREVIEW_VIDEO_INFO", new z(this, p1));
       p0.i("FRAGMENT", new a0(this, p1));
       b0 uob0 = new b0(this, p1);
       String str = "PROFILE_PREVIEW_MEDIA_PREPARED";
       try{
          p0.i(str, uob0);
          p0.h(y.class, new c0(this, p1));
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
