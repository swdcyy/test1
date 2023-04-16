package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashSet;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$e;
import tk2.s;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import ok.x;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import tk2.e;
import com.kuaishou.live.core.show.subscribe.edit.detail.e;
import tk2.p;
import tk2.q;
import java.lang.String;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d61.k;
import android.graphics.drawable.ColorDrawable;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.Runnable;
import tk2.r;
import com.kuaishou.live.core.show.subscribe.edit.detail.e$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import wk2.s;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams$DisplayMode;
import java.lang.Long;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import lnc.a1;
import java.lang.CharSequence;
import va1.l0;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import com.yxcorp.utility.TextUtils;
import tk2.o;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.util.List;
import java.util.Set;
import android.view.View;
import vk2.b;
import tk2.k;
import tk2.m;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeBannedInfo;
import tk2.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import java.util.Objects;
import crd.a;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import qk2.o;
import brd.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.subscribe.edit.detail.g;
import erd.g;
import crd.b;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$n;
import tk2.l;
import com.kuaishou.live.core.show.subscribe.edit.detail.h;
import android.widget.ImageView;
import tk2.f;

public class LiveSubscribeDetailFragment extends BaseFragment	// class@001101
{
    public SubscribeDialogParams j;
    public LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail k;
    public e l;
    public x m;
    public x n;
    public e o;
    public boolean p;
    public boolean q;
    public final Set r;
    public LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo s;
    public View t;
    public View u;
    public TextView v;
    public View w;
    public TextView x;
    public final LiveSubscribeDetailFragment$e y;
    public CountDownTimer z;
    public static final int A;

