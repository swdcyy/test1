package io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.DecoderException;
import java.lang.String;
import java.lang.Throwable;

public class CorruptedFrameException extends DecoderException	// class@0010d5
{
    public static final long serialVersionUID = 0x365fb7bf292bb7f8;

    public void CorruptedFrameException(){
       super();
    }
    public void CorruptedFrameException(String p0){
       super(p0);
    }
    public void CorruptedFrameException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void CorruptedFrameException(Throwable p0){
       super(p0);
    }
}
