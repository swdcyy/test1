package com.facebook.react.uimanager.UIManagerTurboModule;
import com.facebook.react.uimanager.NativeUIManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule$b;
import com.facebook.react.uimanager.UIManagerTurboModule$a;
import java.util.List;
import com.facebook.react.uimanager.UIManagerTurboModule$b;
import com.facebook.react.uimanager.g;
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
import java.lang.Double;
import java.lang.Boolean;
import java.util.Objects;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.UIManagerModule$a;
import df.c;
import ze.m;
import java.util.Map;
import ze.x;
import com.facebook.react.uimanager.f;
import com.facebook.react.bridge.MemoryStatsCallback;
import com.facebook.react.uimanager.l;
import cf.a;

public class UIManagerTurboModule extends NativeUIManagerSpec	// class@001333
{
    public final h mDelegate;

    public void UIManagerTurboModule(ReactApplicationContext p0,UIManagerModule$b p1,int p2,int p3){
       super(p0);
       UIManagerTurboModule$a uoa = new UIManagerTurboModule$a(this, p0, p1, p2, p3);
       this.mDelegate = v6;
    }
    public void UIManagerTurboModule(ReactApplicationContext p0,List p1,UIManagerModule$b p2,int p3,int p4){
       super(p0);
       UIManagerTurboModule$b uob = new UIManagerTurboModule$b(this, p0, p1, p2, new g(), p3, p4);
       this.mDelegate = v8;
    }
    public int addRootView(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIManagerTurboModule.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mDelegate.a(p0);
    }
    public int addRootView(View p0,WritableMap p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, UIManagerTurboModule.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mDelegate.b(p0, p1, p2);
    }
    public void addUIBlock(q0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerTurboModule.class, "62")) {
          return;
       }
       this.mDelegate.c(p0);
       return;
    }
    public void addUIManagerListener(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerTurboModule.class, "53")) {
          return;
       }
       this.mDelegate.d(p0);
       return;
    }
    public void blur(Double p0){
    }
    public boolean canOverrideExistingModule(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(this.mDelegate);
       return false;
    }
    public void clearJSResponder(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "26")) {
          return;
       }
       this.mDelegate.f();
       return;
    }
    public void configureNextLayoutAnimation(ReadableMap p0,Callback p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UIManagerTurboModule.class, "47")) {
          return;
       }
       this.mDelegate.h(p0, p1, p2);
       return;
    }
    public void createView(int p0,String p1,int p2,ReadableMap p3){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, UIManagerTurboModule.class, "18")) {
          return;
       }
       this.mDelegate.j(p0, p1, p2, p3);
       return;
    }
    public void createView(Double p0,String p1,double p2,ReadableMap p3){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidFourRefs(p0, p1, Double.valueOf(p2), p3, this, UIManagerTurboModule.class, "31")) {
          return;
       }
       this.mDelegate.j(p0.intValue(), p1, (int)p2, p3);
       return;
    }
    public void createViewBatch(int p0,ReadableArray p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "21")) {
          return;
       }
       this.mDelegate.k(p0, p1);
       return;
    }
    public void deleteViewBatch(int p0,ReadableArray p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "20")) {
          return;
       }
       this.mDelegate.l(p0, p1);
       return;
    }
    public void dismissPopupMenu(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "43")) {
          return;
       }
       this.mDelegate.m();
       return;
    }
    public void dispatchCommand(int p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, UIManagerTurboModule.class, "28")) {
          return;
       }
       this.mDelegate.n(p0, p1, p2);
       return;
    }
    public void dispatchCommand(int p0,String p1,ReadableArray p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, UIManagerTurboModule.class, "29")) {
          return;
       }
       this.mDelegate.o(p0, p1, p2);
       return;
    }
    public void dispatchViewManagerCommand(int p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, UIManagerTurboModule.class, "27")) {
          return;
       }
       this.mDelegate.p(p0, p1, p2);
       return;
    }
    public void dispatchViewManagerCommand(Double p0,double p1,ReadableArray p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, this, UIManagerTurboModule.class, "35")) {
          return;
       }
       this.mDelegate.p(p0.intValue(), (int)p1, p2);
       return;
    }
    public void dispatchViewManagerStringCommand(Double p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UIManagerTurboModule.class, "36")) {
          return;
       }
       this.mDelegate.q(p0, p1, p2);
       return;
    }
    public void enableDataView(boolean p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uIManagerTur, "77")) {
          return;
       }
       this.mDelegate.r(p0);
       return;
    }
    public void endBatch(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "23")) {
          return;
       }
       this.mDelegate.t();
       return;
    }
    public void findSubviewIn(int p0,ReadableArray p1,Callback p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, UIManagerTurboModule.class, "67")) {
          return;
       }
       this.mDelegate.u(p0, p1, p2);
       return;
    }
    public void findSubviewIn(Double p0,ReadableArray p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UIManagerTurboModule.class, "34")) {
          return;
       }
       this.mDelegate.u(p0.intValue(), p1, p2);
       return;
    }
    public void focus(Double p0){
    }
    public WritableMap getConstantsForViewManager(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIManagerTurboModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.w(p0);
    }
    public WritableMap getDefaultEventTypes(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.x();
    }
    public UIManagerModule$a getDirectEventNamesResolver(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.y();
    }
    public c getEventDispatcher(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.z();
    }
    public String getName(){
       return "UIManagerTurbo";
    }
    public m getNativeViewHierarchyManager(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.A();
    }
    public Map getPerformanceCounters(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.B();
    }
    public x getReactShadowNode(int p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uIManagerTur, "75");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mDelegate.D(p0);
    }
    public Map getTypedExportedConstants(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.v();
    }
    public f getUIImplementation(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.E();
    }
    public void getUIMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerTurboModule.class, "73")) {
          return;
       }
       this.mDelegate.F(p0);
       return;
    }
    public l getViewManagerRegistry_DO_NOT_USE(){
       return this.mDelegate.G();
    }
    public boolean hasConstants(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(this.mDelegate);
       return false;
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "2")) {
          return;
       }
       this.mDelegate.H();
       return;
    }
    public void invalidate(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "61")) {
          return;
       }
       Objects.requireNonNull(this.mDelegate);
       return;
    }
    public void invalidateNodeLayout(int p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uIManagerTur, "72")) {
          return;
       }
       this.mDelegate.I(p0);
       return;
    }
    public WritableMap lazilyLoadView(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIManagerTurboModule.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.J(p0);
    }
    public void manageChildren(int p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uIManagerTur, "24")) {
             return;
          }
       }
       this.mDelegate.K(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void manageChildren(Double p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uIManagerTur, "51")) {
             return;
          }
       }
       this.mDelegate.K(p0.intValue(), p1, p2, p3, p4, p5);
       return;
    }
    public void measure(int p0,Callback p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "64")) {
          return;
       }
       this.mDelegate.L(p0, p1);
       return;
    }
    public void measure(Double p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UIManagerTurboModule.class, "37")) {
          return;
       }
       this.mDelegate.L(p0.intValue(), p1);
       return;
    }
    public void measureInWindow(int p0,Callback p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "65")) {
          return;
       }
       this.mDelegate.M(p0, p1);
       return;
    }
    public void measureInWindow(Double p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UIManagerTurboModule.class, "38")) {
          return;
       }
       this.mDelegate.M(p0.intValue(), p1);
       return;
    }
    public void measureLayout(int p0,int p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, UIManagerTurboModule.class, "66")) {
          return;
       }
       this.mDelegate.N(p0, p1, p2, p3);
       return;
    }
    public void measureLayout(Double p0,Double p1,Callback p2,Callback p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, UIManagerTurboModule.class, "40")) {
          return;
       }
       this.mDelegate.N(p0.intValue(), p1.intValue(), p2, p3);
       return;
    }
    public void measureLayoutRelativeToParent(int p0,Callback p1,Callback p2){
       this.mDelegate.O(p0, p1, p2);
    }
    public void measureLayoutRelativeToParent(Double p0,Callback p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UIManagerTurboModule.class, "41")) {
          return;
       }
       this.mDelegate.O(p0.intValue(), p1, p2);
       return;
    }
    public void onBatchComplete(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "52")) {
          return;
       }
       this.mDelegate.P();
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "3")) {
          return;
       }
       this.mDelegate.Q();
       return;
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "76")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerTurboModule.class, "63")) {
          return;
       }
       this.mDelegate.T(p0);
       return;
    }
    public void profileNextBatch(){
       if (PatchProxy.applyVoid(null, this, UIManagerTurboModule.class, "8")) {
          return;
       }
       this.mDelegate.U();
       return;
    }
    public void removeRootView(int p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uIManagerTur, "11")) {
          return;
       }
       this.mDelegate.V(p0);
       return;
    }
    public void removeRootView(Double p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerTurboModule.class, "33")) {
          return;
       }
       this.mDelegate.V(p0.intValue());
       return;
    }
    public void removeRootViewByNative(int p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uIManagerTur, "12")) {
          return;
       }
       this.mDelegate.W(p0);
       return;
    }
    public void removeSubviewsFromContainerWithID(double p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uIManagerTur, "48")) {
          return;
       }
       this.mDelegate.X((int)p0);
       return;
    }
    public void removeSubviewsFromContainerWithID(int p0){
       this.mDelegate.X(p0);
    }
    public void removeUIManagerListener(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerTurboModule.class, "70")) {
          return;
       }
       this.mDelegate.Y(p0);
       return;
    }
    public void replaceExistingNonRootView(int p0,int p1){
       this.mDelegate.Z(p0, p1);
    }
    public void replaceExistingNonRootView(Double p0,Double p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UIManagerTurboModule.class, "49")) {
          return;
       }
       this.mDelegate.Z(p0.intValue(), p1.intValue());
       return;
    }
    public int resolveRootTagFromReactTag(int p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uIManagerTur, "71");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mDelegate.a0(p0);
    }
    public View resolveView(int p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uIManagerTur, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mDelegate.b0(p0);
    }
    public void sendAccessibilityEvent(int p0,int p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uIManagerTur, "56")) {
          return;
       }
       this.mDelegate.c0(p0, p1);
       return;
    }
    public void sendAccessibilityEvent(Double p0,double p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uIManagerTur, "45")) {
          return;
       }
       this.mDelegate.c0(p0.intValue(), (int)p1);
       return;
    }
    public void setAllowImmediateUIOperationExecution(boolean p0){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, UIManagerTurboModule.class, "57")) {
          return;
       }
       Objects.requireNonNull(this.mDelegate);
       return;
    }
    public void setChildren(int p0,ReadableArray p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "25")) {
          return;
       }
       this.mDelegate.d0(p0, p1);
       return;
    }
    public void setChildren(Double p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UIManagerTurboModule.class, "50")) {
          return;
       }
       this.mDelegate.d0(p0.intValue(), p1);
       return;
    }
    public void setJSResponder(int p0,boolean p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uIManagerTur, "68")) {
          return;
       }
       this.mDelegate.e0(p0, p1);
       return;
    }
    public void setJSResponder(Double p0,boolean p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uIManagerTur, "42")) {
          return;
       }
       this.mDelegate.e0(p0.intValue(), p1);
       return;
    }
    public void setLayoutAnimationEnabledExperimental(boolean p0){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uIManagerTur, "44")) {
          return;
       }
       this.mDelegate.f0(p0);
       return;
    }
    public void setViewHierarchyUpdateDebugListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIManagerTurboModule.class, "54")) {
          return;
       }
       this.mDelegate.g0(p0);
       return;
    }
    public void setViewLocalData(int p0,Object p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "16")) {
          return;
       }
       this.mDelegate.h0(p0, p1);
       return;
    }
    public void showPopupMenu(int p0,ReadableArray p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, UIManagerTurboModule.class, "69")) {
          return;
       }
       this.mDelegate.i0(p0, p1, p2, p3);
       return;
    }
    public void showPopupMenu(Double p0,ReadableArray p1,Callback p2,Callback p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, UIManagerTurboModule.class, "46")) {
          return;
       }
       this.mDelegate.i0(p0.intValue(), p1, p2, p3);
       return;
    }
    public void synchronouslyUpdateViewOnUIThread(int p0,ReadableMap p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "13")) {
          return;
       }
       this.mDelegate.j0(p0, p1);
       return;
    }
    public void updateNodeSize(int p0,int p1,int p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, UIManagerTurboModule.class, "15")) {
          return;
       }
       this.mDelegate.k0(p0, p1, p2);
       return;
    }
    public void updateRootLayoutSpecs(int p0,int p1,int p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, UIManagerTurboModule.class, "58")) {
          return;
       }
       this.mDelegate.l0(p0, p1, p2);
       return;
    }
    public void updateView(double p0,String p1,ReadableMap p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Double.valueOf(p0), p1, p2, this, UIManagerTurboModule.class, "32")) {
          return;
       }
       this.mDelegate.m0((int)p0, p1, p2);
       return;
    }
    public void updateView(int p0,String p1,ReadableMap p2){
       if (PatchProxy.isSupport(UIManagerTurboModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, UIManagerTurboModule.class, "19")) {
          return;
       }
       this.mDelegate.m0(p0, p1, p2);
       return;
    }
    public void updateViewBatch(int p0,ReadableArray p1){
       UIManagerTurboModule uIManagerTur = UIManagerTurboModule.class;
       if (PatchProxy.isSupport(uIManagerTur) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uIManagerTur, "22")) {
          return;
       }
       this.mDelegate.n0(p0, p1);
       return;
    }
    public void viewIsDescendantOf(int p0,int p1,Callback p2){
       this.mDelegate.o0(p0, p1, p2);
    }
    public void viewIsDescendantOf(Double p0,Double p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UIManagerTurboModule.class, "39")) {
          return;
       }
       this.mDelegate.o0(p0.intValue(), p1.intValue(), p2);
       return;
    }
}
