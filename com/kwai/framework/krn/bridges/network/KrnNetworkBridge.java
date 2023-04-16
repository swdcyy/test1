package com.kwai.framework.krn.bridges.network.KrnNetworkBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kwai.framework.krn.bridges.network.a;
import com.kwai.framework.krn.init.network.b;
import java.lang.Throwable;
import com.kwai.feature.api.platform.antispam.model.FaceRecognitionNetworkException;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.HashMap;
import y86.w;
import y86.b;
import java.util.Map;
import brd.t;
import cjd.e;
import erd.o;
import y86.l;
import y86.j;
import erd.g;
import crd.b;
import java.lang.Double;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import gk0.b;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Integer;
import java.lang.Long;
import gk0.a;
import java.util.List;
import y86.k;
import y86.i;
import com.facebook.react.bridge.Promise;
import java.lang.Boolean;
import com.kwai.framework.krn.bridges.network.KrnNetworkBridge$a;
import y86.d;
import com.kwai.framework.krn.bridges.network.KrnNetworkBridge$b;

public class KrnNetworkBridge extends KrnBridge	// class@0015c7
{

    public void KrnNetworkBridge(ReactApplicationContext p0){
       super(p0);
       b.f = a.a;
    }
    public static boolean lambda$new$0(Throwable p0){
       return p0 instanceof FaceRecognitionNetworkException;
    }
    public String getName(){
       return "KSURCTNetworkInterface";
    }
    public void getRequestWith(String p0,ReadableMap p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnNetworkBridge.class, "2")) {
          return;
       }
       b uob = b.b();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, uob, b.class, "2")) {
          HashMap hashMap = (p1 != null)? p1.toHashMap(): new HashMap();
          b.d("api", true).i(p0, hashMap).map(new e()).subscribe(new l(p2), new j(p2));
       }
       return;
    }
    public void jsRequestMs(String p0,String p1,double p2,double p3,String p4,ReadableMap p5){
       a uoa;
       KrnNetworkBridge krnNetworkBr = KrnNetworkBridge.class;
       int i = 6;
       int i1 = 0;
       int i2 = 2;
       int i3 = 4;
       int i4 = 5;
       if (PatchProxy.isSupport(krnNetworkBr)) {
          Object[] objArray = new Object[i];
          objArray[i1] = p0;
          objArray[1] = p1;
          objArray[i2] = Double.valueOf(p2);
          objArray[3] = Double.valueOf(p3);
          objArray[i3] = p4;
          objArray[i4] = p5;
          if (PatchProxy.applyVoid(objArray, this, krnNetworkBr, "5")) {
             return;
          }
       }else {
          int i5 = this;
       }
       b uob = b.b();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray1 = new Object[]{reactApplica,p0,p1,Double.valueOf(p2),Double.valueOf(p3),p4,p5};
          if (!PatchProxy.applyVoid(objArray1, uob, uob1, "33")) {
          label_0067 :
             if (uob.j(reactApplica)) {
                b uob2 = b.a();
                int uniqueId = reactApplica.getCatalystInstance().getUniqueId();
                long l = (long)p2;
                long l1 = (long)p3;
                Objects.requireNonNull(uob2);
                uob = b.class;
                if (PatchProxy.isSupport(uob)) {
                   Object[] objArray2 = new Object[i4];
                   objArray2[i1] = Integer.valueOf(uniqueId);
                   objArray2[1] = p4;
                   objArray2[i2] = Long.valueOf(l);
                   objArray2[3] = Long.valueOf(l1);
                   objArray2[i3] = p5;
                   if (!PatchProxy.applyVoid(objArray2, uob2, uob, "2")) {
                   }
                }else {
                }
             }
          }
       }else {
          goto label_0067 ;
       }
       return;
    }
    public void postRequestWith(String p0,ReadableMap p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnNetworkBridge.class, "1")) {
          return;
       }
       b uob = b.b();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, uob, b.class, "1")) {
          HashMap hashMap = (p1 != null)? p1.toHashMap(): new HashMap();
          b.d("api", true).c(p0, hashMap).map(new e()).subscribe(new k(p2), new i(p2));
       }
       return;
    }
    public void request(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnNetworkBridge.class, "3")) {
          return;
       }
       b.b().n(Boolean.FALSE, this.getReactApplicationContext(), p0, new KrnNetworkBridge$a(this, p1));
       return;
    }
    public void requestV2(ReadableMap p0,Callback p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnNetworkBridge.class, "4")) {
          return;
       }
       b.b().n(Boolean.TRUE, this.getReactApplicationContext(), p0, super(this, p1, p2));
       return;
    }
}
