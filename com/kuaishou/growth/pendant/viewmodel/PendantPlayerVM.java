package com.kuaishou.growth.pendant.viewmodel.PendantPlayerVM;
import androidx.lifecycle.ViewModel;
import com.kuaishou.growth.pendant.viewmodel.PendantPlayerVM$a;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.jvm.internal.a;

public final class PendantPlayerVM extends ViewModel	// class@000700
{
    public static final PendantPlayerVM$a Companion;

    static {
       PendantPlayerVM.Companion = new PendantPlayerVM$a(null);
    }
    public void PendantPlayerVM(){
       super();
    }
    public static final PendantPlayerVM getInstance(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PendantPlayerVM.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PendantPlayerVM.Companion.a(p0);
    }
    public final void processPlayerState(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantPlayerVM.class, "1")) {
          return;
       }
       a.p(p0, "baseFeed");
       return;
    }
}
