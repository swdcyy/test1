package com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nearby.common.model.CommonBtnModel;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$d;

public final class NearbyCommonRvBtn$b$a implements View$OnClickListener	// class@002136
{
    public final NearbyCommonRvBtn$b b;

    public void NearbyCommonRvBtn$b$a(NearbyCommonRvBtn$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCommonRvBtn$b$a.class, str)) {
          return;
       }
       NearbyCommonRvBtn$b$a tb = this.b;
       NearbyCommonRvBtn$b t = tb.t;
       if (t != null) {
          Objects.requireNonNull(tb);
          NearbyCommonRvBtn$b uob = PatchProxy.apply(null, tb, NearbyCommonRvBtn$b.class, str);
          if (uob != PatchProxyResult.class) {
          }else {
             uob = tb.p;
             if (uob == null) {
                a.S("mCommonBtnModel");
             }
          }
          t.a(uob);
       }
       return;
    }
}
