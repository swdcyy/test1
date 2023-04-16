package com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KSException extends RuntimeException	// class@0013a3
{
    public final int mError;
    public int mReturnedErrorCode;

    public void KSException(int p0,String p1){
       super(p1);
       this.mReturnedErrorCode = Integer.MIN_VALUE;
       this.mError = p0;
    }
    public void KSException(int p0,String p1,Throwable p2){
       super(p1, p2);
       this.mReturnedErrorCode = Integer.MIN_VALUE;
       this.mError = p0;
    }
    public String getUserTip(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, KSException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (-8 == this.mError) {
          objArray = this.getMessage();
       }
       return objArray;
    }
    public void setReturnedErrorCode(int p0){
       this.mReturnedErrorCode = p0;
    }
}
