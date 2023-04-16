package com.kuaishou.live.core.show.profilecard.photo.i;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.profilecard.photo.j;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf2.n;
import wg3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserOwnerCount;
import java.util.List;
import qvb.a;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.show.profilecard.photo.h;
import lf2.g;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class i implements Observer	// class@000de8
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       boolean b;
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "13")) {
       }else if(p0 == null){
          int i = 1;
          if (n.a(p0)) {
             if (a.d()) {
                p0 = tb.w;
                Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "6");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(p0.getUserProfile() != null && (p0.getUserProfile().mOwnerCount != null && p0.getUserProfile().mOwnerCount.mPublicPhoto > null)){
                   b = true;
                }else {
                   b = false;
                }
                if (!b) {
                label_007b :
                   tb.F.z1(i);
                   tb.F.s1(2);
                }
             }
             if (!tb.w.shouldHideLoading() && q.f(tb.G.getItems())) {
                tb.F.s1(i);
             }
             tb.D.post(new g(tb));
          }else {
             goto label_007b ;
          }
       }
       return;
    }
}
