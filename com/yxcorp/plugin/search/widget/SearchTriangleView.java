package com.yxcorp.plugin.search.widget.SearchTriangleView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.Path$FillType;

public class SearchTriangleView extends View	// class@0007ef
{
    public Paint b;
    public int c;
    public Path d;

    public void SearchTriangleView(Context p0){
       super(p0, null);
       this.a();
    }
    public void SearchTriangleView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (p1 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.P5, 0, 0);
          this.c = typedArray.getColor(0, 0);
          typedArray.recycle();
       }
       this.a();
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SearchTriangleView.class, "1")) {
          return;
       }
       Paint paint = new Paint();
       this.b = paint;
       paint.setColor(this.c);
       this.b.setAntiAlias(true);
       this.b.setStyle(Paint$Style.FILL_AND_STROKE);
       this.d = new Path();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTriangleView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       this.d.setFillType(Path$FillType.EVEN_ODD);
       this.d.reset();
       this.d.moveTo(0, (float)this.getHeight());
       this.d.lineTo((float)this.getWidth(), (float)this.getHeight());
       this.d.lineTo((float)(this.getWidth() / 2), 0);
       this.d.close();
       p0.drawPath(this.d, this.b);
       return;
    }
}
