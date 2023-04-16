package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailDescriptionView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;

public class LiveAudienceTopicDetailDescriptionView extends LinearLayout	// class@0011ec
{
    public ExpandEmojiTextView b;

    public void LiveAudienceTopicDetailDescriptionView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceTopicDetailDescriptionView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceTopicDetailDescriptionView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicDetailDescriptionView.class, "2")) {
       }else {
          this.setOrientation(1);
          a.k(this, R.layout.arg_RES_7f0d0e1d, 1);
          this.b = this.findViewById(0x7f0a26dd);
       }
       return;
    }
}
