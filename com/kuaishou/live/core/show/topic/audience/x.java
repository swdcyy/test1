package com.kuaishou.live.core.show.topic.audience.x;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.topic.audience.x$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import vq5.d;
import java.lang.Long;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import tkd.b;
import tkd.d;
import ym5.a;
import rkd.b;
import java.lang.Math;
import com.kuaishou.live.core.show.topic.audience.x$b;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import ql2.f0;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.show.topic.a;
import com.kwai.robust.PatchProxyResult;
import ql2.n0;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lb2.i;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import ab2.i$b;
import wj2.r0;
import io.reactivex.subjects.PublishSubject;
import ql2.h0;
import vq5.b;

public class x extends f implements g	// class@001223
{
    public LiveDialogContainerFragment K;
    public o0 L;
    public BaseFragment M;
    public i N;
    public LiveBizParam O;
    public a0 P;
    public i$b Q;
    public d R;
    public r0 S;
    public PublishSubject T;
    public final x$c U;
    public static String sLivePresenterClassName = "LiveAudienceTopicPresenter";

    public void x(){
       super();
       this.U = new x$a(this);
    }
    public void Q(boolean p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ox, "4")) {
          return;
       }
       x.E(this.K);
       this.R.Z4("topicdetailpanel");
       return;
    }
    public void a9(long p0,String p1,int p2){
       if (PatchProxy.isSupport(x.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, x.class, "5")) {
          return;
       }
       x tK = this.K;
       if (tK != null && tK.isAdded()) {
          return;
       }
       LiveDialogContainerFragment liveDialogCo = new LiveDialogContainerFragment();
       this.K = liveDialogCo;
       liveDialogCo.Ah(0);
       float f = 0x3f4ccccd;
       int i = (int)((float)n.l(this.getActivity()) * f);
       if (d.a(0x4c5dd1b8).f2() && b.e()) {
          i = (int)((float)Math.min(n.k(this.getActivity()), n.j(this.getActivity())) * f);
       }
       this.K.Bh(-1, i);
       this.K.Dh(new x$b(this, p0, p1));
       this.K.k0(new f0(this));
       this.K.Cb(this.M.getChildFragmentManager(), "LiveTopicChooseFragment");
       a.h(p0, p1, this.P.c.mEntity, p2);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, x.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(x.class, new n0());
       }else {
          obj.put(x.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       super.j8();
       this.M = this.r8("LIVE_FRAGMENT");
       this.P = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.N = this.s8(i.class);
       this.O = this.q8(LiveBizParam.class);
       this.Q = this.q8(i$b.class);
       this.R = this.r8("LIVE_ROUTER_SERVICE");
       this.S = this.q8(r0.class);
       this.T = this.t8("LIVE_SQUARE_REPLACE_PAGE_LIST_PUBLISHER");
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       x.E(this.K);
       return;
    }
    public void x(boolean p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ox, "3")) {
          return;
       }
       this.R.t5("topicdetailpanel", new h0(this));
       return;
    }
}
