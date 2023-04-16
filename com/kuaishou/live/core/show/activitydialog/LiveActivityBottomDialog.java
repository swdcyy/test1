package com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialog;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import java.util.ArrayList;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Number;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import tx4.h;
import sx4.e;
import androidx.fragment.app.KwaiDialogFragment;
import z51.c;
import vq5.d;
import lnc.u1;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialogEventData;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialogEventData$Value;
import android.widget.FrameLayout;
import android.view.View;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import com.kuaishou.live.krn.dialog.internal.LiveRoundCornerWithoutJagLayout;
import java.util.List;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialogData;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import android.app.Activity;
import t02.a0;
import t02.r1;
import kq3.a;
import c22.a;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.live.core.show.activitydialog.c$b;
import ekd.x0;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import g22.e;
import lp3.e;
import o63.c;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import androidx.viewpager.widget.ViewPager;
import g22.d;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.show.activitydialog.c;
import android.content.Context;
import h3.a;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialogUrlData$ActivityTabData;
import e3a.a;
import lnc.a1;
import android.widget.FrameLayout$LayoutParams;
import java.util.Objects;
import java.lang.Boolean;
import o63.a;
import lp3.c;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import com.kuaishou.live.core.show.activitydialog.a;
import msd.a;
import z51.g;
import g22.c;
import com.kuaishou.live.core.show.activitydialog.b;
import msd.l;
import java.lang.Float;
import com.yxcorp.utility.n;
import g22.b;
import vq5.b;

public class LiveActivityBottomDialog extends LiveDialogContainerFragment	// class@000922
{
    public ViewPager A;
    public e B;
    public d C;
    public a0 D;
    public r1 E;
    public List F;
    public LiveActivityBottomDialogUrlData$ActivityTabData G;
    public float H;
    public c I;
    public int J;
    public final LiveTkItemManager K;
    public e L;
    public c M;
    public boolean N;
    public static final int O;

