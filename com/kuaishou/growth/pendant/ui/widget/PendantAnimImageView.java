package com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView$a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.widget.ImageView;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import java.util.Collection;

public class PendantAnimImageView extends KwaiImageView	// class@0006fa
{
    public long A;
    public long B;
    public int C;
    public PendantAnimImageView$a D;
    public Bitmap E;
    public List x;
    public long y;
    public boolean z;

    public void PendantAnimImageView(Context p0){
       super(p0, null);
    }
    public void PendantAnimImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PendantAnimImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, PendantAnimImageView.class, "1")) {
       }else {
          this.x = new ArrayList();
          this.y = 50;
       }
       return;
    }
    public final Bitmap getAnimFrame(){
       Object[] objArray = null;
       PendantAnimImageView obj = PatchProxy.apply(objArray, this, PendantAnimImageView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj != null && !obj.isEmpty()) {
          int i = (int)(this.A / this.y);
          PendantAnimImageView tC = this.C;
          if (tC > null) {
             if ((tC * this.x.size()) > i) {
                i = i % this.x.size();
             }else {
                i = this.x.size() - 1;
                tC = this.D;
                if (tC != null) {
                   tC.onAnimationEnd();
                }
             }
          }else if(this.z != null){
             i = i % this.x.size();
          }else if(i > (this.x.size() - 1)){
             i = this.x.size() - 1;
             tC = this.D;
             if (tC != null) {
                tC.onAnimationEnd();
             }
          }
          if (i >= 0 && i < this.x.size()) {
             return this.x.get(i);
          }
       }
    label_0080 :
       return objArray;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, PendantAnimImageView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p0();
       PendantAnimImageView tD = this.D;
       if (tD != null) {
          tD.onAnimationEnd();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantAnimImageView.class, "7")) {
          return;
       }
       PendantAnimImageView tx = this.x;
       if (tx != null && tx.size() > 0) {
          this.A = this.A + (SystemClock.elapsedRealtime() - this.B);
          this.B = SystemClock.elapsedRealtime();
          Bitmap animFrame = this.getAnimFrame();
          if (animFrame != null && animFrame != this.E) {
             this.setImageBitmap(animFrame);
             this.postInvalidateDelayed(this.y);
             this.E = animFrame;
          }
       }
       super.onDraw(p0);
       return;
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, PendantAnimImageView.class, "4")) {
          return;
       }
       this.x.clear();
       return;
    }
    public void q0(List p0,boolean p1,long p2){
       if (PatchProxy.isSupport(PendantAnimImageView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, PendantAnimImageView.class, "2")) {
          return;
       }
       this.r0(p0, p1, p2, 0);
       return;
    }
    public void r0(List p0,boolean p1,long p2,int p3){
       if (PatchProxy.isSupport(PendantAnimImageView.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), Integer.valueOf(p3), this, PendantAnimImageView.class, "3")) {
          return;
       }
       if (p0 == null || (p0.size() >= 1 && p2 > 0)) {
          this.E = null;
          this.x.clear();
          this.x.addAll(p0);
          this.z = p1;
          this.y = p2;
          this.A = 0;
          this.C = p3;
          this.B = SystemClock.elapsedRealtime();
          this.postInvalidate();
       }
    label_004f :
       return;
    }
    public void setCallback(PendantAnimImageView$a p0){
       this.D = p0;
    }
}
