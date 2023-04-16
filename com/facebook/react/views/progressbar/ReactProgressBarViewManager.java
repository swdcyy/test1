package com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import jf.i;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.Object;
import jf.h;
import ze.b;
import android.content.Context;
import android.widget.ProgressBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.util.AttributeSet;
import java.lang.Number;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import com.facebook.react.views.progressbar.ProgressBarShadowNode;
import ze.x;
import ze.n0;
import android.view.View;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import ze.c1;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Double;

public class ReactProgressBarViewManager extends BaseViewManager implements i	// class@0013de
{
    public final c1 mDelegate;
    public static Object sProgressBarCtorLock;

    static {
       ReactProgressBarViewManager.sProgressBarCtorLock = new Object();
    }
    public void ReactProgressBarViewManager(){
       super();
       this.mDelegate = new h(this);
    }
    public static ProgressBar createProgressBar(Context p0,int p1){
       Object obj;
       ReactProgressBarViewManager reactProgres = ReactProgressBarViewManager.class;
       if (PatchProxy.isSupport(reactProgres)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, reactProgres, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ReactProgressBarViewManager.sProgressBarCtorLock;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return new ProgressBar(p0, null, p1);
    }
    public static int getStyleFromString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactProgressBarViewManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
       }
       if (p0.equals("Horizontal")) {
          return 0x1010078;
       }
       if (p0.equals("Small")) {
          return 0x1010079;
       }
       if (p0.equals("Large")) {
          return 0x101007a;
       }
       if (p0.equals("Inverse")) {
          return 0x1010287;
       }
       if (p0.equals("SmallInverse")) {
          return 0x1010288;
       }
       if (p0.equals("LargeInverse")) {
          return 0x1010289;
       }
       if (p0.equals("Normal")) {
          return 0x1010077;
       }
       throw new JSApplicationIllegalArgumentException("Unknown ProgressBar style: "+p0);
    }
    public ProgressBarShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactProgressBarViewManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProgressBarShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ProgressBarContainerView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactProgressBarViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProgressBarContainerView(p0);
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public String getName(){
       return "AndroidProgressBar";
    }
    public Class getShadowNodeClass(){
       return ProgressBarShadowNode.class;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ProgressBarContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactProgressBarViewManager.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, ProgressBarContainerView.class, "2")) {
          ProgressBarContainerView f = p0.f;
          if (f != null) {
             f.setIndeterminate(p0.c);
             p0.setColor(p0.f);
             p0.f.setProgress((int)(p0.e * 0x408f400000000000));
             if (p0.d != null) {
                p0.f.setVisibility(0);
             }else {
                p0.f.setVisibility(4);
             }
          }else {
             throw new JSApplicationIllegalArgumentException("setStyle\(\) not called");
          }
       }
       return;
    }
    public void setAnimating(View p0,boolean p1){
       this.setAnimating(p0, p1);
    }
    public void setAnimating(ProgressBarContainerView p0,boolean p1){
       ReactProgressBarViewManager reactProgres = ReactProgressBarViewManager.class;
       if (PatchProxy.isSupport(reactProgres) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactProgres, "7")) {
          return;
       }
       p0.setAnimating(p1);
       return;
    }
    public void setColor(View p0,Integer p1){
       this.setColor(p0, p1);
    }
    public void setColor(ProgressBarContainerView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactProgressBarViewManager.class, "4")) {
          return;
       }
       p0.setColor(p1);
       return;
    }
    public void setIndeterminate(View p0,boolean p1){
       this.setIndeterminate(p0, p1);
    }
    public void setIndeterminate(ProgressBarContainerView p0,boolean p1){
       ReactProgressBarViewManager reactProgres = ReactProgressBarViewManager.class;
       if (PatchProxy.isSupport(reactProgres) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactProgres, "5")) {
          return;
       }
       p0.setIndeterminate(p1);
       return;
    }
    public void setProgress(View p0,double p1){
       this.setProgress(p0, p1);
    }
    public void setProgress(ProgressBarContainerView p0,double p1){
       ReactProgressBarViewManager reactProgres = ReactProgressBarViewManager.class;
       if (PatchProxy.isSupport(reactProgres) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactProgres, "6")) {
          return;
       }
       p0.setProgress(p1);
       return;
    }
    public void setStyleAttr(View p0,String p1){
       this.setStyleAttr(p0, p1);
    }
    public void setStyleAttr(ProgressBarContainerView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactProgressBarViewManager.class, "3")) {
          return;
       }
       p0.setStyle(p1);
       return;
    }
    public void setTestID(View p0,String p1){
       this.setTestID(p0, p1);
    }
    public void setTestID(ProgressBarContainerView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactProgressBarViewManager.class, "8")) {
          return;
       }
       super.setTestId(p0, p1);
       return;
    }
    public void setTypeAttr(View p0,String p1){
       this.setTypeAttr(p0, p1);
    }
    public void setTypeAttr(ProgressBarContainerView p0,String p1){
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(ProgressBarContainerView p0,Object p1){
    }
}
