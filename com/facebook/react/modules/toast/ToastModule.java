package com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import vd.d;
import java.lang.Integer;
import com.facebook.react.modules.toast.ToastModule$a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.toast.ToastModule$b;
import com.facebook.react.modules.toast.ToastModule$c;

public class ToastModule extends ReactContextBaseJavaModule	// class@0012fa
{

    public void ToastModule(ReactApplicationContext p0){
       super(p0);
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, ToastModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.b();
       obj.put("SHORT", Integer.valueOf(0));
       obj.put("LONG", Integer.valueOf(1));
       obj.put("TOP", Integer.valueOf(49));
       obj.put("BOTTOM", Integer.valueOf(81));
       obj.put("CENTER", Integer.valueOf(17));
       return obj;
    }
    public String getName(){
       return "ToastAndroid";
    }
    public void show(String p0,int p1){
       ToastModule toastModule = ToastModule.class;
       if (PatchProxy.isSupport(toastModule) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, toastModule, "2")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new ToastModule$a(this, p0, p1));
       return;
    }
    public void showWithGravity(String p0,int p1,int p2){
       if (PatchProxy.isSupport(ToastModule.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ToastModule.class, "3")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new ToastModule$b(this, p0, p1, p2));
       return;
    }
    public void showWithGravityAndOffset(String p0,int p1,int p2,int p3,int p4){
       ToastModule toastModule = ToastModule.class;
       if (PatchProxy.isSupport(toastModule)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, toastModule, "4")) {
             return;
          }
       }
       ToastModule$c uoc = new ToastModule$c(this, p0, p1, p2, p3, p4);
       UiThreadUtil.runOnUiThread(toastModule);
       return;
    }
}
