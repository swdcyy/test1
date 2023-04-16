package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailActivityView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class LiveAudienceTopicDetailActivityView extends LinearLayout	// class@0011eb
{
    public static final int b;

    public void LiveAudienceTopicDetailActivityView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceTopicDetailActivityView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveAudienceTopicDetailActivityView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public static void a(KwaiImageView p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveAudienceTopicDetailActivityView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, LiveAudienceTopicDetailActivityView.class, "5")) {
          return;
       }
       if (p2 > 0 && p1 > 0) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.width = (int)((float)(layoutParams.height * p1) / (float)p2);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
}
