package com.kwai.emotionsdk.core.exception.EmotionDataException;
import com.kwai.emotionsdk.core.exception.BaseException;
import java.lang.String;
import java.lang.Throwable;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.emotionsdk.core.exception.EmptyException;

public final class EmotionDataException extends BaseException	// class@000d96
{

    public void EmotionDataException(){
       super(null, null, 3, null);
    }
    public void EmotionDataException(String p0){
       super(p0, null, 2, null);
    }
    public void EmotionDataException(String p0,Throwable p1){
       a.p(p0, "message");
       a.p(p1, "cause");
       super(p0, p1);
    }
    public void EmotionDataException(String p0,Throwable p1,int p2,u p3){
       EmptyException uEmptyExcept;
       if (p2 & 0x01) {
          p0 = "EmotionDataException";
       }
       if (p2 & 0x02) {
          uEmptyExcept = new EmptyException();
       }
       super(p0, uEmptyExcept);
       return;
    }
}
