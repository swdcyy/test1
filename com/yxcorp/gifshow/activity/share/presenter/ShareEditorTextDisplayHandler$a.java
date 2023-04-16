package com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$a;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import android.graphics.Rect;

public final class ShareEditorTextDisplayHandler$a extends ImageSpan	// class@00139f
{

    public void ShareEditorTextDisplayHandler$a(Drawable p0){
       a.p(p0, "icon");
       super(p0);
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (PatchProxy.isSupport(ShareEditorTextDisplayHandler$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, ShareEditorTextDisplayHandler$a.class, "1")) {
             return;
          }
       }
       a.p(p0, "canvas");
       a.p(p8, "paint");
       Drawable drawable = this.getDrawable();
       a.o(drawable, "drawable");
       p0.save();
       p0.translate(p4, (float)((p7 - drawable.getBounds().bottom) - 3));
       drawable.draw(p0);
       p0.restore();
       return;
    }
}
