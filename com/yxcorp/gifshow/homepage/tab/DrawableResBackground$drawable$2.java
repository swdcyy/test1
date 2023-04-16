package com.yxcorp.gifshow.homepage.tab.DrawableResBackground$drawable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.tab.DrawableResBackground;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.core.content.ContextCompat;

public final class DrawableResBackground$drawable$2 extends Lambda implements a	// class@001808
{
    public final DrawableResBackground this$0;

    public void DrawableResBackground$drawable$2(DrawableResBackground p0){
       this.this$0 = p0;
       super(0);
    }
    public final Drawable invoke(){
       DrawableResBackground$drawable$2 obj = PatchProxy.apply(null, this, DrawableResBackground$drawable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       return ContextCompat.getDrawable(obj.g, obj.f);
    }
    public Object invoke(){
       return this.invoke();
    }
}
