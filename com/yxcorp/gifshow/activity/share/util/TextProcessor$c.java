package com.yxcorp.gifshow.activity.share.util.TextProcessor$c;
import android.text.style.ReplacementSpan;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint$FontMetricsInt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class TextProcessor$c extends ReplacementSpan	// class@00148f
{

    public void TextProcessor$c(){
       super();
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (PatchProxy.isSupport(TextProcessor$c.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, TextProcessor$c.class, "2")) {
             return;
          }
       }
       a.p(p0, "canvas");
       a.p(p8, "paint");
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(TextProcessor$c.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p1 = PatchProxy.apply(objArray, this, TextProcessor$c.class, "1");
          if (p1 != PatchProxyResult.class) {
             return p1.intValue();
          }
       }
       a.p(p0, "paint");
       return 0;
    }
}
