package com.kwai.dva.design.internal.UIStrategy$mHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.dva.design.internal.UIStrategy;
import com.kwai.dva.design.internal.UIStrategy$mHandler$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class UIStrategy$mHandler$2 extends Lambda implements a	// class@000d13
{
    public final UIStrategy this$0;

    public void UIStrategy$mHandler$2(UIStrategy p0){
       this.this$0 = p0;
       super(0);
    }
    public final UIStrategy$mHandler$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, UIStrategy$mHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UIStrategy$mHandler$2$a(this.this$0, Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
