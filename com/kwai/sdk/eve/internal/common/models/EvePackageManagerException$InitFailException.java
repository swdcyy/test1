package com.kwai.sdk.eve.internal.common.models.EvePackageManagerException$InitFailException;
import com.kwai.sdk.eve.internal.common.models.EvePackageManagerException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class EvePackageManagerException$InitFailException extends EvePackageManagerException	// class@00147c
{
    public final String errMsg;
    public final Throwable throwable;

    public void EvePackageManagerException$InitFailException(String p0,Throwable p1){
       a.p(p0, "errMsg");
       super(null);
       this.errMsg = p0;
       this.throwable = p1;
    }
    public void EvePackageManagerException$InitFailException(String p0,Throwable p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final String getErrMsg(){
       return this.errMsg;
    }
    public final Throwable getThrowable(){
       return this.throwable;
    }
}
