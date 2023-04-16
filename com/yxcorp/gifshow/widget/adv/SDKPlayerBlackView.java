package com.yxcorp.gifshow.widget.adv.SDKPlayerBlackView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Rect;

public final class SDKPlayerBlackView extends View	// class@00190f
{
    public final String b;
    public boolean c;
    public float d;
    public float e;
    public HashMap f;

    public void SDKPlayerBlackView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void SDKPlayerBlackView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void SDKPlayerBlackView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = "SDKPlayerBlackView";
       this.d = 0xbf800000;
       this.e = 0xbf800000;
    }
    public void SDKPlayerBlackView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final float getMBlackHeightBottom(){
       return this.e;
    }
    public final float getMBlackHeightTop(){
       return this.d;
    }
    public final boolean getMIsBlackCover(){
       return this.c;
    }
    public final String getTAG(){
       return this.b;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SDKPlayerBlackView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       Object[] objArray = new Object[0];
       a.D().w(this.b, "onDraw mIsBlackCover "+this.c, objArray);
       if (this.c != null) {
          int i = 0;
          if (this.d - i > 0 && this.e - i > 0) {
             Paint paint = new Paint(3);
             paint.setColor(0xff000000);
             paint.setStyle(Paint$Style.FILL);
             Object[] objArray1 = new Object[0];
             a.D().w(this.b, "onDraw blackHeightTop "+this.d+",blackHeightBottom "+this.e+",SDKView: width"+this.getWidth()+" height "+this.getHeight()+" top "+this.getTop()+' '+"bottom "+this.getBottom(), objArray1);
             if (p0 != null) {
                p0.drawRect(new Rect(0, 0, this.getWidth(), (int)this.d), paint);
                p0.drawRect(new Rect(0, (this.getHeight() - (int)this.e), this.getWidth(), this.getHeight()), paint);
             }
          }
       }
       return;
    }
    public final void setMBlackHeightBottom(float p0){
       this.e = p0;
    }
    public final void setMBlackHeightTop(float p0){
       this.d = p0;
    }
    public final void setMIsBlackCover(boolean p0){
       this.c = p0;
    }
}
