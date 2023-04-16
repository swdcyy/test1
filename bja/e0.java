package bja.e0;
import lv5.d;
import java.lang.Object;
import o26.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.stagger.post.g;
import com.yxcorp.gifshow.follow.stagger.post.g$d;
import o26.a;
import com.yxcorp.gifshow.follow.stagger.post.IPublishPhotoViewImpl;

public class e0 implements d	// class@0003e2
{

    public void e0(){
       super();
    }
    public d XV(){
       Object obj = PatchProxy.apply(null, this, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g$d.a;
    }
    public a gQ(){
       Object obj = PatchProxy.apply(null, this, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IPublishPhotoViewImpl();
    }
    public boolean isAvailable(){
       return true;
    }
}
