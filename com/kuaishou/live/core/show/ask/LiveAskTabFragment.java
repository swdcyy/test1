package com.kuaishou.live.core.show.ask.LiveAskTabFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$f;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$g;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$e;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$c;
import com.kwai.library.widget.refresh.RefreshLayout;
import kotlin.jvm.internal.a;
import g9c.d;
import qvb.i;
import hka.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.a;
import com.kuaishou.live.core.show.ask.model.LiveAskItem;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ob1.c;
import java.lang.Boolean;
import i32.m;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig;
import ok.x;
import android.widget.TextView;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import lnc.b5;
import com.kuaishou.live.common.core.component.ask.LiveAskItemClickListener;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import lnc.a1;
import java.lang.Integer;
import nsd.r0;
import java.util.Arrays;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import android.os.Bundle;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$j;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import android.content.Context;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.LinearLayout$LayoutParams;
import java.lang.StringBuffer;
import java.lang.Throwable;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$d;
import va1.j0;
import java.util.Map;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import bld.b;
import lnc.l1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.widget.ImageView;
import i32.o;
import i32.n;
import androidx.recyclerview.widget.RecyclerView$r;
import qvb.a;
import y8c.g;
import com.kwai.framework.model.user.QCurrentUser;
import i32.q;
import androidx.recyclerview.widget.RecyclerView$i;
import qvb.f;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$b;

public final class LiveAskTabFragment extends RecyclerFragment implements d	// class@0009c4
{
    public m F;
    public t G;
    public String H;
    public f I;
    public LiveAskItemClickListener J;
    public PagerSlidingTabStrip$d K;
    public m L;
    public boolean M;
    public String N;
    public boolean O;
    public g P;
    public g Q;
    public x R;
    public boolean S;
    public View T;
    public View U;
    public LiveAskAndChatTabConfig U0;
    public TextView V;
    public HashMap V0;
    public TextView W;
    public TextView X;
    public View Y;
    public TextView Z;

