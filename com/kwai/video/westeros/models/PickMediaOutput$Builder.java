package com.kwai.video.westeros.models.PickMediaOutput$Builder;
import com.kwai.video.westeros.models.PickMediaOutputOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PickMediaOutput;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PickMediaOutput$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public final class PickMediaOutput$Builder extends GeneratedMessageLite$Builder implements PickMediaOutputOrBuilder	// class@000ff0
{

    public void PickMediaOutput$Builder(){
       super(PickMediaOutput.DEFAULT_INSTANCE);
    }
    public void PickMediaOutput$Builder(PickMediaOutput$1 p0){
       super();
    }
    public PickMediaOutput$Builder clearKey(){
       this.copyOnWrite();
       this.instance.clearKey();
       return this;
    }
    public PickMediaOutput$Builder clearNeedFaceData(){
       this.copyOnWrite();
       this.instance.clearNeedFaceData();
       return this;
    }
    public PickMediaOutput$Builder clearType(){
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
    public boolean getNeedFaceData(){
       return this.instance.getNeedFaceData();
    }
    public PickingMediaResType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public PickMediaOutput$Builder setKey(String p0){
       this.copyOnWrite();
       this.instance.setKey(p0);
       return this;
    }
    public PickMediaOutput$Builder setKeyBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setKeyBytes(p0);
       return this;
    }
    public PickMediaOutput$Builder setNeedFaceData(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedFaceData(p0);
       return this;
    }
    public PickMediaOutput$Builder setType(PickingMediaResType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public PickMediaOutput$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
