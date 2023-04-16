package eg1.c;
import eg1.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public class c implements b	// class@00214b
{
    public LiveEffectDownloadSwitchInfo a;
    public String b;

    public void c(){
       super();
    }
    public synchronized LiveEffectDownloadSwitchInfo a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          LiveEffectDownloadSwitchInfo matchedSwitc = LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo();
          b.Z(LiveLogTag.LIVE_DOWNLOAD_UTILS, "[getEffectSwitchInfo]: liveStreamId is empty, switchInfo = "+matchedSwitc);
          return matchedSwitc;
       }else if(p0.equals(this.b)){
          return this.a;
       }else {
          this.a = LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo();
          this.b = p0;
          b.Z(LiveLogTag.LIVE_DOWNLOAD_UTILS, "[getEffectSwitchInfo]: refresh newLiveStreamId = "+p0+", mBindingLiveStreamId"+this.b+", switchInfo = "+this.a);
          return this.a;
       }
    }
}
