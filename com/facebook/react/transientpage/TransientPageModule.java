package com.facebook.react.transientpage.TransientPageModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.transientpage.TransientPageModule$STATE;
import android.content.res.Resources;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.f;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ze.x;
import ze.j0;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import java.util.List;
import java.util.Collections;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.StringBuilder;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Double;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import java.util.Map;
import ze.c;
import java.lang.Float;
import com.facebook.react.bridge.BaseJavaModule;

public class TransientPageModule extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@001305
{
    public float mFontScale;
    public ReadableArray mMountTags;
    public NetworkingModule mNetworkingModule;
    public int mRootTag;
    public TransientPageModule$STATE mState;

    public void TransientPageModule(ReactApplicationContext p0){
       super(p0);
       this.mState = TransientPageModule$STATE.INACTIVE;
       this.mRootTag = -1;
       this.mMountTags = null;
       this.mFontScale = p0.getResources().getConfiguration().fontScale;
    }
    public void clearRootView(){
       if (this.isActive() && (this.mRootTag != -1 && this.mMountTags.size() > 0)) {
          f uIImplementa = this.getUIManager().getUIImplementation();
          TransientPageModule tmRootTag = this.mRootTag;
          TransientPageModule tmMountTags = this.mMountTags;
          Objects.requireNonNull(uIImplementa);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tmRootTag), tmMountTags, uIImplementa, uof, "21")) {
             f a = uIImplementa.a;
             _monitor_enter(a);
             x ox = uIImplementa.d.a(tmRootTag);
             if (ox != null) {
                ArrayList uArrayList = new ArrayList();
                int i = 0;
                while (true) {
                   if (i < tmMountTags.size()) {
                      int i1 = ox.indexOf(uIImplementa.d.a(tmMountTags.getInt(i)));
                      if (i1 >= 0) {
                         uArrayList.add(Integer.valueOf(i1));
                         i = i + 1;
                      }else {
                         throw new IllegalStateException("Didn\'t find child tag in parent");
                      }
                   }else {
                      Collections.sort(uArrayList);
                      uIImplementa.n(tmRootTag, null, 0, null, null, Arguments.makeNativeArray(uArrayList));
                      _monitor_exit(a);
                      break ;
                   }
                }
             }else {
                throw new IllegalViewOperationException("Trying to remove children from unknown view tag: "+tmRootTag);
             }
          }
       }
       this.onHide();
       return;
    }
    public void createView(double p0,String p1,double p2,ReadableMap p3){
       if (this.isActive()) {
          this.getUIManager().createView((int)p0, p1, (int)p2, p3);
       }
       return;
    }
    public void dispatchViewManagerCommand(double p0,int p1,ReadableArray p2){
       if (this.isActive()) {
          this.getUIManager().dispatchViewManagerCommand((int)p0, p1, p2);
       }
       return;
    }
    public void dispatchViewManagerCommand(double p0,String p1,ReadableArray p2){
       if (this.isActive()) {
          this.getUIManager().dispatchViewManagerStringCommand(Double.valueOf(p0), p1, p2);
       }
       return;
    }
    public String getName(){
       return "TransientPageModule";
    }
    public final NetworkingModule getNetworking(){
       if (this.mNetworkingModule == null) {
          this.mNetworkingModule = this.getReactApplicationContext().getNativeModule(NetworkingModule.class);
       }
       return this.mNetworkingModule;
    }
    public TransientPageModule$STATE getState(){
       return this.mState;
    }
    public final UIManagerModule getUIManager(){
       return this.getReactApplicationContext().getNativeModule(UIManagerModule.class);
    }
    public double getWindowWidth(){
       Map map = c.a((double)this.mFontScale).get("windowPhysicalPixels");
       return (double)((float)map.get("width").intValue() / map.get("scale").floatValue());
    }
    public void invalidateView(){
       if (this.isActive()) {
          this.getUIManager().onBatchComplete();
       }
       return;
    }
    public boolean isActive(){
       boolean b = (this.mState == TransientPageModule$STATE.ACTIVE)? true: false;
       return b;
    }
    public void manageChildren(double p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5){
       if (this.isActive()) {
          this.getUIManager().manageChildren((int)p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void markRootTags(double p0,ReadableArray p1){
       this.mRootTag = (int)p0;
       this.mMountTags = p1;
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       this.onHide();
    }
    public void onHide(){
       this.mState = TransientPageModule$STATE.INACTIVE;
    }
    public void onLoad(){
       this.mState = TransientPageModule$STATE.ACTIVE;
    }
    public String resolveAssetSource(ReadableMap p0){
       return "";
    }
    public void sendRequest(String p0,String p1,double p2,ReadableArray p3,ReadableMap p4,String p5,boolean p6,double p7,boolean p8){
       if (this.isActive()) {
          this.getNetworking().sendRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       return;
    }
    public void setChildren(double p0,ReadableArray p1){
       if (this.isActive()) {
          this.getUIManager().setChildren((int)p0, p1);
       }
       return;
    }
    public void updateView(double p0,String p1,ReadableMap p2){
       if (this.isActive()) {
          this.getUIManager().updateView((int)p0, p1, p2);
       }
       return;
    }
}
