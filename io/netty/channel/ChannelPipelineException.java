package io.netty.channel.ChannelPipelineException;
import io.netty.channel.ChannelException;
import java.lang.String;
import java.lang.Throwable;

public class ChannelPipelineException extends ChannelException	// class@001076
{
    public static final long serialVersionUID = 0x2ee53d0a6e3d079c;

    public void ChannelPipelineException(){
       super();
    }
    public void ChannelPipelineException(String p0){
       super(p0);
    }
    public void ChannelPipelineException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void ChannelPipelineException(Throwable p0){
       super(p0);
    }
}
