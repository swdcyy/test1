package com.kwai.video.ksuploaderkit.DefaultUploaderKitLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKitLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.init.module.KSUploaderKitLogInit;
import com.yxcorp.gifshow.init.module.KSUploaderKitLogInit$Companion;
import q87.c;
import java.lang.Throwable;

public final class DefaultUploaderKitLogger implements KSUploaderKitLogger	// class@000953
{

    public void DefaultUploaderKitLogger(){
       super();
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DefaultUploaderKitLogger.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "message");
       Log.b(p0, p1);
       Object[] objArray = new Object[0];
       KSUploaderKitLogInit.c.a().s(p0, p1, objArray);
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DefaultUploaderKitLogger.class, "5")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "message");
       Log.e(p0, p1, p2);
       KSUploaderKitLogInit.c.a().e(p0, p1, p2);
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DefaultUploaderKitLogger.class, "3")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "message");
       Log.g(p0, p1);
       Object[] objArray = new Object[0];
       KSUploaderKitLogInit.c.a().w(p0, p1, objArray);
       return;
    }
    public void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DefaultUploaderKitLogger.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "message");
       Log.l(p0, p1);
       Object[] objArray = new Object[0];
       KSUploaderKitLogInit.c.a().y(p0, p1, objArray);
       return;
    }
    public void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DefaultUploaderKitLogger.class, "4")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "message");
       Log.n(p0, p1);
       Object[] objArray = new Object[0];
       KSUploaderKitLogInit.c.a().A(p0, p1, objArray);
       return;
    }
}
