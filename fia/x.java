package fia.x;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import fia.v;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fia.w;
import java.lang.Class;
import mm8.a;

public final class x implements b	// class@00293a
{

    public void x(){
       super();
    }
    public void a(a p0,Object p1){
       v ov = new v(this, p1);
       String str = "NIRVANA_PYMI_SHOWING_STATE";
       try{
          p0.i(str, ov);
          p0.h(FollowSlideInternalPymiListPresenter.class, new w(this, p1));
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
