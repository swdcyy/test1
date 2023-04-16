package com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rk2.n;
import rk2.i;
import rk2.j;
import rk2.k;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.g;
import androidx.fragment.app.DialogFragment;
import pk2.c;
import pk2.b;
import brd.t;
import cjd.e;
import erd.o;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import rk2.m;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment$a;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.plugin.live.widget.LiveNumberTextView;
import android.widget.Button;
import rk2.g;
import android.view.View$OnClickListener;
import rk2.h;
import rk2.c;
import rk2.f;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import rk2.e;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import lnc.a1;
import e17.i;
import com.yxcorp.gifshow.entity.QPhoto;
import zk2.p;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import com.kuaishou.live.core.show.subscribe.dosubscribe.a;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment$c;
import rk2.l;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment$b;
import java.lang.StringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class LiveSubscribeFragment extends BaseFragment implements d	// class@0010dd
{
    public HashMap j;
    public long k;
    public LinearLayout l;
    public LinearLayout m;
    public KwaiImageView n;
    public TextView o;
    public LiveNumberTextView p;
    public TextView q;
    public Button r;
    public LiveSubscribeStatInfo s;
    public QPhoto t;
    public String u;
    public String v;
    public final n w;
    public static final int x;

    public void LiveSubscribeFragment(){
       super();
       this.w = new n(new i(this), new j(this), new k(this));
    }
    public int M(){
       return 1;
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribeFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.b();
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeFragment.class, "17")) {
          return;
       }
       if (!g.h(this.getActivity()) && this.getParentFragment() instanceof DialogFragment) {
          this.getParentFragment().dismissAllowingStateLoss();
       }
       return;
    }
    public final void dh(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeFragment.class, "9")) {
          return;
       }
       b.b().a(this.v).map(new e()).compose(this.ge()).subscribe(new m(this), new LiveSubscribeFragment$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeFragment.class, "2")) {
          return;
       }
       this.l = m1.f(p0, 0x7f0a2908);
       this.m = m1.f(p0, 0x7f0a260c);
       this.n = m1.f(p0, 0x7f0a260b);
       this.o = m1.f(p0, 0x7f0a260d);
       this.p = m1.f(p0, 0x7f0a260f);
       this.q = m1.f(p0, 0x7f0a2664);
       this.r = m1.f(p0, 0x7f0a2619);
       m1.a(p0, new g(this), R.id.live_subscribe_anchor_avatar_view);
       m1.a(p0, new h(this), R.id.live_subscribe_button);
       m1.a(p0, new c(this), R.id.retry_btn);
       m1.a(p0, new f(this), R.id.live_subscribe_close);
       return;
    }
    public final boolean eh(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribeFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.u, "24");
    }
    public final void fh(boolean p0){
       if (PatchProxy.isSupport(LiveSubscribeFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSubscribeFragment.class, "8")) {
          return;
       }
       long l = (p0)? 500: 0;
       k1.s(new e(this), this, l);
       return;
    }
    public void gh(boolean p0){
       if (PatchProxy.isSupport(LiveSubscribeFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSubscribeFragment.class, "6")) {
          return;
       }
       if (p0) {
          this.r.setEnabled(false);
       }else {
          this.r.setEnabled(true);
       }
       return;
    }
    public void hh(boolean p0){
       if (PatchProxy.isSupport(LiveSubscribeFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSubscribeFragment.class, "10")) {
          return;
       }
       LiveSubscribeFragment tl = this.l;
       int i = 8;
       int i1 = (p0)? 8: 0;
       tl.setVisibility(i1);
       tl = this.m;
       if (p0) {
          i = 0;
       }
       tl.setVisibility(i);
       return;
    }
    public final void ih(int p0){
       if (PatchProxy.isSupport(LiveSubscribeFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSubscribeFragment.class, "12")) {
          return;
       }
       i.f(R.style.arg_RES_7f11066a, a1.p(p0), true);
       return;
    }
    public final void jh(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeFragment.class, "14")) {
          return;
       }
       this.gh(true);
       LiveSubscribeStatInfo$LiveSubscribeStat mSubscribeId = this.s.mLiveSubscribeStat.mSubscribeId;
       a uoa = new a(this, mSubscribeId);
       b.b().b(mSubscribeId, p.a(this.t, this.u)).map(new e()).compose(this.ge()).subscribe(uoa, new LiveSubscribeFragment$c(this));
       return;
    }
    public final void kh(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeFragment.class, "13")) {
          return;
       }
       this.gh(true);
       b.b().y0(this.s.mLiveSubscribeStat.mSubscribeId).map(new e()).compose(this.ge()).subscribe(new l(this), new LiveSubscribeFragment$b(this));
       return;
    }
    public final void lh(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeFragment.class, "7")) {
          return;
       }
       LiveSubscribeStatInfo mLiveSubscri = this.s.mLiveSubscribeStat;
       LiveSubscribeStatInfo$LiveSubscribeStat mRawTotalCou = mLiveSubscri.mRawTotalCount;
       long l = 0;
       if (mRawTotalCou - l < 0) {
          mLiveSubscri.mRawTotalCount = l;
          mRawTotalCou = l;
       }
       this.q.setText(a1.p(R.string.arg_RES_7f102bbe)+TextUtils.N(mRawTotalCou));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSubscribeFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0def, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeFragment.class, "16")) {
          return;
       }
       k1.n(this);
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSubscribeFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       if (this.getArguments() != null) {
          this.v = this.getArguments().getString("LIVE_SUBSCRIBE_RESERVATION_ID", "");
          this.t = SerializableHook.getSerializable(this.getArguments(), "LIVE_SUBSCRIBE_Q_PHOTO");
          this.u = this.getArguments().getString("LIVE_SUBSCRIBE_SOURCE", "");
          this.dh();
       }
       return;
    }
}
