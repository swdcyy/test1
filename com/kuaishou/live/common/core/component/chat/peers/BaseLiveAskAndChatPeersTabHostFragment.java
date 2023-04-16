package com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatPeersTabHostFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.String;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatPeersTabHostFragment$a;
import java.util.List;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.ask.LiveAskItemClickListener;
import p91.m;
import java.lang.Integer;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.content.res.Resources;
import ekd.m1;
import java.lang.Number;
import android.view.LayoutInflater;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatType;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import lnc.a1;
import androidx.viewpager.widget.ViewPager$i;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.b;
import lp3.e;
import ob1.d;
import lp3.c;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import ie1.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import org.json.JSONArray;
import java.util.Collection;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public abstract class BaseLiveAskAndChatPeersTabHostFragment extends TabHostFragment implements d	// class@00104b
{
    public TextView B;
    public m C;
    public boolean D;
    public LiveAskItemClickListener E;
    public int F;
    public boolean G;
    public LiveAskAndChatTabConfig H;
    public int I;
    public final ViewPager$i J;
    public static final String[] K;

    static {
       String[] stringArray = new String[]{"ask","audience_apply","anchors_recommend"};
       BaseLiveAskAndChatPeersTabHostFragment.K = stringArray;
    }
    public void BaseLiveAskAndChatPeersTabHostFragment(){
       super();
       this.I = 0;
       this.J = new BaseLiveAskAndChatPeersTabHostFragment$a(this);
    }
    public abstract void Qh(List p0,List p1);
    public View Rh(String p0){
       ViewGroup obj = PatchProxy.applyOneRefs(p0, this, BaseLiveAskAndChatPeersTabHostFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(this.getContext(), R.layout.arg_RES_7f0d09dd);
       obj.getChildAt(0).setText(p0);
       return obj;
    }
    public boolean Sh(){
       return this.D;
    }
    public abstract void Th(int p0);
    public void Uh(LiveAskItemClickListener p0){
       this.E = p0;
    }
    public void Vh(m p0){
       this.C = p0;
    }
    public void Wh(int p0){
       if (PatchProxy.isSupport(BaseLiveAskAndChatPeersTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseLiveAskAndChatPeersTabHostFragment.class, "6")) {
          return;
       }
       int i = 0;
       while (i < this.F) {
          TextView textView = ((this.vh(i).c()).equals(BaseLiveAskAndChatPeersTabHostFragment.K[0]))? this.vh(i).b().findViewById(R.id.live_ask_tab_title_text_view): this.vh(i).e().getChildAt(0);
          if (i == p0) {
             textView.setTextColor(this.getContext().getResources().getColor(R.color.arg_RES_7f060ca6));
          }else {
             textView.setTextColor(this.getContext().getResources().getColor(R.color.arg_RES_7f060ca7));
          }
          i = i + 1;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAskAndChatPeersTabHostFragment.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a2c3e);
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, BaseLiveAskAndChatPeersTabHostFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.Sh())? 0x7f0d0ab0: 0x7f0d0aaf;
       return i;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       LiveAskAndChatTabConfig obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseLiveAskAndChatPeersTabHostFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SerializableHook.getSerializable(this.getArguments(), "key_tab_config");
       this.H = obj;
       this.F = 0;
       LiveAskAndChatTabConfig mLiveAskAndC = obj.mLiveAskAndChatType;
       if (LiveAskAndChatType.ONLY_ASK == mLiveAskAndC || LiveAskAndChatType.ASK_AND_CHAT_BOTH_AUDIO == mLiveAskAndC) {
          this.G = true;
          this.F = 0 + true;
       }
       if (LiveAskAndChatType.ONLY_CHAT_AUDIENCES == mLiveAskAndC || LiveAskAndChatType.ASK_AND_CHAT_BOTH_AUDIO == mLiveAskAndC) {
          this.D = true;
          this.F = this.F + true;
       }
       this.I = obj.mTargetTabIndex;
       View view = super.onCreateView(p0, p1, p2);
       this.doBindView(view);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str = "3";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveAskAndChatPeersTabHostFragment.class, str)) {
          return;
       }
       super.onViewCreated(p0, p1);
       ViewGroup$LayoutParams layoutParams = this.u.getLayoutParams();
       layoutParams.height = -1;
       this.u.setLayoutParams(layoutParams);
       int i = 0;
       if (this.F == 1) {
          this.t.y(i);
          this.t.w(i);
       }else {
          this.t.y(a1.d(R.dimen.arg_RES_7f0702df));
       }
       this.Oh(this.J);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, BaseLiveAskAndChatPeersTabHostFragment.class, "5")) {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          if (this.G != null) {
             b uob = PatchProxy.apply(objArray, this, BaseLiveAskAndChatPeersTabHostFragment.class, "8");
             if (uob != PatchProxyResult.class) {
             }else {
                String str1 = "key_tab_config";
                LiveAskAndChatTabConfig serializable = SerializableHook.getSerializable(this.getArguments(), str1);
                View view = a.a(this.getContext(), R.layout.arg_RES_7f0d09e1);
                TextView textView = view.findViewById(R.id.live_ask_tab_title_text_view);
                if (serializable != null) {
                   if (serializable.mIsAnchor != null) {
                      textView.setText(a1.p(R.string.arg_RES_7f102b34));
                   }else {
                      textView.setText(a1.p(R.string.arg_RES_7f101e16));
                   }
                }
                Bundle uBundle = new Bundle();
                SerializableHook.putSerializable(uBundle, str1, this.H);
                uob = this.C.t5().a(d.class).Vb(new PagerSlidingTabStrip$d(BaseLiveAskAndChatPeersTabHostFragment.K[i], view), uBundle, this.E, this.C);
             }
             uArrayList.add(uob);
             uArrayList1.add((BaseLiveAskAndChatPeersTabHostFragment.K[i]).toUpperCase());
          }
          this.Qh(uArrayList, uArrayList1);
          this.Kh(uArrayList);
          this.Ih(this.y, new Bundle());
          this.u.setCurrentItem(this.I);
          this.v.q();
          this.Wh(this.I);
          if (this.I == null) {
             this.J.onPageSelected(i);
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList1, objArray, d.class, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_ANCHOR_CHAT_RECOMMEND_LIST";
             i3 oi3 = i3.f();
             oi3.d("tab_list", new JSONArray(uArrayList1).toString());
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = d.a;
             u1.u0(6, uElementPack, uContentPack);
          }
       }
       return;
    }
    public List wh(){
       return null;
    }
}
