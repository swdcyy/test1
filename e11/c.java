package e11.c;
import erd.g;
import e11.a;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveMiniProgramConfig;
import java.lang.Boolean;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@002084
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          LiveTimeConsumingUserStatusResponse mMiniProgram = p0.mMiniProgramConfig;
          Boolean uBoolean = (mMiniProgram != null)? Boolean.valueOf(mMiniProgram.bottomEntranceAuthority): null;
          c b = a.B;
          b.Z(b, "receive userIoStatus with authority: "+uBoolean);
          if (uBoolean != null) {
             this.b.v = uBoolean.booleanValue();
             c tb = this.b;
             LiveTimeConsumingUserStatusResponse mMiniProgram1 = p0.mMiniProgramConfig;
             tb.w = mMiniProgram1.panelPath;
             tb.x = mMiniProgram1.iconPic;
             tb.y = mMiniProgram1.iconStatic;
             b.Z(b, "krnlink is: "+this.b.w);
             tb = this.b;
             boolean b1 = (tb.v != null && p0.mMiniProgramConfig.authorRecoSwitchIsOn != null)? true: false;
             tb.R8(b1);
          }
       }
       return;
    }
}
