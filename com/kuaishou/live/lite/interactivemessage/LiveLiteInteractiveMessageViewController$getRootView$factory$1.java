package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$getRootView$factory$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import ha1.a;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;

public final class LiveLiteInteractiveMessageViewController$getRootView$factory$1 extends Lambda implements a	// class@0009c3
{
    public final LiveLiteInteractiveMessageViewController this$0;

    public void LiveLiteInteractiveMessageViewController$getRootView$factory$1(LiveLiteInteractiveMessageViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       LiveLiteInteractiveMessageViewController$getRootView$factory$1 obj = PatchProxy.apply(null, this, LiveLiteInteractiveMessageViewController$getRootView$factory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       View view = a.a(obj, obj.D2(), R.layout.live_lite_interactive_message_layout);
       view.setTag(d.a, LayoutViewType.EnterRoomMessage.name());
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
