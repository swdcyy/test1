package com.yxcorp.plugin.search.widget.SearchEdgeTransparentView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.graphics.Canvas;
import android.view.View;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.Integer;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;

public class SearchEdgeTransparentView extends FrameLayout	// class@0007da
{
    public Paint b;
    public int c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public float[] l;

    public void SearchEdgeTransparentView(Context p0){
       super(p0, null);
    }
    public void SearchEdgeTransparentView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchEdgeTransparentView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 1;
       this.f = 1 << 1;
       this.g = 1 << 2;
       this.h = 1 << 3;
       this.k = new int[2]{0xff000000,0};
       this.l = new float[2]{0,0x3f800000};
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchEdgeTransparentView.class, "1")) {
       }else {
          Paint paint = new Paint(1);
          this.b = paint;
          paint.setStyle(Paint$Style.FILL);
          this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.R4);
          if (typedArray != null) {
             this.c = typedArray.getInt(0, 0);
             this.d = typedArray.getDimension(1, (float)a1.e(20.00f));
             typedArray.recycle();
          }
       }
       return;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       SearchEdgeTransparentView obj;
       SearchEdgeTransparentView searchEdgeTr = this;
       Canvas uCanvas = p0;
       if (PatchProxy.isSupport(SearchEdgeTransparentView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, SearchEdgeTransparentView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
       boolean b = super.drawChild(p0, p1, p2);
       obj = searchEdgeTr.c;
       if (obj == null || (obj & searchEdgeTr.e)) {
          p0.drawRect(0, 0, (float)searchEdgeTr.i, searchEdgeTr.d, searchEdgeTr.b);
       }
       obj = searchEdgeTr.c;
       if (obj == null || (obj & searchEdgeTr.f)) {
          uCanvas.rotate(180.00f, ((float)searchEdgeTr.i / 2.00f), ((float)searchEdgeTr.j / 2.00f));
          p0.drawRect(0, 0, (float)searchEdgeTr.i, searchEdgeTr.d, searchEdgeTr.b);
          uCanvas.restoreToCount(p0.save());
       }
       float f = (float)(searchEdgeTr.j - searchEdgeTr.i) / 2.00f;
       obj = searchEdgeTr.c;
       if (obj == null || (obj & searchEdgeTr.g)) {
          uCanvas.rotate(270.00f, ((float)searchEdgeTr.i / 2.00f), ((float)searchEdgeTr.j / 2.00f));
          uCanvas.translate(0, f);
          p0.drawRect((0 - f), 0, ((float)searchEdgeTr.i + f), searchEdgeTr.d, searchEdgeTr.b);
          uCanvas.restoreToCount(p0.save());
       }
       obj = searchEdgeTr.c;
       if (obj == null || (obj & searchEdgeTr.h)) {
          uCanvas.rotate(90.00f, ((float)searchEdgeTr.i / 2.00f), ((float)searchEdgeTr.j / 2.00f));
          uCanvas.translate(0, f);
          p0.drawRect((0 - f), 0, ((float)searchEdgeTr.i + f), searchEdgeTr.d, searchEdgeTr.b);
          uCanvas.restoreToCount(p0.save());
       }
       uCanvas.restoreToCount(i);
       return b;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SearchEdgeTransparentView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SearchEdgeTransparentView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (!PatchProxy.applyVoid(null, this, SearchEdgeTransparentView.class, "3")) {
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, this.d, this.k, this.l, Shader$TileMode.CLAMP);
          this.b.setShader(null);
       }
       this.i = this.getWidth();
       this.j = this.getHeight();
       return;
    }
}
