package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$ERRORCODE extends Enum	// class@00096c
{
    public int value;
    public static final KSUploaderKitCommon$ERRORCODE[] $VALUES;
    public static final KSUploaderKitCommon$ERRORCODE APPLY_CONNECT_SERVER_FAILED;
    public static final KSUploaderKitCommon$ERRORCODE APPLY_NOT2XX_HTTP_CODE;
    public static final KSUploaderKitCommon$ERRORCODE APPLY_PARSER_SERVERINFO_FAILED;
    public static final KSUploaderKitCommon$ERRORCODE EMPTY_FILE;
    public static final KSUploaderKitCommon$ERRORCODE END_POINTS_AGENT_RETURN_VOID_RESULT;
    public static final KSUploaderKitCommon$ERRORCODE EXTERNAL_HTTP_UPLOAD_FAILED;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_CLIENT_NETWORK_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_COMPLETE_3XX_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_COMPLETE_4XX_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_COMPLETE_5XX_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_COMPLETE_SERVER_INTERNAL_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_COMPLETE_UNEXPECTED_Error;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_INVALID_FILE;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_UPLOAD_3XX_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_UPLOAD_4XX_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_UPLOAD_5XX_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_UPLOAD_SERVER_INTERNAL_ERROR;
    public static final KSUploaderKitCommon$ERRORCODE HTTP_UPLOAD_UNEXPECTED_Error;
    public static final KSUploaderKitCommon$ERRORCODE ILLEGAL_CONFIG;
    public static final KSUploaderKitCommon$ERRORCODE MISSING_LEGAL_API_SERVICE_TYPE;
    public static final KSUploaderKitCommon$ERRORCODE NO_AVAILABLE_NETWORK;
    public static final KSUploaderKitCommon$ERRORCODE PUBLISH_CONNECT_SERVER_FAILED;
    public static final KSUploaderKitCommon$ERRORCODE PUBLISH_NOT2XX_HTTP_CODE;
    public static final KSUploaderKitCommon$ERRORCODE PUBLISH_PHOTO_FAILED;
    public static final KSUploaderKitCommon$ERRORCODE UNKNOWN_ERROR;

    static {
       KSUploaderKitCommon$ERRORCODE uERRORCODE = new KSUploaderKitCommon$ERRORCODE("UNKNOWN_ERROR", 0, 0x186a0);
       KSUploaderKitCommon$ERRORCODE.UNKNOWN_ERROR = uERRORCODE;
       KSUploaderKitCommon$ERRORCODE uERRORCODE1 = new KSUploaderKitCommon$ERRORCODE("APPLY_CONNECT_SERVER_FAILED", 1, 0x186a1);
       KSUploaderKitCommon$ERRORCODE.APPLY_CONNECT_SERVER_FAILED = uERRORCODE1;
       KSUploaderKitCommon$ERRORCODE uERRORCODE2 = new KSUploaderKitCommon$ERRORCODE("APPLY_NOT2XX_HTTP_CODE", 2, 0x186a2);
       KSUploaderKitCommon$ERRORCODE.APPLY_NOT2XX_HTTP_CODE = uERRORCODE2;
       KSUploaderKitCommon$ERRORCODE uERRORCODE3 = new KSUploaderKitCommon$ERRORCODE("APPLY_PARSER_SERVERINFO_FAILED", 3, 0x186a3);
       KSUploaderKitCommon$ERRORCODE.APPLY_PARSER_SERVERINFO_FAILED = uERRORCODE3;
       KSUploaderKitCommon$ERRORCODE uERRORCODE4 = new KSUploaderKitCommon$ERRORCODE("PUBLISH_CONNECT_SERVER_FAILED", 4, 0x186a4);
       KSUploaderKitCommon$ERRORCODE.PUBLISH_CONNECT_SERVER_FAILED = uERRORCODE4;
       KSUploaderKitCommon$ERRORCODE uERRORCODE5 = new KSUploaderKitCommon$ERRORCODE("PUBLISH_NOT2XX_HTTP_CODE", 5, 0x186a5);
       KSUploaderKitCommon$ERRORCODE.PUBLISH_NOT2XX_HTTP_CODE = uERRORCODE5;
       KSUploaderKitCommon$ERRORCODE uERRORCODE6 = new KSUploaderKitCommon$ERRORCODE("PUBLISH_PHOTO_FAILED", 6, 0x186a6);
       KSUploaderKitCommon$ERRORCODE.PUBLISH_PHOTO_FAILED = uERRORCODE6;
       KSUploaderKitCommon$ERRORCODE uERRORCODE7 = new KSUploaderKitCommon$ERRORCODE("HTTP_INVALID_FILE", 7, 0x186aa);
       KSUploaderKitCommon$ERRORCODE.HTTP_INVALID_FILE = uERRORCODE7;
       KSUploaderKitCommon$ERRORCODE uERRORCODE8 = new KSUploaderKitCommon$ERRORCODE("HTTP_UPLOAD_SERVER_INTERNAL_ERROR", 8, 0x186ab);
       KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_SERVER_INTERNAL_ERROR = uERRORCODE8;
       KSUploaderKitCommon$ERRORCODE uERRORCODE9 = new KSUploaderKitCommon$ERRORCODE("HTTP_COMPLETE_SERVER_INTERNAL_ERROR", 9, 0x186ac);
       KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_SERVER_INTERNAL_ERROR = uERRORCODE9;
       KSUploaderKitCommon$ERRORCODE uERRORCODE10 = new KSUploaderKitCommon$ERRORCODE("HTTP_CLIENT_NETWORK_ERROR", 10, 0x186ad);
       KSUploaderKitCommon$ERRORCODE.HTTP_CLIENT_NETWORK_ERROR = uERRORCODE10;
       KSUploaderKitCommon$ERRORCODE uERRORCODE11 = new KSUploaderKitCommon$ERRORCODE("ILLEGAL_CONFIG", 11, 0x186ae);
       KSUploaderKitCommon$ERRORCODE.ILLEGAL_CONFIG = uERRORCODE11;
       KSUploaderKitCommon$ERRORCODE uERRORCODE12 = new KSUploaderKitCommon$ERRORCODE("END_POINTS_AGENT_RETURN_VOID_RESULT", 12, 0x186af);
       KSUploaderKitCommon$ERRORCODE.END_POINTS_AGENT_RETURN_VOID_RESULT = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE uERRORCODE13 = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE uERRORCODE14 = new KSUploaderKitCommon$ERRORCODE("NO_AVAILABLE_NETWORK", 13, 0x186b0);
       KSUploaderKitCommon$ERRORCODE.NO_AVAILABLE_NETWORK = uERRORCODE14;
       KSUploaderKitCommon$ERRORCODE uERRORCODE15 = uERRORCODE14;
       uERRORCODE12 = new KSUploaderKitCommon$ERRORCODE("MISSING_LEGAL_API_SERVICE_TYPE", 14, 0x186b1);
       KSUploaderKitCommon$ERRORCODE.MISSING_LEGAL_API_SERVICE_TYPE = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE uERRORCODE16 = uERRORCODE12;
       uERRORCODE14 = new KSUploaderKitCommon$ERRORCODE("EMPTY_FILE", 15, 0x186b2);
       KSUploaderKitCommon$ERRORCODE.EMPTY_FILE = uERRORCODE14;
       KSUploaderKitCommon$ERRORCODE uERRORCODE17 = uERRORCODE14;
       uERRORCODE12 = new KSUploaderKitCommon$ERRORCODE("HTTP_UPLOAD_3XX_ERROR", 16, 0x186b3);
       KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_3XX_ERROR = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE uERRORCODE18 = uERRORCODE12;
       uERRORCODE14 = new KSUploaderKitCommon$ERRORCODE("HTTP_UPLOAD_4XX_ERROR", 17, 0x186b4);
       KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_4XX_ERROR = uERRORCODE14;
       KSUploaderKitCommon$ERRORCODE uERRORCODE19 = uERRORCODE14;
       uERRORCODE12 = new KSUploaderKitCommon$ERRORCODE("HTTP_UPLOAD_5XX_ERROR", 18, 0x186b5);
       KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_5XX_ERROR = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE uERRORCODE20 = uERRORCODE12;
       uERRORCODE14 = new KSUploaderKitCommon$ERRORCODE("HTTP_UPLOAD_UNEXPECTED_Error", 19, 0x186b6);
       KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_UNEXPECTED_Error = uERRORCODE14;
       KSUploaderKitCommon$ERRORCODE uERRORCODE21 = uERRORCODE14;
       uERRORCODE12 = new KSUploaderKitCommon$ERRORCODE("HTTP_COMPLETE_3XX_ERROR", 20, 0x186b7);
       KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_3XX_ERROR = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE uERRORCODE22 = uERRORCODE12;
       uERRORCODE14 = new KSUploaderKitCommon$ERRORCODE("HTTP_COMPLETE_4XX_ERROR", 21, 0x186b8);
       KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_4XX_ERROR = uERRORCODE14;
       KSUploaderKitCommon$ERRORCODE uERRORCODE23 = uERRORCODE14;
       uERRORCODE12 = new KSUploaderKitCommon$ERRORCODE("HTTP_COMPLETE_5XX_ERROR", 22, 0x186b9);
       KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_5XX_ERROR = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE uERRORCODE24 = uERRORCODE12;
       uERRORCODE14 = new KSUploaderKitCommon$ERRORCODE("HTTP_COMPLETE_UNEXPECTED_Error", 23, 0x186ba);
       KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_UNEXPECTED_Error = uERRORCODE14;
       KSUploaderKitCommon$ERRORCODE uERRORCODE25 = uERRORCODE14;
       uERRORCODE12 = new KSUploaderKitCommon$ERRORCODE("EXTERNAL_HTTP_UPLOAD_FAILED", 24, 0x186bb);
       KSUploaderKitCommon$ERRORCODE.EXTERNAL_HTTP_UPLOAD_FAILED = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE[] uERRORCODEAr = new KSUploaderKitCommon$ERRORCODE[25];
       uERRORCODEAr[0] = uERRORCODE;
       uERRORCODEAr[1] = uERRORCODE1;
       uERRORCODEAr[2] = uERRORCODE2;
       uERRORCODEAr[3] = uERRORCODE3;
       uERRORCODEAr[4] = uERRORCODE4;
       uERRORCODEAr[5] = uERRORCODE5;
       uERRORCODEAr[6] = uERRORCODE6;
       uERRORCODEAr[7] = uERRORCODE7;
       uERRORCODEAr[8] = uERRORCODE8;
       uERRORCODEAr[9] = uERRORCODE9;
       uERRORCODEAr[10] = uERRORCODE10;
       uERRORCODEAr[11] = uERRORCODE11;
       uERRORCODEAr[12] = uERRORCODE13;
       uERRORCODEAr[13] = uERRORCODE15;
       uERRORCODEAr[14] = uERRORCODE16;
       uERRORCODEAr[15] = uERRORCODE17;
       uERRORCODEAr[16] = uERRORCODE18;
       uERRORCODEAr[17] = uERRORCODE19;
       uERRORCODEAr[18] = uERRORCODE20;
       uERRORCODEAr[19] = uERRORCODE21;
       uERRORCODEAr[20] = uERRORCODE22;
       uERRORCODEAr[21] = uERRORCODE23;
       uERRORCODEAr[22] = uERRORCODE24;
       uERRORCODEAr[23] = uERRORCODE25;
       uERRORCODEAr[24] = uERRORCODE12;
       KSUploaderKitCommon$ERRORCODE.$VALUES = uERRORCODEAr;
    }
    public void KSUploaderKitCommon$ERRORCODE(String p0,int p1,int p2){
       super(p0, p1);
       this.value = 0;
       this.value = p2;
    }
    public static KSUploaderKitCommon$ERRORCODE valueOf(int p0){
       switch (p0){
           case 0x186a0:
             return KSUploaderKitCommon$ERRORCODE.UNKNOWN_ERROR;
           case 0x186a1:
             return KSUploaderKitCommon$ERRORCODE.APPLY_CONNECT_SERVER_FAILED;
           case 0x186a2:
             return KSUploaderKitCommon$ERRORCODE.APPLY_NOT2XX_HTTP_CODE;
           case 0x186a3:
             return KSUploaderKitCommon$ERRORCODE.APPLY_PARSER_SERVERINFO_FAILED;
           case 0x186a4:
             return KSUploaderKitCommon$ERRORCODE.PUBLISH_CONNECT_SERVER_FAILED;
           case 0x186a5:
             return KSUploaderKitCommon$ERRORCODE.PUBLISH_NOT2XX_HTTP_CODE;
           case 0x186a6:
             return KSUploaderKitCommon$ERRORCODE.PUBLISH_PHOTO_FAILED;
           case 0x186aa:
             return KSUploaderKitCommon$ERRORCODE.HTTP_INVALID_FILE;
           case 0x186ab:
             return KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_SERVER_INTERNAL_ERROR;
           case 0x186ac:
             return KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_SERVER_INTERNAL_ERROR;
           case 0x186ad:
             return KSUploaderKitCommon$ERRORCODE.HTTP_CLIENT_NETWORK_ERROR;
           case 0x186ae:
             return KSUploaderKitCommon$ERRORCODE.ILLEGAL_CONFIG;
           case 0x186af:
             return KSUploaderKitCommon$ERRORCODE.END_POINTS_AGENT_RETURN_VOID_RESULT;
           case 0x186b0:
             return KSUploaderKitCommon$ERRORCODE.NO_AVAILABLE_NETWORK;
           case 0x186b1:
             return KSUploaderKitCommon$ERRORCODE.MISSING_LEGAL_API_SERVICE_TYPE;
           case 0x186b2:
             return KSUploaderKitCommon$ERRORCODE.EMPTY_FILE;
           case 0x186b3:
             return KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_3XX_ERROR;
           case 0x186b4:
             return KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_4XX_ERROR;
           case 0x186b5:
             return KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_5XX_ERROR;
           case 0x186b6:
             return KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_UNEXPECTED_Error;
           case 0x186b7:
             return KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_3XX_ERROR;
           case 0x186b8:
             return KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_4XX_ERROR;
           case 0x186b9:
             return KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_5XX_ERROR;
           case 0x186ba:
             return KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_UNEXPECTED_Error;
           case 0x186bb:
             return KSUploaderKitCommon$ERRORCODE.EXTERNAL_HTTP_UPLOAD_FAILED;
           default:
          label_0003 :
             return KSUploaderKitCommon$ERRORCODE.UNKNOWN_ERROR;
       }
    }
    public static KSUploaderKitCommon$ERRORCODE valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$ERRORCODE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$ERRORCODE.class, p0);
    }
    public static KSUploaderKitCommon$ERRORCODE[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$ERRORCODE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$ERRORCODE.$VALUES.clone();
    }
    public int value(){
       return this.value;
    }
}
