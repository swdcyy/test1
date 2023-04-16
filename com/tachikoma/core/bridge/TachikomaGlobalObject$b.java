package com.tachikoma.core.bridge.TachikomaGlobalObject$b;
import java.lang.Runnable;
import com.tachikoma.core.bridge.TachikomaGlobalObject;
import android.graphics.Bitmap;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.StringBuilder;
import com.tachikoma.core.bridge.d;
import java.lang.System;
import iq8.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.lang.Throwable;
import zp8.a;
import com.tachikoma.core.bridge.TachikomaGlobalObject$b$a;
import iq8.x;

public class TachikomaGlobalObject$b implements Runnable	// class@000d3a
{
    public final Bitmap b;
    public final JsValueRef c;
    public final TachikomaGlobalObject d;

    public void TachikomaGlobalObject$b(TachikomaGlobalObject p0,Bitmap p1,JsValueRef p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       File uFile1;
       if (PatchProxy.applyVoid(null, this, TachikomaGlobalObject$b.class, "1")) {
          return;
       }
       File uFile = new File(this.d.getContext().getFilesDir(), "kds_native/image");
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       TachikomaGlobalObject$b tb = this.b;
       String absolutePath = new File(uFile, this.d.getTKJSContext().e()+"_"+System.nanoTime()+".jpg").getAbsolutePath();
       if (PatchProxy.isSupport(b.class)) {
          File obj = PatchProxy.applyThreeRefs(tb, absolutePath, Integer.valueOf(100), null, b.class, "7");
          if (obj != PatchProxyResult.class) {
             uFile1 = obj;
          }else {
             try{
                obj = new File(absolutePath);
                BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(obj));
                tb.compress(Bitmap$CompressFormat.PNG, 100, uBufferedOut);
                uBufferedOut.flush();
                uBufferedOut.close();
                uFile1 = obj;
             }catch(java.io.IOException e0){
                a.g("saveBitmapToFile error: "+absolutePath, e0);
             }
          }
       }else {
          goto label_0079 ;
       }
    }
}
