package com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Math;

public class LiveQuizQuestionAnswerStateProgressBar extends ProgressBar	// class@000e33
{
    public int b;
    public int c;
    public int d;
    public Paint e;
    public RectF f;
    public int g;

    public void LiveQuizQuestionAnswerStateProgressBar(Context p0){
       super(p0, null);
    }
    public void LiveQuizQuestionAnswerStateProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveQuizQuestionAnswerStateProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveQuizQuestionAnswerStateProgressBar.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.J2);
          this.b = typedArray.getColor(0, 0);
          this.c = typedArray.getColor(1, 0);
          this.d = typedArray.getDimensionPixelOffset(2, n.c(this.getContext(), 0x3f800000));
          Paint paint = new Paint();
          this.e = paint;
          paint.setAntiAlias(1);
          this.e.setDither(1);
          this.f = new RectF();
          typedArray.recycle();
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizQuestionAnswerStateProgressBar.class, "3")) {
          return;
       }
       super.draw(p0);
       if (this.g != null) {
          this.e.setStrokeWidth((float)this.d);
          this.e.setStyle(Paint$Style.STROKE);
          this.e.setStrokeCap(Paint$Cap.ROUND);
          this.e.setColor(this.b);
          LiveQuizQuestionAnswerStateProgressBar tg = this.g;
          p0.drawCircle((float)(tg / 2), (float)(tg / 2), (float)((tg / 2) - (this.d / 2)), this.e);
          this.e.setColor(this.c);
          p0.drawArc(this.f, -90.00f, ((((float)this.getProgress() * 0x3f800000) / (float)this.getMax()) * 360.00f), false, this.e);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveQuizQuestionAnswerStateProgressBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveQuizQuestionAnswerStateProgressBar.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       p3 = p3 - p1;
       p4 = p4 - p2;
       if (p3 && p4) {
          int i = Math.min(p3, p4);
          this.g = i;
          p1 = this.d / 2;
          this.f.set((float)p1, (float)p1, (float)(i - p1), (float)(i - p1));
       }
       return;
    }
    public void setProgressColor(int p0){
       this.c = p0;
    }
}
