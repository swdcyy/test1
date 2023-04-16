package cn.vimfung.luascriptcore.LuaNativeUtil;
import nl5.b;
import java.lang.Object;
import java.lang.Error;
import java.lang.String;
import cn.vimfung.luascriptcore.LuaValue;
import cn.vimfung.luascriptcore.LuaScriptController;
import cn.vimfung.luascriptcore.LuaContext;
import cn.vimfung.luascriptcore.LuaFunction;
import com.kwai.eve.so.SoVm;
import java.lang.Class;

public class LuaNativeUtil	// class@000d3f
{

    static {
       b.a();
    }
    public void LuaNativeUtil(){
       super();
       throw new Error("Not allowed to instantiate the class");
    }
    public static native void addSearchPath(int p0,String p1);
    public static native LuaValue callMethod(int p0,String p1,LuaValue[] p2,LuaScriptController p3);
    public static native void catchException(LuaContext p0,boolean p1);
    public static native void clearObjectMapping(long p0);
    public static native void cppBlockDataRefCounterRelease(long p0);
    public static native void cppBlockDataRefCounterRetain(long p0);
    public static native LuaContext createContext(String p0);
    public static native long createCppBlockData(Object p0,String p1,int p2,int[] p3,String p4);
    public static native Object createDirectByteBuffer(long p0);
    public static native LuaScriptController createScriptController();
    public static native LuaValue evalScript(int p0,String p1,LuaScriptController p2);
    public static native LuaValue evalScriptFromFile(int p0,String p1,LuaScriptController p2);
    public static native void freeInferenceStopWatch(String p0,String p1);
    public static native void freeMemoryByInferenceId(String p0,String p1);
    public static native void freeMemoryByTaskId(String p0);
    public static native LuaValue getExtra(int p0,String p1);
    public static native LuaValue getGlobal(int p0,String p1);
    public static native String getInferenceStopWatchInfo(String p0,String p1);
    public static native int getRetainNum(long p0);
    public static native void initPerformanceTrackerEnv(Object p0,float p1,float p2,LuaValue p3);
    public static native LuaValue invokeFunction(LuaContext p0,LuaFunction p1,LuaValue[] p2,LuaScriptController p3);
    public static native Object invokeSo(long p0,String p1,LuaValue p2);
    public static native void lapUniversalStopWatch(String p0,String p1,String p2,String p3);
    public static native void loadDynaimicModule(int p0,String p1,String p2,String p3);
    public static native SoVm loadSo(String p0);
    public static native Object luaValueSetObject(LuaContext p0,LuaValue p1,String p2,LuaValue p3);
    public static native void preWarm(String p0,String p1);
    public static native void putExtra(int p0,String p1,LuaValue p2);
    public static native void raiseException(LuaContext p0,String p1);
    public static native void registerMethod(int p0,String p1);
    public static native boolean registerType(LuaContext p0,String p1,String p2,String p3,Class p4,String[] p5,String[] p6,String[] p7);
    public static native void releaseNativeObject(int p0);
    public static native void releaseValue(LuaContext p0,LuaValue p1);
    public static native void retainValue(LuaContext p0,LuaValue p1);
    public static String safelyGetInferenceStopWatchInfo(String p0,String p1){
       return LuaNativeUtil.getInferenceStopWatchInfo(p0, p1);
    }
    public static void safelyLapUniversalStopWatch(String p0,String p1,String p2,String p3){
       LuaNativeUtil.lapUniversalStopWatch(p0, p1, p2, p3);
    }
    public static void safelyPreWarm(String p0,String p1){
       LuaNativeUtil.preWarm(p0, p1);
    }
    public static void safelyReleaseNativeObject(int p0){
       LuaNativeUtil.releaseNativeObject(p0);
    }
    public static void safelySetOrUpdateFeatureCache(String p0,LuaValue p1){
       LuaNativeUtil.setOrUpdateFeatureCache(p0, p1);
    }
    public static void safelyStartUniversalStopWatch(String p0,String p1,String p2){
       LuaNativeUtil.startUniversalStopWatch(p0, p1, p2);
    }
    public static void safelyStopUniversalStopWatch(String p0,String p1,String p2,String p3){
       LuaNativeUtil.stopUniversalStopWatch(p0, p1, p2, p3);
    }
    public static void safelySyncKSwitch(boolean p0,boolean p1,boolean p2,boolean p3){
       LuaNativeUtil.syncKSwitch(p0, p1, p2, p3);
    }
    public static native void scriptControllerForceExit(LuaScriptController p0);
    public static native void scriptControllerSetTimeout(LuaScriptController p0,int p1);
    public static native void setGlobal(int p0,String p1,LuaValue p2);
    public static native void setLogStatus(boolean p0,boolean p1,boolean p2);
    public static native void setLogger(int p0,Object p1);
    public static native void setOrUpdateFeatureCache(String p0,LuaValue p1);
    public static native void startUniversalStopWatch(String p0,String p1,String p2);
    public static native void stopUniversalStopWatch(String p0,String p1,String p2,String p3);
    public static native void syncKSwitch(boolean p0,boolean p1,boolean p2,boolean p3);
    public static native void testLuaClassInject();
    public static native Object typeValueToRef(Object p0,String p1,String p2);
    public static native void unloadSo(long p0);
}
