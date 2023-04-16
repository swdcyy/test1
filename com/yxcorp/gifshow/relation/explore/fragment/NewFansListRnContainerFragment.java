package com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import crd.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.relation.rn.NoticeParams;
import nsd.u;
import android.net.Uri;
import pbc.b;
import com.kuaishou.krn.model.LaunchModel$b;
import java.util.Set;
import ekd.x0;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Parcelable;
import qrd.l1;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.s;
import com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment$a;
import lkd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment$b;
import com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment$c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment$d;
import com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment$e;
import lnc.b9;

public final class NewFansListRnContainerFragment extends LazyInitSupportedFragment	// class@00180c
{
    public PresenterV2 s;
    public final a t;

    public void NewFansListRnContainerFragment(){
       super();
       this.t = new a();
    }
    public int M(){
       return 1;
    }
    public boolean Xg(){
       return false;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NewFansListRnContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d109c, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­ist_rn, container, false\)");
       return view;
    }
    public void fh(View p0,Bundle p1){
       PresenterV2 presenterV2 = this;
       Object[] obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, presenterV2, NewFansListRnContainerFragment.class, "2")) {
          return;
       }
       a.p(obj, "view");
       Object[] objArray = null;
       KwaiRnTab kwaiRnTab = PatchProxy.apply(objArray, presenterV2, NewFansListRnContainerFragment.class, "3");
       int i = 0;
       int i1 = 1;
       if (kwaiRnTab != patchProxyRe) {
       }else {
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             Intent intent = activity.getIntent();
             if (intent != null) {
                Serializable serializable = SerializableHook.getSerializableExtra(intent, "keyKrnArgs");
                if (serializable != null) {
                   if (!serializable instanceof NoticeParams) {
                      serializable = objArray;
                   }
                   if (serializable != null) {
                   label_005a :
                      serializable.isInTab = i1;
                      Uri uri = b.a(serializable);
                      LaunchModel$b uob = new LaunchModel$b();
                      Set set = x0.c(uri);
                      if (set == null) {
                         set = new LinkedHashSet();
                      }
                      Iterator iterator = set.iterator();
                      while (iterator.hasNext()) {
                         String str = iterator.next();
                         String str1 = x0.a(uri, str);
                         if (TextUtils.n(str, "bundleId")) {
                            uob.i(str1);
                         }else if(TextUtils.n(str, "componentName")){
                            uob.j(str1);
                         }else {
                            uob.e(str, str1);
                         }
                      }
                      uob.f("enableBackBtnHandler", i);
                      uob.e("containerSource", "NewFansListRnContainerFragment");
                      uob.b("shouldnotReportPV", i1);
                      kwaiRnTab = new KwaiRnTab();
                      Bundle uBundle = new Bundle();
                      uBundle.putParcelable("rn_launch_model", uob.h());
                      kwaiRnTab.setArguments(uBundle);
                   }
                }
             }
          }
          NoticeParams noticeParams = new NoticeParams("FollowNotice", false, false, 0, null, null, null, null, 254, null);
          goto label_005a ;
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, kwaiRnTab);
       uoe.m();
       s os = PatchProxy.applyWithListener(objArray, presenterV2, NewFansListRnContainerFragment.class, "4");
       if (os != patchProxyRe) {
       }else {
          os = new s();
          PatchProxy.onMethodExit(NewFansListRnContainerFragment.class, "4");
       }
       os.f(obj);
       obj = new Object[i1];
       obj[i] = presenterV2;
       os.i(obj);
       presenterV2.s = os;
       kwaiRnTab.mg(i1);
       kwaiRnTab.ba(new NewFansListRnContainerFragment$a(presenterV2));
       FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
       presenterV2.t.c(this.Vg().i().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new NewFansListRnContainerFragment$b(kwaiRnTab), NewFansListRnContainerFragment$c.b));
       presenterV2.t.c(this.Vg().l().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new NewFansListRnContainerFragment$d(kwaiRnTab), NewFansListRnContainerFragment$e.b));
       return;
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       return "FOLLOW_MESSAGE_AGGR";
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, NewFansListRnContainerFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.t);
       NewFansListRnContainerFragment ts = this.s;
       if (ts != null) {
          ts.destroy();
       }
       this.s = null;
       return;
    }
}
