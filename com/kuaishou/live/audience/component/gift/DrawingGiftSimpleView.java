package com.kuaishou.live.audience.component.gift.DrawingGiftSimpleView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ug1.e;
import android.graphics.Canvas;
import com.kuaishou.live.core.show.gift.DrawingGift;

public class DrawingGiftSimpleView extends View	// class@000ada
{
    public e b;
    public DrawingGift c;

    public void DrawingGiftSimpleView(Context p0){
       super(p0);
       this.a();
    }
    public void DrawingGiftSimpleView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void DrawingGiftSimpleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, DrawingGiftSimpleView.class, "1")) {
          return;
       }
       this.b = new e();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftSimpleView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       DrawingGiftSimpleView tc = this.c;
       if (tc != null) {
          this.b.b(p0, tc, this.getWidth(), this.getHeight());
       }
       return;
    }
    public void setDrawingGift(DrawingGift p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftSimpleView.class, "2")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
}
