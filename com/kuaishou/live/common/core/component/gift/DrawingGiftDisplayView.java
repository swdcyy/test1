package com.kuaishou.live.common.core.component.gift.DrawingGiftDisplayView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ug1.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import com.kuaishou.live.core.show.gift.DrawingGift;

public class DrawingGiftDisplayView extends View	// class@001114
{
    public e b;
    public DrawingGift c;
    public float d;
    public AnimatorSet e;

    public void DrawingGiftDisplayView(Context p0){
       super(p0, null, 0);
    }
    public void DrawingGiftDisplayView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DrawingGiftDisplayView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new e();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DrawingGiftDisplayView.class, "3")) {
          return;
       }
       this.c = null;
       this.invalidate();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftDisplayView.class, "6")) {
          return;
       }
       super.onDraw(p0);
       DrawingGiftDisplayView tc = this.c;
       if (tc == null) {
          return;
       }
       this.b.a(p0, tc, this.d, this.getWidth(), this.getHeight());
       return;
    }
}
