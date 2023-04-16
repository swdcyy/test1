package com.kuaishou.commercial.tach.component.ADAnimationWrapper;
import com.tachikoma.core.component.e;
import java.lang.Object;
import android.view.View;
import yp8.a;
import jq8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kp8.d;
import java.util.Objects;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable;
import com.facebook.yoga.YogaEdge;
import lg.i;
import java.lang.StringBuilder;
import android.widget.TextView;
import iq8.n;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;

public class ADAnimationWrapper	// class@001646
{
    public a mNode;
    public a mTKDomNode;
    public View mTarget;
    public e mTkBase;
    public static final int KEY_TAG = 4369;
    public static final String TAG = "ViewAnimationWrapper";
    public static final boolean sEnableLog;

    public void ADAnimationWrapper(e p0){
       super();
       this.mTkBase = p0;
       View view = p0.getView();
       this.mTarget = view;
       view.setTag(R.id.viewtag, this);
       a domNode = p0.getDomNode();
       this.mTKDomNode = domNode;
       this.mNode = domNode.c();
    }
    public int getBackgroundColor(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, ADAnimationWrapper.class, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.mTkBase.getViewBackgroundManager();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, d.class, "7");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(obj.h != null){
          TKViewBackgroundDrawable tKViewBackgr = obj.a();
          if (tKViewBackgr != null) {
             i = tKViewBackgr.getColor();
          }
       }
       i = 0;
       return i;
    }
    public float getBorderRadius(){
       Object obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTkBase.getViewBackgroundManager().g;
    }
    public float getBottom(){
       YogaEdge obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = YogaEdge.BOTTOM;
       if (this.isUndefined(obj)) {
          this.log("getBottom: undefined");
          return 0;
       }else {
          i a = this.mNode.k(obj).a;
          this.log("getBottom: "+a);
          return a;
       }
    }
    public float getEnd(){
       YogaEdge obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = YogaEdge.END;
       if (this.isUndefined(obj)) {
          return 0;
       }
       return this.mNode.k(obj).a;
    }
    public float getFontSize(){
       Object obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       ADAnimationWrapper tmTarget = this.mTarget;
       if (tmTarget instanceof TextView) {
          f = (float)n.e(tmTarget.getTextSize());
       }
       return f;
    }
    public float getHeight(){
       i obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mNode.d().a;
       this.log("getHeight: "+obj);
       return obj;
    }
    public float getLeft(){
       YogaEdge obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = YogaEdge.LEFT;
       if (this.isUndefined(obj)) {
          this.log("getLeft: undefined");
          return 0;
       }else {
          i a = this.mNode.k(obj).a;
          this.log("getLeft:  "+a);
          return a;
       }
    }
    public float getOpacity(){
       Object obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float alpha = this.mTarget.getAlpha();
       this.log("getOpacity: "+alpha);
       return alpha;
    }
    public float getRight(){
       YogaEdge obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = YogaEdge.RIGHT;
       if (this.isUndefined(obj)) {
          return 0;
       }
       return this.mNode.k(obj).a;
    }
    public float getStart(){
       YogaEdge obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = YogaEdge.START;
       if (this.isUndefined(obj)) {
          this.log("getStart: undefined");
          return 0;
       }else {
          i a = this.mNode.k(obj).a;
          this.log("getStart: "+a);
          return a;
       }
    }
    public int getTextColor(){
       ADAnimationWrapper obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTarget;
       if (obj instanceof TextView) {
          return obj.getCurrentTextColor();
       }
       return 0;
    }
    public float getTop(){
       YogaEdge obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = YogaEdge.TOP;
       if (this.isUndefined(obj)) {
          this.log("getTop: undefined");
          return 0;
       }else {
          i a = this.mNode.k(obj).a;
          this.log("getTop: "+a);
          return a;
       }
    }
    public float getWidth(){
       i obj = PatchProxy.apply(null, this, ADAnimationWrapper.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mNode.l().a;
       this.log("getWidth: "+obj+" to : "+this.mNode.l().toString());
       return obj;
    }
    public boolean isUndefined(YogaEdge p0){
       ADAnimationWrapper obj = PatchProxy.applyOneRefs(p0, this, ADAnimationWrapper.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mNode;
       if (obj != null && obj.k(p0) != null) {
          return this.mNode.k(p0).equals(i.c);
       }
       return true;
    }
    public void log(String p0){
    }
    public void setBackgroundColor(int p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uADAnimation, "1")) {
          return;
       }
       this.mTkBase.getViewBackgroundManager().b(p0);
       return;
    }
    public void setBorderRadius(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "3")) {
          return;
       }
       this.mTkBase.getViewBackgroundManager().f(p0);
       return;
    }
    public void setBottom(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "25")) {
          return;
       }
       this.mNode.B(YogaEdge.BOTTOM, p0);
       return;
    }
    public void setEnd(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "19")) {
          return;
       }
       this.mNode.B(YogaEdge.END, p0);
       return;
    }
    public void setFontSize(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "5")) {
          return;
       }
       uADAnimation = this.mTarget;
       if (uADAnimation instanceof TextView) {
          uADAnimation.setTextSize(1, p0);
       }
       this.log("setFontSize size = "+p0);
       return;
    }
    public void setHeight(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "23")) {
          return;
       }
       this.mNode.s(p0);
       this.log("setHeight: "+p0);
       return;
    }
    public void setLeft(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "14")) {
          return;
       }
       this.mNode.B(YogaEdge.LEFT, p0);
       this.log("setLeft: value = "+p0);
       return;
    }
    public void setOpacity(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "7")) {
          return;
       }
       this.log("setOpacity: "+p0);
       this.mTarget.setAlpha(p0);
       return;
    }
    public void setRight(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "17")) {
          return;
       }
       this.mNode.B(YogaEdge.RIGHT, p0);
       this.log("setRight: value = "+p0);
       return;
    }
    public void setStart(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "15")) {
          return;
       }
       this.mNode.B(YogaEdge.START, p0);
       this.mTarget.setTranslationX((p0 - this.getStart()));
       return;
    }
    public void setTextColor(int p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uADAnimation, "9")) {
          return;
       }
       uADAnimation = this.mTarget;
       if (uADAnimation instanceof TextView) {
          uADAnimation.setTextColor(p0);
       }
       return;
    }
    public void setTop(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "12")) {
          return;
       }
       this.mNode.B(YogaEdge.TOP, p0);
       this.log("setTop: value = "+p0);
       return;
    }
    public void setWidth(float p0){
       ADAnimationWrapper uADAnimation = ADAnimationWrapper.class;
       if (PatchProxy.isSupport(uADAnimation) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uADAnimation, "21")) {
          return;
       }
       this.mNode.D(p0);
       this.log("setWidth: "+p0);
       return;
    }
}
