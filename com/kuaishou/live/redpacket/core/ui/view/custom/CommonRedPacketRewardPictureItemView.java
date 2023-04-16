package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketRewardPictureItemView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketTagLabel;
import android.graphics.drawable.GradientDrawable;
import po3.h;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class CommonRedPacketRewardPictureItemView extends FrameLayout	// class@000ef8
{
    public KwaiImageView b;
    public CommonRedPacketTagLabel c;
    public int d;
    public float e;
    public float f;
    public d g;
    public int h;

    public void CommonRedPacketRewardPictureItemView(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketRewardPictureItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketRewardPictureItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = Integer.MIN_VALUE;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonRedPacketRewardPictureItemView.class, "1")) {
       }else {
          this.d = a1.a(0x7f061d17);
          this.e = 0.20f;
          this.f = (float)a1.d(0x7f070d9c);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketRewardPictureItemView.class, "2")) {
          a.c(p0, R.layout.arg_RES_7f0d020e, this);
          this.b = this.findViewById(0x7f0a3514);
          this.c = this.findViewById(0x7f0a3515);
          int[] ointArray = new int[]{this.d};
          p2 = 0;
          GradientDrawable gradientDraw = h.b(ointArray, p2, p2, this.f);
          if (gradientDraw != null) {
             gradientDraw.setAlpha((int)(this.e * 100.00f));
          }
          this.setBackground(gradientDraw);
       }
       return;
    }
    public void setIconSizePx(int p0){
       if (PatchProxy.isSupport(CommonRedPacketRewardPictureItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommonRedPacketRewardPictureItemView.class, "4")) {
          return;
       }
       if (this.h != p0) {
          this.b.getLayoutParams().width = p0;
          this.b.getLayoutParams().height = p0;
       }
       this.h = p0;
       return;
    }
}
