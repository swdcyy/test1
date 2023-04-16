package com.yxcrop.gifshow.v3.editor.decoration_v2.ui.pic.PictureFakeView;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.pic.PictureFakeView$paint$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.pic.PictureFakeView$rect$2;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import java.lang.Boolean;
import java.lang.Integer;

public final class PictureFakeView extends View	// class@000a3a
{
    public final p b;
    public final p c;
    public Bitmap d;
    public HashMap e;

    public void PictureFakeView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = s.c(PictureFakeView$paint$2.INSTANCE);
       this.c = s.c(PictureFakeView$rect$2.INSTANCE);
    }
    public final Paint getPaint(){
       Object obj = PatchProxy.apply(null, this, PictureFakeView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final Rect getRect(){
       Object obj = PatchProxy.apply(null, this, PictureFakeView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureFakeView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       PictureFakeView td = this.d;
       if (td != null && p0 != null) {
          p0.drawBitmap(td, null, this.getRect(), this.getPaint());
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(PictureFakeView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PictureFakeView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       p0.right = p3 - p1;
       p0.bottom = p4 - p2;
       return;
    }
    public final void setBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureFakeView.class, "3")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
}
