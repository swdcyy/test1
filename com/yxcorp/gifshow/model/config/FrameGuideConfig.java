package com.yxcorp.gifshow.model.config.FrameGuideConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class FrameGuideConfig implements Serializable	// class@001eca
{
    public List mDarkGuideCoverUrl;
    public List mDarkGuideVideoUrl;
    public List mLightGuideCoverUrl;
    public List mLightGuideVideoUrl;
    public static final long serialVersionUID = 0x623ee2fe8e9bac20;

    public void FrameGuideConfig(){
       super();
    }
    public static boolean isConfigValid(FrameGuideConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrameGuideConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 != null && (!q.f(p0.mDarkGuideCoverUrl) && (!q.f(p0.mDarkGuideVideoUrl) && (!q.f(p0.mLightGuideCoverUrl) && (!q.f(p0.mLightGuideVideoUrl) && (!TextUtils.x(p0.mDarkGuideCoverUrl.get(i).mUrl) && (!TextUtils.x(p0.mDarkGuideVideoUrl.get(i).mUrl) && (!TextUtils.x(p0.mLightGuideCoverUrl.get(i).mUrl) && !TextUtils.x(p0.mLightGuideVideoUrl.get(i).mUrl))))))))) {
          i = true;
       }
    label_0078 :
       return i;
    }
}
