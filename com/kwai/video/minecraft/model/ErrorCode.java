package com.kwai.video.minecraft.model.ErrorCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ErrorCode extends Enum	// class@0009fb
{
    public static final ErrorCode[] $VALUES;
    public static final ErrorCode CannotComputeAvailableRange;
    public static final ErrorCode CannotComputeBounds;
    public static final ErrorCode CannotTrimTransition;
    public static final ErrorCode ChildAlreadyParented;
    public static final ErrorCode DuplicateObjectReference;
    public static final ErrorCode FileOpenFailed;
    public static final ErrorCode FileWriteFailed;
    public static final ErrorCode IllegalIndex;
    public static final ErrorCode InternalError;
    public static final ErrorCode InvalidObject;
    public static final ErrorCode InvalidTimeRange;
    public static final ErrorCode JsonParseError;
    public static final ErrorCode KeyNotFound;
    public static final ErrorCode MalformatSchema;
    public static final ErrorCode NotAChild;
    public static final ErrorCode NotAChildOf;
    public static final ErrorCode NotAnItem;
    public static final ErrorCode NotDescendedFrom;
    public static final ErrorCode NotImplemented;
    public static final ErrorCode ObjectCycle;
    public static final ErrorCode ObjectWithoutDuration;
    public static final ErrorCode Ok;
    public static final ErrorCode SchemaAlreadyRegistered;
    public static final ErrorCode SchemaNotRegistered;
    public static final ErrorCode SchemaVersionUnsupported;
    public static final ErrorCode TypeMisMatch;
    public static final ErrorCode UnknownError;
    public static final ErrorCode UnresolvedObjectReference;

    static {
       ErrorCode uErrorCode = new ErrorCode("Ok", 0);
       ErrorCode.Ok = uErrorCode;
       ErrorCode uErrorCode1 = new ErrorCode("NotImplemented", 1);
       ErrorCode.NotImplemented = uErrorCode1;
       ErrorCode uErrorCode2 = new ErrorCode("UnresolvedObjectReference", 2);
       ErrorCode.UnresolvedObjectReference = uErrorCode2;
       ErrorCode uErrorCode3 = new ErrorCode("DuplicateObjectReference", 3);
       ErrorCode.DuplicateObjectReference = uErrorCode3;
       ErrorCode uErrorCode4 = new ErrorCode("MalformatSchema", 4);
       ErrorCode.MalformatSchema = uErrorCode4;
       ErrorCode uErrorCode5 = new ErrorCode("JsonParseError", 5);
       ErrorCode.JsonParseError = uErrorCode5;
       ErrorCode uErrorCode6 = new ErrorCode("ChildAlreadyParented", 6);
       ErrorCode.ChildAlreadyParented = uErrorCode6;
       ErrorCode uErrorCode7 = new ErrorCode("FileOpenFailed", 7);
       ErrorCode.FileOpenFailed = uErrorCode7;
       ErrorCode uErrorCode8 = new ErrorCode("FileWriteFailed", 8);
       ErrorCode.FileWriteFailed = uErrorCode8;
       ErrorCode uErrorCode9 = new ErrorCode("SchemaAlreadyRegistered", 9);
       ErrorCode.SchemaAlreadyRegistered = uErrorCode9;
       ErrorCode uErrorCode10 = new ErrorCode("SchemaNotRegistered", 10);
       ErrorCode.SchemaNotRegistered = uErrorCode10;
       ErrorCode uErrorCode11 = new ErrorCode("SchemaVersionUnsupported", 11);
       ErrorCode.SchemaVersionUnsupported = uErrorCode11;
       ErrorCode uErrorCode12 = new ErrorCode("KeyNotFound", 12);
       ErrorCode.KeyNotFound = uErrorCode12;
       ErrorCode uErrorCode13 = new ErrorCode("IllegalIndex", 13);
       ErrorCode.IllegalIndex = uErrorCode13;
       ErrorCode uErrorCode14 = uErrorCode13;
       ErrorCode uErrorCode15 = new ErrorCode("TypeMisMatch", 14);
       ErrorCode.TypeMisMatch = uErrorCode15;
       ErrorCode uErrorCode16 = uErrorCode15;
       ErrorCode uErrorCode17 = new ErrorCode("InternalError", 15);
       ErrorCode.InternalError = uErrorCode17;
       ErrorCode uErrorCode18 = uErrorCode17;
       uErrorCode13 = new ErrorCode("NotAnItem", 16);
       ErrorCode.NotAnItem = uErrorCode13;
       ErrorCode uErrorCode19 = uErrorCode13;
       uErrorCode15 = new ErrorCode("NotAChildOf", 17);
       ErrorCode.NotAChildOf = uErrorCode15;
       ErrorCode uErrorCode20 = uErrorCode15;
       uErrorCode17 = new ErrorCode("NotAChild", 18);
       ErrorCode.NotAChild = uErrorCode17;
       ErrorCode uErrorCode21 = uErrorCode17;
       uErrorCode13 = new ErrorCode("NotDescendedFrom", 19);
       ErrorCode.NotDescendedFrom = uErrorCode13;
       ErrorCode uErrorCode22 = uErrorCode13;
       uErrorCode15 = new ErrorCode("CannotComputeAvailableRange", 20);
       ErrorCode.CannotComputeAvailableRange = uErrorCode15;
       ErrorCode uErrorCode23 = uErrorCode15;
       uErrorCode17 = new ErrorCode("InvalidTimeRange", 21);
       ErrorCode.InvalidTimeRange = uErrorCode17;
       ErrorCode uErrorCode24 = uErrorCode17;
       uErrorCode13 = new ErrorCode("ObjectWithoutDuration", 22);
       ErrorCode.ObjectWithoutDuration = uErrorCode13;
       ErrorCode uErrorCode25 = uErrorCode13;
       uErrorCode17 = new ErrorCode("CannotTrimTransition", 23);
       ErrorCode.CannotTrimTransition = uErrorCode17;
       ErrorCode uErrorCode26 = uErrorCode17;
       uErrorCode15 = new ErrorCode("ObjectCycle", 24);
       ErrorCode.ObjectCycle = uErrorCode15;
       ErrorCode uErrorCode27 = uErrorCode15;
       uErrorCode17 = new ErrorCode("CannotComputeBounds", 25);
       ErrorCode.CannotComputeBounds = uErrorCode17;
       ErrorCode uErrorCode28 = uErrorCode17;
       uErrorCode15 = new ErrorCode("InvalidObject", 26);
       ErrorCode.InvalidObject = uErrorCode15;
       ErrorCode uErrorCode29 = uErrorCode15;
       uErrorCode17 = new ErrorCode("UnknownError", 27);
       ErrorCode.UnknownError = uErrorCode17;
       ErrorCode[] uErrorCodeAr = new ErrorCode[28];
       uErrorCodeAr[0] = uErrorCode;
       uErrorCodeAr[1] = uErrorCode1;
       uErrorCodeAr[2] = uErrorCode2;
       uErrorCodeAr[3] = uErrorCode3;
       uErrorCodeAr[4] = uErrorCode4;
       uErrorCodeAr[5] = uErrorCode5;
       uErrorCodeAr[6] = uErrorCode6;
       uErrorCodeAr[7] = uErrorCode7;
       uErrorCodeAr[8] = uErrorCode8;
       uErrorCodeAr[9] = uErrorCode9;
       uErrorCodeAr[10] = uErrorCode10;
       uErrorCodeAr[11] = uErrorCode11;
       uErrorCodeAr[12] = uErrorCode12;
       uErrorCodeAr[13] = uErrorCode14;
       uErrorCodeAr[14] = uErrorCode16;
       uErrorCodeAr[15] = uErrorCode18;
       uErrorCodeAr[16] = uErrorCode19;
       uErrorCodeAr[17] = uErrorCode20;
       uErrorCodeAr[18] = uErrorCode21;
       uErrorCodeAr[19] = uErrorCode22;
       uErrorCodeAr[20] = uErrorCode23;
       uErrorCodeAr[21] = uErrorCode24;
       uErrorCodeAr[22] = uErrorCode25;
       uErrorCodeAr[23] = uErrorCode26;
       uErrorCodeAr[24] = uErrorCode27;
       uErrorCodeAr[25] = uErrorCode28;
       uErrorCodeAr[26] = uErrorCode29;
       uErrorCodeAr[27] = uErrorCode17;
       ErrorCode.$VALUES = uErrorCodeAr;
    }
    public void ErrorCode(String p0,int p1){
       super(p0, p1);
    }
    public static ErrorCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ErrorCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ErrorCode.class, p0);
    }
    public static ErrorCode[] values(){
       Object obj = PatchProxy.apply(null, null, ErrorCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ErrorCode.$VALUES.clone();
    }
}
