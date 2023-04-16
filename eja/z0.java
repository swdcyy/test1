package eja.z0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.z;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.g;
import qvb.a;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import android.view.View;

public final class z0 implements g	// class@00270d
{
    public final z b;

    public void z0(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       z0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!QCurrentUser.ME.isLogined()) {
          p0 = PatchProxy.apply(null, tb, z.class, "7");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else if(tb.q.isEmpty() && (!HoldoutConfigUtilKt.a() && (tb.H.li() || tb.H.mi()))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             b = tb.u;
             if (b != null && !b.getVisibility()) {
                tb.S8(true);
                tb.Y8();
             }
          }
       }
    label_0058 :
       return;
    }
}
