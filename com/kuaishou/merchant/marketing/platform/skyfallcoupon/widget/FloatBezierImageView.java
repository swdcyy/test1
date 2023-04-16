package com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.FloatBezierImageView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.PointF;

public class FloatBezierImageView extends MerchantKwaiImageView	// class@001b62
{
    public int Q;
    public PointF R;
    public PointF S;
    public PointF T;

    public void FloatBezierImageView(Context p0){
       super(p0);
       this.Q = 2000;
    }
    public void FloatBezierImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.Q = 2000;
    }
    public void FloatBezierImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.Q = 2000;
    }
    public void setDuration(int p0){
       this.Q = p0;
    }
    public void setTerminalPointF(PointF p0){
       this.T = p0;
    }
}
