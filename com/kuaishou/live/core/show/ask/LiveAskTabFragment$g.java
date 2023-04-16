package com.kuaishou.live.core.show.ask.LiveAskTabFragment$g;
import erd.g;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig;

public final class LiveAskTabFragment$g implements g	// class@0009c0
{
    public final LiveAskTabFragment b;

    public void LiveAskTabFragment$g(LiveAskTabFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment$g.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.M = p0.booleanValue();
          p0 = this.b.U0;
          p0 = (p0 != null)? Boolean.valueOf(p0.mIsAnchor): null;
          a.m(p0);
          if (!p0.booleanValue()) {
             this.b.Ih();
          }
          p0 = this.b;
          p0.Hh(p0.M);
       }
       return;
    }
}
