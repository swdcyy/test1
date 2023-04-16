package com.lsjwzh.widget.text.ReadMoreTextView$a;
import com.lsjwzh.widget.text.a$a;
import android.text.style.ReplacementSpan;
import java.lang.String;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Math;
import android.view.View;
import com.lsjwzh.widget.text.ReadMoreTextView;
import com.lsjwzh.widget.text.FastTextLayoutView;

public class ReadMoreTextView$a extends ReplacementSpan implements a$a	// class@00147c
{
    public String b;

    public void ReadMoreTextView$a(String p0){
       super();
       this.b = p0;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       ReadMoreTextView$a b = this.b;
       p0.drawText(b, 0, b.length(), p4, (float)p6, p8);
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       ReadMoreTextView$a tb = this.b;
       return (int)Math.ceil((double)p0.measureText(tb, 0, tb.length()));
    }
    public void onClick(View p0){
       if (p0.o != null) {
          p0.o = false;
          p0.b = p0.q;
          p0.requestLayout();
       }else {
          p0.o = true;
          p0.b = p0.p;
          p0.requestLayout();
       }
       return;
    }
}
