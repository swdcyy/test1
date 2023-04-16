package com.kuaishou.live.playback.list.LivePlaybackListFragment;
import k3c.w1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lnc.a1;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y2c.o;
import y2c.a;
import y8c.t;
import s1c.r0;
import fx5.h;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import hi3.f;
import lkd.b;
import hi3.e;
import hi3.d;
import tkd.b;
import tkd.d;
import gx5.d;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.lang.Number;
import rkd.b;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.Boolean;
import java.util.List;
import im8.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Map;
import java.lang.StringBuilder;
import android.content.res.Configuration;
import androidx.recyclerview.widget.GridLayoutManager;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import crd.b;
import lnc.b9;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import hi3.b;
import android.view.View$OnClickListener;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.playback.list.LivePlaybackListFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewGroup;
import gi3.a;
import com.kuaishou.live.playback.list.c;
import erd.g;
import eoc.f;
import com.kuaishou.live.playback.list.LivePlaybackListFragment$b;
import androidx.recyclerview.widget.RecyclerView$n;
import zf6.j;
import y8c.g;
import hi3.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import android.content.Context;
import qvb.i;
import ii3.a;
import hi3.g;
import qvb.q;
import qvb.a;

public class LivePlaybackListFragment extends RecyclerFragment implements w1	// class@000d24
{
    public long F;
    public a G;
    public NpaGridLayoutManager H;
    public r0 I;
    public int J;
    public String K;
    public b L;
    public static final int M;
    public static final int N;
    public static final int O;

    static {
       LivePlaybackListFragment.M = a1.e(19.00f);
       LivePlaybackListFragment.N = a1.e(4.00f);
       LivePlaybackListFragment.O = a1.e(8.00f);
    }
    public void LivePlaybackListFragment(){
       super();
       this.K = a1.p(0x7f103f71);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LivePlaybackListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       if (this.Hh()) {
          obj.U7(new o());
          obj.U7(new a());
          PatchProxy.onMethodExit(LivePlaybackListFragment.class, "5");
          return obj;
       }else {
          PatchProxy.onMethodExit(LivePlaybackListFragment.class, "5");
          return obj;
       }
    }
    public t Bh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.Hh()) {
          return super.Bh();
       }
       obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "17");
       if (obj != patchProxyRe) {
       }else {
          LivePlaybackListFragment tI = this.I;
          if (tI != null) {
             r0 d = tI.d;
             if (d != null) {
                h oh = new h(this, d);
                oh.f(new f(this));
                oh.c(new e(this));
                oh.i(new d(this));
                obj = d.a(-1188553266).DK(oh);
             }
          }
          obj = super.Bh();
       }
       return obj;
    }
    public void Fc(r0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackListFragment.class, "2")) {
          return;
       }
       r0 b = p0.b;
       this.F = (b != null && !TextUtils.isEmpty(b.mId))? Long.parseLong(p0.b.mId): 0;
    }
    public int Gh(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.Hh() && (b.g() && b.e())) {
          return 4;
       }
       return 2;
    }
    public boolean Hh(){
       boolean b = (this.J == 2)? true: false;
       return b;
    }
    public void Ih(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackListFragment.class, "11")) {
          return;
       }
       if (!this.isAdded()) {
          return;
       }
       LivePlaybackListFragment tI = this.I;
       if (tI != null) {
          r0 b = tI.b;
          if (b != null) {
             b.notifyChanged();
          }
       }
       return;
    }
    public boolean S1(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.Hh() ^ 0x01);
    }
    public List fg(){
       LivePlaybackListFragment obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Hh()) {
          obj = this.I;
          if (obj != null) {
             Object[] objArray = new Object[]{this,obj,obj.e,new c("FRAGMENT", this)};
             return Lists.e(objArray);
          }
       }
       return super.fg();
    }
    public int getLayoutResId(){
       return 0x7f0d0d34;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackListFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LivePlaybackListFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "author_id="+this.F;
    }
    public String o(){
       return "LIVE_PLAYBACK_AGGR_PAGE";
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackListFragment.class, "19")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (!this.Hh() || (b.g() && !PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackListFragment.class, "20"))) {
          LivePlaybackListFragment tH = this.H;
          if (tH != null) {
             tH.setSpanCount(this.Gh());
          }
          if (this.ia() != null) {
             this.ia().k0();
          }
       }
    label_003d :
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackListFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.h0().clearOnScrollListeners();
       b9.a(this.L);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlaybackListFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.live_playback_tab_action_bar_back_view).setOnClickListener(new b(this));
       if (this.Hh()) {
          p0.findViewById(R.id.toolbar_layout).setVisibility(8);
          p0.findViewById(R.id.root_layout).setBackground(new ColorDrawable(a1.a(R.color.arg_RES_7f060bcc)));
       }
       this.ia().R0(this.h0());
       this.h0().addOnScrollListener(new LivePlaybackListFragment$a(this));
       if (this.Hh()) {
          boolean b = false;
          this.h0().setVerticalScrollBarEnabled(b);
          if (b.g()) {
             this.h0().setPadding((LivePlaybackListFragment.M - (LivePlaybackListFragment.N / 2)), b, (LivePlaybackListFragment.M - (LivePlaybackListFragment.N / 2)), b);
          }
       }
       this.L = f.a(a.class, new c(this));
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackListFragment.class, "8")) {
          return;
       }
       super.th();
       this.h0().addItemDecoration(new LivePlaybackListFragment$b(this, a1.e(4.00f)));
       if (this.Hh()) {
          this.h0().setBackgroundColor(j.d(this.h0(), R.color.arg_RES_7f061ca5));
       }
       return;
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.J, true);
       this.G = obj;
       return obj;
    }
    public RecyclerView$LayoutManager xh(){
       NpaGridLayoutManager obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NpaGridLayoutManager(this.getContext(), this.Gh());
       this.H = obj;
       return obj;
    }
    public i yh(){
       a obj = PatchProxy.apply(null, this, LivePlaybackListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.F);
       if (!this.Hh() || (this.I != null && !PatchProxy.applyVoidOneRefs(obj, this, LivePlaybackListFragment.class, "14"))) {
          obj.h(new g(this, obj));
       }
    label_0034 :
       return obj;
    }
}
