package com.yxcorp.gifshow.reminder.friend.relation.FriendsListContainerFragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import crd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cec.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import java.lang.Boolean;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import com.kuaishou.krn.model.LaunchModel$b;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import bec.c;
import lkd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import bec.d;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import bec.e;
import lnc.b9;

public class FriendsListContainerFragment extends LazyInitSupportedFragment	// class@001ae2
{
    public PresenterV2 s;
    public final a t;
    public boolean u;
    public static final int v;

    public void FriendsListContainerFragment(){
       super();
       this.t = new a();
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, FriendsListContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(FriendsListContainerFragment.class, "3");
       return new d();
    }
    public boolean Xg(){
       return false;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendsListContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, this.mh(), p1, false);
    }
    public void fh(View p0,Bundle p1){
       KwaiRnTab kwaiRnTab;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendsListContainerFragment.class, "2")) {
          return;
       }
       FriendsListContainerFragment tu = this.u;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(FriendsListContainerFragment.class)) {
          kwaiRnTab = PatchProxy.applyOneRefs(Boolean.valueOf(tu), null, FriendsListContainerFragment.class, "5");
          if (kwaiRnTab != PatchProxyResult.class) {
          label_0092 :
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.v(R.id.fragment_container, kwaiRnTab);
             uoe.m();
             PresenterV2 presenterV2 = this.B2();
             this.s = presenterV2;
             presenterV2.f(p0);
             Object[] objArray = new Object[i1];
             objArray[i] = this;
             this.s.i(objArray);
             kwaiRnTab.mg(i1);
             kwaiRnTab.ba(new c(this));
             FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
             this.t.c(this.Vg().i().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new d(kwaiRnTab), h.b));
             this.t.c(this.Vg().l().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new e(kwaiRnTab), h.b));
             return;
          }
       }
       LaunchModel$b uob = new LaunchModel$b();
       uob.i("SocialFansFollowList");
       uob.j("FriendsPage");
       String str = "minBundleVersion";
       uob = uob.e("biz", "friends").f("enableBackBtnHandler", i).f("enableManageFriends", b.a(-1578665399).F()).e(str, String.valueOf(83)).e("containerSource", "FriendsListContainerFragment");
       if (tu != null) {
          uob.b("shouldnotReportPV", i1);
          uob.e(str, "136");
       }
       KwaiRnTab kwaiRnTab1 = new KwaiRnTab();
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("rn_launch_model", uob.h());
       kwaiRnTab1.setArguments(uBundle);
       kwaiRnTab = kwaiRnTab1;
       goto label_0092 ;
    }
    public boolean lh(){
       return true;
    }
    public int mh(){
       return 0x7f0d052c;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FriendsListContainerFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.t);
       FriendsListContainerFragment ts = this.s;
       if (ts != null) {
          ts.destroy();
          this.s = null;
       }
       return;
    }
}
