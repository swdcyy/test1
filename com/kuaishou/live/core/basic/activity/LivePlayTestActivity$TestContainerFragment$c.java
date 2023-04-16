package com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment$c;
import erd.g;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.QLiveLaunchInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import tkd.b;
import tkd.d;
import os5.m;
import pw6.d;
import android.os.Bundle;
import dw6.b;
import qrd.l1;
import com.kuaishou.live.lite.LiveLiteParam$b;
import com.kuaishou.live.lite.LiveLiteParam;

public final class LivePlayTestActivity$TestContainerFragment$c implements g	// class@00181c
{
    public final LivePlayTestActivity$TestContainerFragment b;
    public final int c;

    public void LivePlayTestActivity$TestContainerFragment$c(LivePlayTestActivity$TestContainerFragment p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Fragment uFragment;
       Bundle uBundle;
       QLiveLaunchInfo mLiveStream;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTestActivity$TestContainerFragment$c.class, "1")) {
       }else {
          LivePlayTestActivity$TestContainerFragment$c tc = this.c;
          String str = "item.asFragment\(\)";
          String str1 = -1433048163;
          int i = 1;
          String str2 = "rsp.mLiveStream";
          if (tc != i) {
             if (tc != 2) {
                if (tc == 3) {
                   tc = this.b;
                   p0 = p0.mLiveStream;
                   a.o(p0, str2);
                   Objects.requireNonNull(tc);
                   if (!PatchProxy.applyVoidOneRefs(p0, tc, LivePlayTestActivity$TestContainerFragment.class, "11")) {
                      p0 = LivePlayFragment.Mh(tc.dh(p0));
                      e uoe = tc.getChildFragmentManager().beginTransaction();
                      uoe.f(R.id.live_play_test_container, p0);
                      uoe.o();
                      tc.j = p0;
                   }
                }
             }else {
                tc = this.b;
                p0 = p0.mLiveStream;
                a.o(p0, str2);
                Objects.requireNonNull(tc);
                if (!PatchProxy.applyVoidOneRefs(p0, tc, LivePlayTestActivity$TestContainerFragment.class, "10")) {
                   d uod = d.a(str1).Qn(i);
                   a.o(uod, "PluginManager.get\(LivePr¡­ivePreviewPage.PAGE_NASA\)");
                   uFragment = uod.g0();
                   a.o(uFragment, str);
                   uBundle = new Bundle();
                   b.j(uBundle).h(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY, tc.dh(p0));
                   uFragment.setArguments(uBundle);
                   tc.gh(uod);
                }
             }
          }else {
             tc = this.b;
             mLiveStream = p0.mLiveStream;
             a.o(mLiveStream, str2);
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoidOneRefs(mLiveStream, tc, LivePlayTestActivity$TestContainerFragment.class, "9")) {
                p0 = d.a(str1).h0();
                a.o(p0, "PluginManager.get\(LivePr¡­     .buildLiteFragment\(\)");
                LiveLiteParam$b uob = new LiveLiteParam$b(mLiveStream, 1, "FEATURED_PAGE", 9, 0, 7, "");
                uFragment = p0.g0();
                a.o(uFragment, str);
                uBundle = new Bundle();
                b.j(uBundle).h("LIVE_LITE_PARAM", str1.a());
                uFragment.setArguments(uBundle);
                tc.gh(p0);
             }
          }
       }
       return;
    }
}
