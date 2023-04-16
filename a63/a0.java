package a63.a0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import a63.a$a;
import a63.v;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a63.w;
import a63.x;
import a63.y;
import a63.z;
import java.lang.Class;
import mm8.a;

public final class a0 implements b	// class@000050
{

    public void a0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_GZONE_IMAGE_PREVIEW_ANIM_OUT_SUBJECT", new v(this, p1));
       p0.i("LIVE_GZONE_IMAGE_PREVIEW_POSITION", new w(this, p1));
       p0.i("LIVE_GZONE_IMAGE_PREVIEW_MODEL", new x(this, p1));
       y oy = new y(this, p1);
       String str = "LIVE_GZONE_IMAGE_PREVIEW_SELECTED_POSITION";
       try{
          p0.i(str, oy);
          p0.h(a$a.class, new z(this, p1));
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
