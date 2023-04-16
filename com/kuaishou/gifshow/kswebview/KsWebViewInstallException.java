package com.kuaishou.gifshow.kswebview.KsWebViewInstallException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KsWebViewInstallException extends Exception	// class@0019e2
{
    public final int resultCode;

    public void KsWebViewInstallException(int p0,String p1){
       a.p(p1, "errorMsg");
       super(p1);
       this.resultCode = p0;
    }
    public final int getResultCode(){
       return this.resultCode;
    }
}
