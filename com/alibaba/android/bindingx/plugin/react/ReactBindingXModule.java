package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import x5.i;
import x5.i$b;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$a;
import x5.i$d;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$j;
import x5.i$e;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$i;
import x5.i$c;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.ArrayList;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$d;
import java.util.List;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import android.util.Pair;
import java.lang.String;
import com.facebook.react.bridge.ReactContext;
import z5.d;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$k;
import android.view.View;
import java.lang.Double;
import com.alibaba.android.bindingx.core.internal.e;
import java.lang.Float;
import android.graphics.drawable.Drawable;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import android.graphics.Color;
import java.util.Locale;
import java.lang.Integer;
import android.widget.TextView;
import com.facebook.react.bridge.BaseJavaModule;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$h;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$g;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$c;
import x5.a;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$b;
import x5.a$e;
import com.facebook.react.bridge.WritableArray;
import java.util.Arrays;
import com.facebook.react.bridge.WritableNativeArray;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$e;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$f;

public final class ReactBindingXModule extends ReactContextBaseJavaModule implements LifecycleEventListener	// class@000e2e
{
    public a mBindingXCore;
    public i mPlatformManager;
    public ReactBindingXModule$k mWorkerThread;

    public void ReactBindingXModule(ReactApplicationContext p0){
       super(p0);
       this.mWorkerThread = null;
    }
    public static i createPlatformManager(ReactApplicationContext p0){
       i$b uob = new i$b();
       uob.c(new ReactBindingXModule$a(p0));
       uob.d(new ReactBindingXModule$j(p0));
       uob.b(new ReactBindingXModule$i());
       return uob.a();
    }
    public WritableMap bind(ReadableMap p0){
       Map map = (p0 == null)? Collections.emptyMap(): p0.toHashMap();
       CountDownLatch uCountDownLa = new CountDownLatch(1);
       ArrayList uArrayList = new ArrayList(2);
       this.executeAsynchronously(new ReactBindingXModule$d(this, map, uArrayList, uCountDownLa));
       try{
          int i = 2000;
          uCountDownLa.await(i, TimeUnit.MILLISECONDS);
       }catch(java.lang.Exception e0){
       }
       String str = null;
       Pair first = (uArrayList.size() > 0)? uArrayList.get(0).first: str;
       if (uArrayList.size() > 0) {
          str = uArrayList.get(0).second;
       }
       d.f(this.getReactApplicationContext(), first, map, str);
       return Arguments.makeNativeMap(Collections.singletonMap("token", first));
    }
    public final void executeAsynchronously(Runnable p0){
       if (this.mWorkerThread == null) {
          this.mWorkerThread = new ReactBindingXModule$k("bindingX-thread");
       }
       this.mWorkerThread.a(p0);
       return;
    }
    public WritableMap getComputedStyle(int p0){
       ReactBindingXModule reactBinding = this;
       this.prepareInternal();
       i$c uoc = reactBinding.mPlatformManager.a();
       Object[] objArray = new Object[0];
       View view = reactBinding.mPlatformManager.b().a(String.valueOf(p0), objArray);
       if (view == null) {
          return Arguments.makeNativeMap(Collections.emptyMap());
       }
       HashMap hashMap = new HashMap();
       Object[] objArray1 = new Object[0];
       hashMap.put("translateX", Double.valueOf(uoc.b((double)view.getTranslationX(), objArray1)));
       objArray1 = new Object[0];
       hashMap.put("translateY", Double.valueOf(uoc.b((double)view.getTranslationY(), objArray1)));
       hashMap.put("rotateX", Float.valueOf(e.h(view.getRotationX())));
       hashMap.put("rotateY", Float.valueOf(e.h(view.getRotationY())));
       hashMap.put("rotateZ", Float.valueOf(e.h(view.getRotation())));
       hashMap.put("scaleX", Float.valueOf(view.getScaleX()));
       hashMap.put("scaleY", Float.valueOf(view.getScaleY()));
       hashMap.put("opacity", Float.valueOf(view.getAlpha()));
       int i = 4;
       double d = 0x406fe00000000000;
       if (view.getBackground() != null) {
          ReactViewBackgroundDrawable reactViewBac = 0xff000000;
          if (view.getBackground() instanceof ReactViewBackgroundDrawable) {
             reactViewBac = view.getBackground().g();
          }
          Object[] objArray2 = new Object[i];
          objArray2[0] = Integer.valueOf(Color.red(reactViewBac));
          objArray2[1] = Integer.valueOf(Color.green(reactViewBac));
          objArray2[2] = Integer.valueOf(Color.blue(reactViewBac));
          objArray2[3] = Double.valueOf(((double)Color.alpha(reactViewBac) / d));
          hashMap.put("background-color", String.format(Locale.getDefault(), "rgba\(%d,%d,%d,%f\)", objArray2));
       }
       if (view instanceof TextView) {
          int currentTextC = view.getCurrentTextColor();
          int i1 = Color.red(currentTextC);
          int i2 = Color.green(currentTextC);
          Object[] objArray3 = new Object[i];
          objArray3[0] = Integer.valueOf(i1);
          objArray3[1] = Integer.valueOf(i2);
          objArray3[2] = Integer.valueOf(Color.blue(currentTextC));
          objArray3[3] = Double.valueOf(((double)Color.alpha(currentTextC) / 0x406fe00000000000));
          hashMap.put("color", String.format(Locale.getDefault(), "rgba\(%d,%d,%d,%f\)", objArray3));
       }
       return Arguments.makeNativeMap(hashMap);
    }
    public String getName(){
       return "bindingx";
    }
    public void initialize(){
       super.initialize();
       if (this.getReactApplicationContext() != null) {
          this.getReactApplicationContext().addLifecycleEventListener(this);
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       ReactBindingXModule tmWorkerThre = this.mWorkerThread;
       if (tmWorkerThre != null) {
          tmWorkerThre.quit();
          this.mWorkerThread = null;
       }
       return;
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       if (this.mBindingXCore == null) {
          return;
       }
       this.executeAsynchronously(new ReactBindingXModule$h(this));
       return;
    }
    public void onHostResume(){
       if (this.mBindingXCore == null) {
          return;
       }
       this.executeAsynchronously(new ReactBindingXModule$g(this));
       return;
    }
    public void prepare(ReadableMap p0){
       this.executeAsynchronously(new ReactBindingXModule$c(this));
    }
    public void prepareInternal(){
       if (this.mPlatformManager == null) {
          this.mPlatformManager = ReactBindingXModule.createPlatformManager(this.getReactApplicationContext());
       }
       if (this.mBindingXCore == null) {
          a uoa = new a(this.mPlatformManager);
          this.mBindingXCore = uoa;
          uoa.k("scroll", new ReactBindingXModule$b(this));
       }
       return;
    }
    public WritableArray supportFeatures(){
       String[] stringArray = new String[]{"pan","orientation","timing","scroll"};
       return Arguments.makeNativeArray(Arrays.asList(stringArray));
    }
    public void unbind(ReadableMap p0){
       if (p0 == null) {
          return;
       }
       this.executeAsynchronously(new ReactBindingXModule$e(this, p0));
       return;
    }
    public void unbindAll(){
       this.executeAsynchronously(new ReactBindingXModule$f(this));
    }
}
