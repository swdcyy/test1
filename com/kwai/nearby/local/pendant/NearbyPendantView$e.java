package com.kwai.nearby.local.pendant.NearbyPendantView$e;
import com.yxcorp.gifshow.widget.m;
import com.kwai.nearby.local.pendant.NearbyPendantView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.nearby.local.pendant.NearbyPendantView$b;

public final class NearbyPendantView$e extends m	// class@000f9b
{
    public final NearbyPendantView c;

    public void NearbyPendantView$e(NearbyPendantView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyPendantView$e.class, "1")) {
          return;
       }
       a.p(p0, "v");
       NearbyPendantView c = this.c.c;
       if (c != null) {
          c.a();
       }
       return;
    }
}