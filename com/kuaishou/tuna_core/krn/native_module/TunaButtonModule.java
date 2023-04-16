package com.kuaishou.tuna_core.krn.native_module.TunaButtonModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kuaishou.tuna_core.button.TunaButton;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import java.lang.Throwable;
import c15.b;
import t45.d;
import zz4.a;
import java.lang.Runnable;
import crd.b;
import brd.z;
import zz4.b;
import com.kuaishou.tuna_core.krn.native_module.TunaButtonModule$TunaButtonModuleException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class TunaButtonModule extends KrnBridge	// class@0010db
{

    public void TunaButtonModule(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(TunaButtonModule p0,TunaButtonModel p1){
       p0.lambda$perform$0(p1);
    }
    private void lambda$perform$0(TunaButtonModel p0){
       TunaButton.b(this.getCurrentActivity(), p0);
    }
    public static void lambda$preprocess$1(TunaButtonModel p0){
       TunaButton.c(p0);
    }
    public String getName(){
       return "TunaButtonModule";
    }
    public void perform(ReadableMap p0){
       TunaButtonModel tunaButtonMo;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaButtonModule.class, "1")) {
          return;
       }
       int i = 0;
       try{
          tunaButtonMo = this.parseParams(p0, TunaButtonModel.class);
       }catch(java.lang.Exception e4){
          b.c(KsLogTunaCoreTag.TUNA_KRN.appendTag("TunaButtonModule.perform"), e4);
       }
       if (tunaButtonMo != null) {
          d.a.d(new a(this, tunaButtonMo));
       }
       return;
    }
    public void preprocess(ReadableMap p0){
       TunaButtonModel tunaButtonMo;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaButtonModule.class, "2")) {
          return;
       }
       int i = 0;
       try{
          tunaButtonMo = this.parseParams(p0, TunaButtonModel.class);
       }catch(java.lang.Exception e4){
          b.c(KsLogTunaCoreTag.TUNA_KRN.appendTag("TunaButtonModule.preprocess"), e4);
       }
       if (tunaButtonMo != null) {
          d.a.d(new b(tunaButtonMo));
       }else {
          ExceptionHandler.handleCaughtException(new TunaButtonModule$TunaButtonModuleException("preprocess: tunaButtonModel is null"));
       }
       return;
    }
}
