package com.kuaishou.activity.kwaibubble.KwaiPopView;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.Color;

public final class KwaiPopView extends FrameLayout implements View$OnTouchListener	// class@000773
{
    public boolean b;
    public final boolean c;
    public final float d;
    public HashMap e;

    public void KwaiPopView(Context p0){
       super(p0, false, 0, null, 14, null);
    }
    public void KwaiPopView(Context p0,boolean p1,float p2,AttributeSet p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = false;
       }
       if (p4 & 0x04) {
          p2 = 0x3f800000;
       }
       a.p(p0, "context");
       super(p0, null);
       this.c = p1;
       this.d = p2;
       this.setOnTouchListener(this);
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       int i;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiPopView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "v";
       a.p(p0, obj);
       a.p(p1, "event");
       if (this.c == null) {
          return false;
       }
       a.p(this, obj);
       Bitmap uBitmap = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(uBitmap);
       this.layout(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
       Drawable background = this.getBackground();
       a.o(background, "v.background");
       if (background != null) {
          background.draw(uCanvas);
       }else {
          uCanvas.drawColor(-1);
       }
       this.draw(uCanvas);
       if (uBitmap != null) {
          i = Color.alpha(uBitmap.getPixel((int)p1.getX(), (int)p1.getY()));
          uBitmap.recycle();
       }else {
          i = 0;
       }
       boolean b = (i >= (int)((float)255 * this.d))? true: false;
       this.b = b;
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPopView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b != null)? super.onTouchEvent(p0): false;
       return b;
    }
}
