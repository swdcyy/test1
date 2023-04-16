package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import er3.b;
import java.util.concurrent.ConcurrentHashMap;
import er3.c;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.Boolean;
import java.io.IOException;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class LiveMaterialResourceLocalFileManager$Companion$instance$2 extends Lambda implements a	// class@001048
{
    public static final LiveMaterialResourceLocalFileManager$Companion$instance$2 INSTANCE;

    static {
       LiveMaterialResourceLocalFileManager$Companion$instance$2.INSTANCE = new LiveMaterialResourceLocalFileManager$Companion$instance$2();
    }
    public void LiveMaterialResourceLocalFileManager$Companion$instance$2(){
       super(0);
    }
    public final LiveMaterialResourceLocalFileManager invoke(){
       File uFile1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       LiveMaterialResourceLocalFileManager obj = PatchProxy.apply(objArray, this, LiveMaterialResourceLocalFileManager$Companion$instance$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new LiveMaterialResourceLocalFileManager();
       LiveMaterialResourceLocalFileManager liveMaterial = LiveMaterialResourceLocalFileManager.class;
       if (!PatchProxy.applyVoid(objArray, obj, liveMaterial, str)) {
          if (obj.b == null) {
             ConcurrentHashMap uConcurrentH = PatchProxy.apply(objArray, obj, liveMaterial, "4");
             if (uConcurrentH != patchProxyRe) {
             }else {
                uConcurrentH = obj.a.a(objArray);
                if (uConcurrentH == null) {
                   uConcurrentH = new ConcurrentHashMap();
                }
             }
             obj.b = uConcurrentH;
          }
          str = b.d()+File.separator;
          if (PatchProxy.isSupport(b.class)) {
             File obj1 = PatchProxy.applyTwoRefs(str, Boolean.TRUE, objArray, b.class, "12");
             if (obj1 != patchProxyRe) {
                obj1.booleanValue();
             }else {
             label_006d :
                File uFile = new File(str);
                if (!uFile.exists()) {
                   obj1 = uFile.getParentFile();
                   if (obj1 == null || (obj1.exists() || obj1.mkdirs())) {
                      try{
                         uFile.mkdir();
                      }catch(java.io.IOException e0){
                         e0.printStackTrace();
                      }
                   }
                }
             }
          }else {
             goto label_006d ;
          }
       }
    label_00c2 :
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
