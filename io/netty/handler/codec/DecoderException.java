package io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.CodecException;
import java.lang.String;
import java.lang.Throwable;

public class DecoderException extends CodecException	// class@0010d6
{
    public static final long serialVersionUID = 0x6020a4446d9df1dc;

    public void DecoderException(){
       super();
    }
    public void DecoderException(String p0){
       super(p0);
    }
    public void DecoderException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void DecoderException(Throwable p0){
       super(p0);
    }
}
