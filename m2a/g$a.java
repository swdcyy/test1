package m2a.g$a;
import msd.a;
import m2a.g;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;

public class g$a implements a	// class@002f06
{
    public final PhotoDetailParam b;
    public final g c;

    public void g$a(g p0,PhotoDetailParam p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object invoke(){
       Boolean uBoolean = PatchProxy.apply(null, this, g$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(this.b.mPhoto.isAllowPhotoDownload());
       }
       return uBoolean;
    }
}
