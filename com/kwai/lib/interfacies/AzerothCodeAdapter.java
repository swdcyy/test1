package com.kwai.lib.interfacies.AzerothCodeAdapter;
import gv6.b;
import com.kwai.lib.interfacies.AzerothCodeAdapter$INSTANCE$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class AzerothCodeAdapter implements b	// class@000d00
{
    public static final p a;
    public static final AzerothCodeAdapter b;

    static {
       AzerothCodeAdapter.b = new AzerothCodeAdapter();
       AzerothCodeAdapter.a = s.c(AzerothCodeAdapter$INSTANCE$2.INSTANCE);
    }
    public void AzerothCodeAdapter(){
       super();
    }
    public final b a(){
       return AzerothCodeAdapter.a.getValue();
    }
    public void addCustomStatEvent(float p0,String p1,String p2){
       a.p(p1, "key");
       a.p(p2, "value");
       this.a().addCustomStatEvent(p0, p1, p2);
    }
    public boolean azerothHasInit(){
       return this.a().azerothHasInit();
    }
    public boolean dispatchPushCommand(String p0,String p1){
       a.p(p0, "command");
       a.p(p1, "extra");
       return this.a().dispatchPushCommand(p0, p1);
    }
    public String getAppVersion(){
       return this.a().getAppVersion();
    }
    public String getDeviceId(){
       return this.a().getDeviceId();
    }
    public String getGlobalId(){
       return this.a().getGlobalId();
    }
    public String getManufacturerAndModel(){
       return this.a().getManufacturerAndModel();
    }
    public String getSysRelease(){
       return this.a().getSysRelease();
    }
    public String getUserId(){
       return this.a().getUserId();
    }
    public boolean isDebugMode(){
       return this.a().isDebugMode();
    }
    public void logE(String p0,String p1,Throwable p2){
       a.p(p0, "tag");
       a.p(p1, "msg");
       this.a().logE(p0, p1, p2);
    }
    public void logI(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "msg");
       this.a().logI(p0, p1);
    }
}
