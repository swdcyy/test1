package com.kuaishou.live.core.show.contributorlist.f;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.webview.LiveYodaWebViewFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import android.os.Bundle;
import p62.g;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import uxc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import p62.f;
import uxc.a;

public final class f implements View$OnClickListener	// class@000add
{
    public final LiveContributorListDialogFragment b;

    public void f(LiveContributorListDialogFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveContributorListDialogFragment.class, "13")) {
       }else {
          LiveContributorListDialogFragment e = tb.E;
          if (e != null) {
             e.b();
          }
          e = tb.z;
          if (PatchProxy.applyVoidOneRefs(e, tb, LiveContributorListDialogFragment.class, "21") || (tb.isAdded() && (tb.getFragmentManager() != null && !TextUtils.x(e)))) {
             e uoe = tb.getChildFragmentManager().beginTransaction();
             uoe.z(R.anim.arg_RES_7f010109, 0x7f01004c, R.anim.arg_RES_7f01004a, 0x7f010112);
             LiveYodaWebViewFragment liveYodaWebV = PatchProxy.applyOneRefs(e, tb, LiveContributorListDialogFragment.class, "22");
             if (liveYodaWebV != PatchProxyResult.class) {
             }else {
                GifshowActivity activity = tb.getActivity();
                liveYodaWebV = new LiveYodaWebViewFragment();
                KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity.G3(activity, e);
                KwaiYodaWebViewActivity$c uoc1 = uoc.k(activity.getUrl());
                liveYodaWebV.setArguments(uoc1.e("KEY_THEME", "0").d("KEY_ACTIONBAR_BACKGROUND_COLOR", R.color.arg_RES_7f0620c7).d("ACTIONBAR_TITLE_COLOR", R.color.arg_RES_7f0600a6).c("KEY_ACTIONBAR_TOP_ROUND_DP", 16.00f).a().getExtras());
                liveYodaWebV.kh(new g(liveYodaWebV));
                liveYodaWebV.gh(new f(liveYodaWebV));
             }
             uoe.v(R.id.live_contributor_rule_fragment_container, liveYodaWebV);
             uoe.j("LiveContributorListRuleFragment");
             uoe.m();
          }
       }
    label_00c7 :
       return;
    }
}
