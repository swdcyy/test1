package com.kwai.video.westeros.models.ServerProcessingInfo$Builder;
import com.kwai.video.westeros.models.ServerProcessingInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.ServerProcessingInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.ServerProcessingInfo$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class ServerProcessingInfo$Builder extends GeneratedMessageLite$Builder implements ServerProcessingInfoOrBuilder	// class@00103e
{

    public void ServerProcessingInfo$Builder(){
       super(ServerProcessingInfo.DEFAULT_INSTANCE);
    }
    public void ServerProcessingInfo$Builder(ServerProcessingInfo$1 p0){
       super();
    }
    public ServerProcessingInfo$Builder clearDisableCache(){
       this.copyOnWrite();
       this.instance.clearDisableCache();
       return this;
    }
    public ServerProcessingInfo$Builder clearReturnMediaType(){
       this.copyOnWrite();
       this.instance.clearReturnMediaType();
       return this;
    }
    public ServerProcessingInfo$Builder clearServiceType(){
       this.copyOnWrite();
       this.instance.clearServiceType();
       return this;
    }
    public boolean getDisableCache(){
       return this.instance.getDisableCache();
    }
    public String getReturnMediaType(){
       return this.instance.getReturnMediaType();
    }
    public ByteString getReturnMediaTypeBytes(){
       return this.instance.getReturnMediaTypeBytes();
    }
    public String getServiceType(){
       return this.instance.getServiceType();
    }
    public ByteString getServiceTypeBytes(){
       return this.instance.getServiceTypeBytes();
    }
    public ServerProcessingInfo$Builder setDisableCache(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableCache(p0);
       return this;
    }
    public ServerProcessingInfo$Builder setReturnMediaType(String p0){
       this.copyOnWrite();
       this.instance.setReturnMediaType(p0);
       return this;
    }
    public ServerProcessingInfo$Builder setReturnMediaTypeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setReturnMediaTypeBytes(p0);
       return this;
    }
    public ServerProcessingInfo$Builder setServiceType(String p0){
       this.copyOnWrite();
       this.instance.setServiceType(p0);
       return this;
    }
    public ServerProcessingInfo$Builder setServiceTypeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setServiceTypeBytes(p0);
       return this;
    }
}
