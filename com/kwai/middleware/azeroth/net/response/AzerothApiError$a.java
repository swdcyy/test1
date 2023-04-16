package com.kwai.middleware.azeroth.net.response.AzerothApiError$a;
import java.lang.Object;
import nsd.u;
import com.kwai.middleware.leia.response.LeiaApiError;
import com.kwai.middleware.azeroth.net.response.AzerothApiError;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.io.IOException;
import com.google.gson.JsonObject;

public final class AzerothApiError$a	// class@000f0b
{

    public void AzerothApiError$a(){
       super();
    }
    public void AzerothApiError$a(u p0){
       super();
    }
    public final AzerothApiError a(LeiaApiError p0){
       a.q(p0, "e");
       AzerothApiError uAzerothApiE = new AzerothApiError(p0.errorType, p0.httpCode, p0.httpMessage, p0.resultCode, p0.resultMessage, p0.responseBody, p0.getCause());
       return v0;
    }
}
