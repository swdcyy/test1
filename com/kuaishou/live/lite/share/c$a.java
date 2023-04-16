package com.kuaishou.live.lite.share.c$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import mhc.n1;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c$a	// class@000b15
{
    public final GifshowActivity a;
    public final LiveStreamFeedWrapper b;
    public final n1 c;
    public final String d;
    public String e;

    public void c$a(GifshowActivity p0,LiveStreamFeedWrapper p1,n1 p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public LiveStreamFeed a(){
       return this.b.mEntity;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareParam{mActivity="+this.a+", mPhoto="+this.b+", mShareSubBiz=\'"+this.d+'''+'}';
    }
}
