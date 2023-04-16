package io.netty.channel.ChannelException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class ChannelException extends RuntimeException	// class@001074
{
    public static final long serialVersionUID = 0x285d7cf2a6a69bbc;

    public void ChannelException(){
       super();
    }
    public void ChannelException(String p0){
       super(p0);
    }
    public void ChannelException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void ChannelException(Throwable p0){
       super(p0);
    }
}
