package com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$animController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$animController$2$a;
import fd3.v;

public final class LiveLiteSideBarViewController$animController$2 extends Lambda implements a	// class@000b3f
{
    public final LiveLiteSideBarViewController this$0;

    public void LiveLiteSideBarViewController$animController$2(LiveLiteSideBarViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiteSideBarReplaceAnimController invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideBarViewController$animController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiteSideBarReplaceAnimController(new LiveLiteSideBarViewController$animController$2$a(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
