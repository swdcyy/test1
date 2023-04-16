package com.yxcorp.gifshow.homepage.kcube.actionbar.decoratorview.BackgroundViewElement$backgroundSwitchView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.decoratorview.BackgroundViewElement;
import com.yxcorp.gifshow.widget.BackgroundSwitchView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import mr6.b;
import java.util.Objects;

public final class BackgroundViewElement$backgroundSwitchView$2 extends Lambda implements a	// class@0016f2
{
    public final BackgroundViewElement this$0;

    public void BackgroundViewElement$backgroundSwitchView$2(BackgroundViewElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final BackgroundSwitchView invoke(){
       View obj = PatchProxy.apply(null, this, BackgroundViewElement$backgroundSwitchView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.j();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.BackgroundSwitchView");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
