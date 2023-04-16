package com.yxcorp.gifshow.v3.widget.EditorContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.content.res.Resources;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.view.View;

public class EditorContainer extends FrameLayout	// class@00163b
{
    public int b;
    public Paint c;

    public void EditorContainer(Context p0){
       super(p0);
       this.a();
    }
    public void EditorContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void EditorContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, EditorContainer.class, "1")) {
          return;
       }
       Paint paint = new Paint();
       this.c = paint;
       paint.setColor(this.getContext().getResources().getColor(R.color.arg_RES_7f0609d8));
       this.c.setStyle(Paint$Style.FILL);
       this.setWillNotDraw(false);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorContainer.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.b > null) {
          p0.drawRect(0, (float)(this.getHeight() - this.b), (float)this.getWidth(), (float)this.getHeight(), this.c);
       }
       return;
    }
}
