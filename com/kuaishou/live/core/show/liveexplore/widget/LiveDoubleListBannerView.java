package com.kuaishou.live.core.show.liveexplore.widget.LiveDoubleListBannerView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public class LiveDoubleListBannerView extends RelativeLayout	// class@000c7b
{
    public KwaiImageView b;
    public KwaiImageView c;
    public float d;

    public void LiveDoubleListBannerView(Context p0){
       super(p0, null);
    }
    public void LiveDoubleListBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveDoubleListBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 0x3f800000;
       if (PatchProxy.applyVoid(null, this, LiveDoubleListBannerView.class, "2")) {
       }else {
          a.k(this, R.layout.arg_RES_7f0d0ae4, true);
          this.b = m1.f(this, 0x7f0a1c08);
          this.c = m1.f(this, 0x7f0a1c09);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveDoubleListBannerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveDoubleListBannerView.class, "1")) {
          return;
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec((int)((float)View$MeasureSpec.getSize(p0) / this.d), 0x40000000));
       return;
    }
    public void setAspectRatio(float p0){
       this.d = p0;
    }
}
