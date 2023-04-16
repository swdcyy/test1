package com.kwai.middleware.azeroth.network.AzerothResponseException;
import java.io.IOException;
import x97.p;
import java.lang.StringBuilder;
import java.lang.String;

public class AzerothResponseException extends IOException	// class@000f0e
{
    public final int mErrorCode;
    public final String mErrorMessage;
    public final p mResponse;
    public static final long serialVersionUID = 0x204c3a5291a91759;

    public void AzerothResponseException(p p0){
       super("errorCode: "+p0.a()+" , errorMessage:"+p0.b());
       this.mResponse = p0;
       this.mErrorCode = p0.a();
       this.mErrorMessage = p0.b();
    }
}
