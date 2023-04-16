package nz9.i;
import erd.g;
import nz9.z0;
import java.lang.Object;
import i95.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;

public final class i implements g	// class@003228
{
    public final z0 b;

    public void i(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z0.class, "25")) {
       }else if(p0 != null){
          z0 u = tb.u;
          if (u != null && (u.getUser() != null && (p0.b != null && TextUtils.n(p0.a(), tb.u.getUser().getId())))) {
             User user = tb.u.getUser();
             Boolean tRUE = Boolean.TRUE;
             p0 = p0.c;
             p0 = (p0 != null)? p0.mLevel: 0;
             user.setFansGroupV2JoinedState(tRUE, p0);
          }
       }
       return;
    }
}
