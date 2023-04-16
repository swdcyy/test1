package bja.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2;
import bja.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bja.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@0003e8
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       f uof = new f(this, p1);
       String str = "FRIEND_PRODUCT_PRODUCE_OBSERVER";
       try{
          p0.i(str, uof);
          p0.h(MockFeedPresenterV2.class, new g(this, p1));
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
