package com.kuaishou.live.core.basic.activity.LivePlayFragment$b;
import i51.g;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;

public class LivePlayFragment$b implements g	// class@00180e
{
    public final LivePlayFragment a;

    public void LivePlayFragment$b(LivePlayFragment p0){
       this.a = p0;
       super();
    }
    public e0 c(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.K.Z2.b();
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.K.Z2.d();
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.K.Z2.e();
    }
    public int g(){
       return this.a.F.mLiveStreamStartPlaySourceForEnterPrompt;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.K.Z2.getLiveStreamId();
    }
}
