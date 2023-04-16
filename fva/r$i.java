package fva.r$i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;

public final class r$i extends Accessor	// class@002a22
{
    public final QPhoto c;

    public void r$i(QPhoto p0){
       this.c = p0;
       super();
    }
    public Object get(){
       User user = PatchProxy.apply(null, this, r$i.class, "1");
       if (user != PatchProxyResult.class) {
       }else {
          user = this.c.getUser();
          a.o(user, "photo.user");
       }
       return user;
    }
}
