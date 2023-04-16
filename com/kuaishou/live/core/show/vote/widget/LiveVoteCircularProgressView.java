package com.kuaishou.live.core.show.vote.widget.LiveVoteCircularProgressView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import lnc.a1;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.SweepGradient;
import android.graphics.Shader;
import java.lang.Integer;
import java.lang.Float;

public class LiveVoteCircularProgressView extends View	// class@00124d
{
    public final Paint b;
    public final RectF c;
    public float d;
    public int[] e;
    public int f;
    public int g;
    public int h;

    public void LiveVoteCircularProgressView(Context p0){
       super(p0);
       this.b = new Paint();
       this.c = new RectF();
       this.d = 0;
       int[] ointArray = new int[]{a1.a(0x7f060752),a1.a(0x7f060752)};
       this.e = ointArray;
       this.f = a1.a(0x7f061e1f);
       this.g = a1.a(0x7f06202f);
       this.h = a1.d(0x7f070628);
    }
    public void LiveVoteCircularProgressView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.c = new RectF();
       this.d = 0;
       int[] ointArray = new int[]{a1.a(0x7f060752),a1.a(0x7f060752)};
       this.e = ointArray;
       this.f = a1.a(0x7f061e1f);
       this.g = a1.a(0x7f06202f);
       this.h = a1.d(0x7f070628);
    }
    public void LiveVoteCircularProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       this.c = new RectF();
       this.d = 0;
       int[] ointArray = new int[]{a1.a(0x7f060752),a1.a(0x7f060752)};
       this.e = ointArray;
       this.f = a1.a(0x7f061e1f);
       this.g = a1.a(0x7f06202f);
       this.h = a1.d(0x7f070628);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoteCircularProgressView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoid(null, this, LiveVoteCircularProgressView.class, "6")) {
          LiveVoteCircularProgressView tc = this.c;
          float f = (float)this.h;
          tc.left = f;
          tc.top = f;
          tc.right = (float)(this.getWidth() - this.h);
          this.c.bottom = (float)(this.getHeight() - this.h);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveVoteCircularProgressView.class, "7")) {
          this.b.setStrokeWidth((float)this.h);
          this.b.setColor(this.g);
          this.b.setAntiAlias(true);
          this.b.setFlags(true);
          this.b.setStyle(Paint$Style.STROKE);
          this.b.setStrokeCap(Paint$Cap.ROUND);
          p0.drawArc(this.c, 0, 360.00f, false, this.b);
          this.b.setColor(this.f);
          this.b.setShader(new SweepGradient(0, 0, this.e, null));
          p0.drawArc(this.c, -90.00f, (this.d * -360.00f), false, this.b);
          this.b.setShader(null);
       }
       return;
    }
    public void setColor(int p0){
       if (PatchProxy.isSupport(LiveVoteCircularProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoteCircularProgressView.class, "1")) {
          return;
       }
       if (this.f == p0) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(LiveVoteCircularProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveVoteCircularProgressView.class, "3")) {
          return;
       }
       if (!this.d - p0) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
    public void setProgressBgColor(int p0){
       if (PatchProxy.isSupport(LiveVoteCircularProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoteCircularProgressView.class, "2")) {
          return;
       }
       if (this.g == p0) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setStrokeWidth(int p0){
       if (PatchProxy.isSupport(LiveVoteCircularProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoteCircularProgressView.class, "4")) {
          return;
       }
       if (this.h == p0) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
}
