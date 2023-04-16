package com.kuaishou.gifshow.files.security.SensitiveFileDefender$mSensitiveFiles$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import java.io.File;
import j80.a;

public final class SensitiveFileDefender$mSensitiveFiles$2 extends Lambda implements a	// class@0019c4
{
    public static final SensitiveFileDefender$mSensitiveFiles$2 INSTANCE;

    static {
       SensitiveFileDefender$mSensitiveFiles$2.INSTANCE = new SensitiveFileDefender$mSensitiveFiles$2();
    }
    public void SensitiveFileDefender$mSensitiveFiles$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ArrayList invoke(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, SensitiveFileDefender$mSensitiveFiles$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       c uoc = a.a();
       String str = "AppEnv.get\(\)";
       a.o(uoc, str);
       Application uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       File uFile = a.a(uApplication, objArray);
       if (uFile != null) {
          obj.add(uFile);
          obj.add(new File(uFile, "push_cdata.lock"));
          obj.add(new File(uFile, "push_cdata.data"));
          obj.add(new File(uFile, "MiPushLog/log.lock"));
          obj.add(new File(uFile, "MiPushLog/log1.txt"));
          obj.add(new File(uFile, "data/f_c/wf4"));
          obj.add(new File(uFile, "data/f_c/wf4_bf"));
          obj.add(new File(uFile, "keyconfig/high_priority_config.fb"));
          obj.add(new File(uFile, ".ttdduuts"));
          obj.add(new File(uFile, ".ttdduu"));
          obj.add(new File(uFile, ".rrssuuts"));
          obj.add(new File(uFile, ".rrssuu"));
       }
       c uoc1 = a.a();
       a.o(uoc1, str);
       Application uApplication1 = uoc1.a();
       a.o(uApplication1, "AppEnv.get\(\).appContext");
       uFile = uApplication1.getExternalCacheDir();
       if (uFile != null) {
          obj.add(new File(uFile, "ksadsdk"));
          obj.add(new File(uFile, "ksadsdk/.nomedia"));
          obj.add(new File(uFile, "ksadsdk/journal"));
          obj.add(new File(uFile, "kssplash"));
          obj.add(new File(uFile, "kssplash/f7dcebb38bded78c1a2973e2e9cb23aa"));
          obj.add(new File(uFile, "kssplash/journal"));
       }
       return obj;
    }
}
