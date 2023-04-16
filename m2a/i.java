package m2a.i;
import dz9.c0;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.o;
import lnc.e2;

public class i extends c0	// class@002f09
{
    public final QPhoto C;

    public void i(PhotoDetailParam p0){
       super();
       this.C = p0.mPhoto;
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.ME.isLogined() && (o.k(this.C) && e2.d()))? true: false;
       return b;
    }
}
