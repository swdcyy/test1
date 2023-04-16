package com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout;
import androidx.cardview.widget.CardView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout$ScaleType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Float;

public final class PlayerViewCropLayout extends CardView	// class@000920
{
    public int k;
    public int l;
    public float m;
    public PlayerViewCropLayout$ScaleType n;

    public void PlayerViewCropLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void PlayerViewCropLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void PlayerViewCropLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.n = PlayerViewCropLayout$ScaleType.UNKNOWN;
    }
    public void PlayerViewCropLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final float getAspectRatio(){
       return this.m;
    }
    public final int getExtraHeight(){
       return this.k;
    }
    public final int getExtraWidth(){
       return this.l;
    }
    public final PlayerViewCropLayout$ScaleType getScaleType(){
       return this.n;
    }
    public void onMeasure(int p0,int p1){
       ViewGroup$LayoutParams obj;
       int i;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PlayerViewCropLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PlayerViewCropLayout.class, "7")) {
          return;
       }
       if (this.m - null) {
          int mode = View$MeasureSpec.getMode(p0);
          String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
          if (PatchProxy.isSupport(PlayerViewCropLayout.class)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PlayerViewCropLayout.class, "5");
             if (obj != patchProxyRe) {
                i = obj.intValue();
             label_0061 :
                int mode1 = View$MeasureSpec.getMode(p1);
                if (PatchProxy.isSupport(PlayerViewCropLayout.class)) {
                   PlayerViewCropLayout obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, PlayerViewCropLayout.class, "6");
                   if (obj1 != patchProxyRe) {
                      i1 = obj1.intValue();
                   label_0098 :
                      if (mode == 0x40000000 || mode == Integer.MIN_VALUE) {
                         mode = (int)((float)i / this.m);
                         obj1 = this.n;
                         if (obj1 != PlayerViewCropLayout$ScaleType.NONE && (obj1 != PlayerViewCropLayout$ScaleType.CENTER_INSIDE || (mode <= i1 || (obj1 == PlayerViewCropLayout$ScaleType.CENTER_CROP && mode >= i1)))) {
                            super.onMeasure(View$MeasureSpec.makeMeasureSpec(i, 0x40000000), View$MeasureSpec.makeMeasureSpec(mode, 0x40000000));
                            return;
                         }
                      }
                      if (mode1 == 0x40000000) {
                         mode = (int)((float)i1 * this.m);
                         PlayerViewCropLayout tn = this.n;
                         if (tn != PlayerViewCropLayout$ScaleType.NONE && (tn != PlayerViewCropLayout$ScaleType.CENTER_INSIDE || (mode <= i || (tn == PlayerViewCropLayout$ScaleType.CENTER_CROP && mode >= i)))) {
                            super.onMeasure(View$MeasureSpec.makeMeasureSpec(mode, 0x40000000), View$MeasureSpec.makeMeasureSpec(i1, 0x40000000));
                            return;
                         }
                      }
                   }
                }
                ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
                Objects.requireNonNull(layoutParams, str);
                i1 = layoutParams.bottomMargin + ((View$MeasureSpec.getSize(p1) + this.k) + layoutParams.topMargin);
                goto label_0098 ;
             }
          }
          obj = this.getLayoutParams();
          Objects.requireNonNull(obj, str);
          i = obj.getMarginEnd() + ((View$MeasureSpec.getSize(p0) + this.l) + obj.getMarginStart());
          goto label_0061 ;
       }
    label_00ea :
       super.onMeasure(p0, p1);
       return;
    }
    public final void setAspectRatio(float p0){
       if (PatchProxy.isSupport(PlayerViewCropLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PlayerViewCropLayout.class, "3")) {
          return;
       }
       if (this.m - p0) {
          this.m = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public final void setExtraHeight(int p0){
       if (PatchProxy.isSupport(PlayerViewCropLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlayerViewCropLayout.class, "1")) {
          return;
       }
       if (this.k != p0) {
          this.k = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public final void setExtraWidth(int p0){
       if (PatchProxy.isSupport(PlayerViewCropLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlayerViewCropLayout.class, "2")) {
          return;
       }
       if (this.l != p0) {
          this.l = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public final void setScaleType(PlayerViewCropLayout$ScaleType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerViewCropLayout.class, "4")) {
          return;
       }
       a.p(p0, "value");
       if (this.n != p0) {
          this.n = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
}
