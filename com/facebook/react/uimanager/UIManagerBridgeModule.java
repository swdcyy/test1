package com.facebook.react.uimanager.UIManagerBridgeModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule$b;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.UIManagerBridgeModule$a;
import java.util.List;
import com.facebook.react.uimanager.UIManagerBridgeModule$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.react.uimanager.h;
import com.facebook.react.bridge.WritableMap;
import ze.q0;
import ze.w0;
import java.lang.Boolean;
import java.util.Objects;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import bf.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import ze.t0;
import java.lang.Double;
import java.util.Map;
import com.facebook.react.uimanager.UIManagerModule$a;
import df.c;
import ze.m;
import ze.x;
import com.facebook.react.uimanager.f;
import com.facebook.react.bridge.MemoryStatsCallback;
import com.facebook.react.uimanager.l;
import cf.a;

public class UIManagerBridgeModule extends UIManagerModule	// class@00132c
{
    public final h mDelegate;

    public void UIManagerBridgeModule(ReactApplicationContext p0,UIManagerModule$b p1,int p2,int p3){
       super(p0, p1, new g(), p2, p3);
    }
    public void UIManagerBridgeModule(ReactApplicationContext p0,UIManagerModule$b p1,g p2,int p3,int p4){
       super(p0);
       UIManagerBridgeModule$a uoa = new UIManagerBridgeModule$a(this, p0, p1, p3, p4);
       this.mDelegate = p2;
    }
    public void UIManagerBridgeModule(ReactApplicationContext p0,List p1,UIManagerModule$b p2,int p3,int p4){
       super(p0, p1, p2, new g(), p3, p4);
    }
    public void UIManagerBridgeModule(ReactApplicationContext p0,List p1,UIManagerModule$b p2,g p3,int p4,int p5){
       super(p0);
       UIManagerBridgeModule$b uob = new UIManagerBridgeModule$b(this, p0, p1, p2, new g(), p4, p5);
       this.mDelegate = p3;
    }
    public int addRootView(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIManagerBridgeModule.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mDelegate.a(p0);
    }
    public int addRootView(View p0,WritableMap p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, UIManagerBridgeModule.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mDelegate.b(p0, p1, p2);
    }
    public void addUIBlock(q0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerBridgeModule.class, "46")) {
          return;
       }
       this.mDelegate.c(p0);
       return;
    }
    public void addUIManagerListener(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerBridgeModule.class, "48")) {
          return;
       }
       this.mDelegate.d(p0);
       return;
    }
    public UIManagerModule asUIManagerModule(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.e();
    }
    public boolean canOverrideExistingModule(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(this.mDelegate);
       return false;
    }
    public void clearJSResponder(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "32")) {
          return;
       }
       this.mDelegate.f();
       return;
    }
    public void configureNextLayoutAnimation(ReadableMap p0,Callback p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UIManagerBridgeModule.class, "40")) {
          return;
       }
       this.mDelegate.h(p0, p1, p2);
       return;
    }
    public void createView(int p0,String p1,int p2,ReadableMap p3){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, UIManagerBridgeModule.class, "19")) {
          return;
       }
       this.mDelegate.j(p0, p1, p2, p3);
       return;
    }
    public void createViewBatch(int p0,ReadableArray p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "21")) {
          return;
       }
       this.mDelegate.k(p0, p1);
       return;
    }
    public void deleteViewBatch(int p0,ReadableArray p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "23")) {
          return;
       }
       this.mDelegate.l(p0, p1);
       return;
    }
    public void dismissPopupMenu(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "38")) {
          return;
       }
       this.mDelegate.m();
       return;
    }
    public void dispatchCommand(int p0,int p1,ReadableArray p2){
       this.mDelegate.n(p0, p1, p2);
    }
    public void dispatchCommand(int p0,String p1,ReadableArray p2){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, UIManagerBridgeModule.class, "35")) {
          return;
       }
       this.mDelegate.o(p0, p1, p2);
       return;
    }
    public void dispatchViewManagerCommand(int p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, UIManagerBridgeModule.class, "33")) {
          return;
       }
       this.mDelegate.p(p0, p1, p2);
       return;
    }
    public void dispatchViewManagerCommand(int p0,Dynamic p1,ReadableArray p2){
       UIManager uIManager;
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, UIManagerBridgeModule.class, "34")) {
          return;
       }
       UIManagerBridgeModule tmDelegate = this.mDelegate;
       Objects.requireNonNull(tmDelegate);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, tmDelegate, h.class, "36")) {
          if (p1.getType() == ReadableType.Number) {
             int i = p1.asInt();
             uIManager = t0.a(tmDelegate.C(), a.a(p0));
             if (uIManager != null) {
                uIManager.dispatchCommand(p0, i, p2);
             }
          }else if(p1.getType() == ReadableType.String){
             String str = p1.asString();
             uIManager = t0.a(tmDelegate.C(), a.a(p0));
             if (uIManager != null) {
                uIManager.dispatchCommand(p0, str, p2);
             }
          }
       }
       return;
    }
    public void dispatchViewManagerStringCommand(Double p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UIManagerBridgeModule.class, "36")) {
          return;
       }
       this.mDelegate.q(p0, p1, p2);
       return;
    }
    public void enableDataView(boolean p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uIManagerBri, "62")) {
          return;
       }
       this.mDelegate.r(p0);
       return;
    }
    public void endBatch(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "24")) {
          return;
       }
       this.mDelegate.t();
       return;
    }
    public void findSubviewIn(int p0,ReadableArray p1,Callback p2){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, UIManagerBridgeModule.class, "30")) {
          return;
       }
       this.mDelegate.u(p0, p1, p2);
       return;
    }
    public Map getConstants(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.v();
    }
    public WritableMap getConstantsForViewManager(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIManagerBridgeModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.w(p0);
    }
    public WritableMap getDefaultEventTypes(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.x();
    }
    public UIManagerModule$a getDirectEventNamesResolver(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.y();
    }
    public c getEventDispatcher(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.z();
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.mDelegate);
       return "UIManager";
    }
    public m getNativeViewHierarchyManager(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.A();
    }
    public Map getPerformanceCounters(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.B();
    }
    public x getReactShadowNode(int p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uIManagerBri, "60");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mDelegate.D(p0);
    }
    public f getUIImplementation(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.E();
    }
    public void getUIMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerBridgeModule.class, "58")) {
          return;
       }
       this.mDelegate.F(p0);
       return;
    }
    public l getViewManagerRegistry_DO_NOT_USE(){
       return this.mDelegate.G();
    }
    public boolean hasConstants(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(this.mDelegate);
       return false;
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "4")) {
          return;
       }
       this.mDelegate.H();
       return;
    }
    public void invalidate(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "57")) {
          return;
       }
       Objects.requireNonNull(this.mDelegate);
       return;
    }
    public void invalidateNodeLayout(int p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uIManagerBri, "51")) {
          return;
       }
       this.mDelegate.I(p0);
       return;
    }
    public WritableMap lazilyLoadView(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIManagerBridgeModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.J(p0);
    }
    public void manageChildren(int p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uIManagerBri, "25")) {
             return;
          }
       }
       this.mDelegate.K(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void measure(int p0,Callback p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "27")) {
          return;
       }
       this.mDelegate.L(p0, p1);
       return;
    }
    public void measureInWindow(int p0,Callback p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "28")) {
          return;
       }
       this.mDelegate.M(p0, p1);
       return;
    }
    public void measureLayout(int p0,int p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, UIManagerBridgeModule.class, "29")) {
          return;
       }
       this.mDelegate.N(p0, p1, p2, p3);
       return;
    }
    public void measureLayoutRelativeToParent(int p0,Callback p1,Callback p2){
       this.mDelegate.O(p0, p1, p2);
    }
    public void onBatchComplete(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "41")) {
          return;
       }
       this.mDelegate.P();
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "6")) {
          return;
       }
       this.mDelegate.Q();
       return;
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "61")) {
          return;
       }
       this.mDelegate.onHostResume();
       return;
    }
    public void playTouchSound(){
       this.mDelegate.R();
    }
    public void preComputeConstantsForViewManager(List p0){
       this.mDelegate.S(p0);
    }
    public void prependUIBlock(q0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerBridgeModule.class, "47")) {
          return;
       }
       this.mDelegate.T(p0);
       return;
    }
    public void profileNextBatch(){
       if (PatchProxy.applyVoid(null, this, UIManagerBridgeModule.class, "10")) {
          return;
       }
       this.mDelegate.U();
       return;
    }
    public void removeRootView(int p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uIManagerBri, "15")) {
          return;
       }
       this.mDelegate.V(p0);
       return;
    }
    public void removeRootViewByNative(int p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uIManagerBri, "16")) {
          return;
       }
       this.mDelegate.W(p0);
       return;
    }
    public void removeSubviewsFromContainerWithID(int p0){
       this.mDelegate.X(p0);
    }
    public void removeUIManagerListener(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerBridgeModule.class, "49")) {
          return;
       }
       this.mDelegate.Y(p0);
       return;
    }
    public void replaceExistingNonRootView(int p0,int p1){
       this.mDelegate.Z(p0, p1);
    }
    public int resolveRootTagFromReactTag(int p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uIManagerBri, "50");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mDelegate.a0(p0);
    }
    public View resolveView(int p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uIManagerBri, "53");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mDelegate.b0(p0);
    }
    public void sendAccessibilityEvent(int p0,int p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uIManagerBri, "44")) {
          return;
       }
       this.mDelegate.c0(p0, p1);
       return;
    }
    public void setAllowImmediateUIOperationExecution(boolean p0){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, UIManagerBridgeModule.class, "45")) {
          return;
       }
       Objects.requireNonNull(this.mDelegate);
       return;
    }
    public void setChildren(int p0,ReadableArray p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "26")) {
          return;
       }
       this.mDelegate.d0(p0, p1);
       return;
    }
    public void setJSResponder(int p0,boolean p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uIManagerBri, "31")) {
          return;
       }
       this.mDelegate.e0(p0, p1);
       return;
    }
    public void setLayoutAnimationEnabledExperimental(boolean p0){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uIManagerBri, "39")) {
          return;
       }
       this.mDelegate.f0(p0);
       return;
    }
    public void setViewHierarchyUpdateDebugListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerBridgeModule.class, "42")) {
          return;
       }
       this.mDelegate.g0(p0);
       return;
    }
    public void setViewLocalData(int p0,Object p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "18")) {
          return;
       }
       this.mDelegate.h0(p0, p1);
       return;
    }
    public void showPopupMenu(int p0,ReadableArray p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, UIManagerBridgeModule.class, "37")) {
          return;
       }
       this.mDelegate.i0(p0, p1, p2, p3);
       return;
    }
    public void synchronouslyUpdateViewOnUIThread(int p0,ReadableMap p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "13")) {
          return;
       }
       this.mDelegate.j0(p0, p1);
       return;
    }
    public void updateNodeSize(int p0,int p1,int p2){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, UIManagerBridgeModule.class, "17")) {
          return;
       }
       this.mDelegate.k0(p0, p1, p2);
       return;
    }
    public void updateRootLayoutSpecs(int p0,int p1,int p2){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, UIManagerBridgeModule.class, "52")) {
          return;
       }
       this.mDelegate.l0(p0, p1, p2);
       return;
    }
    public void updateView(int p0,String p1,ReadableMap p2){
       if (PatchProxy.isSupport(UIManagerBridgeModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, UIManagerBridgeModule.class, "20")) {
          return;
       }
       this.mDelegate.m0(p0, p1, p2);
       return;
    }
    public void updateViewBatch(int p0,ReadableArray p1){
       UIManagerBridgeModule uIManagerBri = UIManagerBridgeModule.class;
       if (PatchProxy.isSupport(uIManagerBri) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerBri, "22")) {
          return;
       }
       this.mDelegate.n0(p0, p1);
       return;
    }
    public void viewIsDescendantOf(int p0,int p1,Callback p2){
       this.mDelegate.o0(p0, p1, p2);
    }
}
