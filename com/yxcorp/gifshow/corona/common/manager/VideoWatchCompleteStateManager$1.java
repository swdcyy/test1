package com.yxcorp.gifshow.corona.common.manager.VideoWatchCompleteStateManager$1;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.corona.common.manager.a;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class VideoWatchCompleteStateManager$1 extends LinkedHashMap	// class@0011f2
{
    public final a this$0;
    public static final long serialVersionUID = 0x5a5352a3b0c7e0f6;

    public void VideoWatchCompleteStateManager$1(a p0,int p1,float p2,boolean p3){
       this.this$0 = p0;
       super(p1, p2, p3);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VideoWatchCompleteStateManager$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > 0x4e20)? true: false;
       return b;
    }
}
