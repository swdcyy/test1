package com.kwai.middleware.azeroth.network.AzerothApiException;
import java.io.IOException;
import java.lang.Throwable;
import okhttp3.Request;
import java.lang.String;

public class AzerothApiException extends IOException	// class@000f0d
{
    public final String mExpiresTime;
    public final int mHttpCode;
    public final Request mRequest;
    public static final long serialVersionUID = 0xc1a50513fd007e9;

    public void AzerothApiException(Throwable p0,Request p1,int p2){
       super(p0, p1, p2, "");
    }
    public void AzerothApiException(Throwable p0,Request p1,int p2,String p3){
       super(p0);
       this.mRequest = p1;
       this.mHttpCode = p2;
       this.mExpiresTime = p3;
    }
}
