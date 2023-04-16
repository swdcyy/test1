package okhttp3.internal.http2.ErrorCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ErrorCode extends Enum	// class@001f97
{
    public final int httpCode;
    public static final ErrorCode[] $VALUES;
    public static final ErrorCode CANCEL;
    public static final ErrorCode COMPRESSION_ERROR;
    public static final ErrorCode CONNECT_ERROR;
    public static final ErrorCode ENHANCE_YOUR_CALM;
    public static final ErrorCode FLOW_CONTROL_ERROR;
    public static final ErrorCode HTTP_1_1_REQUIRED;
    public static final ErrorCode INADEQUATE_SECURITY;
    public static final ErrorCode INTERNAL_ERROR;
    public static final ErrorCode NO_ERROR;
    public static final ErrorCode PROTOCOL_ERROR;
    public static final ErrorCode REFUSED_STREAM;

    static {
       ErrorCode uErrorCode = new ErrorCode("NO_ERROR", 0, 0);
       ErrorCode.NO_ERROR = uErrorCode;
       ErrorCode uErrorCode1 = new ErrorCode("PROTOCOL_ERROR", 1, 1);
       ErrorCode.PROTOCOL_ERROR = uErrorCode1;
       ErrorCode uErrorCode2 = new ErrorCode("INTERNAL_ERROR", 2, 2);
       ErrorCode.INTERNAL_ERROR = uErrorCode2;
       ErrorCode uErrorCode3 = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
       ErrorCode.FLOW_CONTROL_ERROR = uErrorCode3;
       ErrorCode uErrorCode4 = new ErrorCode("REFUSED_STREAM", 4, 7);
       ErrorCode.REFUSED_STREAM = uErrorCode4;
       ErrorCode uErrorCode5 = new ErrorCode("CANCEL", 5, 8);
       ErrorCode.CANCEL = uErrorCode5;
       ErrorCode uErrorCode6 = new ErrorCode("COMPRESSION_ERROR", 6, 9);
       ErrorCode.COMPRESSION_ERROR = uErrorCode6;
       ErrorCode uErrorCode7 = new ErrorCode("CONNECT_ERROR", 7, 10);
       ErrorCode.CONNECT_ERROR = uErrorCode7;
       ErrorCode uErrorCode8 = new ErrorCode("ENHANCE_YOUR_CALM", 8, 11);
       ErrorCode.ENHANCE_YOUR_CALM = uErrorCode8;
       ErrorCode uErrorCode9 = new ErrorCode("INADEQUATE_SECURITY", 9, 12);
       ErrorCode.INADEQUATE_SECURITY = uErrorCode9;
       ErrorCode uErrorCode10 = new ErrorCode("HTTP_1_1_REQUIRED", 10, 13);
       ErrorCode.HTTP_1_1_REQUIRED = uErrorCode10;
       ErrorCode[] uErrorCodeAr = new ErrorCode[11];
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
       ErrorCode.$VALUES = uErrorCodeAr;
    }
    public void ErrorCode(String p0,int p1,int p2){
       super(p0, p1);
       this.httpCode = p2;
    }
    public static ErrorCode fromHttp2(int p0){
       object oobject;
       ErrorCode[] uErrorCodeAr = ErrorCode.values();
       int len = uErrorCodeAr.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = uErrorCodeAr[i];
          if (oobject.httpCode == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static ErrorCode valueOf(String p0){
       return Enum.valueOf(ErrorCode.class, p0);
    }
    public static ErrorCode[] values(){
       return ErrorCode.$VALUES.clone();
    }
}
