package com.kuaishou.live.gzone.v2.profile.LiveGzoneAnchorProfileTabFragment;
import i63.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u0.d;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e63.g;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import wj2.r0;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import wj2.r;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ne2.k;
import e63.c;
import ok.x;
import e63.d;
import e63.e;
import android.view.ViewStub;
import com.kuaishou.live.gzone.v2.profile.e;
import com.kuaishou.live.gzone.v2.profile.a;
import tkd.b;
import tkd.d;
import os5.h;
import i63.b;
import y43.a;
import sr5.a;

public class LiveGzoneAnchorProfileTabFragment extends BaseFragment implements c	// class@001cd8
{
    public g j;
    public PresenterV2 k;
    public b l;
    public b m;
    public a n;
    public a0 o;

    public void LiveGzoneAnchorProfileTabFragment(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneAnchorProfileTabFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0.cloneInContext(new d(this.getActivity(), 0x7f110203)), 0x7f0d0b7f, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAnchorProfileTabFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       LiveGzoneAnchorProfileTabFragment tk = this.k;
       if (tk != null) {
          tk.destroy();
          this.k = null;
       }
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAnchorProfileTabFragment.class, "3")) {
          return;
       }
       if (this.k == null && this.getView() != null) {
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, this, LiveGzoneAnchorProfileTabFragment.class, "5")) {
             this.j = new g();
             User user = this.o.c.getUser();
             LiveGzoneProfileParams liveGzonePro = this.o.U.h(f.o(user), LiveStreamClickType.UNKNOWN, 36, null, false, 98);
             liveGzonePro.setShouldHideLoading(i);
             liveGzonePro.setDarkModeEnabled(i);
             liveGzonePro.setGzoneAuthorAuthenticationTagEnable(i);
             liveGzonePro.setProfileTextClickEnabled(i);
             liveGzonePro.setProfileTextCollapsedDefaultLines(3);
             liveGzonePro.setGameLiveStreamNewVersion2Enabled(0);
             liveGzonePro.setTopFollowLayoutInRecyclerViewHeader(i);
             LiveGzoneAnchorProfileTabFragment tj = this.j;
             tj.b = user;
             tj.d = liveGzonePro;
             tj.B = liveGzonePro;
             tj.c = this.getActivity();
             LiveGzoneAnchorProfileTabFragment tj1 = this.j;
             tj1.e = this;
             tj1.s = new k(user.mId, new c(this));
             tj = this.o;
             tj1.w = tj;
             tj1.f = tj.B;
             tj1.l = tj.Z2;
             tj1.g = new d(this);
             this.j.h = new e(this, user);
          }
          View view = this.getView();
          if (!PatchProxy.applyVoidOneRefs(view, this, LiveGzoneAnchorProfileTabFragment.class, "4")) {
             ViewStub viewStub = view.findViewById(R.id.live_gzone_audience_anchor_profile_content_stub);
             if (viewStub != null) {
                viewStub.inflate();
             }
          }
          PresenterV2 presenterV2 = new PresenterV2();
          this.k = presenterV2;
          presenterV2.U7(new e());
          this.k.U7(new a());
          if (this.o.h != null) {
             this.k.U7(d.a(0x2cb5d4a8).h40());
          }
          this.k.f(this.getView());
          Object[] objArray1 = new Object[i];
          objArray1[0] = this.j;
          this.k.i(objArray1);
       }
       return;
    }
    public void zf(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAnchorProfileTabFragment.class, "2")) {
          return;
       }
       this.l = p0;
       this.m = p0.j;
       p0 = p0.l;
       this.n = p0;
       this.o = p0.J.i1(a0.class);
       return;
    }
}
