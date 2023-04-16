package a2a.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.model.response.CommentLimitInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import a2a.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import a2a.b;
import mm8.a;

public final class c implements b	// class@00001e
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(QPhoto.class, new a(this, p1));
       if (p1.mPhoto != null) {
          Accessors.d().b(p1.mPhoto).a(p0, p1.mPhoto);
       }
       try{
          p0.h(CommentLimitInfo.class, new b(this, p1));
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
