package b34.c;
import erd.g;
import b34.f;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kuaishou.merchant.api.core.model.AnchorNeedCallBackendTool;
import java.lang.Object;
import njd.a;
import java.util.Objects;

public final class c implements g	// class@00030c
{
    public final f b;
    public final SlipSwitchButton c;
    public final AnchorNeedCallBackendTool d;

    public void c(f p0,SlipSwitchButton p1,AnchorNeedCallBackendTool p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.P8(this.c, this.d.switchOpen);
    }
}
