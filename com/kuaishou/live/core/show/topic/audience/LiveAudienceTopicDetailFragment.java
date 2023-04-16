package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.topic.audience.n;
import com.kuaishou.live.core.show.topic.audience.u;
import ql2.v;
import y8c.t;
import ql2.x;
import android.view.View;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment$b;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ql2.o0;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.view.ViewTreeObserver;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment$c;
import androidx.recyclerview.widget.RecyclerView$n;
import java.lang.Boolean;
import qvb.i;
import ql2.u;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.lifecycle.MutableLiveData;
import y8c.g;
import ql2.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class LiveAudienceTopicDetailFragment extends RecyclerFragment implements d	// class@0011f0
{
    public o0 F;

    public void LiveAudienceTopicDetailFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveAudienceTopicDetailFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new n());
       obj.U7(new u());
       obj.U7(new v());
       PatchProxy.onMethodExit(LiveAudienceTopicDetailFragment.class, "10");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicDetailFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new x(this, 3);
    }
    public boolean S1(){
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopicDetailFragment.class, "3")) {
          return;
       }
       m1.b(p0, new LiveAudienceTopicDetailFragment$b(this), R.id.live_audience_topic_detail_more_text_view);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0e1b;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceTopicDetailFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAudienceTopicDetailFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopicDetailFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = o0.p0(this);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceTopicDetailFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       p0.getViewTreeObserver().addOnGlobalLayoutListener(new LiveAudienceTopicDetailFragment$a(this, p0));
       this.ia().R0(this.h0());
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicDetailFragment.class, "9")) {
          return;
       }
       super.th();
       this.h0().addItemDecoration(new LiveAudienceTopicDetailFragment$c(this));
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceTopicDetailFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveAudienceTopicDetailFragment.class, "6")) {
          return;
       }
       super.v2(p0, p1);
       if (!p0) {
          return;
       }
       LiveTopicHeaderInfo liveTopicHea = this.q().h2();
       if (liveTopicHea != null && !TextUtils.x(liveTopicHea.mTopicName)) {
          this.F.d.setValue(liveTopicHea.mTopicName);
          p1.c = liveTopicHea.mTopicId;
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicDetailFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicDetailFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NpaGridLayoutManager(this.getContext(), 3);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicDetailFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new u(r1.n1(this.F.a), this.F.c);
    }
}
