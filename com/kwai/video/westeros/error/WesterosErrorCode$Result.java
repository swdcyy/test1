package com.kwai.video.westeros.error.WesterosErrorCode$Result;
import java.lang.Enum;
import com.kwai.video.westeros.error.WesterosErrorCode$Level;
import com.kwai.video.westeros.error.WesterosErrorCode$Module;
import com.kwai.video.westeros.error.WesterosErrorCode;
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
import java.lang.Number;

public final class WesterosErrorCode$Result extends Enum	// class@000e7b
{
    public final int code;
    public final String name;
    public static final WesterosErrorCode$Result[] $VALUES;
    public static final WesterosErrorCode$Result kEOF;
    public static final WesterosErrorCode$Result kIOError;
    public static final WesterosErrorCode$Result kIllegalOperation;
    public static final WesterosErrorCode$Result kIllegalState;
    public static final WesterosErrorCode$Result kInvalidArgument;
    public static final WesterosErrorCode$Result kNone;
    public static final WesterosErrorCode$Result kOOM;
    public static final WesterosErrorCode$Result kOk;
    public static final WesterosErrorCode$Result kSensorManagerEventNoSensor;
    public static final WesterosErrorCode$Result kSensorManagerNoGravitySensor;
    public static final WesterosErrorCode$Result kSensorManagerNoRotationSensor;
    public static final WesterosErrorCode$Result kSensorManagerRegisterListenerFailed;
    public static final WesterosErrorCode$Result kSensorManagerReturnNull;
    public static final WesterosErrorCode$Result kSensorManagerUnRegisterListenerFailed;
    public static final WesterosErrorCode$Result kUnknownError;
    public static final Map lookup;

