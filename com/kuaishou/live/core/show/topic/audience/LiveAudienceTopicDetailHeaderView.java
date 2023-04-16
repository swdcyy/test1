package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.String;
import d61.j;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import ql2.s;
import android.view.View$OnClickListener;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import ql2.t;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailActivityView;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailDescriptionView;
import java.lang.Boolean;
import lnc.a1;
import java.lang.CharSequence;

public class LiveAudienceTopicDetailHeaderView extends ConstraintLayout	// class@0011f1
{
    public KwaiImageView B;
    public KwaiImageView C;
    public TextView D;
    public TextView E;
    public View F;
    public SelectShapeTextView G;
    public LiveAudienceTopicDetailRecommendView H;
    public LiveAudienceTopicDetailActivityView I;
    public LiveAudienceTopicDetailDescriptionView J;
    public View$OnClickListener K;
    public View$OnClickListener L;
    public static final String M;

    static {
       LiveAudienceTopicDetailHeaderView.M = j.a("https://static.yximgs.com/udata/pkg/LIVE-CDN/live_topic_detail_header_background.png");
    }
    public void LiveAudienceTopicDetailHeaderView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceTopicDetailHeaderView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceTopicDetailHeaderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicDetailHeaderView.class, "6")) {
       }else {
          a.k(this, R.layout.arg_RES_7f0d0e1e, true);
          this.B = this.findViewById(0x7f0a1a2f);
          this.D = this.findViewById(0x7f0a1a33);
          this.E = this.findViewById(0x7f0a1a34);
          View view = this.findViewById(R.id.live_audience_topic_detail_header_join_button);
          this.F = view;
          view.setOnClickListener(new s(this));
          SelectShapeTextView selectShapeT = this.findViewById(R.id.live_audience_topic_detail_header_follow_button);
          this.G = selectShapeT;
          selectShapeT.setOnClickListener(new t(this));
          this.H = this.findViewById(0x7f0a1a38);
          this.C = this.findViewById(0x7f0a1a2c);
          this.I = this.findViewById(0x7f0a1a25);
          this.J = this.findViewById(0x7f0a1a26);
       }
       return;
    }
    public void L(boolean p0){
       if (PatchProxy.isSupport(LiveAudienceTopicDetailHeaderView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAudienceTopicDetailHeaderView.class, "2")) {
          return;
       }
       this.G.setSelected(p0);
       LiveAudienceTopicDetailHeaderView tG = this.G;
       String str = (p0)? a1.p(R.string.arg_RES_7f101034): a1.p(R.string.arg_RES_7f100f8f);
       tG.setText(str);
       return;
    }
}
