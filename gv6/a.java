package gv6.a;
import gv6.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class a implements b	// class@001711
{

    public void a(){
       super();
    }
    public void addCustomStatEvent(float p0,String p1,String p2){
       a.p(p1, "key");
       a.p(p2, "value");
    }
    public boolean azerothHasInit(){
       return false;
    }
    public boolean dispatchPushCommand(String p0,String p1){
       a.p(p0, "command");
       a.p(p1, "extra");
       return false;
    }
    public String getAppVersion(){
       return "";
    }
    public String getDeviceId(){
       return "";
    }
    public String getGlobalId(){
       return "";
    }
    public String getManufacturerAndModel(){
       return "";
    }
    public String getSysRelease(){
       return "";
    }
    public String getUserId(){
       return "";
    }
    public boolean isDebugMode(){
       return false;
    }
    public void logE(String p0,String p1,Throwable p2){
       a.p(p0, "tag");
       a.p(p1, "msg");
    }
    public void logI(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "msg");
    }
}