    public void LiveActivityBottomDialog(){
       super();
       this.F = new ArrayList();
       this.J = 0;
       this.K = new LiveTkItemManager();
    }
    public void Eh(int p0){
       if (PatchProxy.isSupport(LiveActivityBottomDialog.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveActivityBottomDialog.class, "9")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("toSelectedIndex", Integer.valueOf(p0));
       LiveActivityBottomDialog tL = this.L;
       if (tL != null) {
          tL.b("onSelectedTabChanged", a.a.p(jsonObject), null);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d09a0;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveActivityBottomDialog.class, "11")) {
          return;
       }
       super.onDestroyView();
       LiveActivityBottomDialog tK = this.K;
       if (tK != null) {
          tK.a();
       }
       tK = this.L;
       if (tK != null) {
          tK.close();
       }
       tK = this.M;
       if (tK != null) {
          tK.b();
       }
       tK = this.C;
       if (tK != null) {
          tK.Z4("switchActivitytab");
       }
       u1.b(this);
       return;
    }
    public void onEventMainThread(JsEmitParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityBottomDialog.class, "7")) {
          return;
       }
       if (TextUtils.n("LiveActivityBottomContainerEvent", p0.mType)) {
          LiveActivityBottomDialogEventData liveActivity = a.a.h(p0.mData, LiveActivityBottomDialogEventData.class);
          if (TextUtils.n(LiveActivityBottomDialogEventData.a, liveActivity.mAction)) {
             LiveActivityBottomDialogEventData$Value mTabViewVisi = liveActivity.mValue.mTabViewVisible;
             this.N = mTabViewVisi ^ 0x01;
             LiveActivityBottomDialog tL = this.L;
             if (tL != null && tL.getView() != null) {
                FrameLayout view = this.L.getView();
                int i = (mTabViewVisi != null)? 0: 8;
                view.setVisibility(i);
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i1;
       LiveActivityBottomDialog g;
       int b;
       GifshowActivity activity;
       ViewPager viewPager = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(obj, p1, viewPager, LiveActivityBottomDialog.class, str)) {
          return;
       }
       super.onViewCreated(p0, p1);
       u1.a(this);
       m1.f(obj, R.id.live_activity_bottom_dialog_root).setTopRadius(16.00f);
       String str1 = "3";
       int i = 1;
       if (!PatchProxy.applyVoidOneRefs(obj, viewPager, LiveActivityBottomDialog.class, str1)) {
          ArrayList uArrayList = new ArrayList();
          boolean b1 = false;
          int i2 = 0;
          while (i2 < viewPager.F.size()) {
             LiveActivityBottomDialogData liveActivity = viewPager.F.get(i2);
             if (liveActivity != null) {
                if (liveActivity.mType == null && !TextUtils.x(liveActivity.mUrl)) {
                   String str2 = Uri.decode(liveActivity.mUrl);
                   WebViewFragment webViewFragm = PatchProxy.applyOneRefs(str2, viewPager, LiveActivityBottomDialog.class, "12");
                   if (webViewFragm != patchProxyRe) {
                   }else {
                      b.S(LiveLogTag.LIVE_ACTIVITY_DIALOG.appendTag("LiveActivityBottomDialog"), "createLiveWebFragment", "url", str2);
                      activity = this.getActivity();
                      a uoa = a.d(activity, this.getChildFragmentManager(), viewPager.D, viewPager.E);
                      uoa.g(activity.getUrl());
                      uoa.e(viewPager);
                      uoa.b.setLayoutType(str1).setNeedCorner(b1);
                      webViewFragm = a.c().b(str2, uoa);
                   }
                   uArrayList.add(new c$b(webViewFragm, liveActivity.mUrl));
                }else if(liveActivity.mType == i && !TextUtils.x(liveActivity.mUrl)){
                   LiveKrnDialogData liveKrnDialo = new LiveKrnDialogData(x0.f(Uri.decode(liveActivity.mUrl)));
                   LiveKrnFragment liveKrnFragm = PatchProxy.applyOneRefs(liveKrnDialo, viewPager, LiveActivityBottomDialog.class, "13");
                   if (liveKrnFragm != patchProxyRe) {
                   }else {
                      LiveLogTag lIVE_ACTIVIT = LiveLogTag.LIVE_ACTIVITY_DIALOG;
                      lIVE_ACTIVIT.appendTag("LiveActivityBottomDialog");
                      b.T(lIVE_ACTIVIT, "createLiveKrnFragment", "bundleId", liveKrnDialo.e(), "componentName", liveKrnDialo.f());
                      liveKrnFragm = LiveKrnFragment.dh(liveKrnDialo, viewPager.B, new e(viewPager));
                   }
                   uArrayList.add(new c$b(liveKrnFragm, liveActivity.mUrl));
                }
             }
             i2 = i2 + 1;
          }
          ViewPager viewPager1 = m1.f(obj, R.id.live_activity_bottom_dialog_viewpager);
          viewPager.A = viewPager1;
          viewPager1.addOnPageChangeListener(new d(viewPager));
          viewPager.I = new c(this.getContext(), this.getChildFragmentManager(), uArrayList);
          viewPager.A.setOffscreenPageLimit(3);
          viewPager.A.setAdapter(viewPager.I);
          g = viewPager.G;
          if (g != null && g.mSelectedIndex < viewPager.I.j()) {
             viewPager.A.setCurrentItem(viewPager.G.mSelectedIndex);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, viewPager, LiveActivityBottomDialog.class, "6")) {
          if (viewPager.G == null) {
             b.B(LiveLogTag.LIVE_ACTIVITY_DIALOG, "KdsView createTkView error, mTabData is null");
          }else {
             Activity uActivity = a.b(this.getContext());
             if (uActivity == null) {
                b.B(LiveLogTag.LIVE_ACTIVITY_DIALOG, "KdsView createTkView error, activity is null");
             }else {
                LiveActivityBottomDialogUrlData$ActivityTabData mTabHeight = viewPager.G.mTabHeight;
                if (PatchProxy.isSupport(LiveActivityBottomDialog.class)) {
                   FrameLayout$LayoutParams obj1 = PatchProxy.applyOneRefs(Integer.valueOf(mTabHeight), viewPager, LiveActivityBottomDialog.class, "8");
                   if (obj1 != patchProxyRe) {
                      i1 = obj1.intValue();
                   label_01ac :
                      obj1 = new FrameLayout$LayoutParams(-1, i1);
                      g = viewPager.G;
                      Objects.requireNonNull(g);
                      Object obj2 = PatchProxy.apply(null, g, LiveActivityBottomDialogUrlData$ActivityTabData.class, str);
                      b = (obj2 != patchProxyRe)? obj2.booleanValue(): TextUtils.n("top", g.mPosition);
                      b = (b)? 48: 80;
                      obj1.gravity = b;
                      LiveActivityBottomDialog g1 = viewPager.G;
                      c uoc = new c(this, new LiveTkBridge(viewPager.B.a(a.class), a.b), uActivity, p0, obj1);
                      viewPager.K.b(new g(g1.mBundleId, g1.viewKey, a.a.p(g1.mData), Integer.valueOf(i)), v13, b.b);
                   }
                }
                i1 = (int)(((float)mTabHeight / 0x43cf0000) * (float)a1.h());
                goto label_01ac ;
             }
          }
       }
       if (!PatchProxy.applyVoid(null, viewPager, LiveActivityBottomDialog.class, "10") && viewPager.H - null > 0) {
          b.S(LiveLogTag.LIVE_ACTIVITY_DIALOG.appendTag("LiveActivityBottomDialog"), "initView", "mHeightRatio", Float.valueOf(viewPager.H));
          viewPager.Bh(-1, (int)((float)n.j(this.requireActivity()) * viewPager.H));
       }
       if (!PatchProxy.applyVoid(null, viewPager, LiveActivityBottomDialog.class, "5")) {
          viewPager.C.t5("switchActivitytab", new b(viewPager));
       }
       return;
    }
}
