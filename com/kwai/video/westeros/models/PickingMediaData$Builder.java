package com.kwai.video.westeros.models.PickingMediaData$Builder;
import com.kwai.video.westeros.models.PickingMediaDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PickingMediaData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PickingMediaData$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public final class PickingMediaData$Builder extends GeneratedMessageLite$Builder implements PickingMediaDataOrBuilder	// class@000ffc
{

    public void PickingMediaData$Builder(){
       super(PickingMediaData.DEFAULT_INSTANCE);
    }
    public void PickingMediaData$Builder(PickingMediaData$1 p0){
       super();
    }
    public PickingMediaData$Builder clearKey(){
       this.copyOnWrite();
       this.instance.clearKey();
       return this;
    }
    public PickingMediaData$Builder clearPath(){
       this.copyOnWrite();
       this.instance.clearPath();
       return this;
    }
    public PickingMediaData$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public String getKey(){
       return this.instance.getKey();
    }
    public ByteString getKeyBytes(){
       return this.instance.getKeyBytes();
    }
    public String getPath(){
       return this.instance.getPath();
    }
    public ByteString getPathBytes(){
       return this.instance.getPathBytes();
    }
    public PickingMediaResType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public PickingMediaData$Builder setKey(String p0){
       this.copyOnWrite();
       this.instance.setKey(p0);
       return this;
    }
    public PickingMediaData$Builder setKeyBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setKeyBytes(p0);
       return this;
    }
    public PickingMediaData$Builder setPath(String p0){
       this.copyOnWrite();
       this.instance.setPath(p0);
       return this;
    }
    public PickingMediaData$Builder setPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPathBytes(p0);
       return this;
    }
    public PickingMediaData$Builder setType(PickingMediaResType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public PickingMediaData$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
