package com.kuaishou.live.lite.sidebar.debuginfo.LiteDebugViewController$container$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.sidebar.debuginfo.LiteDebugViewController;
import android.widget.LinearLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiteDebugViewController$container$2 extends Lambda implements a	// class@000b4a
{
    public final LiteDebugViewController this$0;

    public void LiteDebugViewController$container$2(LiteDebugViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LinearLayout invoke(){
       LinearLayout obj = PatchProxy.apply(null, this, LiteDebugViewController$container$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout(this.this$0.D2());
       obj.setOrientation(1);
       obj.setGravity(16);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
