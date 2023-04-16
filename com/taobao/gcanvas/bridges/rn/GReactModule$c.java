package com.taobao.gcanvas.bridges.rn.GReactModule$c;
import yq8.a;
import com.taobao.gcanvas.bridges.rn.GReactModule;
import wq8.b;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import com.taobao.gcanvas.bridges.rn.GReactTextureView;
import com.taobao.gcanvas.surface.GTextureView;
import com.taobao.gcanvas.surface.GTextureViewCallback;
import org.json.JSONObject;
import java.lang.Integer;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.Boolean;
import android.os.Handler;
import android.os.Looper;
import com.taobao.gcanvas.bridges.rn.GReactModule$c$a;
import java.lang.Runnable;
import com.taobao.gcanvas.GCanvasJNI;
import com.taobao.gcanvas.bridges.spec.module.IGBridgeModule$ContextType;
import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import xq8.b;
import com.facebook.react.bridge.Callback;
import wq8.a;
import com.facebook.react.bridge.WritableNativeArray;
import wq8.c;
import com.facebook.react.bridge.WritableMap;

public class GReactModule$c extends a	// class@000df6
{
    public final b e;
    public final GReactModule f;

    public void GReactModule$c(GReactModule p0){
       this.f = p0;
       super();
       this.e = new b();
    }
    public void a(String p0){
       GReactTextureView gReactTextur = this.f.mViews.get(p0);
       if (gReactTextur == null) {
          return;
       }
       gReactTextur.b.a();
       return;
    }
    public String d(JSONObject p0){
       String str = p0.getString("componentId");
       int i = Integer.parseInt(str);
       if (this.f.getCurrentActivity() == null) {
          return Boolean.FALSE.toString();
       }
       Handler handler = new Handler(Looper.getMainLooper());
       handler.post(new GReactModule$c$a(this, str, i, handler));
       return Boolean.TRUE.toString();
    }
    public void disable(String p0){
       GReactTextureView gReactTextur = this.f.mViews.get(p0);
       if (gReactTextur == null) {
          return;
       }
       gReactTextur.onHostDestroy();
       return;
    }
    public void e(String p0,double p1){
       GReactTextureView gReactTextur = this.f.mViews.get(p0);
       if (gReactTextur == null) {
          return;
       }
       GCanvasJNI.setDevicePixelRatio(gReactTextur.getCanvasKey(), p1);
       return;
    }
    public String g(String p0,String p1,int p2){
       GReactTextureView gReactTextur = this.f.mViews.get(p0);
       if (gReactTextur == null) {
          return "";
       }
       return GCanvasJNI.render(gReactTextur.getCanvasKey(), p1, p2);
    }
    public void h(String p0,String p1,int p2){
       GReactTextureView gReactTextur = this.f.mViews.get(p0);
       if (gReactTextur == null) {
          return;
       }
       GCanvasJNI.render(gReactTextur.getCanvasKey(), p1, p2);
       return;
    }
    public void j(String p0,IGBridgeModule$ContextType p1){
       GReactTextureView gReactTextur = this.f.mViews.get(p0);
       if (gReactTextur == null) {
          return;
       }
       GCanvasJNI.setContextType(gReactTextur.getCanvasKey(), p1.value());
       return;
    }
    public Context k(){
       return this.f.getReactApplicationContext();
    }
    public b l(){
       return this.e;
    }
    public void n(Object p0,Object p1){
       this.o(p0, p1);
    }
    public void o(Callback p0,Object p1){
       Object[] objArray;
       if (p0 != null) {
          if (p1 instanceof a) {
             objArray = new Object[]{p1.c()};
             p0.invoke(objArray);
          }else if(p1 instanceof c){
             objArray = new Object[]{p1.d()};
             p0.invoke(objArray);
          }else {
             objArray = new Object[]{p1};
             p0.invoke(objArray);
          }
       }
       return;
    }
}
