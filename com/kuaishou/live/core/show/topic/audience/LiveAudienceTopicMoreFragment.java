package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicMoreFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gka.c;
import android.view.View;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicMoreFragment$a;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ql2.o0;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicMoreFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import y8c.g;
import ql2.z;
import qvb.i;
import ql2.a0;

public class LiveAudienceTopicMoreFragment extends RecyclerFragment implements d	// class@0011f7
{
    public o0 F;

    public void LiveAudienceTopicMoreFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicMoreFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this, 3);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopicMoreFragment.class, "3")) {
          return;
       }
       m1.b(p0, new LiveAudienceTopicMoreFragment$a(this), R.id.live_audience_topic_more_fragment_back_button);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0e1f;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceTopicMoreFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAudienceTopicMoreFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopicMoreFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = o0.p0(this);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceTopicMoreFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicMoreFragment.class, "7")) {
          return;
       }
       super.th();
       this.h0().addOnScrollListener(new LiveAudienceTopicMoreFragment$b(this));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicMoreFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new z();
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicMoreFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a0();
    }
}