    public void LiveSubscribeDetailFragment(){
       super();
       this.p = false;
       this.q = false;
       this.r = new HashSet();
       this.y = new LiveSubscribeDetailFragment$e(this, null);
    }
    public void LiveSubscribeDetailFragment(SubscribeDialogParams p0,x p1,x p2,LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail p3,e p4){
       super();
       this.p = false;
       this.q = false;
       this.r = new HashSet();
       this.y = new LiveSubscribeDetailFragment$e(this, null);
       this.m = p1;
       this.n = p2;
       this.k = p3;
       this.l = p4;
       this.j = p0;
       this.o = new e(new p(this), new q(this), p1, p2);
    }
    public Drawable ch(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSubscribeDetailFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ColorDrawable(k.b(p0));
    }
    public void dh(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSubscribeDetailFragment.class, "24")) {
          return;
       }
       this.o.d(p0.mSubscribeId, new r(this, p1));
       s.x("DELETE", p0, this.m.get(), this.j.b);
       return;
    }
    public void eh(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "25")) {
          return;
       }
       this.l.h(p0);
       s.x("UNION_BUTTON", p0, this.m.get(), this.j.b);
       return;
    }
    public final boolean fh(){
       boolean b = (this.j.b == 24)? true: false;
       return b;
    }
    public final void g1(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeDetailFragment.class, "17")) {
          return;
       }
       LiveSubscribeDetailFragment tz = this.z;
       if (tz != null) {
          tz.cancel();
       }
       return;
    }
    public boolean gh(){
       boolean b = (this.j.a == SubscribeDialogParams$DisplayMode.SelectSubscribe)? true: false;
       return b;
    }
    public final boolean hh(){
       boolean b = (this.m != null && (this.l != null && (this.j != null && this.k != null)))? true: false;
       return b;
    }
    public void ih(long p0){
       if (PatchProxy.isSupport(LiveSubscribeDetailFragment.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveSubscribeDetailFragment.class, "16")) {
          return;
       }
       LiveSpannable liveSpannabl = new LiveSpannable();
       liveSpannabl.b(a1.p(R.string.arg_RES_7f102cf9)).c();
       LiveSpannable$b uob = new LiveSpannable$b(l0.d(p0)).d(R.color.arg_RES_7f0607d1);
       uob.a();
       liveSpannabl.j(uob);
       this.v.setText(liveSpannabl.k());
       return;
    }
    public void jh(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "29")) {
          return;
       }
       this.s = p0;
       this.lh(this.k, p0);
       return;
    }
    public void kh(LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail p0){
       ClientContent$LiveStreamPackage liveStreamPa;
       boolean i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "11")) {
          return;
       }
       if (!this.hh()) {
          return;
       }
       LiveSubscribeDetailFragment tk = this.k;
       this.k = p0;
       String str = null;
       boolean b = true;
       int i = 0;
       if (this.s == null) {
          String str1 = PatchProxy.applyTwoRefs(p0, tk, this, LiveSubscribeDetailFragment.class, "12");
          if (str1 != PatchProxyResult.class) {
          }else {
             LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail mSubscribeIn = p0.mSubscribeInfoList;
             if (!q.f(mSubscribeIn)) {
                SubscribeDialogParams d = this.j.d;
                if (!TextUtils.x(d)) {
                   LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo liveSubscrib = y.y(mSubscribeIn, new o(d)).orNull();
                   if (liveSubscrib != null) {
                      str1 = liveSubscrib;
                   }
                }
                if (tk != null && (q.f(tk.mSubscribeInfoList) && mSubscribeIn.size() == b)) {
                   str1 = mSubscribeIn.get(i);
                }
             }
          label_0034 :
             str1 = str;
          }
          this.s = str1;
       }
       this.lh(p0, this.s);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "20")) {
          i2 = (!p0.isBanned() && !q.f(p0.getEditableSubscribeTypes()))? true: false;
          b.c(this.u, i2);
          if (!PatchProxy.applyVoid(str, this, LiveSubscribeDetailFragment.class, "21")) {
             this.u.post(new k(this));
          }
          this.u.setOnClickListener(new m(this, p0));
       }
       int i1 = 8;
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "18")) {
          liveStreamPa = (p0.mShouldShowSuccessTips != null && p0.mBannedInfo == null)? 1: 0;
          LiveSubscribeDetailFragment tt = this.t;
          i2 = (liveStreamPa)? 0: 8;
          tt.setVisibility(i2);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "13")) {
          p0 = p0.mBannedInfo;
          if (p0 == null || this.gh()) {
             this.w.setVisibility(i1);
             this.g1();
          }else {
             this.w.setVisibility(i);
             if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "15")) {
                long bannedLeftTi = p0.getBannedLeftTimeMs();
                this.ih(bannedLeftTi);
                this.g1();
                if (bannedLeftTi - null > 0) {
                   t ot = new t(this, bannedLeftTi, 300);
                   this.z = tk;
                   tk.start();
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "14") && this.p == null) {
                this.p = b;
                liveStreamPa = this.m.get();
                Object obj = this.n.get();
                String str2 = l0.d(p0.getBannedLeftTimeMs());
                if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj, str2, null, s.class, "31")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "BAN_LEFT_TIME";
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.c0("left_time", str2);
                   uElementPack.params = jsonObject.toString();
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   if (liveStreamPa != null) {
                      uContentPack.liveStreamPackage = liveStreamPa;
                   }
                   if (obj != null) {
                      uContentPack.liveVoicePartyPackage = obj;
                   }
                   u1.u0(9, uElementPack, uContentPack);
                }
             }
          }
       }
       return;
    }
    public final void lh(LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail p0,LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSubscribeDetailFragment.class, "19")) {
          return;
       }
       CharSequence uCharSequenc = (p1 == null)? null: p1.mSubscribeId;
       p0 = p0.mSubscribeInfoList;
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo liveSubscrib = iterator.next();
             liveSubscrib.mIsSelected = TextUtils.n(liveSubscrib.mSubscribeId, uCharSequenc);
          }
       }
       this.y.k0();
       LiveSubscribeDetailFragment tx = this.x;
       boolean b = (this.s != null)? true: false;
       b.c(tx, b);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSubscribeDetailFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       LiveSubscribeDetailFragment tj = this.j;
       int i = (tj != null && tj.h != null)? 2: 0;
       return a.h(p0, 0x7f0d0dfa, p1, false, i);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSubscribeDetailFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       if (!this.hh()) {
          return;
       }
       this.g1();
       LiveSubscribeDetailFragment to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoid(objArray, to, e.class, "2")) {
          to.a.d();
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(LiveSubscribeDetailFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSubscribeDetailFragment.class, "23")) {
          return;
       }
       super.onHiddenChanged(p0);
       b.c0(LiveLogTag.PLAY_FRAGMENT, "LiveSubscribeDetailFragment->onHiddenChanged", "hidden", Boolean.valueOf(p0));
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeDetailFragment.class, "22")) {
          return;
       }
       super.onResume();
       b.Z(LiveLogTag.PLAY_FRAGMENT, "LiveSubscribeDetailFragment->onResume");
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       TextView textView;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSubscribeDetailFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!this.hh()) {
          return;
       }
       RxBus.f.f(o.class).compose(this.Ug(FragmentEvent.DESTROY_VIEW)).observeOn(d.a).subscribe(new g(this));
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "4")) {
          this.t = m1.f(p0, 0x7f0a2627);
          this.u = m1.f(p0, 0x7f0a2622);
          this.v = m1.f(p0, 0x7f0a2616);
          this.w = m1.f(p0, 0x7f0a2615);
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "5")) {
             textView = m1.f(p0, R.id.live_subscribe_detail_title);
             if (this.gh()) {
                textView.setText(R.string.arg_RES_7f102ce6);
             }else {
                textView.setText(R.string.arg_RES_7f102cd0);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "8")) {
             RecyclerView recyclerView = m1.f(p0, R.id.live_subscribe_list);
             recyclerView.setLayoutManager(new LinearLayoutManager(p0.getContext()));
             recyclerView.addItemDecoration(new s(this, a1.d(R.dimen.arg_RES_7f070295)));
             recyclerView.setAdapter(this.y);
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "9")) {
             m1.f(p0, R.id.live_subscribe_rule_view).setOnClickListener(new l(this));
          }
          int i = 8;
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "7")) {
             textView = m1.f(p0, R.id.live_subscribe_relate_photo_button);
             this.x = textView;
             int i1 = (this.gh())? 0: 8;
             textView.setVisibility(i1);
             LiveSubscribeDetailFragment tx = this.x;
             String str = (this.fh())? a1.p(R.string.arg_RES_7f1007e2): a1.p(R.string.arg_RES_7f102caf);
             tx.setText(str);
             b.c(this.x, false);
             this.x.setOnClickListener(new h(this));
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment.class, "6")) {
             ImageView imageView = m1.f(p0, R.id.live_subscribe_detail_cancel);
             if (this.fh()) {
                i = 0;
             }
             imageView.setVisibility(i);
             imageView.setOnClickListener(new f(this));
          }
       }
       this.kh(this.k);
       return;
    }
}
