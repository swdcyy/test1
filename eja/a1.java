package eja.a1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.a0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.h;
import qvb.a;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import android.view.View;

public final class a1 implements g	// class@0026af
{
    public final a0 b;

    public void a1(a0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       a1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!QCurrentUser.ME.isLogined()) {
          p0 = PatchProxy.apply(null, tb, a0.class, "3");
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
                tb.P8(true);
                tb.W8();
             }
          }
       }
    label_0058 :
       return;
    }
}
