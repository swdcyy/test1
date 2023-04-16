package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LiveViewElement$liveView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LiveViewElement;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import mr6.b;
import java.util.Objects;

public final class LiveViewElement$liveView$2 extends Lambda implements a	// class@0016f4
{
    public final LiveViewElement this$0;

    public void LiveViewElement$liveView$2(LiveViewElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final ImageView invoke(){
       View obj = PatchProxy.apply(null, this, LiveViewElement$liveView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.j();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.widget.ImageView");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
