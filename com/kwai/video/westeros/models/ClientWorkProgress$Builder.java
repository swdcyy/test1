package com.kwai.video.westeros.models.ClientWorkProgress$Builder;
import com.kwai.video.westeros.models.ClientWorkProgressOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.ClientWorkProgress;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.ClientWorkProgress$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class ClientWorkProgress$Builder extends GeneratedMessageLite$Builder implements ClientWorkProgressOrBuilder	// class@000ef0
{

    public void ClientWorkProgress$Builder(){
       super(ClientWorkProgress.DEFAULT_INSTANCE);
    }
    public void ClientWorkProgress$Builder(ClientWorkProgress$1 p0){
       super();
    }
    public ClientWorkProgress$Builder clearKey(){
       this.copyOnWrite();
       this.instance.clearKey();
       return this;
    }
    public ClientWorkProgress$Builder clearProgress(){
       this.copyOnWrite();
       this.instance.clearProgress();
       return this;
    }
    public String getKey(){
       return this.instance.getKey();
    }
    public ByteString getKeyBytes(){
       return this.instance.getKeyBytes();
    }
    public int getProgress(){
       return this.instance.getProgress();
    }
    public ClientWorkProgress$Builder setKey(String p0){
       this.copyOnWrite();
       this.instance.setKey(p0);
       return this;
    }
    public ClientWorkProgress$Builder setKeyBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setKeyBytes(p0);
       return this;
    }
    public ClientWorkProgress$Builder setProgress(int p0){
       this.copyOnWrite();
       this.instance.setProgress(p0);
       return this;
    }
}
