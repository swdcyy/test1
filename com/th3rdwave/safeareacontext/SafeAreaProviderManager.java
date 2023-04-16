package com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.bridge.ReactApplicationContext;
import ze.n0;
import android.view.View;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager$a;
import com.th3rdwave.safeareacontext.SafeAreaProvider$a;
import android.content.Context;
import java.util.Map;
import vd.d$b;
import vd.d;
import java.lang.Object;
import android.app.Activity;
import android.view.Window;
import android.view.ViewGroup;
import ar8.a;
import ar8.e;
import ar8.c;
import ze.p;
import java.lang.Float;
import java.lang.String;

public class SafeAreaProviderManager extends ViewGroupManager	// class@000f95
{
    public final ReactApplicationContext mContext;

    public void SafeAreaProviderManager(ReactApplicationContext p0){
       super();
       this.mContext = p0;
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,SafeAreaProvider p1){
       p1.setOnInsetsChangeListener(new SafeAreaProviderManager$a(this, p0.getNativeModule(UIManagerModule.class).getEventDispatcher()));
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public SafeAreaProvider createViewInstance(n0 p0){
       return new SafeAreaProvider(p0);
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b uob = d.a();
       uob.b("topInsetsChange", d.d("registrationName", "onInsetsChange"));
       return uob.a();
    }
    public Map getExportedViewConstants(){
       return d.d("initialWindowMetrics", this.getInitialWindowMetrics());
    }
    public final Map getInitialWindowMetrics(){
       Activity currentActiv = this.mContext.getCurrentActivity();
       Map map = null;
       if (currentActiv == null) {
          return map;
       }
       ViewGroup decorView = currentActiv.getWindow().getDecorView();
       if (decorView == null) {
          return map;
       }
       a uoa = e.c(decorView);
       c uoc = e.a(decorView, decorView.findViewById(0x1020002));
       if (uoa == null || uoc == null) {
          return map;
       }
       return d.e("insets", d.g("top", Float.valueOf(p.a(uoa.a)), "right", Float.valueOf(p.a(uoa.b)), "bottom", Float.valueOf(p.a(uoa.c)), "left", Float.valueOf(p.a(uoa.d))), "frame", d.g("x", Float.valueOf(p.a(uoc.a)), "y", Float.valueOf(p.a(uoc.b)), "width", Float.valueOf(p.a(uoc.c)), "height", Float.valueOf(p.a(uoc.d))));
    }
    public String getName(){
       return "RNCSafeAreaProvider";
    }
}
