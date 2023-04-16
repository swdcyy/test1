package com.kuaishou.krn.bridges.toast.KrnToastBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import vd.d;
import java.lang.Integer;
import dj0.a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import dj0.b;
import dj0.c;

public class KrnToastBridge extends KrnBridge	// class@000831
{

    public void KrnToastBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(KrnToastBridge p0,String p1,int p2){
       p0.lambda$show$0(p1, p2);
    }
    public static void b(KrnToastBridge p0,String p1,int p2,int p3){
       p0.lambda$showWithGravity$1(p1, p2, p3);
    }
    public static void c(KrnToastBridge p0,String p1,int p2,int p3,int p4,int p5){
       p0.lambda$showWithGravityAndOffset$2(p1, p2, p3, p4, p5);
    }
    private void lambda$show$0(String p0,int p1){
       Toast.makeText(this.getReactApplicationContext(), p0, p1).show();
    }
    private void lambda$showWithGravity$1(String p0,int p1,int p2){
       Toast toast = Toast.makeText(this.getReactApplicationContext(), p0, p1);
       toast.setGravity(p2, 0, 0);
       toast.show();
    }
    private void lambda$showWithGravityAndOffset$2(String p0,int p1,int p2,int p3,int p4){
       Toast toast = Toast.makeText(this.getReactApplicationContext(), p0, p1);
       toast.setGravity(p2, p3, p4);
       toast.show();
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, KrnToastBridge.class, "1");
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
       return "Toast";
    }
    public void show(String p0,int p1){
       KrnToastBridge krnToastBrid = KrnToastBridge.class;
       if (PatchProxy.isSupport(krnToastBrid) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, krnToastBrid, "2")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new a(this, p0, p1));
       return;
    }
    public void showWithGravity(String p0,int p1,int p2){
       if (PatchProxy.isSupport(KrnToastBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KrnToastBridge.class, "3")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new b(this, p0, p1, p2));
       return;
    }
    public void showWithGravityAndOffset(String p0,int p1,int p2,int p3,int p4){
       KrnToastBridge krnToastBrid = KrnToastBridge.class;
       if (PatchProxy.isSupport(krnToastBrid)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, krnToastBrid, "4")) {
             return;
          }
       }
       c uoc = new c(this, p0, p1, p2, p3, p4);
       UiThreadUtil.runOnUiThread(krnToastBrid);
       return;
    }
}
