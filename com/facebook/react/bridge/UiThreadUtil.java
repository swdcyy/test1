package com.facebook.react.bridge.UiThreadUtil;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.SoftAssertions;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Looper;
import java.lang.Thread;
import java.lang.Runnable;
import java.lang.Long;
import android.os.Handler;

public class UiThreadUtil	// class@00123d
{
    public static Handler sMainHandler;

    public void UiThreadUtil(){
       super();
    }
    public static void assertNotOnUiThread(){
       if (PatchProxy.applyVoid(null, null, UiThreadUtil.class, "3")) {
          return;
       }
       SoftAssertions.assertCondition((UiThreadUtil.isOnUiThread() ^ 0x01), "Expected not to run on UI thread!");
       return;
    }
    public static void assertOnUiThread(){
       if (PatchProxy.applyVoid(null, null, UiThreadUtil.class, "2")) {
          return;
       }
       SoftAssertions.assertCondition(UiThreadUtil.isOnUiThread(), "Expected to run on UI thread!");
       return;
    }
    public static boolean isOnUiThread(){
       Object obj = PatchProxy.apply(null, null, UiThreadUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Looper.getMainLooper().getThread() == Thread.currentThread())? true: false;
       return b;
    }
    public static void runOnUiThread(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, UiThreadUtil.class, "4")) {
          return;
       }
       UiThreadUtil.runOnUiThread(p0, 0);
       return;
    }
    public static void runOnUiThread(Runnable p0,long p1){
       UiThreadUtil uiThreadUtil = UiThreadUtil.class;
       if (PatchProxy.isSupport(uiThreadUtil) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uiThreadUtil, "5")) {
          return;
       }
       _monitor_enter(uiThreadUtil);
       if (UiThreadUtil.sMainHandler == null) {
          UiThreadUtil.sMainHandler = new Handler(Looper.getMainLooper());
       }
       _monitor_exit(uiThreadUtil);
       UiThreadUtil.sMainHandler.postDelayed(p0, p1);
       return;
    }
}
