package com.kwai.logger.upload.model.UploadError$Error;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class UploadError$Error extends Enum	// class@000ee5
{
    public final int mErrCode;
    public final String mErrMsg;
    public static final UploadError$Error[] $VALUES;
    public static final UploadError$Error CHECK_BEGIN_FAILED;
    public static final UploadError$Error DUPLICATE_TASK;
    public static final UploadError$Error FREQUENCE_EXCEED;
    public static final UploadError$Error INVALID_PATH;
    public static final UploadError$Error LAST_TASK_IN_PROCESS;
    public static final UploadError$Error NOT_INIT;
    public static final UploadError$Error NOT_IN_MAIN_PROCESS;
    public static final UploadError$Error NO_NETWORK;
    public static final UploadError$Error OVER_SIZE;
    public static final UploadError$Error REQUEST_UPLOAD;
    public static final UploadError$Error RESPONSE_HTTP_ERROR;
    public static final UploadError$Error ZIP_FOLDER;

    static {
       UploadError$Error uError = new UploadError$Error("CHECK_BEGIN_FAILED", 0, -1, "Check begin failed");
       UploadError$Error.CHECK_BEGIN_FAILED = uError;
       UploadError$Error uError1 = new UploadError$Error("NOT_INIT", 1, -11, "Please init.");
       UploadError$Error.NOT_INIT = uError1;
       UploadError$Error uError2 = new UploadError$Error("ZIP_FOLDER", 2, -12, "error when zip_file");
       UploadError$Error.ZIP_FOLDER = uError2;
       UploadError$Error uError3 = new UploadError$Error("NO_NETWORK", 3, -13, "There is no valid network.");
       UploadError$Error.NO_NETWORK = uError3;
       UploadError$Error uError4 = new UploadError$Error("FREQUENCE_EXCEED", 4, -15, "upload task execute frequence exceed.");
       UploadError$Error.FREQUENCE_EXCEED = uError4;
       UploadError$Error uError5 = new UploadError$Error("REQUEST_UPLOAD", 5, -16, "process request fail.");
       UploadError$Error.REQUEST_UPLOAD = uError5;
       UploadError$Error uError6 = new UploadError$Error("RESPONSE_HTTP_ERROR", 6, -17, "sever response error http code");
       UploadError$Error.RESPONSE_HTTP_ERROR = uError6;
       UploadError$Error uError7 = new UploadError$Error("INVALID_PATH", 7, -27, "upload zip path invalid");
       UploadError$Error.INVALID_PATH = uError7;
       UploadError$Error uError8 = new UploadError$Error("OVER_SIZE", 8, -20, "upload file over size");
       UploadError$Error.OVER_SIZE = uError8;
       UploadError$Error uError9 = new UploadError$Error("NOT_IN_MAIN_PROCESS", 9, -28, "not in main process");
       UploadError$Error.NOT_IN_MAIN_PROCESS = uError9;
       UploadError$Error uError10 = new UploadError$Error("DUPLICATE_TASK", 10, -29, "duplicate task");
       UploadError$Error.DUPLICATE_TASK = uError10;
       UploadError$Error uError11 = new UploadError$Error("LAST_TASK_IN_PROCESS", 11, -30, "last task in process");
       UploadError$Error.LAST_TASK_IN_PROCESS = uError11;
       UploadError$Error[] uErrorArray = new UploadError$Error[12];
       uErrorArray[0] = uError;
       uErrorArray[1] = uError1;
       uErrorArray[2] = uError2;
       uErrorArray[3] = uError3;
       uErrorArray[4] = uError4;
       uErrorArray[5] = uError5;
       uErrorArray[6] = uError6;
       uErrorArray[7] = uError7;
       uErrorArray[8] = uError8;
       uErrorArray[9] = uError9;
       uErrorArray[10] = uError10;
       uErrorArray[11] = uError11;
       UploadError$Error.$VALUES = uErrorArray;
    }
    public void UploadError$Error(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mErrCode = p2;
       this.mErrMsg = p3;
    }
    public static UploadError$Error valueOf(String p0){
       return Enum.valueOf(UploadError$Error.class, p0);
    }
    public static UploadError$Error[] values(){
       return UploadError$Error.$VALUES.clone();
    }
    public int getErrCode(){
       return this.mErrCode;
    }
    public String getErrMsg(){
       return this.mErrMsg;
    }
}
