package com.kuaishou.live.preview.item.bottomcard.widget.LivePreviewLocalLifeBottomCardWidget;
import ok3.b;
import gk3.b;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.preview.item.bottomcard.widget.LivePreviewLocalLifeBottomCardWidget$mDCompositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.animation.Animator;
import ok3.a;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import z77.b;
import android.content.Context;
import android.view.View;
import com.kwai.locallife.api.live.bean.LocalLifeWidgetInfo;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import crd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import b87.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kuaishou.live.preview.item.bottomcard.widget.LivePreviewLocalLifeBottomCardWidget$a;
import erd.g;
import crd.b;
import b87.a;
import com.kuaishou.live.preview.item.bottomcard.widget.LivePreviewLocalLifeBottomCardWidget$b;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kwai.locallife.api.live.bean.MaterialMap;
import java.lang.StringBuilder;
import java.util.UUID;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kuaishou.krn.model.LaunchModel;

public class LivePreviewLocalLifeBottomCardWidget implements b	// class@000da9
{
    public View d;
    public final p e;
    public final b f;
    public final LivePreviewBottomCardModel g;

    public void LivePreviewLocalLifeBottomCardWidget(b p0,LivePreviewBottomCardModel p1){
       a.p(p0, "mBottomCardContext");
       a.p(p1, "mLivePreviewBottomCardModel");
       super();
       this.f = p0;
       this.g = p1;
       this.e = s.c(LivePreviewLocalLifeBottomCardWidget$mDCompositeDisposable$2.INSTANCE);
    }
    public Animator a(){
       return a.d(this);
    }
    public void b(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewLocalLifeBottomCardWidget.class, "2")) {
          return;
       }
       a.p(p0, "container");
       View view = d.a(0x354d71de).Kt(p0.getContext());
       a.o(view, "PluginManager.get\(LocalL¡­erView\(container.context\)");
       this.d = view;
       return;
    }
    public void c(){
       boolean b;
       LaunchModel$b uob;
       Object[] objArray1;
       LocalLifeWidgetInfo localLifeWid = LocalLifeWidgetInfo.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LivePreviewLocalLifeBottomCardWidget livePreviewL = LivePreviewLocalLifeBottomCardWidget.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, livePreviewL, "4")) {
          return;
       }
       LivePreviewLocalLifeBottomCardWidget tg = this.g;
       Object obj = PatchProxy.applyOneRefs(tg, this, livePreviewL, "10");
       if (obj != patchProxyRe) {
       }else {
          obj = a.a.h(tg.mCustomCardContentInfo, localLifeWid);
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.j().c(f.g(b.class, mAIN).subscribe(new LivePreviewLocalLifeBottomCardWidget$a(this)));
       this.j().c(f.g(a.class, mAIN).subscribe(new LivePreviewLocalLifeBottomCardWidget$b(this)));
       if (!PatchProxy.applyVoidOneRefs(obj, this, livePreviewL, "6") && obj != null) {
          String obj1 = PatchProxy.apply(objArray, obj, localLifeWid, "8");
          b = true;
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if((obj.a()).length() > 0){
             obj1 = 1;
          }else {
             obj1 = null;
          }
          if (obj1) {
             String str = PatchProxy.apply(objArray, obj, localLifeWid, "6");
             if (str != patchProxyRe) {
             }else if(obj.c() != null){
                str = x0.a(obj.c(), "componentName");
                a.o(str, "SafetyUriUtil.getQueryPa¡­nderUri, \"componentName\"\)");
             }else {
                str = "";
             }
             uob = (str.length() > 0)? 1: null;
             if (!uob) {
             label_00b1 :
                b = false;
             }
          }else {
             goto label_00b1 ;
          }
          if (b) {
             uob = new LaunchModel$b();
             uob.i(obj.a());
             uob.j(obj.mComponentName);
             MaterialMap materialMap = obj.b();
             materialMap = (materialMap != null)? materialMap.mBizData: objArray;
             uob.e("bizData", materialMap);
             uob.e("liveId", "liveId-"+UUID.randomUUID());
             LivePreviewLocalLifeBottomCardWidget td = this.d;
             if (td == null) {
                a.S("mKRNContainerView");
             }
             if (td instanceof KwaiRnContainerView) {
                objArray = td;
             }
             if (objArray != null) {
                ActivityContext uActivityCon = ActivityContext.g();
                a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                objArray.c(uActivityCon.e(), uob.h());
             }
          }
       }
    label_0115 :
       return;
    }
    public void d(){
       a.h(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLocalLifeBottomCardWidget.class, "5")) {
          return;
       }
       if (!this.j().isDisposed()) {
          this.j().dispose();
       }
       return;
    }
    public int f(){
       return a.b(this);
    }
    public Animator g(){
       return a.e(this);
    }
    public View getView(){
       LivePreviewLocalLifeBottomCardWidget obj = PatchProxy.apply(null, this, LivePreviewLocalLifeBottomCardWidget.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mKRNContainerView");
       }
       return obj;
    }
    public Animator h(){
       return a.a(this);
    }
    public View i(){
       return a.c(this);
    }
    public final a j(){
       Object obj = PatchProxy.apply(null, this, LivePreviewLocalLifeBottomCardWidget.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
}
