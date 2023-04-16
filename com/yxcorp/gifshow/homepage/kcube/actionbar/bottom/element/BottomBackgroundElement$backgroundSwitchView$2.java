package com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.element.BottomBackgroundElement$backgroundSwitchView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.element.BottomBackgroundElement;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.ImageSwitchView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import mr6.b;
import java.util.Objects;

public final class BottomBackgroundElement$backgroundSwitchView$2 extends Lambda implements a	// class@0016ee
{
    public final BottomBackgroundElement this$0;

    public void BottomBackgroundElement$backgroundSwitchView$2(BottomBackgroundElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final ImageSwitchView invoke(){
       View obj = PatchProxy.apply(null, this, BottomBackgroundElement$backgroundSwitchView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.j();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.feature.api.feed.home.wrapper.kcube.widget.ImageSwitchView");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
