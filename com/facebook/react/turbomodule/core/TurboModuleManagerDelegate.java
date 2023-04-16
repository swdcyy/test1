package com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import java.lang.Object;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import com.facebook.jni.HybridData;
import java.util.List;
import java.util.ArrayList;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.CxxModuleWrapper;

public abstract class TurboModuleManagerDelegate	// class@00130d
{
    public final HybridData mHybridData;
    public static boolean a;

    public void TurboModuleManagerDelegate(){
       super();
       _monitor_enter(this);
       _monitor_exit(this);
       TurboModuleManagerDelegate turboModuleM = TurboModuleManagerDelegate.class;
       _monitor_enter(turboModuleM);
       if (!TurboModuleManagerDelegate.a) {
          SoLoader.b("turbomodulejsijni");
          TurboModuleManagerDelegate.a = true;
       }
       _monitor_exit(turboModuleM);
       this.mHybridData = this.initHybrid();
       return;
    }
    public List a(){
       return new ArrayList();
    }
    public abstract TurboModule b(String p0);
    public abstract CxxModuleWrapper getLegacyCxxModule(String p0);
    public abstract HybridData initHybrid();
}
