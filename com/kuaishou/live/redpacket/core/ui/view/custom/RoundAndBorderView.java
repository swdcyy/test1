package com.kuaishou.live.redpacket.core.ui.view.custom.RoundAndBorderView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.j;
import java.lang.Float;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import java.lang.Math;
import lo3.f;

public class RoundAndBorderView extends FrameLayout	// class@000efc
{
    public KwaiImageView b;
    public float c;
    public int d;

    public void RoundAndBorderView(Context p0){
       super(p0, null);
    }
    public void RoundAndBorderView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void RoundAndBorderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = Float.MIN_VALUE;
       a.c(p0, R.layout.arg_RES_7f0d1329, this);
       if (PatchProxy.applyVoid(null, this, RoundAndBorderView.class, "1")) {
       }else {
          this.b = this.findViewById(0x7f0a36ab);
       }
       return;
    }
    public void a(CDNUrl[] p0,int p1){
       if (PatchProxy.isSupport(RoundAndBorderView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RoundAndBorderView.class, "4")) {
          return;
       }
       this.b.setPlaceHolderImage(p1);
       RoundAndBorderView tb = this.b;
       if (!PatchProxy.applyVoidTwoRefs(tb, p0, null, RoundAndBorderView.class, "5") && !j.h(p0)) {
          tb.U(p0);
       }
       return;
    }
    public void b(float p0,int p1){
       if (PatchProxy.isSupport(RoundAndBorderView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, RoundAndBorderView.class, "3")) {
          return;
       }
       if (!p0 - this.c && p1 == this.d) {
          return;
       }
       this.c = p0;
       this.d = p1;
       RoundingParams roundingPara = this.b.getHierarchy().n();
       if (roundingPara == null) {
          roundingPara = new RoundingParams();
       }
       roundingPara.q(true);
       roundingPara.j(p1, Math.max(p0, 0));
       this.b.getHierarchy().L(roundingPara);
       this.invalidate();
       return;
    }
    public void setRoundAndBorderViewInfo(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundAndBorderView.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b(p0.b, p0.a);
       this.a(p0.c, p0.d);
       return;
    }
}
