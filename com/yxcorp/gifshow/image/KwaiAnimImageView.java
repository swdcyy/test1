package com.yxcorp.gifshow.image.KwaiAnimImageView;
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
import java.lang.Math;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.widget.ImageView;

public class KwaiAnimImageView extends KwaiImageView	// class@001941
{
    public long A;
    public long B;
    public List x;
    public long y;
    public boolean z;

    public void KwaiAnimImageView(Context p0){
       super(p0, null);
    }
    public void KwaiAnimImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiAnimImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, KwaiAnimImageView.class, "1")) {
       }else {
          this.x = new ArrayList();
          this.y = 50;
       }
       return;
    }
    public final Bitmap getAnimFrame(){
       Object[] objArray = null;
       KwaiAnimImageView obj = PatchProxy.apply(objArray, this, KwaiAnimImageView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj != null && !obj.isEmpty()) {
          int i = (int)(this.A / this.y);
          i = (this.z != null)? i % this.x.size(): Math.min(i, (this.x.size() - 1));
          if (i >= 0 && i < this.x.size()) {
             return this.x.get(i);
          }
       }
    label_004d :
       return objArray;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiAnimImageView.class, "5")) {
          return;
       }
       KwaiAnimImageView tx = this.x;
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
}
