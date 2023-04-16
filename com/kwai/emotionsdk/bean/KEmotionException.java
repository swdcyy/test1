package com.kwai.emotionsdk.bean.KEmotionException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KEmotionException extends Exception	// class@000d83
{
    public final int mErrorCode;
    public final String mErrorMessage;

    public void KEmotionException(int p0,String p1){
       super();
       this.mErrorCode = p0;
       this.mErrorMessage = p1;
    }
    public void KEmotionException(String p0){
       super(-1, p0);
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getMessage(){
       return this.mErrorMessage;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KEmotionException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KEmotionException{errorCode="+this.mErrorCode+", errorMessage="+this.mErrorMessage+"}";
    }
}
