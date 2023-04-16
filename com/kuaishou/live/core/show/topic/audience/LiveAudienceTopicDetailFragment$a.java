package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import java.util.Objects;
import pq3.d;
import lnc.a1;
import android.view.ViewOutlineProvider;

public class LiveAudienceTopicDetailFragment$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0011ed
{
    public final View b;
    public final LiveAudienceTopicDetailFragment c;

    public void LiveAudienceTopicDetailFragment$a(LiveAudienceTopicDetailFragment p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicDetailFragment$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       LiveAudienceTopicDetailFragment$a tc = this.c;
       LiveAudienceTopicDetailFragment$a tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, LiveAudienceTopicDetailFragment.class, "11")) {
          tb.setClipToOutline(true);
          d uod = new d((float)a1.d(0x7f070421), 0, 0, tb.getWidth(), (tb.getHeight() + a1.d(0x7f070421)));
          tb.setOutlineProvider(tc);
       }
       return;
    }
}
