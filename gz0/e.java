package gz0.e;
import h47.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;

public final class e implements b	// class@0025c7
{
    public final i a;

    public void e(i p0){
       this.a = p0;
    }
    public final void a(LiveGzoneConfigResponse p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, i.class, "8")) {
       }else {
          ta.l = TextUtils.isEmpty(p0.mGiftPanelEntranceButtonPictureUrl) ^ 0x01;
          i g = ta.g;
          if (g != null) {
             g.j(ta.a());
          }
       }
       return;
    }
}
