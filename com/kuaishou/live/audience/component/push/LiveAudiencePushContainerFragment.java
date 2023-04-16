package com.kuaishou.live.audience.component.push.LiveAudiencePushContainerFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment;
import t02.a0;
import v21.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import v12.f;
import android.app.Activity;
import va1.i0;
import v21.h;
import android.view.View$OnClickListener;

public class LiveAudiencePushContainerFragment extends RxFragment	// class@000bc5
{
    public LiveAudiencePushFragment c;
    public a0 d;
    public View e;
    public a f;
    public static final int g;

    public void LiveAudiencePushContainerFragment(LiveAudiencePushFragment p0,a0 p1){
       super();
       this.f = new i(this);
       this.c = p0;
       this.d = p1;
    }
    public final void Vg(){
       if (PatchProxy.applyVoid(null, this, LiveAudiencePushContainerFragment.class, "5")) {
          return;
       }
       if (this.isAdded()) {
          e uoe = this.d.Z2.b().getChildFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
          uoe.u(this).m();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushContainerFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.live_bottom_dialog_container_root, this.c);
       uoe.m();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudiencePushContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0a89, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudiencePushContainerFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.getActivity().l3(this.f);
       this.d.L2.Q3(LiveSlidePlayService$DisableSlidePlayFunction.LIVE_AUDIENCE_PUSH, true);
       i0.e(this.getActivity(), this.e);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudiencePushContainerFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.e = p0;
       p0.setOnClickListener(new h(this));
       this.getActivity().F2(this.f);
       this.d.L2.Q3(LiveSlidePlayService$DisableSlidePlayFunction.LIVE_AUDIENCE_PUSH, false);
       i0.b(this.getActivity(), this.e);
       return;
    }
}
