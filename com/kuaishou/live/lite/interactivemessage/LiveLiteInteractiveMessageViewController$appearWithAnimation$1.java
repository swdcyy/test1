package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$appearWithAnimation$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;

public final class LiveLiteInteractiveMessageViewController$appearWithAnimation$1 extends Lambda implements a	// class@0009bf
{
    public final LiveLiteInteractiveMessageViewController this$0;

    public void LiveLiteInteractiveMessageViewController$appearWithAnimation$1(LiveLiteInteractiveMessageViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteInteractiveMessageViewController$appearWithAnimation$1.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = LiveLiteInteractiveMessageViewController.V2(this.this$0).getLayoutParams();
       if (layoutParams != null) {
          layoutParams.height = -2;
          LiveLiteInteractiveMessageViewController.V2(this.this$0).setLayoutParams(layoutParams);
       }
       return;
    }
}
