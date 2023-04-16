package com.kuaishou.live.core.show.liveslidesquare.sidebar.widget.LiveSquareFeedCoverImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;
import com.facebook.drawee.view.DraweeView;

public class LiveSquareFeedCoverImageView extends KwaiImageView	// class@000cb1
{
    public float x;
    public static float y = 0.000000;

    public void LiveSquareFeedCoverImageView(Context p0){
       super(p0, null);
    }
    public void LiveSquareFeedCoverImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSquareFeedCoverImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = LiveSquareFeedCoverImageView.y;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveSquareFeedCoverImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveSquareFeedCoverImageView.class, "1")) {
          return;
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec((int)((float)View$MeasureSpec.getSize(p0) / this.x), 0x40000000));
       return;
    }
    public void setCoverViewRatio(float p0){
       this.x = p0;
    }
}
