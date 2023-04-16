package com.kwai.sdk.eve.internal.common.models.EvePackageManagerException$DownloadException;
import com.kwai.sdk.eve.internal.common.models.EvePackageManagerException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class EvePackageManagerException$DownloadException extends EvePackageManagerException	// class@00147b
{
    public final int errCode;
    public final String errMsg;
    public final Throwable throwable;

    public void EvePackageManagerException$DownloadException(int p0,String p1,Throwable p2){
       a.p(p1, "errMsg");
       super(null);
       this.errCode = p0;
       this.errMsg = p1;
       this.throwable = p2;
    }
    public void EvePackageManagerException$DownloadException(int p0,String p1,Throwable p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public final int getErrCode(){
       return this.errCode;
    }
    public final String getErrMsg(){
       return this.errMsg;
    }
    public final Throwable getThrowable(){
       return this.throwable;
    }
}
