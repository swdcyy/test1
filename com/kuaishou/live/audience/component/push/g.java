package com.kuaishou.live.audience.component.push.g;
import erd.g;
import com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import oq5.b;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment;
import android.view.View;
import v21.d;
import android.view.View$OnClickListener;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.live.audience.component.push.LiveAudiencePushContainerFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public final class g implements g	// class@000bd2
{
    public final LiveAudienceBottomBarPushPresenter b;

    public void g(LiveAudienceBottomBarPushPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveAudienceBottomBarPushPresenter.class, "4")) {
       }else if(tb.q.p1 != null && y.d(tb.getActivity())){
          tb.q.p1.d();
       }
       p0 = new LiveAudiencePushFragment(tb.m8(), tb.q, new d(tb), tb.p);
       View view = tb.q.Z2.b().getView().findViewById(R.id.live_audience_play_bottom_fragment_container);
       if (view.getLayoutParams() != null && view.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
          RelativeLayout$LayoutParams layoutParams = view.getLayoutParams();
          layoutParams.addRule(12);
          view.setLayoutParams(layoutParams);
       }
       tb.t = new LiveAudiencePushContainerFragment(p0, tb.q);
       p0 = tb.q.Z2.b().getChildFragmentManager().beginTransaction();
       p0.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       p0.f(R.id.live_audience_play_bottom_fragment_container, tb.t);
       p0.m();
       return;
    }
}
