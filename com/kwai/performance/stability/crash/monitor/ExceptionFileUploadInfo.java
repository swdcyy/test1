package com.kwai.performance.stability.crash.monitor.ExceptionFileUploadInfo;
import java.io.Serializable;
import com.kwai.performance.stability.crash.monitor.ExceptionFileUploadInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class ExceptionFileUploadInfo implements Serializable	// class@001195
{
    public final String detailMessage;
    public final int error;
    public final String logUUID;
    public final int status;
    public final int type;
    public static final ExceptionFileUploadInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ExceptionFileUploadInfo.Companion = new ExceptionFileUploadInfo$a(null);
    }
    public void ExceptionFileUploadInfo(){
       super(null, 0, 0, null, 0, 31, null);
    }
    public void ExceptionFileUploadInfo(String p0,int p1,int p2,String p3,int p4){
       a.p(p0, "logUUID");
       a.p(p3, "detailMessage");
       super();
       this.logUUID = p0;
       this.status = p1;
       this.error = p2;
       this.detailMessage = p3;
       this.type = p4;
    }
    public void ExceptionFileUploadInfo(String p0,int p1,int p2,String p3,int p4,int p5,u p6){
       String str = "";
       String str1 = (p5 & 0x01)? str: p0;
       int i = 0;
       int i1 = (p5 & 0x02)? 0: p1;
       if (!(p5 & 0x04)) {
          i = p2;
       }
       if (!(p5 & 0x08)) {
          str = p3;
       }
       p5 = (p5 & 0x10)? 1: p4;
       super(str1, i1, i, str, p5);
       return;
    }
    public final String getDetailMessage(){
       return this.detailMessage;
    }
    public final int getError(){
       return this.error;
    }
    public final String getLogUUID(){
       return this.logUUID;
    }
    public final int getStatus(){
       return this.status;
    }
    public final int getType(){
       return this.type;
    }
}
