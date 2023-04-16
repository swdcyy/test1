package bac.e0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bac.p$a;
import bac.v;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.w;
import bac.x;
import bac.y;
import bac.z;
import bac.a0;
import bac.b0;
import bac.c0;
import bac.d0;
import bac.u;
import java.lang.Class;
import mm8.a;

public final class e0 implements b	// class@0003fe
{

    public void e0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FRAGMENT", new v(this, p1));
       p0.i("PYMK_ACCESS_IDSclose_user", new w(this, p1));
       p0.i("PYMK_ACCESS_IDScurrentUser", new x(this, p1));
       p0.i("PYMK_ACCESS_IDSfollowUser_position", new y(this, p1));
       p0.i("PYMK_ACCESS_IDSportal", new z(this, p1));
       p0.i("ADAPTER_POSITION_GETTER", new a0(this, p1));
       p0.i("PYMK_ACCESS_IDSITEM_CLICK_LISTENER", new b0(this, p1));
       p0.i("PYMK_ACCESS_IDSPYMK_PARAMS", new c0(this, p1));
       d0 uod0 = new d0(this, p1);
       String str = "PYMK_ACCESS_IDSitem_data";
       try{
          p0.i(str, uod0);
          p0.h(p$a.class, new u(this, p1));
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
