package com.kwai.nearby.local.pendant.NearbyPendantView$f;
import ub.a;
import com.kwai.nearby.local.pendant.NearbyPendantView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.nearby.local.pendant.PendantAnimImageView;
import com.yxcorp.utility.n;
import android.graphics.drawable.Animatable;

public final class NearbyPendantView$f extends a	// class@000f9c
{
    public final NearbyPendantView b;

    public void NearbyPendantView$f(NearbyPendantView p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NearbyPendantView$f.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       View[] viewArray = new View[2];
       viewArray[0] = NearbyPendantView.a(this.b);
       NearbyPendantView f = this.b.f;
       if (f == null) {
          a.S("mPendantCloseView");
       }
       viewArray[1] = f;
       n.Z(8, viewArray);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NearbyPendantView$f.class, "2")) {
          return;
       }
       this.b.d();
       this.b.c();
       return;
    }
}
