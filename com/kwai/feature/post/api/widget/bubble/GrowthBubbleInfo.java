package com.kwai.feature.post.api.widget.bubble.GrowthBubbleInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class GrowthBubbleInfo	// class@001488
{
    public GrowthBubbleInfo$BackgroundConfig mBackgroundConfig;
    public GrowthBubbleInfo$BubbleConfig mBubbleConfig;
    public boolean mDisableAnimation;
    public boolean mIsAdjustScreenSize;
    public int[] mScreenEdgeInsets;
    public long mShowDuration;

    public void GrowthBubbleInfo(){
       super();
    }
    public final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthBubbleInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 9;
       if (p0.length() == i && p0.charAt(0) == '#') {
          p0 = "#"+p0.subSequence(7, i)+p0.subSequence(1, 7);
       }
       return p0;
    }
}
