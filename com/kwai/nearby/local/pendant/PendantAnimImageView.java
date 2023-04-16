package com.kwai.nearby.local.pendant.PendantAnimImageView;
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
import com.kwai.nearby.local.pendant.PendantAnimImageView$a;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.widget.ImageView;

public class PendantAnimImageView extends KwaiImageView	// class@000f9f
{
    public long A;
    public long B;
    public int C;
    public PendantAnimImageView$a D;
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
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantAnimImageView.class, "7")) {
          return;
       }
       PendantAnimImageView tx = this.x;
       if (tx != null && tx.size() > 0) {
          this.A = this.A + (SystemClock.elapsedRealtime() - this.B);
          this.B = SystemClock.elapsedRealtime();
          Bitmap animFrame = this.getAnimFrame();
          if (animFrame != null) {
             this.setImageBitmap(animFrame);
             this.postInvalidateDelayed(this.y);
          }
       }
       super.onDraw(p0);
       return;
    }
    public void setCallback(PendantAnimImageView$a p0){
       this.D = p0;
    }
}
