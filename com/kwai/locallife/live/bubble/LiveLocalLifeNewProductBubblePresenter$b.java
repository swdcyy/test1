package com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$b;
import lf3.g;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.lang.Throwable;
import j87.i;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo;
import j87.d;
import java.lang.reflect.Type;
import el.a;
import java.lang.Boolean;
import com.kwai.locallife.live.widget.model.WidgetMountInfo;
import java.lang.Integer;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.locallife.live.widget.LocalLifeRNContainerView;
import android.content.Context;
import android.widget.FrameLayout;
import com.kuaishou.krn.model.LaunchModel;
import android.net.Uri;
import ekd.x0;
import o63.a;
import lp3.c;
import lp3.e;
import com.kuaishou.krn.model.LaunchModel$b;
import fq5.b;
import java.lang.Number;
import androidx.fragment.app.FragmentActivity;
import j87.c;
import androidx.lifecycle.LifecycleOwner;
import zj0.x;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble;
import n87.c;
import java.lang.System;
import qrd.p;
import o87.d;
import n87.a;
import n87.e;
import com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble$b;
import o87.d$c;
import com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble$c;
import o87.d$b;
import lf3.f;

public final class LiveLocalLifeNewProductBubblePresenter$b implements g	// class@000eaa
{
    public final LiveLocalLifeNewProductBubblePresenter b;

