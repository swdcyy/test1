package com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketResultDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketResultDialogFragment$a;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.k;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.j;

public class LiveConditionRedPacketResultDialogFragment extends LiveConditionRedPacketBaseResultDialogFragment	// class@000a7d
{
    public LiveConditionRedPacketResultDialogFragment$a x;
    public static final int y;

    public void LiveConditionRedPacketResultDialogFragment(){
       super();
       this.x = new LiveConditionRedPacketResultDialogFragment$a(this);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConditionRedPacketResultDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       String str = "3";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, LiveConditionRedPacketResultDialogFragment.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new k());
          presenterV2.U7(new j());
          PatchProxy.onMethodExit(LiveConditionRedPacketResultDialogFragment.class, str);
       }
       presenterV2.f(p0);
       Object[] objArray = new Object[]{this.s,this.t,this.x};
       presenterV2.i(objArray);
       this.u = presenterV2;
       return;
    }
}
