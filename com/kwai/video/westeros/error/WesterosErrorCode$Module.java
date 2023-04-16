package com.kwai.video.westeros.error.WesterosErrorCode$Module;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Class;
import java.util.EnumSet;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Integer;
import java.util.Map;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WesterosErrorCode$Module extends Enum	// class@000e79
{
    public final int code;
    public static final WesterosErrorCode$Module[] $VALUES;
    public static final WesterosErrorCode$Module kAppStateMonitor;
    public static final WesterosErrorCode$Module kAudioCapture;
    public static final WesterosErrorCode$Module kBase;
    public static final WesterosErrorCode$Module kCamera;
    public static final WesterosErrorCode$Module kCommon;
    public static final WesterosErrorCode$Module kConfig;
    public static final WesterosErrorCode$Module kConverter;
    public static final WesterosErrorCode$Module kDepsManager;
    public static final WesterosErrorCode$Module kFace;
    public static final WesterosErrorCode$Module kLog;
    public static final WesterosErrorCode$Module kMax;
    public static final WesterosErrorCode$Module kNone;
    public static final WesterosErrorCode$Module kPipeline;
    public static final WesterosErrorCode$Module kPlugin;
    public static final WesterosErrorCode$Module kProcessor;
    public static final WesterosErrorCode$Module kRecorder;
    public static final WesterosErrorCode$Module kRender;
    public static final WesterosErrorCode$Module kResourceManager;
    public static final WesterosErrorCode$Module kSensor;
    public static final WesterosErrorCode$Module kStats;
    public static final WesterosErrorCode$Module kUtils;
    public static final Map lookup;

    static {
       WesterosErrorCode$Module module = new WesterosErrorCode$Module("kCommon", 0, 0);
       WesterosErrorCode$Module.kCommon = module;
       WesterosErrorCode$Module module1 = new WesterosErrorCode$Module("kCamera", 1, 1);
       WesterosErrorCode$Module.kCamera = module1;
       WesterosErrorCode$Module module2 = new WesterosErrorCode$Module("kAudioCapture", 2, 2);
       WesterosErrorCode$Module.kAudioCapture = module2;
       WesterosErrorCode$Module module3 = new WesterosErrorCode$Module("kFace", 3, 3);
       WesterosErrorCode$Module.kFace = module3;
       WesterosErrorCode$Module module4 = new WesterosErrorCode$Module("kStats", 4, 4);
       WesterosErrorCode$Module.kStats = module4;
       WesterosErrorCode$Module module5 = new WesterosErrorCode$Module("kPlugin", 5, 5);
       WesterosErrorCode$Module.kPlugin = module5;
       WesterosErrorCode$Module module6 = new WesterosErrorCode$Module("kDepsManager", 6, 6);
       WesterosErrorCode$Module.kDepsManager = module6;
       WesterosErrorCode$Module module7 = new WesterosErrorCode$Module("kResourceManager", 7, 7);
       WesterosErrorCode$Module.kResourceManager = module7;
       WesterosErrorCode$Module module8 = new WesterosErrorCode$Module("kConverter", 8, 8);
       WesterosErrorCode$Module.kConverter = module8;
       WesterosErrorCode$Module module9 = new WesterosErrorCode$Module("kPipeline", 9, 9);
       WesterosErrorCode$Module.kPipeline = module9;
       WesterosErrorCode$Module module10 = new WesterosErrorCode$Module("kBase", 10, 10);
       WesterosErrorCode$Module.kBase = module10;
       WesterosErrorCode$Module module11 = new WesterosErrorCode$Module("kProcessor", 11, 11);
       WesterosErrorCode$Module.kProcessor = module11;
       WesterosErrorCode$Module module12 = new WesterosErrorCode$Module("kRecorder", 12, 12);
       WesterosErrorCode$Module.kRecorder = module12;
       WesterosErrorCode$Module module13 = new WesterosErrorCode$Module("kRender", 13, 13);
       WesterosErrorCode$Module.kRender = module13;
       WesterosErrorCode$Module module14 = module13;
       WesterosErrorCode$Module module15 = new WesterosErrorCode$Module("kLog", 14, 14);
       WesterosErrorCode$Module.kLog = module15;
       WesterosErrorCode$Module module16 = module15;
       WesterosErrorCode$Module module17 = new WesterosErrorCode$Module("kAppStateMonitor", 15, 15);
       WesterosErrorCode$Module.kAppStateMonitor = module17;
       WesterosErrorCode$Module module18 = module17;
       module13 = new WesterosErrorCode$Module("kConfig", 16, 16);
       WesterosErrorCode$Module.kConfig = module13;
       WesterosErrorCode$Module module19 = module13;
       module15 = new WesterosErrorCode$Module("kSensor", 17, 17);
       WesterosErrorCode$Module.kSensor = module15;
       WesterosErrorCode$Module module20 = module15;
       module17 = new WesterosErrorCode$Module("kUtils", 18, 18);
       WesterosErrorCode$Module.kUtils = module17;
       WesterosErrorCode$Module module21 = module17;
       WesterosErrorCode$Module module22 = module12;
       module13 = new WesterosErrorCode$Module("kMax", 19, 63);
       WesterosErrorCode$Module.kMax = module13;
       int i = 20;
       WesterosErrorCode$Module module23 = module13;
       module15 = new WesterosErrorCode$Module("kNone", i, -1);
       WesterosErrorCode$Module.kNone = module15;
       WesterosErrorCode$Module[] moduleArray = new WesterosErrorCode$Module[21];
       moduleArray[0] = module;
       moduleArray[1] = module1;
       moduleArray[2] = module2;
       moduleArray[3] = module3;
       moduleArray[4] = module4;
       moduleArray[5] = module5;
       moduleArray[6] = module6;
       moduleArray[7] = module7;
       moduleArray[8] = module8;
       moduleArray[9] = module9;
       moduleArray[10] = module10;
       moduleArray[11] = module11;
       moduleArray[12] = module22;
       moduleArray[13] = module14;
       moduleArray[14] = module16;
       moduleArray[15] = module18;
       moduleArray[16] = module19;
       moduleArray[17] = module20;
       moduleArray[18] = module21;
       moduleArray[19] = module23;
       moduleArray[i] = module15;
       WesterosErrorCode$Module.$VALUES = moduleArray;
       WesterosErrorCode$Module.lookup = new HashMap();
       Iterator iterator = EnumSet.allOf(WesterosErrorCode$Module.class).iterator();
       while (iterator.hasNext()) {
          module1 = iterator.next();
          WesterosErrorCode$Module.lookup.put(Integer.valueOf(module1.code), module1);
       }
    }
    public void WesterosErrorCode$Module(String p0,int p1,int p2){
       super(p0, p1);
       this.code = p2;
    }
    public static WesterosErrorCode$Module fromCode(int p0){
       WesterosErrorCode$Module module = WesterosErrorCode$Module.class;
       if (PatchProxy.isSupport(module)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, module, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       WesterosErrorCode$Module module1 = WesterosErrorCode$Module.lookup.get(Integer.valueOf(p0));
       if (module1 == null) {
          module1 = WesterosErrorCode$Module.kNone;
       }
       return module1;
    }
    public static WesterosErrorCode$Module valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode$Module.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WesterosErrorCode$Module.class, p0);
    }
    public static WesterosErrorCode$Module[] values(){
       Object obj = PatchProxy.apply(null, null, WesterosErrorCode$Module.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WesterosErrorCode$Module.$VALUES.clone();
    }
    public int getCode(){
       return this.code;
    }
}
