package com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$LiveGzoneBannerLruMap;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class LiveGzoneAudienceActivityBannerPresenter$LiveGzoneBannerLruMap extends LinkedHashMap	// class@000c51
{
    public static final long serialVersionUID = 0x9931ab9112316133;

    public void LiveGzoneAudienceActivityBannerPresenter$LiveGzoneBannerLruMap(){
       super(10, 0x3f400000, true);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter$LiveGzoneBannerLruMap.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > 30)? true: false;
       return b;
    }
}
