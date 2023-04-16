package com.kwai.live.gzone.promotion.LiveGzoneColorTopView$c;
import android.graphics.drawable.ColorDrawable;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView$a;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class LiveGzoneColorTopView$c extends ColorDrawable	// class@000dab
{
    public final LiveGzoneColorTopView a;

    public void LiveGzoneColorTopView$c(LiveGzoneColorTopView p0){
       this.a = p0;
       super();
    }
    public void LiveGzoneColorTopView$c(LiveGzoneColorTopView p0,LiveGzoneColorTopView$a p1){
       super(p0);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneColorTopView$c.class, "2")) {
          return;
       }
       this.getBounds().bottom = this.a.getPaddingTop();
       super.draw(p0);
       return;
    }
    public int getIntrinsicHeight(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneColorTopView$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getPaddingTop();
    }
}
