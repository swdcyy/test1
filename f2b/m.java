package f2b.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import f2b.i;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f2b.j;
import f2b.k;
import f2b.l;
import java.lang.Class;
import mm8.a;

public final class m implements b	// class@00287b
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NearbyHeaderProvider", new i(this, p1));
       p0.i("nearby_header_LOCAL_SIZER_SHOW", new j(this, p1));
       k ok = new k(this, p1);
       String str = "nearby_header_LOCAL_SIZER_PERMISSION_ENABLE";
       try{
          p0.i(str, ok);
          p0.h(HomeLocalSizerViewPresenter.class, new l(this, p1));
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
