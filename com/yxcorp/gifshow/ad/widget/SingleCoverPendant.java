package com.yxcorp.gifshow.ad.widget.SingleCoverPendant;
import com.yxcorp.gifshow.ad.widget.FloatRootView;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import android.widget.ImageView;
import android.view.View;
import android.widget.FrameLayout;

public class SingleCoverPendant extends FloatRootView	// class@001924
{
    public KwaiImageView x;

    public void SingleCoverPendant(Context p0){
       super(p0, null);
    }
    public void SingleCoverPendant(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SingleCoverPendant(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       KwaiImageView kwaiImageVie = new KwaiImageView(p0);
       this.x = kwaiImageVie;
       kwaiImageVie.setMaxHeight(a1.e(150.00f));
       this.x.setMaxWidth(a1.e(150.00f));
       this.addView(this.x, -1, -1);
    }
}
