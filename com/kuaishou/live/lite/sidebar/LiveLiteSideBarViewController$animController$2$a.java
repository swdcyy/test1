package com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$animController$2$a;
import fd3.v;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$animController$2;
import java.lang.Object;
import com.kuaishou.live.lite.sidebar.e$a;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import android.widget.LinearLayout;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;

public final class LiveLiteSideBarViewController$animController$2$a implements v	// class@000b3e
{
    public final LiveLiteSideBarViewController$animController$2 a;

    public void LiveLiteSideBarViewController$animController$2$a(LiveLiteSideBarViewController$animController$2 p0){
       this.a = p0;
       super();
    }
    public final View a(e$a p0){
       View obj = PatchProxy.applyOneRefs(p0, this, LiveLiteSideBarViewController$animController$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = LiveLiteSideBarViewController.V2(this.a.this$0).findViewWithTag(p0);
       if (obj == null) {
          LiveLiteSideBarViewController$animController$2 this$0 = this.a.this$0;
          obj = this$0.X2(this$0.D2(), p0, this.a.this$0.v.g(p0));
       }
       return obj;
    }
}
