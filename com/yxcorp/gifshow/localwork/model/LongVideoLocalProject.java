package com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import java.lang.String;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject$MultiResourceType;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject$b;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject$a;
import java.lang.System;
import com.google.gson.Gson;
import s26.d;
import qkd.b;
import java.lang.Exception;
import java.lang.Boolean;
import xf6.g;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.LongVideoEditConfig;
import oa0.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.lang.Number;

public class LongVideoLocalProject	// class@001ad4
{
    public LongVideoLocalProject$a a;
    public final File b;
    public static LongVideoEditConfig c;

    public void LongVideoLocalProject(String p0,String p1){
       LongVideoLocalProject$MultiResourceType lONG_VIDEO = LongVideoLocalProject$MultiResourceType.LONG_VIDEO;
       super();
       File uFile = new File(p0, p1);
       this.b = uFile;
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       File uFile1 = new File(uFile, "config.bat");
       LongVideoLocalProject$b uob = PatchProxy.apply(null, this, LongVideoLocalProject.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new LongVideoLocalProject$b();
       }
       this.a = uob;
       uob.projectType = lONG_VIDEO;
       uob.projectId = p1;
       uob.lastUpdateTime = System.currentTimeMillis();
       if (uFile1.exists()) {
          try{
             this.a = d.a().h(b.g0(uFile1, "utf-8"), this.a.getClass());
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
    public static boolean a(){
       a obj = PatchProxy.apply(null, null, LongVideoLocalProject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       obj = (g.o1() && l.c("enable_long_video_upload", b))? 1: null;
       if (obj || a.t().d("enableUploadLongVideo", true)) {
          b = true;
       }
       return b;
    }
    public static void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, LongVideoLocalProject.class, "7")) {
          return;
       }
       if (LongVideoLocalProject.c == null) {
          LongVideoEditConfig longVideoEdi = LongVideoEditConfig.class;
          String str = a.a.getString(b.d("user")+"longVideoConfig", "");
          if (str != null && str != "") {
             objArray = b.a(str, longVideoEdi);
          }
          LongVideoLocalProject.c = objArray;
       }
       if (LongVideoLocalProject.c == null) {
          LongVideoLocalProject.c = new LongVideoEditConfig();
       }
       return;
    }
    public static double d(){
       Object obj = PatchProxy.apply(null, null, LongVideoLocalProject.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       LongVideoLocalProject.b();
       return (double)((float)(LongVideoLocalProject.c.getMaxMinutes() * 60) + 0x3f000000);
    }
    public static long e(boolean p0){
       LongVideoLocalProject longVideoLoc = LongVideoLocalProject.class;
       if (PatchProxy.isSupport(longVideoLoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, longVideoLoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       LongVideoLocalProject.b();
       long maxMilliseco = LongVideoLocalProject.c.getMaxMilliseconds();
       int i = (p0)? 499: 0;
       return (maxMilliseco + (long)i);
    }
    public static int f(){
       Object obj = PatchProxy.apply(null, null, LongVideoLocalProject.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       LongVideoLocalProject.b();
       return LongVideoLocalProject.c.getMaxMinutes();
    }
    public static long g(boolean p0){
       LongVideoLocalProject longVideoLoc = LongVideoLocalProject.class;
       if (PatchProxy.isSupport(longVideoLoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, longVideoLoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       LongVideoLocalProject.b();
       long minMilliseco = LongVideoLocalProject.c.getMinMilliseconds();
       int i = (p0)? 499: 0;
       return (minMilliseco + (long)i);
    }
    public LongVideoLocalProject$b c(){
       return this.a;
    }
    public File h(){
       return this.b;
    }
}
