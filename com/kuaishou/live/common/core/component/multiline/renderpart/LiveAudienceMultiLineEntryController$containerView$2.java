package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$containerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveAudienceMultiLineEntryController$containerView$2 extends Lambda implements a	// class@0014f5
{
    public final LiveAudienceMultiLineEntryController this$0;

    public void LiveAudienceMultiLineEntryController$containerView$2(LiveAudienceMultiLineEntryController p0){
       this.this$0 = p0;
       super(0);
    }
    public final FrameLayout invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController$containerView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FrameLayout(this.this$0.D2());
    }
    public Object invoke(){
       return this.invoke();
    }
}
