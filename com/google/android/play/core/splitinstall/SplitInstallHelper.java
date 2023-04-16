package com.google.android.play.core.splitinstall.SplitInstallHelper;
import java.lang.Object;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import com.kwai.plugin.dva.feature.core.loader.a;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import android.app.Service;
import android.content.BroadcastReceiver;
import java.lang.Class;
import android.content.ContextWrapper;

public class SplitInstallHelper	// class@0016f6
{

    public void SplitInstallHelper(){
       super();
    }
    public static void loadResources(Activity p0,Resources p1){
       a.h(p0, p1);
    }
    public static void loadResources(Service p0){
       a.h(p0, p0.getBaseContext().getResources());
    }
    public static void loadResources(BroadcastReceiver p0,Context p1){
       if ((p1.getClass().getSimpleName()).equals("ReceiverRestrictedContext")) {
          a.h(p1.getBaseContext(), p1.getResources());
       }
       return;
    }
}
