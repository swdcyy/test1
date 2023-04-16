package com.kwai.video.westeros.models.ServerMediaRequest$Builder;
import com.kwai.video.westeros.models.ServerMediaRequestOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.ServerMediaRequest;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.ServerMediaRequest$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public final class ServerMediaRequest$Builder extends GeneratedMessageLite$Builder implements ServerMediaRequestOrBuilder	// class@00103a
{

    public void ServerMediaRequest$Builder(){
       super(ServerMediaRequest.DEFAULT_INSTANCE);
    }
    public void ServerMediaRequest$Builder(ServerMediaRequest$1 p0){
       super();
    }
    public ServerMediaRequest$Builder clearDisableCache(){
       this.copyOnWrite();
       this.instance.clearDisableCache();
       return this;
    }
    public ServerMediaRequest$Builder clearKey(){
       this.copyOnWrite();
       this.instance.clearKey();
       return this;
    }
    public ServerMediaRequest$Builder clearServerAction(){
       this.copyOnWrite();
       this.instance.clearServerAction();
       return this;
    }
    public ServerMediaRequest$Builder clearText(){
       this.copyOnWrite();
       this.instance.clearText();
       return this;
    }
    public ServerMediaRequest$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public boolean getDisableCache(){
       return this.instance.getDisableCache();
    }
    public String getKey(){
       return this.instance.getKey();
    }
    public ByteString getKeyBytes(){
       return this.instance.getKeyBytes();
    }
    public String getServerAction(){
       return this.instance.getServerAction();
    }
    public ByteString getServerActionBytes(){
       return this.instance.getServerActionBytes();
    }
    public String getText(){
       return this.instance.getText();
    }
    public ByteString getTextBytes(){
       return this.instance.getTextBytes();
    }
    public PickingMediaResType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public ServerMediaRequest$Builder setDisableCache(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableCache(p0);
       return this;
    }
    public ServerMediaRequest$Builder setKey(String p0){
       this.copyOnWrite();
       this.instance.setKey(p0);
       return this;
    }
    public ServerMediaRequest$Builder setKeyBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setKeyBytes(p0);
       return this;
    }
    public ServerMediaRequest$Builder setServerAction(String p0){
       this.copyOnWrite();
       this.instance.setServerAction(p0);
       return this;
    }
    public ServerMediaRequest$Builder setServerActionBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setServerActionBytes(p0);
       return this;
    }
    public ServerMediaRequest$Builder setText(String p0){
       this.copyOnWrite();
       this.instance.setText(p0);
       return this;
    }
    public ServerMediaRequest$Builder setTextBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTextBytes(p0);
       return this;
    }
    public ServerMediaRequest$Builder setType(PickingMediaResType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public ServerMediaRequest$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
