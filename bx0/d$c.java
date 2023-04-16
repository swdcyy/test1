package bx0.d$c;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import bx0.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import e93.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.video.waynelive.LivePlayUrlInfo$DataSourceType;
import com.kwai.video.waynelive.LivePlayUrlInfo;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Enum;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class d$c implements LivePlayerBufferListener	// class@000428
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void onBufferEnd(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "2")) {
          return;
       }
       f.f(this.b.G);
       this.b.P8();
       return;
    }
    public void onBufferStart(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$c.class, "1")) {
          return;
       }
       f.f(this.b.G);
       if (!this.b.R8()) {
          return;
       }
       if (this.b.S8()) {
          return;
       }
       d$c tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, d.class, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.s.isLandscape() && (!tb.u.isQuizLive() && (LivePlayUrlInfo$DataSourceType.MULTI_RESOLUTION.equals(tb.p.getCurrentPlayUrlInfo().getUrlType()) && !TextUtils.n(tb.p.getCurrentLiveQualityItem().mQualityType, LiveQualityItem.StandardQuality().mQualityType)))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          f.j("showNetworkBadToast", this.b.G, 5000);
       }
       return;
    }
}
