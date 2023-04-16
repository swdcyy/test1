package com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelAdapter$a;
import im8.g;
import y8c.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import com.yxcorp.gifshow.autoplay.live.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.recommendsidebar.panel.c;
import java.util.Map;
import java.util.HashMap;

public class LiveLiteRecommendPanelAdapter$a implements g	// class@000aed
{
    public final LiveAutoPlayModule b;

    public void LiveLiteRecommendPanelAdapter$a(a p0,BaseFeed p1){
       super();
       e$a uoa = new e$a(p1, p0, 6, ":ks-features:ft-live:live-external:live-lite");
       uoa.a(16);
       this.b = new LiveAutoPlayModule(uoa.b());
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteRecommendPanelAdapter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveLiteRecommendPanelAdapter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveLiteRecommendPanelAdapter$a.class, new c());
       }else {
          obj.put(LiveLiteRecommendPanelAdapter$a.class, null);
       }
       return obj;
    }
}
