package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicMoreFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicMoreFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;

public class LiveAudienceTopicMoreFragment$a extends m	// class@0011f5
{
    public final LiveAudienceTopicMoreFragment c;

    public void LiveAudienceTopicMoreFragment$a(LiveAudienceTopicMoreFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopicMoreFragment$a.class, "1")) {
          return;
       }
       LiveAudienceTopicMoreFragment$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LiveAudienceTopicMoreFragment.class, "9") && (tc.getParentFragment() != null && tc.getParentFragment().isAdded())) {
          tc.getParentFragment().getChildFragmentManager().popBackStack();
       }
    label_0037 :
       return;
    }
}