    public void LiveAskTabFragment(){
       super();
       this.P = new LiveAskTabFragment$f(this);
       this.Q = new LiveAskTabFragment$g(this);
       this.R = new LiveAskTabFragment$e(this);
    }
    public t Bh(){
       LiveAskTabFragment$c obj = PatchProxy.apply(null, this, LiveAskTabFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RefreshLayout refreshLayou = this.Ac();
       a.o(refreshLayou, "refreshLayout");
       i oi = this.q();
       a.o(oi, "pageList");
       obj = new LiveAskTabFragment$c(refreshLayou, this.ia(), oi, this.S1());
       this.G = obj;
       return obj;
    }
    public final void Gh(){
       if (PatchProxy.applyVoid(null, this, LiveAskTabFragment.class, "22")) {
          return;
       }
       if (this.h0() != null) {
          RecyclerView recyclerView = this.h0();
          String str = "recyclerView";
          a.o(recyclerView, str);
          if (recyclerView.getLayoutManager() != null) {
             recyclerView = this.h0();
             a.o(recyclerView, str);
             LinearLayoutManager layoutManage = recyclerView.getLayoutManager();
             a.m(layoutManage);
             int i = layoutManage.i0();
             RecyclerView recyclerView1 = this.h0();
             a.o(recyclerView1, str);
             LinearLayoutManager layoutManage1 = recyclerView1.getLayoutManager();
             a.m(layoutManage1);
             int i1 = layoutManage1.c();
             if (i <= i1) {
                LiveAskTabFragment tF = this.F;
                a.m(tF);
                while (i < tF.getItemCount()) {
                   tF = this.F;
                   a.m(tF);
                   LiveAskItem liveAskItem = tF.N0(i);
                   if (liveAskItem != null && liveAskItem.mHasShown == null) {
                      LiveAskTabFragment tL = this.L;
                      ClientContent$LiveStreamPackage liveStreamPa = (tL != null)? tL.a(): null;
                      int i2 = i + 1;
                      c.j(liveStreamPa, false, i2, liveAskItem.mItemId, liveAskItem.mLikeCount);
                      liveAskItem.mHasShown = true;
                      break ;
                   }else if(i != i1){
                      i = i + 1;
                   }
                }
             }
          }
       }
       return;
    }
    public final void Hh(boolean p0){
       if (PatchProxy.isSupport(LiveAskTabFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAskTabFragment.class, "20")) {
          return;
       }
       LiveAskTabFragment tF = this.F;
       if (tF != null) {
          m om = m.class;
          if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tF, om, "3")) {
             tF.z = p0;
             tF.k0();
          }
       }
       return;
    }
    public final void Ih(){
       LiveAskTabFragment tU0;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAskTabFragment.class, "19")) {
          return;
       }
       if (this.M == null) {
          tU0 = this.U0;
          if (tU0 != null) {
             LiveAskAndChatTabConfig mIsForbidden = tU0.mIsForbiddenCommentSupplier;
             if (mIsForbidden != null) {
                objArray = mIsForbidden.get();
             }
          }
          a.m(objArray);
          if (!objArray.booleanValue()) {
             tU0 = 1;
          label_002b :
             if (!tU0) {
                tU0 = this.X;
                if (tU0 != null) {
                   tU0.setAlpha(0x3f000000);
                }
                tU0 = this.X;
                if (tU0 != null) {
                   tU0.setOnClickListener(new LiveAskTabFragment$h(this));
                }
             }else {
                tU0 = this.X;
                if (tU0 != null) {
                   tU0.setAlpha(0x3f800000);
                }
                tU0 = this.X;
                if (tU0 != null) {
                   tU0.setOnClickListener(new LiveAskTabFragment$i(this));
                }
             }
             return;
          }
       }
       tU0 = null;
       goto label_002b ;
    }
    public final void Jh(){
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAskTabFragment.class, "5")) {
          return;
       }
       LiveAskTabFragment tL = this.L;
       ClientContent$LiveStreamPackage liveStreamPa = (tL != null)? tL.a(): objArray;
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, c.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "INITIATE_QUESTION_SUBCARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(true, uElementPack, uContentPack);
       }
       if (y.d(this.getActivity()) && !b5.a(this.getActivity())) {
          tL = this.J;
          if (tL != null) {
             tL.e();
          }
          return;
       }else {
          boolean b = false;
          BaseEditorFragment$Arguments uArguments = new BaseEditorFragment$Arguments().setEnableAtFriends(b).setEnableEmoji(b).setSlidePlay(true).setShowKeyBoardFirst(true).setKeyboardType(true).setCancelWhileKeyboardHidden(true).setFinishButtonText(a1.p(R.string.arg_RES_7f101e11)).setShowEmojiFirst(b);
          LiveAskTabFragment tU0 = this.U0;
          Integer integer = (tU0 != null)? Integer.valueOf(tU0.mAskQuestionWordsLimit): objArray;
          a.m(integer);
          if (integer.intValue() > 0) {
             tU0 = this.U0;
             integer = (tU0 != null)? Integer.valueOf(tU0.mAskQuestionWordsLimit): objArray;
             a.m(integer);
             uArguments.setTextLimit(integer.intValue());
             String str = a1.p(R.string.arg_RES_7f101e18);
             a.o(str, "CommonUtil.string\(R.stri¡­uestion_words_limit_tips\)");
             Object[] objArray1 = new Object[true];
             LiveAskTabFragment tU01 = this.U0;
             if (tU01 != null) {
                objArray = Integer.valueOf(tU01.mAskQuestionWordsLimit);
             }
             a.m(objArray);
             objArray1[b] = objArray;
             String str1 = String.format(str, Arrays.copyOf(objArray1, true));
             a.o(str1, "java.lang.String.format\(format, *args\)");
             uArguments.setHintText(str1);
          }
          FloatEditorFragment uFloatEditor = new FloatEditorFragment();
          uFloatEditor.setArguments(uArguments.build());
          uFloatEditor.ai(new LiveAskTabFragment$j(this));
          uFloatEditor.Cb(this.getChildFragmentManager(), LiveAskTabFragment.class.getName());
          return;
       }
    }
    public final void Kh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment.class, "17")) {
          return;
       }
       LiveAskTabFragment tV = this.V;
       int i = 0;
       Context context = (tV != null)? tV.getContext(): i;
       TextView textView = new TextView(context);
       textView.setText(p0);
       int i1 = 0;
       textView.measure(i1, i1);
       tV = this.V;
       ViewGroup$LayoutParams layoutParams = (tV != null)? tV.getLayoutParams(): i;
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
       LiveAskTabFragment tV1 = this.V;
       if (tV1 != null) {
          i = Integer.valueOf(tV1.getMaxWidth());
       }
       a.m(i);
       if (i.intValue() < textView.getMeasuredWidth()) {
          layoutParams.width = i1;
          layoutParams.weight = 0x3f800000;
       }else {
          layoutParams.width = -2;
          layoutParams.weight = 0;
       }
       return;
    }
    public final void Lh(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment.class, "14")) {
          return;
       }
       StringBuffer str = "";
       LiveAskTabFragment tU0 = this.U0;
       Boolean uBoolean = (tU0 != null)? Boolean.valueOf(tU0.mIsAnchor): null;
       a.m(uBoolean);
       str = (uBoolean.booleanValue())? str+a1.p(0x7f102b34): str+a1.p(0x7f101e16);
       if (p0 != null) {
          int i = p0.intValue();
          if (1 <= i && 99 >= i) {
             str = str+" "+String.valueOf(p0.intValue());
          }else if(p0.intValue() > 99){
             str = str+" 99+";
          }
       }
       LiveAskTabFragment tZ = this.Z;
       if (tZ != null) {
          tZ.setText(str);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(LiveAskTabFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveAskTabFragment.class, "10")) {
          return;
       }
       super.M1(p0, p1);
       LiveAskTabFragment tG = this.G;
       a.m(tG);
       tG.k(p0, p1);
       RefreshLayout refreshLayou = this.Ac();
       a.o(refreshLayou, "refreshLayout");
       refreshLayou.setRefreshing(false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment.class, "4")) {
          return;
       }
       this.T = m1.f(p0, 0x7f0a18ec);
       this.U = m1.f(p0, 0x7f0a18eb);
       this.V = m1.f(p0, 0x7f0a18ee);
       this.W = m1.f(p0, 0x7f0a18ed);
       this.X = m1.f(p0, 0x7f0a18f8);
       m1.a(p0, new LiveAskTabFragment$d(this), R.id.live_ask_submit_text_view);
       j0.a(this.X, a1.a(R.color.arg_RES_7f060c75), a1.a(R.color.arg_RES_7f060c76));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d09e0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAskTabFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAskTabFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       a.m(p0);
       Serializable serializable = SerializableHook.getSerializable(p0, "key_tab_config");
       Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig");
       this.U0 = serializable;
       this.H = serializable.mLiveStreamId;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAskTabFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       View view = super.onCreateView(p0, p1, p2);
       a.m(view);
       View view1 = view.findViewById(R.id.live_ask_input_layout);
       View view2 = view.findViewById(R.id.live_ask_tab_layout);
       obj = new b();
       obj.v(a1.a(R.color.arg_RES_7f061d74));
       if (l1.a()) {
          obj.g(KwaiRadiusStyles.R16);
          obj.a();
       }
       a.o(view1, "inputLayout");
       view1.setBackground(obj.a());
       a.o(view2, "tabLayout");
       view2.setBackground(obj.a());
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveAskTabFragment.class, "25")) {
       }else {
          LiveAskTabFragment tV0 = this.V0;
          if (tV0 != null) {
             tV0.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       TextView textView;
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAskTabFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveAskTabFragment.class, "21")) {
          LiveAskTabFragment tK = this.K;
          if (tK != null) {
             tK = tK.b();
             if (tK != null) {
                ImageView imageView = tK.findViewById(R.id.live_ask_tab_lock_icon_image_view);
             label_0038 :
                this.Y = imageView;
                tK = this.K;
                if (tK != null) {
                   tK = tK.b();
                   if (tK != null) {
                      imageView = tK.findViewById(R.id.live_ask_tab_introduce_icon_image_view);
                   label_004f :
                      LiveAskTabFragment tK1 = this.K;
                      if (tK1 != null) {
                         view = tK1.b();
                         if (view != null) {
                            textView = view.findViewById(R.id.live_ask_tab_title_text_view);
                         label_0064 :
                            this.Z = textView;
                            this.Ih();
                            tK1 = this.U0;
                            Boolean uBoolean = (tK1 != null)? Boolean.valueOf(tK1.mIsAnchor): objArray;
                            a.m(uBoolean);
                            if (uBoolean.booleanValue()) {
                               int i = 8;
                               if (imageView != null) {
                                  imageView.setVisibility(i);
                               }
                               tK = this.T;
                               if (tK != null) {
                                  tK.setVisibility(i);
                               }
                               tK = this.U;
                               if (tK != null) {
                                  tK.setVisibility(i);
                               }
                            }else {
                               tK1 = this.T;
                               if (tK1 != null) {
                                  tK1.setVisibility(0);
                               }
                               tK1 = this.U;
                               if (tK1 != null) {
                                  tK1.setVisibility(0);
                               }
                               if (imageView != null) {
                                  imageView.setVisibility(0);
                               }
                               if (imageView != null) {
                                  imageView.setOnClickListener(new o(this, imageView));
                               }
                            }
                            tK = this.U0;
                            Integer integer = (tK != null)? Integer.valueOf(tK.mCurrentAskNum): objArray;
                            this.Lh(integer);
                            if (!PatchProxy.applyVoid(objArray, this, LiveAskTabFragment.class, "23")) {
                               this.h0().addOnScrollListener(new n(this));
                            }
                            tK = this.U0;
                            if (tK != null) {
                               objArray = Boolean.valueOf(tK.mIsAutoOpenKeyboard);
                            }
                            a.m(objArray);
                            if (objArray.booleanValue()) {
                               this.Jh();
                            }
                         }
                      }
                      textView = objArray;
                      goto label_0064 ;
                   }
                }
                objArray1 = objArray;
                goto label_004f ;
             }
          }
          objArray1 = objArray;
          goto label_0038 ;
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveAskTabFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveAskTabFragment.class, "9")) {
          return;
       }
       super.v2(p0, p1);
       LiveAskTabFragment tG = this.G;
       a.m(tG);
       tG.j();
       tG = this.I;
       a.m(tG);
       if (tG.isEmpty()) {
          tG = this.G;
          a.m(tG);
          tG.i();
       }else {
          tG = this.G;
          a.m(tG);
          tG.f();
       }
       return;
    }
    public g vh(){
       Object[] objArray = null;
       LiveAskTabFragment liveAskTabFr = PatchProxy.apply(objArray, this, LiveAskTabFragment.class, "6");
       if (liveAskTabFr != PatchProxyResult.class) {
       }else {
          LiveAskTabFragment tU0 = this.U0;
          if (tU0 != null) {
             objArray = Boolean.valueOf(tU0.mIsAnchor);
          }
          a.m(objArray);
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          String id = qCurrentUser.getId();
          a.o(id, "QCurrentUser.me\(\).id");
          m om = new m(objArray.booleanValue(), id);
          this.F = om;
          om.w = this.J;
          om.F0(new q(this));
          liveAskTabFr = this.F;
          a.m(liveAskTabFr);
       }
       return liveAskTabFr;
    }
    public i yh(){
       LiveAskTabFragment$b uob = PatchProxy.apply(null, this, LiveAskTabFragment.class, "7");
       if (uob != PatchProxyResult.class) {
       }else {
          LiveAskTabFragment tH = this.H;
          a.m(tH);
          uob = new LiveAskTabFragment$b(this, tH);
          this.I = uob;
       }
       return uob;
    }
}
