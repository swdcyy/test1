package com.yxcorp.gifshow.widget.FrameAnimImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.widget.FrameAnimImageView$AnimState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.util.ArrayList;
import android.graphics.Canvas;
import java.util.List;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import com.yxcorp.utility.Log;
import android.os.SystemClock;
import com.yxcorp.gifshow.widget.FrameAnimImageView$a;

public class FrameAnimImageView extends KwaiImageView	// class@001852
{
    public long A;
    public long B;
    public long C;
    public int D;
    public FrameAnimImageView$a E;
    public FrameAnimImageView$AnimState F;
    public List x;
    public long y;
    public boolean z;

    public void FrameAnimImageView(Context p0){
       super(p0, null);
    }
    public void FrameAnimImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FrameAnimImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.F = FrameAnimImageView$AnimState.END;
       if (PatchProxy.applyVoid(null, this, FrameAnimImageView.class, "1")) {
       }else {
          this.setWillNotDraw(false);
          this.x = new ArrayList();
          this.y = 67;
       }
       return;
    }
    public void onDraw(Canvas p0){
       Bitmap uBitmap;
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAnimImageView.class, "6")) {
          return;
       }
       FrameAnimImageView$AnimState eND = FrameAnimImageView$AnimState.END;
       if (this.F == eND) {
          super.onDraw(p0);
          return;
       }else {
          FrameAnimImageView tx = this.x;
          if (tx != null && tx.size() > 0) {
             FrameAnimImageView tA = this.A;
             if (PatchProxy.isSupport(FrameAnimImageView.class)) {
                uBitmap = PatchProxy.applyOneRefs(Long.valueOf(tA), this, FrameAnimImageView.class, "5");
                if (uBitmap != PatchProxyResult.class) {
                }else {
                label_003d :
                   tx = this.x;
                   if (tx != null && !tx.isEmpty()) {
                      int i = (int)(tA / this.y);
                      tA = this.D;
                      if (tA > null) {
                         if ((tA * this.x.size()) > i) {
                            i = i % this.x.size();
                         }else {
                            i = this.x.size() - 1;
                            this.p0(FrameAnimImageView$AnimState.LOOP_END, this.A);
                         }
                      }else if(this.z != null){
                         i = i % this.x.size();
                      }else if(i > (this.x.size() - 1)){
                         i = this.x.size() - 1;
                         Log.g("FrameAnimImageView", "stopFrame by frameIndex == mAnimFrames.size\(\)-1");
                         this.p0(eND, this.A);
                      }
                      if (i >= 0 && i < this.x.size()) {
                         uBitmap = this.x.get(i);
                      }
                   }
                label_00b1 :
                   uBitmap = null;
                }
             }else {
                goto label_003d ;
             }
             if (this.F == FrameAnimImageView$AnimState.PAUSE && uBitmap != null) {
                this.setImageBitmap(uBitmap);
                super.onDraw(p0);
                return;
             }else {
                this.A = this.A + (SystemClock.elapsedRealtime() - this.B);
                this.B = SystemClock.elapsedRealtime();
                if (uBitmap != null) {
                   this.setImageBitmap(uBitmap);
                   this.postInvalidateDelayed(this.y);
                }
             }
          }
       label_00dd :
          super.onDraw(p0);
          return;
       }
    }
    public final void p0(FrameAnimImageView$AnimState p0,long p1){
       if (PatchProxy.isSupport(FrameAnimImageView.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, FrameAnimImageView.class, "12")) {
          return;
       }
       this.F = p0;
       FrameAnimImageView tE = this.E;
       if (tE != null) {
          tE.a(p0, p1);
       }
       return;
    }
    public void setFrameStateChangeListener(FrameAnimImageView$a p0){
       this.E = p0;
    }
}
