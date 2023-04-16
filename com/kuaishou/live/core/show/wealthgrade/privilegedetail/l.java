package com.kuaishou.live.core.show.wealthgrade.privilegedetail.l;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm2.v;
import java.lang.Runnable;
import ekd.k1;

public final class l implements Observer	// class@001276
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o.class, "6")) {
       }else {
          k1.o(new v(tb, p0));
       }
       return;
    }
}
