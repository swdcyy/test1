package com.yxcorp.gifshow.aicut.logic.AICutGeneratorException;
import java.lang.Throwable;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Enum;

public final class AICutGeneratorException extends Throwable	// class@001968
{
    public final AICutErrorCode mErrorCode;

    public void AICutGeneratorException(AICutErrorCode p0){
       a.p(p0, "mErrorCode");
       super(p0.name());
       this.mErrorCode = p0;
    }
    public final AICutErrorCode getMErrorCode(){
       return this.mErrorCode;
    }
}
