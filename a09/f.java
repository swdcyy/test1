package a09.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter;
import a09.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a09.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@000011
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       d uod = new d(this, p1);
       String str = "PHOTO_CAN_SHOW_PLAY_END";
       try{
          p0.i(str, uod);
          p0.h(PlayEndControlPresenter.class, new e(this, p1));
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
