package com.kwai.video.aemonplayer.AemonHotfix;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonJNI;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.aemonplayer.AemonJNIBuiltIn;
import com.kwai.video.aemonplayer.AemonJNIHotfix;
import com.kwai.video.aemonplayer.JavaAttrListJNI;
import com.kwai.video.aemonplayer.JavaAttrListJNIBuiltIn;
import com.kwai.video.aemonplayer.JavaAttrListJNIHotfix;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kwai.video.aemonplayer.AemonNativeLogger;
import com.kwai.video.aemonplayer.JavaAttrList;

public class AemonHotfix	// class@001995
{
    public static boolean sEnableHotfix = false;
    public static final int sInstallModeBuiltIn;
    public static final int sInstallModeHotfix;

    public void AemonHotfix(){
       super();
    }
    public static AemonJNI CreateAemonJni(int p0){
       AemonHotfix uAemonHotfix = AemonHotfix.class;
       if (PatchProxy.isSupport(uAemonHotfix)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uAemonHotfix, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (p0 != 1) {
             return new AemonJNIBuiltIn();
          }else {
             return new AemonJNIHotfix();
          }
       }else {
          return new AemonJNIBuiltIn();
       }
    }
    public static JavaAttrListJNI CreateJavaAttrListJNI(int p0){
       AemonHotfix uAemonHotfix = AemonHotfix.class;
       if (PatchProxy.isSupport(uAemonHotfix)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uAemonHotfix, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (p0 != 1) {
             return new JavaAttrListJNIBuiltIn();
          }else {
             return new JavaAttrListJNIHotfix();
          }
       }else {
          return new JavaAttrListJNIBuiltIn();
       }
    }
    public static synchronized int __install__(){
       int i;
       _monitor_enter(AemonHotfix.class);
       Object obj = PatchProxy.apply(null, null, AemonHotfix.class, "5");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(AemonHotfix.class);
          return obj.intValue();
       }else if(AemonHotfix.sEnableHotfix){
          i = 1;
       }else {
          i = 0;
       }
       AemonNativeLogger.i("[PlayerLibrary]", "__install__ ret:"+i);
       _monitor_exit(AemonHotfix.class);
       return i;
    }
    public static synchronized void install(){
       _monitor_enter(AemonHotfix.class);
       if (PatchProxy.applyVoid(null, null, AemonHotfix.class, "6")) {
          _monitor_exit(AemonHotfix.class);
          return;
       }else {
          AemonNativeLogger.i("[PlayerLibrary]", "install hotfix");
          AemonHotfix.sEnableHotfix = true;
          _monitor_exit(AemonHotfix.class);
          return;
       }
    }
    public static JavaAttrList staticBizInvoke(int p0,int p1,JavaAttrList p2){
       if (PatchProxy.isSupport(AemonHotfix.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, AemonHotfix.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (p0 != 1) {
             return AemonJNIBuiltIn.native_staticBizInvoke(p1, p2);
          }else {
             return AemonJNIHotfix.native_staticBizInvoke(p1, p2);
          }
       }else {
          return AemonJNIBuiltIn.native_staticBizInvoke(p1, p2);
       }
    }
    public static JavaAttrList staticCreateJavaAttrList(int p0){
       AemonHotfix uAemonHotfix = AemonHotfix.class;
       if (PatchProxy.isSupport(uAemonHotfix)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uAemonHotfix, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JavaAttrList(p0);
    }
}
