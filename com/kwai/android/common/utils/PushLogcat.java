package com.kwai.android.common.utils.PushLogcat;
import java.lang.String;
import com.kwai.android.common.utils.PushLogcat$logPropertiesSwitcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.android.common.utils.PushLogcat$logClz$2;
import com.kwai.android.common.utils.PushLogcat$tailProcessName$2;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import com.kwai.android.common.utils.PushLogcat$logI$1;
import com.kwai.android.common.utils.PushLogcat$logE$1;
import java.lang.Object;
import msd.q;
import msd.p;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.PushLogcat$e$1;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import java.lang.Boolean;
import com.kwai.android.common.utils.PushLogcat$i$1;

public final class PushLogcat	// class@0009a4
{
    public static final PushLogcat INSTANCE;
    public static final Method eMethod;
    public static final Method iMethod;
    public static final p logClz$delegate;
    public static final q logE;
    public static final p logI;
    public static final p logPropertiesSwitcher$delegate;
    public static final p tailProcessName$delegate;

    static {
       Method declaredMeth;
       String str = String.class;
       PushLogcat pushLogcat = new PushLogcat();
       PushLogcat.INSTANCE = pushLogcat;
       PushLogcat.logPropertiesSwitcher$delegate = s.c(PushLogcat$logPropertiesSwitcher$2.INSTANCE);
       PushLogcat.logClz$delegate = s.c(PushLogcat$logClz$2.INSTANCE);
       PushLogcat.tailProcessName$delegate = s.c(PushLogcat$tailProcessName$2.INSTANCE);
       Class logClz = pushLogcat.getLogClz();
       Method method = null;
       if (logClz != null) {
          Class[] uClassArray = new Class[]{str,str};
          declaredMeth = logClz.getDeclaredMethod("i", uClassArray);
       }else {
          declaredMeth = method;
       }
       PushLogcat.iMethod = declaredMeth;
       Class logClz1 = pushLogcat.getLogClz();
       if (logClz1 != null) {
          Class[] uClassArray1 = new Class[]{str,str,Throwable.class};
          method = logClz1.getDeclaredMethod("e", uClassArray1);
       }
       PushLogcat.eMethod = method;
       PushLogcat.logI = PushLogcat$logI$1.INSTANCE;
       PushLogcat.logE = PushLogcat$logE$1.INSTANCE;
    }
    public void PushLogcat(){
       super();
    }
    public static final Method access$getEMethod$p(PushLogcat p0){
       return PushLogcat.eMethod;
    }
    public static final Method access$getIMethod$p(PushLogcat p0){
       return PushLogcat.iMethod;
    }
    public static final q access$getLogE$p(PushLogcat p0){
       return PushLogcat.logE;
    }
    public static final p access$getLogI$p(PushLogcat p0){
       return PushLogcat.logI;
    }
    public static void e$default(PushLogcat p0,String p1,String p2,Throwable p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = "KwaiPushSDK";
       }
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.e(p1, p2, p3);
       return;
    }
    public static void i$default(PushLogcat p0,String p1,String p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = "KwaiPushSDK";
       }
       p0.i(p1, p2);
       return;
    }
    public final void e(String p0,String p1,Throwable p2){
       a.p(p0, "tag");
       a.p(p1, "msg");
       PushSDKInitUtilKt.requirePushInit(new PushLogcat$e$1(p0, p1, p2));
    }
    public final Class getLogClz(){
       return PushLogcat.logClz$delegate.getValue();
    }
    public final boolean getLogPropertiesSwitcher(){
       return PushLogcat.logPropertiesSwitcher$delegate.getValue().booleanValue();
    }
    public final String getTailProcessName(){
       return PushLogcat.tailProcessName$delegate.getValue();
    }
    public final void i(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "msg");
       PushSDKInitUtilKt.requirePushInit(new PushLogcat$i$1(p0, p1));
    }
}