    public void LiveLocalLifeNewProductBubblePresenter$b(LiveLocalLifeNewProductBubblePresenter p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       Gson a;
       String str1;
       Integer integer;
       ImmutableMap immutableMap2;
       Throwable throwable;
       String str3;
       LiveLocalLifeNewProductBubblePresenter a1;
       LiveLocalLifeNewProductBubblePresenter q;
       LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo bizData;
       Object obj = this;
       i obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLocalLifeNewProductBubblePresenter$b.class, str)) {
       }else {
          LiveLocalLifeNewProductBubblePresenter$b b = obj.b;
          a.o(obj1, "msg");
          Objects.requireNonNull(b);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          LiveLocalLifeNewProductBubblePresenter liveLocalLif = LiveLocalLifeNewProductBubblePresenter.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, liveLocalLif, "5")) {
             boolean i = 0;
             if (obj1 == null) {
                LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal widget = obj1.widget;
                if (widget != null && widget[i] != null) {
                label_004c :
                   i oi = PatchProxy.applyOneRefs(obj1, b, liveLocalLif, "8");
                   if (oi != patchProxyRe) {
                   }else if(b.W8(obj1)){
                      LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo configData = obj1.widget[i].materialMap.configData;
                      a.o(configData, "msg.widget[0].materialMap.configData");
                      oi = new Gson().i(configData, new d().getType());
                   }else {
                      oi = null;
                   }
                   if (oi != null) {
                      a = a.a;
                      ImmutableMap immutableMap1 = ImmutableMap.of("data", a.q(oi), "isValide", Boolean.TRUE);
                      a.o(immutableMap1, "ImmutableMap.of\(\"data\", ¡­onfig\), \"isValide\", true\)");
                      b.V8("NewProductBubbleConfigVerify", immutableMap1, null);
                      WidgetMountInfo widgetMountI = PatchProxy.applyOneRefs(oi, b, liveLocalLif, "10");
                      int i1 = 2;
                      int i2 = 1;
                      if (widgetMountI != patchProxyRe) {
                      }else {
                         widgetMountI = new WidgetMountInfo();
                         widgetMountI.setShowMills(oi.mShowDuration);
                         i mRenderUri = oi.mRenderUri;
                         a.o(mRenderUri, "config.mRenderUri");
                         widgetMountI.setRenderUri(mRenderUri);
                         widgetMountI.setPriority(oi.mPriority);
                         widgetMountI.setAnimationSwitch(i2);
                         widgetMountI.setHideBubbleArrow(i);
                         boolean b1 = (oi.mBubbleType == i1)? true: false;
                         widgetMountI.setAnchorYellowCar(b1);
                      }
                      LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal sCLiveLocalL = (!(widgetMountI.getRenderUri()).length())? 1: null;
                      if (!sCLiveLocalL && !(a.g(obj1.widget[i].componentName, "putawayNotifyBubble") ^ i2)) {
                         LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo sCLiveLocalL1 = PatchProxy.applyOneRefs(obj1, b, liveLocalLif, "9");
                         if (sCLiveLocalL1 != patchProxyRe) {
                         }else if(b.W8(obj1)){
                            bizData = obj1.widget[i].materialMap.bizData;
                            a.o(bizData, "msg.widget[0].materialMap.bizData");
                         }else {
                            bizData = "";
                         }
                         sCLiveLocalL1 = bizData;
                         obj1 = oi.mChangeType;
                         if (obj1 != i2) {
                            if (obj1 != i1) {
                               if (obj1 == 3) {
                                  if (b.t != null) {
                                     b.X8(sCLiveLocalL1);
                                  }
                                  str1 = a.q(sCLiveLocalL1);
                                  integer = Integer.valueOf(3);
                                  if (b.t != null) {
                                     i = true;
                                  }
                                  immutableMap2 = ImmutableMap.of("bizData", str1, "state", integer, "isCurrentBubbleShowing", Boolean.valueOf(i));
                                  a.o(immutableMap2, "ImmutableMap.of\(\n       ¡­ubble != null\n          \)");
                                  b.V8("NewProductBubbleUpdate", immutableMap2, null);
                               }
                            }else if(b.t != null){
                               b.X8(sCLiveLocalL1);
                            }
                            str1 = a.q(sCLiveLocalL1);
                            integer = Integer.valueOf(i1);
                            if (b.t != null) {
                               i = true;
                            }
                            immutableMap2 = ImmutableMap.of("bizData", str1, "state", integer, "isCurrentBubbleShowing", Boolean.valueOf(i));
                            a.o(immutableMap2, "ImmutableMap.of\(\n       ¡­ubble != null\n          \)");
                            b.V8("NewProductBubbleUpdate", immutableMap2, null);
                         }else if(b.t != null){
                            b.X8(sCLiveLocalL1);
                         }else {
                            try{
                               throwable = PatchProxy.applyTwoRefs(sCLiveLocalL1, widgetMountI, b, liveLocalLif, "13");
                               str3 = "mLiveServiceManager";
                               if (throwable != patchProxyRe) {
                               }else if(b.getActivity() != null){
                                  Activity activity = b.getActivity();
                                  a.m(activity);
                                  a.o(activity, "activity!!");
                                  LocalLifeRNContainerView localLifeRNC = new LocalLifeRNContainerView(activity);
                                  localLifeRNC.setMinimumHeight(i2);
                                  q = (!(widgetMountI.getRenderUri()).length())? 1: null;
                                  if (!q) {
                                     String renderUri = widgetMountI.getRenderUri();
                                     Throwable throwable1 = PatchProxy.applyTwoRefs(sCLiveLocalL1, renderUri, b, liveLocalLif, "14");
                                     if (throwable1 != patchProxyRe) {
                                     }else if(!renderUri.length()){
                                        throwable1 = 1;
                                     }else {
                                        throwable1 = null;
                                     }
                                     if (throwable1) {
                                        throwable1 = null;
                                     }else {
                                        Uri uri = Uri.parse(renderUri);
                                        String str4 = x0.a(uri, "bundleId");
                                        String str5 = x0.a(uri, "componentName");
                                        a.o(str5, "SafetyUriUtil.getQueryPa¡­Uri\(uri, \"componentName\"\)");
                                        b.v = str5;
                                        a1 = b.q;
                                        if (a1 == null) {
                                           a.S(str3);
                                        }
                                        str5 = a1.a(a.class).getLiveId();
                                        LaunchModel$b uob = new LaunchModel$b();
                                        uob.i(str4);
                                        uob.j(b.v);
                                        LiveLocalLifeNewProductBubblePresenter r = b.r;
                                        if (r == null) {
                                           a.S("mLiveBasicContext");
                                        }
                                        uob.e("liveStreamId", r.getLiveStreamId());
                                        uob.e("liveId", str5);
                                        uob.e("bubbleInfo", sCLiveLocalL1);
                                        uob.b("width", b.R8());
                                        Object obj2 = PatchProxy.apply(null, b, liveLocalLif, "12");
                                        int i4 = (obj2 != patchProxyRe)? obj2.intValue(): (int)((float)b.R8() * 0x3ebf86a3);
                                        uob.b("height", i4);
                                        throwable1 = uob.h();
                                     }
                                     if (b.getActivity() instanceof FragmentActivity) {
                                        Activity activity1 = b.getActivity();
                                        Objects.requireNonNull(activity1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                        localLifeRNC.e(b.getActivity(), activity1, throwable1, new c(b));
                                     }
                                  }
                               }
                            label_0278 :
                               throwable = null;
                            }catch(java.lang.Exception e0){
                            }
                               if (throwable != null) {
                                  a1 = b.A;
                                  q = b.q;
                                  if (q == null) {
                                     a.S(str3);
                                  }
                                  LocalLifeRNBubble localLifeRNB = new LocalLifeRNBubble(a1, q);
                                  LocalLifeRNBubble localLifeRNB1 = LocalLifeRNBubble.class;
                                  if (!PatchProxy.applyVoidTwoRefs(throwable, widgetMountI, localLifeRNB, localLifeRNB1, "2")) {
                                     a.p(throwable, "view");
                                     a.p(widgetMountI, "mountInfo");
                                     int i3 = System.identityHashCode(throwable);
                                     Map map = PatchProxy.apply(null, localLifeRNB, localLifeRNB1, str);
                                     if (map == patchProxyRe) {
                                        map = localLifeRNB.a.getValue();
                                     }
                                     if (!map.containsKey(Integer.valueOf(i3)) && (!widgetMountI.getCheckAllowShowBubble() || localLifeRNB.b.b())) {
                                        a uoa = PatchProxy.applyTwoRefs(throwable, widgetMountI, localLifeRNB, localLifeRNB1, "4");
                                        if (uoa != patchProxyRe) {
                                        }else if(widgetMountI.isAnchorYellowCar()){
                                           Context context = throwable.getContext();
                                           a.o(context, "view.context");
                                           uoa = new a(context, throwable, widgetMountI);
                                        }else {
                                           uoa = new e(throwable, widgetMountI, throwable.getContext());
                                        }
                                        uoa.r(widgetMountI.getShowMills());
                                        uoa.b(LocalLifeRNBubble$b.a);
                                        uoa.a(LocalLifeRNBubble$c.a);
                                        localLifeRNB.b.c(uoa);
                                     }
                                  }
                               }
                         }
                      label_030b :
                         String str2 = a.a.q(sCLiveLocalL1);
                         Integer integer1 = Integer.valueOf(1);
                         i = (b.t != null)? true: false;
                         immutableMap2 = ImmutableMap.of("bizData", str2, "state", integer1, "isCurrentBubbleShowing", Boolean.valueOf(i));
                         a.o(immutableMap2, "ImmutableMap.of\(\n       ¡­ubble != null\n          \)");
                         b.V8("NewProductBubbleUpdate", immutableMap2, null);
                      }
                   }
                }
             }
             ImmutableMap immutableMap = ImmutableMap.of("signal", a.a.q(obj1));
             a.o(immutableMap, "ImmutableMap.of\(\"signal\"¡­ns.KWAI_GSON.toJson\(msg\)\)");
             b.V8("NewProductBubbleSignal", immutableMap, null);
             goto label_004c ;
          }
       }
    label_0331 :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
