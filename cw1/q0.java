package cw1.q0;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.lang.Object;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerPosition;
import com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import android.view.View;
import ea1.b;

public final class q0 implements Runnable	// class@001e78
{
    public final i b;

    public void q0(i p0){
       this.b = p0;
    }
    public final void run(){
       q0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.c6(0, (LivePendantContainerPosition.TOP.flag | LivePendantContainerPosition.BOTTOM.flag), LivePendantContainerHideFlags.DELAY_FOR_UI_OPT);
       b.a(tb.i, ViewElement.RIGHT_PENDANT);
    }
}
