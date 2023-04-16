package com.kuaishou.live.preview.item.view.LivePreviewFollowGuideView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Paint$Style;

public class LivePreviewFollowGuideView extends ConstraintLayout	// class@000e55
{
    public final Paint B;
    public Shader C;
    public RectF D;
    public static final int E;
    public static final int F;

    static {
       LivePreviewFollowGuideView.E = a1.a(0x7f062030);
       LivePreviewFollowGuideView.F = a1.a(0x7f06203d);
    }
    public void LivePreviewFollowGuideView(Context p0){
       super(p0);
       this.B = new Paint();
    }
    public void LivePreviewFollowGuideView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.B = new Paint();
    }
    public void LivePreviewFollowGuideView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = new Paint();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewFollowGuideView.class, "1")) {
          return;
       }
       int width = this.getWidth();
       int height = this.getHeight();
       if (this.C == null) {
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, (float)this.getHeight(), LivePreviewFollowGuideView.E, LivePreviewFollowGuideView.F, Shader$TileMode.CLAMP);
          this.C = v2;
          this.D = new RectF(0, 0, (float)width, (float)height);
       }
       this.B.setShader(this.C);
       this.B.setStyle(Paint$Style.STROKE);
       this.B.setStrokeWidth(0x3f800000);
       this.B.setAntiAlias(true);
       p0.drawRoundRect(this.D, (float)a1.d(R.dimen.arg_RES_7f070421), (float)a1.d(R.dimen.arg_RES_7f070421), this.B);
       super.dispatchDraw(p0);
       return;
    }
}
