package com.kuaishou.live.core.voiceparty.feed.card.v3.BlurCoverViewController$blurViewForeground$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.feed.card.v3.BlurCoverViewController;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;

public final class BlurCoverViewController$blurViewForeground$2 extends Lambda implements a	// class@0014f1
{
    public final BlurCoverViewController this$0;

    public void BlurCoverViewController$blurViewForeground$2(BlurCoverViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final Drawable invoke(){
       Object[] objArray = null;
       BlurCoverViewController$blurViewForeground$2 obj = PatchProxy.apply(objArray, this, BlurCoverViewController$blurViewForeground$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       if (obj.d != null) {
          if (obj.c == null) {
             objArray = new ColorDrawable(this.this$0.d);
          }else {
             objArray = new GradientDrawable();
             objArray.setColor(this.this$0.d);
             objArray.setCornerRadius((float)this.this$0.c);
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
