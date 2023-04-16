package com.yxcorp.gifshow.homepage.tab.ColorBackground$drawable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.tab.ColorBackground;
import android.graphics.drawable.ColorDrawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ColorBackground$drawable$2 extends Lambda implements a	// class@001806
{
    public final ColorBackground this$0;

    public void ColorBackground$drawable$2(ColorBackground p0){
       this.this$0 = p0;
       super(0);
    }
    public final ColorDrawable invoke(){
       Object obj = PatchProxy.apply(null, this, ColorBackground$drawable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ColorDrawable(this.this$0.f);
    }
    public Object invoke(){
       return this.invoke();
    }
}
