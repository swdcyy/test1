package com.yxcorp.gifshow.music.cloudmusic.widget.MusicSubSmoothPagerSlidingTabStrip$1;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabGroupWithIndicator;
import com.yxcorp.gifshow.music.cloudmusic.widget.MusicSubSmoothPagerSlidingTabStrip;
import android.content.Context;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabIndicatorView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MusicSubSmoothPagerSlidingTabStrip$1 extends BaseTabGroupWithIndicator	// class@00204b
{
    public final MusicSubSmoothPagerSlidingTabStrip g;

    public void MusicSubSmoothPagerSlidingTabStrip$1(MusicSubSmoothPagerSlidingTabStrip p0,Context p1){
       this.g = p0;
       super(p1);
    }
    public BaseTabIndicatorView g(Context p0){
       BaseTabIndicatorView obj = PatchProxy.applyOneRefs(p0, this, MusicSubSmoothPagerSlidingTabStrip$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BaseTabIndicatorView(p0);
       int[] ointArray = new int[]{MusicSubSmoothPagerSlidingTabStrip.v,MusicSubSmoothPagerSlidingTabStrip.w};
       obj.setGradientColor(ointArray);
       return obj;
    }
}
