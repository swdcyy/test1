package dz9.x;
import dz9.c0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.o;
import lnc.e2;

public final class x extends c0	// class@002028
{
    public final m0 C;

    public void x(m0 p0){
       a.p(p0, "callerContext");
       super();
       this.C = p0;
    }
    public boolean E(){
       QCurrentUser obj = PatchProxy.apply(null, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       boolean b = (obj.isLogined() && (o.k(this.C.c.mPhoto) && e2.d()))? true: false;
       return b;
    }
}
