package com.facebook.react.views.modal.ReactModalHostManager;
import jf.s;
import com.facebook.react.uimanager.ViewGroupManager;
import jf.r;
import ze.b;
import ze.n0;
import android.view.View;
import com.facebook.react.views.modal.ReactModalHostView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import com.facebook.react.views.modal.ReactModalHostManager$a;
import com.facebook.react.views.modal.ReactModalHostView$b;
import com.facebook.react.views.modal.ReactModalHostManager$b;
import android.content.DialogInterface$OnShowListener;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.modal.ModalHostShadowNode;
import ze.x;
import android.content.Context;
import ze.c1;
import java.util.Map;
import vd.d$b;
import vd.d;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableArray;
import ze.z;
import ze.m0;
import android.view.ViewGroup;
import android.graphics.Point;
import rf.a;
import java.lang.Integer;
import com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup;

public class ReactModalHostManager extends ViewGroupManager implements s	// class@0013c9
{
    public final c1 mDelegate;

    public void ReactModalHostManager(){
       super();
       this.mDelegate = new r(this);
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactModalHostView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactModalHostManager.class, "8")) {
          return;
       }
       c eventDispatc = p0.getNativeModule(UIManagerModule.class).getEventDispatcher();
       p1.setOnRequestCloseListener(new ReactModalHostManager$a(this, eventDispatc, p1));
       p1.setOnShowListener(new ReactModalHostManager$b(this, eventDispatc, p1));
       return;
    }
    public LayoutShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactModalHostManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ModalHostShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactModalHostView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactModalHostManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactModalHostView(p0);
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, this, ReactModalHostManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b("topRequestClose", d.d("registrationName", "onRequestClose"));
       obj.b("topShow", d.d("registrationName", "onShow"));
       return obj.a();
    }
    public String getName(){
       return "RCTModalHostView";
    }
    public Class getShadowNodeClass(){
       return ModalHostShadowNode.class;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactModalHostView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostManager.class, "10")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       p0.c();
       return;
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(ReactModalHostView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostManager.class, "3")) {
          return;
       }
       super.onDropViewInstance(p0);
       p0.b();
       return;
    }
    public void setAnimated(View p0,boolean p1){
       this.setAnimated(p0, p1);
    }
    public void setAnimated(ReactModalHostView p0,boolean p1){
    }
    public void setAnimationType(View p0,String p1){
       this.setAnimationType(p0, p1);
    }
    public void setAnimationType(ReactModalHostView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactModalHostManager.class, "4")) {
          return;
       }
       if (p1 != null) {
          p0.setAnimationType(p1);
       }
       return;
    }
    public void setHardwareAccelerated(View p0,boolean p1){
       this.setHardwareAccelerated(p0, p1);
    }
    public void setHardwareAccelerated(ReactModalHostView p0,boolean p1){
       ReactModalHostManager reactModalHo = ReactModalHostManager.class;
       if (PatchProxy.isSupport(reactModalHo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactModalHo, "7")) {
          return;
       }
       p0.setHardwareAccelerated(p1);
       return;
    }
    public void setIdentifier(View p0,int p1){
       this.setIdentifier(p0, p1);
    }
    public void setIdentifier(ReactModalHostView p0,int p1){
    }
    public void setPresentationStyle(View p0,String p1){
       this.setPresentationStyle(p0, p1);
    }
    public void setPresentationStyle(ReactModalHostView p0,String p1){
    }
    public void setStatusBarTranslucent(View p0,boolean p1){
       this.setStatusBarTranslucent(p0, p1);
    }
    public void setStatusBarTranslucent(ReactModalHostView p0,boolean p1){
       ReactModalHostManager reactModalHo = ReactModalHostManager.class;
       if (PatchProxy.isSupport(reactModalHo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactModalHo, "6")) {
          return;
       }
       p0.setStatusBarTranslucent(p1);
       return;
    }
    public void setSupportedOrientations(View p0,ReadableArray p1){
       this.setSupportedOrientations(p0, p1);
    }
    public void setSupportedOrientations(ReactModalHostView p0,ReadableArray p1){
    }
    public void setTransparent(View p0,boolean p1){
       this.setTransparent(p0, p1);
    }
    public void setTransparent(ReactModalHostView p0,boolean p1){
       ReactModalHostManager reactModalHo = ReactModalHostManager.class;
       if (PatchProxy.isSupport(reactModalHo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactModalHo, "5")) {
          return;
       }
       p0.setTransparent(p1);
       return;
    }
    public Object updateState(View p0,z p1,m0 p2){
       return this.updateState(p0, p1, p2);
    }
    public Object updateState(ReactModalHostView p0,z p1,m0 p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactModalHostManager.class, "11");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       Point point = a.a(p0.getContext());
       Point x = point.x;
       point = point.y;
       if (!PatchProxy.isSupport(ReactModalHostView.class) || !PatchProxy.applyVoidThreeRefs(p2, Integer.valueOf(x), Integer.valueOf(point), p0, ReactModalHostView.class, "14")) {
          p0.b.j(p2, x, point);
       }
       return null;
    }
}