    static {
       WesterosErrorCode$Level kOk = WesterosErrorCode$Level.kOk;
       WesterosErrorCode$Module kCommon = WesterosErrorCode$Module.kCommon;
       WesterosErrorCode$Result result = new WesterosErrorCode$Result("kOk", 0, WesterosErrorCode.genWesterosRetCode(kOk, kCommon, 0), "Ok");
       WesterosErrorCode$Result.kOk = result;
       WesterosErrorCode$Result result1 = new WesterosErrorCode$Result("kUnknownError", 1, WesterosErrorCode.genWesterosRetCode(kOk, kCommon, 1), "UnknownError");
       WesterosErrorCode$Result.kUnknownError = result1;
       WesterosErrorCode$Level kP1 = WesterosErrorCode$Level.kP1;
       WesterosErrorCode$Result result2 = new WesterosErrorCode$Result("kIllegalOperation", 2, WesterosErrorCode.genWesterosRetCode(kP1, kCommon, 2), "IllegalOperation");
       WesterosErrorCode$Result.kIllegalOperation = result2;
       WesterosErrorCode$Result result3 = new WesterosErrorCode$Result("kIllegalState", 3, WesterosErrorCode.genWesterosRetCode(kP1, kCommon, 3), "IllegalState");
       WesterosErrorCode$Result.kIllegalState = result3;
       WesterosErrorCode$Level kP2 = WesterosErrorCode$Level.kP2;
       WesterosErrorCode$Result result4 = new WesterosErrorCode$Result("kInvalidArgument", 4, WesterosErrorCode.genWesterosRetCode(kP2, kCommon, 4), "InvalidArgument");
       WesterosErrorCode$Result.kInvalidArgument = result4;
       WesterosErrorCode$Result result5 = new WesterosErrorCode$Result("kIOError", 5, WesterosErrorCode.genWesterosRetCode(kP2, kCommon, 5), "IOError");
       WesterosErrorCode$Result.kIOError = result5;
       WesterosErrorCode$Result result6 = new WesterosErrorCode$Result("kOOM", 6, WesterosErrorCode.genWesterosRetCode(kP1, kCommon, 6), "OOM");
       WesterosErrorCode$Result.kOOM = result6;
       WesterosErrorCode$Result result7 = new WesterosErrorCode$Result("kEOF", 7, WesterosErrorCode.genWesterosRetCode(kP2, kCommon, 7), "EOF");
       WesterosErrorCode$Result.kEOF = result7;
       WesterosErrorCode$Module kSensor = WesterosErrorCode$Module.kSensor;
       WesterosErrorCode$Result result8 = new WesterosErrorCode$Result("kSensorManagerReturnNull", 8, WesterosErrorCode.genWesterosRetCode(kP1, kSensor, 0), "SensorManagerReturnNull");
       WesterosErrorCode$Result.kSensorManagerReturnNull = result8;
       WesterosErrorCode$Result result9 = new WesterosErrorCode$Result("kSensorManagerNoRotationSensor", 9, WesterosErrorCode.genWesterosRetCode(kP2, kSensor, 1), "SensorManagerNoRotationSensor");
       WesterosErrorCode$Result.kSensorManagerNoRotationSensor = result9;
       WesterosErrorCode$Result result10 = result9;
       WesterosErrorCode$Result result11 = new WesterosErrorCode$Result("kSensorManagerNoGravitySensor", 10, WesterosErrorCode.genWesterosRetCode(kP2, kSensor, 2), "SensorManagerNoGravitySensor");
       WesterosErrorCode$Result.kSensorManagerNoGravitySensor = result11;
       WesterosErrorCode$Result result12 = result11;
       result9 = new WesterosErrorCode$Result("kSensorManagerRegisterListenerFailed", 11, WesterosErrorCode.genWesterosRetCode(kP2, kSensor, 3), "SensorManagerRegisterListenerFailed");
       WesterosErrorCode$Result.kSensorManagerRegisterListenerFailed = result9;
       WesterosErrorCode$Result result13 = result9;
       result11 = new WesterosErrorCode$Result("kSensorManagerUnRegisterListenerFailed", 12, WesterosErrorCode.genWesterosRetCode(kP2, kSensor, 4), "SensorManagerUnRegisterListenerFailed");
       WesterosErrorCode$Result.kSensorManagerUnRegisterListenerFailed = result11;
       int i = WesterosErrorCode.genWesterosRetCode(kP2, kSensor, 5);
       result9 = new WesterosErrorCode$Result("kSensorManagerEventNoSensor", 13, i, "SensorManagerEventNoSensor");
       WesterosErrorCode$Result.kSensorManagerEventNoSensor = result9;
       WesterosErrorCode$Result result14 = new WesterosErrorCode$Result("kNone", 14, -1, "None");
       WesterosErrorCode$Result.kNone = result14;
       WesterosErrorCode$Result[] resultArray = new WesterosErrorCode$Result[15];
       resultArray[0] = result;
       resultArray[1] = result1;
       resultArray[2] = result2;
       resultArray[3] = result3;
       resultArray[4] = result4;
       resultArray[5] = result5;
       resultArray[6] = result6;
       resultArray[7] = result7;
       resultArray[8] = result8;
       resultArray[9] = result10;
       resultArray[10] = result12;
       resultArray[11] = result13;
       resultArray[12] = result11;
       resultArray[13] = result9;
       resultArray[14] = result14;
       WesterosErrorCode$Result.$VALUES = resultArray;
       WesterosErrorCode$Result.lookup = new HashMap();
       Iterator iterator = EnumSet.allOf(WesterosErrorCode$Result.class).iterator();
       while (iterator.hasNext()) {
          result2 = iterator.next();
          WesterosErrorCode$Result.lookup.put(Integer.valueOf(result2.code), result2);
       }
    }
    public void WesterosErrorCode$Result(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.code = p2;
       this.name = p3;
    }
    public static WesterosErrorCode$Result fromCode(int p0){
       WesterosErrorCode$Result result = WesterosErrorCode$Result.class;
       if (PatchProxy.isSupport(result)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, result, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       WesterosErrorCode$Result result1 = WesterosErrorCode$Result.lookup.get(Integer.valueOf(p0));
       if (result1 == null) {
          result1 = WesterosErrorCode$Result.kNone;
       }
       return result1;
    }
    public static WesterosErrorCode$Result valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode$Result.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WesterosErrorCode$Result.class, p0);
    }
    public static WesterosErrorCode$Result[] values(){
       Object obj = PatchProxy.apply(null, null, WesterosErrorCode$Result.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WesterosErrorCode$Result.$VALUES.clone();
    }
    public int getCode(){
       return this.code;
    }
    public String getName(){
       return this.name;
    }
    public long toUnsignedInt32(){
       Object obj = PatchProxy.apply(null, this, WesterosErrorCode$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return ((long)this.code & 0xffffffff);
    }
}
