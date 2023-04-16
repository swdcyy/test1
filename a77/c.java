package a77.c;
import h47.b;
import a77.f;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.util.Objects;
import com.kwai.live.gzone.bean.LiveGzoneAudiencePopupConfig;

public final class c implements b	// class@00006d
{
    public final f a;

    public void c(f p0){
       this.a = p0;
    }
    public final void a(LiveGzoneConfigResponse p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null) {
          p0 = p0.mLiveGzoneAudiencePopupConfig;
          if (p0 != null) {
             ta.q = p0.mEnableGamePopup;
             ta.r = p0.mPopupIntervalMs;
          }
       }
       return;
    }
}
