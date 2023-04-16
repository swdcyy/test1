package com.horcrux.svg.SvgViewModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.ref.WeakReference;
import com.horcrux.svg.SvgViewModule$1;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.String;
import com.facebook.react.bridge.BaseJavaModule;
import com.horcrux.svg.SvgViewManager;
import java.lang.Object;

public class SvgViewModule extends ReactContextBaseJavaModule	// class@0005fe
{

    public void SvgViewModule(ReactApplicationContext p0){
       super(p0);
    }
    public static void toDataURL(int p0,ReadableMap p1,Callback p2,int p3,WeakReference p4){
       SvgViewModule$1 u1 = new SvgViewModule$1(p4, p0, p1, p2, p3);
       UiThreadUtil.runOnUiThread(v6);
    }
    public String getName(){
       return "RNSVGSvgViewManager";
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       SvgViewManager.onReactContextDestroy(this.getReactApplicationContext());
    }
    public void toDataURL(int p0,ReadableMap p1,Callback p2){
       SvgViewModule.toDataURL(p0, p1, p2, 0, new WeakReference(this.getReactApplicationContextIfActiveOrWarn()));
    }
}
