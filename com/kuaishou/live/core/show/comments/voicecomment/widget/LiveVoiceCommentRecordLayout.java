package com.kuaishou.live.core.show.comments.voicecomment.widget.LiveVoiceCommentRecordLayout;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import lnc.a1;

public class LiveVoiceCommentRecordLayout extends View	// class@000a65
{
    public Paint b;
    public Paint c;
    public int d;
    public int e;
    public boolean f;

    public void LiveVoiceCommentRecordLayout(Context p0){
       super(p0, null);
    }
    public void LiveVoiceCommentRecordLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoiceCommentRecordLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = -1;
       this.e = -1;
       this.f = false;
    }
    public void onDraw(Canvas p0){
       Paint paint;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoiceCommentRecordLayout.class, "1")) {
          return;
       }
       super.onDraw(p0);
       String str = -1;
       if (this.d != str && this.e != str) {
          float f = 46.00f;
          float f1 = 556.00f;
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveVoiceCommentRecordLayout.class, "2")) {
             if (this.b == null) {
                paint = new Paint();
                this.b = paint;
                paint.setStyle(Paint$Style.FILL);
             }
             this.b.setColor(this.d);
             f2 = (float)a1.e(f1);
             p0.drawCircle((float)(this.getMeasuredWidth() / 2), (f2 - (float)a1.e(f)), f2, this.b);
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveVoiceCommentRecordLayout.class, "3")) {
             if (this.c == null) {
                paint = new Paint();
                this.c = paint;
                paint.setStyle(Paint$Style.STROKE);
                this.c.setStrokeWidth(8.00f);
             }
             this.c.setColor(this.e);
             f2 = (float)a1.e(f1);
             p0.drawCircle((float)(this.getMeasuredWidth() / 2), (f2 - (float)a1.e(f)), f2, this.c);
          }
       }
    label_0098 :
       return;
    }
}
