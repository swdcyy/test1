package com.kuaishou.live.core.show.ask.LiveAskTabFragment$e;
import ok.x;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LiveAskTabFragment$e implements x	// class@0009be
{
    public final LiveAskTabFragment b;

    public void LiveAskTabFragment$e(LiveAskTabFragment p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, LiveAskTabFragment$e.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(this.b.S);
       }
       return uBoolean;
    }
}
