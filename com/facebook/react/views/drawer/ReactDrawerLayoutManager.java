package com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import jf.e;
import com.facebook.react.uimanager.ViewGroupManager;
import jf.d;
import ze.b;
import ze.n0;
import android.view.View;
import com.facebook.react.views.drawer.ReactDrawerLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager$a;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$d;
import android.view.ViewGroup;
import java.lang.Integer;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import vd.d;
import ze.c1;
import com.facebook.react.bridge.ReadableArray;
import java.util.Objects;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import java.lang.Float;
import ze.p;
import java.lang.Math;

public class ReactDrawerLayoutManager extends ViewGroupManager implements e	// class@0013b7
{
    public final c1 mDelegate;

    public void ReactDrawerLayoutManager(){
       super();
       this.mDelegate = new d(this);
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactDrawerLayout p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactDrawerLayoutManager.class, "1")) {
          return;
       }
       p1.a(new ReactDrawerLayoutManager$a(p1, p0.getNativeModule(UIManagerModule.class).getEventDispatcher()));
       return;
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(ReactDrawerLayout p0,View p1,int p2){
       if (PatchProxy.isSupport(ReactDrawerLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ReactDrawerLayoutManager.class, "17")) {
          return;
       }
       if (this.getChildCount(p0) >= 2) {
          throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
       }
       if (p2 && p2 != 1) {
          throw new JSApplicationIllegalArgumentException("The only valid indices for drawer\'s child are 0 or 1. Got "+p2+" instead.");
       }
       p0.addView(p1, p2);
       p0.X();
       return;
    }
    public void closeDrawer(View p0){
       this.closeDrawer(p0);
    }
    public void closeDrawer(ReactDrawerLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactDrawerLayoutManager.class, "10")) {
          return;
       }
       p0.V();
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactDrawerLayout createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactDrawerLayoutManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactDrawerLayout(p0);
    }
    public Map getCommandsMap(){
       Object obj = PatchProxy.apply(null, this, ReactDrawerLayoutManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.e("openDrawer", Integer.valueOf(1), "closeDrawer", Integer.valueOf(2));
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, ReactDrawerLayoutManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.g("topDrawerSlide", d.d("registrationName", "onDrawerSlide"), "topDrawerOpen", d.d("registrationName", "onDrawerOpen"), "topDrawerClose", d.d("registrationName", "onDrawerClose"), "topDrawerStateChanged", d.d("registrationName", "onDrawerStateChanged"));
    }
    public Map getExportedViewConstants(){
       Object obj = PatchProxy.apply(null, this, ReactDrawerLayoutManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d("DrawerPosition", d.e("Left", Integer.valueOf(0x800003), "Right", Integer.valueOf(0x800005)));
    }
    public String getName(){
       return "AndroidDrawerLayout";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public void openDrawer(View p0){
       this.openDrawer(p0);
    }
    public void openDrawer(ReactDrawerLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactDrawerLayoutManager.class, "9")) {
          return;
       }
       p0.W();
       return;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactDrawerLayout p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(ReactDrawerLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactDrawerLayoutManager.class, "13")) {
          return;
       }
       if (p1 != 1) {
          if (p1 == 2) {
             p0.V();
          }
       }else {
          p0.W();
       }
       return;
    }
    public void receiveCommand(ReactDrawerLayout p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactDrawerLayoutManager.class, "14")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (!p1.equals("closeDrawer")) {
          if (p1.equals("openDrawer")) {
             p0.W();
          }
       }else {
          p0.V();
       }
       return;
    }
    public void setDrawerBackgroundColor(View p0,Integer p1){
       this.setDrawerBackgroundColor(p0, p1);
    }
    public void setDrawerBackgroundColor(ReactDrawerLayout p0,Integer p1){
    }
    public void setDrawerLockMode(View p0,String p1){
       this.setDrawerLockMode(p0, p1);
    }
    public void setDrawerLockMode(ReactDrawerLayout p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactDrawerLayoutManager.class, "8")) {
          return;
       }
       if (p1 == null || ("unlocked").equals(p1)) {
          p0.setDrawerLockMode(0);
       }else if(("locked-closed").equals(p1)){
          p0.setDrawerLockMode(1);
       }else if(("locked-open").equals(p1)){
          p0.setDrawerLockMode(2);
       }else {
          throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode "+p1);
       }
       return;
    }
    public void setDrawerPosition(View p0,String p1){
       this.setDrawerPosition(p0, p1);
    }
    public void setDrawerPosition(ReactDrawerLayout p0,Dynamic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactDrawerLayoutManager.class, "4")) {
          return;
       }
       int i = 0x800003;
       if (p1.isNull()) {
          p0.setDrawerPosition(i);
       }else if(p1.getType() == ReadableType.Number){
          int i1 = p1.asInt();
          if (i == i1 || 0x800005 == i1) {
             p0.setDrawerPosition(i1);
          }else {
             throw new JSApplicationIllegalArgumentException("Unknown drawerPosition "+i1);
          }
       }else if(p1.getType() == ReadableType.String){
          this.setDrawerPositionInternal(p0, p1.asString());
       }else {
          throw new JSApplicationIllegalArgumentException("drawerPosition must be a string or int");
       }
       return;
    }
    public void setDrawerPosition(ReactDrawerLayout p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactDrawerLayoutManager.class, "3")) {
          return;
       }
       if (p1 == null) {
          p0.setDrawerPosition(0x800003);
       }else {
          this.setDrawerPositionInternal(p0, p1);
       }
       return;
    }
    public final void setDrawerPositionInternal(ReactDrawerLayout p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactDrawerLayoutManager.class, "5")) {
          return;
       }
       if (p1.equals("left")) {
          p0.setDrawerPosition(0x800003);
       }else if(p1.equals("right")){
          p0.setDrawerPosition(0x800005);
       }else {
          throw new JSApplicationIllegalArgumentException("drawerPosition must be \'left\' or \'right\', received"+p1);
       }
       return;
    }
    public void setDrawerWidth(View p0,Float p1){
       this.setDrawerWidth(p0, p1);
    }
    public void setDrawerWidth(ReactDrawerLayout p0,float p1){
       ReactDrawerLayoutManager reactDrawerL = ReactDrawerLayoutManager.class;
       if (PatchProxy.isSupport(reactDrawerL) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactDrawerL, "6")) {
          return;
       }
       int i = (Float.isNaN(p1))? -1: Math.round(p.c(p1));
       p0.setDrawerWidth(i);
       return;
    }
    public void setDrawerWidth(ReactDrawerLayout p0,Float p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactDrawerLayoutManager.class, "7")) {
          return;
       }
       int i = (p1 == null)? -1: Math.round(p.c(p1.floatValue()));
       p0.setDrawerWidth(i);
       return;
    }
    public void setElevation(View p0,float p1){
       this.setElevation(p0, p1);
    }
    public void setElevation(ReactDrawerLayout p0,float p1){
       ReactDrawerLayoutManager reactDrawerL = ReactDrawerLayoutManager.class;
       if (PatchProxy.isSupport(reactDrawerL) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactDrawerL, "11")) {
          return;
       }
       p0.setDrawerElevation(p.c(p1));
       return;
    }
    public void setKeyboardDismissMode(View p0,String p1){
       this.setKeyboardDismissMode(p0, p1);
    }
    public void setKeyboardDismissMode(ReactDrawerLayout p0,String p1){
    }
    public void setStatusBarBackgroundColor(View p0,Integer p1){
       this.setStatusBarBackgroundColor(p0, p1);
    }
    public void setStatusBarBackgroundColor(ReactDrawerLayout p0,Integer p1){
    }
}
