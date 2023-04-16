package com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import jod.f;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.util.List;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.view.View;
import android.widget.AbsoluteLayout$LayoutParams;
import android.content.Context;
import android.widget.AbsoluteLayout;
import xf6.l;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;
import android.graphics.PointF;
import java.lang.Math;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import android.os.Parcel;

public final class NewEditTextV3Element extends NewEditTextBaseElement	// class@000b8f
{
    public DecorationContainerView containerView;
    public NewTextElementV3Data currentTextElementData;
    public final NewTextElementV3Data initTextElementData;
    public float lastMotionEventX;
    public float lastMotionEventY;

    public void NewEditTextV3Element(NewTextElementV3Data p0){
       a.p(p0, "initTextElementData");
       super(p0);
       this.initTextElementData = p0;
       this.currentTextElementData = p0;
       this.lastMotionEventX = 0xbf800000;
       this.lastMotionEventY = 0xbf800000;
    }
    public int describeContents(){
       return 0;
    }
    public final DecorationContainerView getContainerView(){
       NewEditTextV3Element obj = PatchProxy.apply(null, this, NewEditTextV3Element.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.containerView;
       if (obj == null) {
          a.S("containerView");
       }
       return obj;
    }
    public Rect getContentRect(){
       Object obj = PatchProxy.apply(null, this, NewEditTextV3Element.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = (float)2;
       float f1 = this.mBaseDrawerData.i() / f;
       float f2 = this.mBaseDrawerData.f() / f;
       return new Rect((int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) - f1), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) - f2), (int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) + f1), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) + f2));
    }
    public final NewTextElementV3Data getCurrentTextElementData(){
       return this.currentTextElementData;
    }
    public final NewTextElementV3Data getInitTextElementData(){
       return this.initTextElementData;
    }
    public final f getKeyboardData(){
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NewEditTextV3Element obj1 = PatchProxy.apply(objArray, obj, NewEditTextV3Element.class, "6");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = obj.currentTextElementData;
       Objects.requireNonNull(obj1);
       f uof = PatchProxy.apply(objArray, obj1, NewTextElementV3Data.class, "10");
       if (uof != patchProxyRe) {
       }else {
          TextStyleValue textStyleVal = new TextStyleValue(0, null, null, null, null, 0, null, false, 255, null);
          f uof1 = new f(obj1.G0().j(), obj1.G0().f(), new TextStyleAttrs(false, false, false, null, 15, null), v8, obj1.G0().c(), obj1.G0().d(), obj1.G0().j, obj1.G0().g());
       }
       return uof;
    }
    public Rect getOriginContentRect(){
       Object obj = PatchProxy.apply(null, this, NewEditTextV3Element.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContentRect();
    }
    public Rect getOutBoxRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditTextV3Element.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getOutBoxRect();
       a.o(obj, "super.getOutBoxRect\(\)");
       return obj;
    }
    public Rect getScaleContentRect(){
       Object obj = PatchProxy.apply(null, this, NewEditTextV3Element.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContentRect();
    }
    public Rect getScaleOutBoxRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditTextV3Element.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getScaleOutBoxRect();
       a.o(obj, "super.getScaleOutBoxRect\(\)");
       return obj;
    }
    public View initView(DecorationContainerView p0){
       AbsoluteLayout$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, NewEditTextV3Element.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       this.containerView = p0;
       obj = new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0);
       View view = new View(p0.getContext());
       if (l.c("enable_show_ae_lyrics_debug_view", 0)) {
          Context context = view.getContext();
          a.o(context, "textPainterView.context");
          view.setBackgroundColor(context.getResources().getColor(R.color.arg_RES_7f061c39));
       }
       view.setLayoutParams(obj);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       NewEditTextV3Element tcontainerVi = this.containerView;
       if (tcontainerVi == null) {
          a.S("containerView");
       }
       tmBaseDrawer.Q(tcontainerVi.P());
       return view;
    }
    public boolean isEnableSelectBox(){
       return true;
    }
    public boolean isNewText(){
       return true;
    }
    public void onSingleFingerScaleAndRotateEnd(){
       if (PatchProxy.applyVoid(null, this, NewEditTextV3Element.class, "9")) {
          return;
       }
       super.onSingleFingerScaleAndRotateEnd();
       this.lastMotionEventX = 0xbf800000;
       this.lastMotionEventY = 0xbf800000;
       return;
    }
    public void onSingleFingerScaleAndRotateStart(float p0,float p1){
       if (PatchProxy.isSupport(NewEditTextV3Element.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NewEditTextV3Element.class, "7")) {
          return;
       }
       super.onSingleFingerScaleAndRotateStart(p0, p1);
       this.lastMotionEventX = p0;
       this.lastMotionEventY = p1;
       return;
    }
    public void scaleAndRotateForSingleFinger(float p0,float p1){
       if (PatchProxy.isSupport(NewEditTextV3Element.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NewEditTextV3Element.class, "8")) {
          return;
       }
       if (!this.mBaseDrawerData.H() && !this.mBaseDrawerData.G()) {
          return;
       }
       Rect scaleOutBoxR = this.getScaleOutBoxRect();
       float f = (float)scaleOutBoxR.width() / 2.00f;
       float f1 = (float)scaleOutBoxR.height() / 2.00f;
       float f2 = PointF.length(((p0 - this.lastMotionEventX) + f), ((p1 - this.lastMotionEventY) + f1));
       f1 = PointF.length(f, f1);
       if (this.mBaseDrawerData.H()) {
          this.updateScaleWithLimit(Math.min(Math.max((this.mBaseDrawerData.A() * (f2 / f1)), 0.30f), 4.00f));
       }
       this.lastMotionEventX = p0;
       this.lastMotionEventY = p1;
       return;
    }
    public final void setContainerView(DecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextV3Element.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.containerView = p0;
       return;
    }
    public final void setCurrentTextElementData(NewTextElementV3Data p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextV3Element.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.currentTextElementData = p0;
       return;
    }
    public void updateElement(NewTextBaseElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextV3Element.class, "5")) {
          return;
       }
       a.p(p0, "newElementData");
       this.mBaseDrawerData.P0(p0);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       NewEditTextV3Element tcontainerVi = this.containerView;
       if (tcontainerVi == null) {
          a.S("containerView");
       }
       tmBaseDrawer.Q(tcontainerVi.P());
       tmBaseDrawer = this.mDecorationShowingView;
       a.o(tmBaseDrawer, "mDecorationShowingView");
       ViewGroup$LayoutParams layoutParams = tmBaseDrawer.getLayoutParams();
       layoutParams.width = (int)this.mBaseDrawerData.i();
       layoutParams.height = (int)this.mBaseDrawerData.f();
       BaseDrawer tmDecoration = this.mDecorationShowingView;
       a.o(tmDecoration, "mDecorationShowingView");
       tmDecoration.setLayoutParams(layoutParams);
       NewEditTextV3Element tcontainerVi1 = this.containerView;
       if (tcontainerVi1 == null) {
          a.S("containerView");
       }
       tcontainerVi1.T();
       this.currentTextElementData = p0;
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
    }
}
