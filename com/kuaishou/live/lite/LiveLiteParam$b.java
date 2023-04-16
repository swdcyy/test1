package com.kuaishou.live.lite.LiveLiteParam$b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.lite.LiveLiteParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.LiveLiteParam$a;

public class LiveLiteParam$b	// class@001d68
{
    public final LiveStreamFeed a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public boolean h;
    public Map i;

    public void LiveLiteParam$b(LiveStreamFeed p0,int p1,String p2,int p3,int p4,int p5,String p6){
       super();
       this.a = p0;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.b = p1;
       this.g = p2;
    }
    public LiveLiteParam a(){
       Object[] objArray = null;
       LiveLiteParam obj = PatchProxy.apply(objArray, this, LiveLiteParam$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveLiteParam(objArray);
       obj.mLiveStreamFeed = this.a;
       obj.mSourceUrl = this.f;
       obj.mStartPlaySourceType = this.e;
       obj.mSourceType = this.c;
       obj.mInnerCustomSourceType = this.d;
       obj.mPageType = this.b;
       obj.mPage = this.g;
       obj.mAdaptBottomBar = this.h;
       return obj;
    }
}
