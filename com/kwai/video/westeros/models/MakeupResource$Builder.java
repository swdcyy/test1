package com.kwai.video.westeros.models.MakeupResource$Builder;
import com.kwai.video.westeros.models.MakeupResourceOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MakeupResource;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MakeupResource$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class MakeupResource$Builder extends GeneratedMessageLite$Builder implements MakeupResourceOrBuilder	// class@000fa6
{

    public void MakeupResource$Builder(){
       super(MakeupResource.DEFAULT_INSTANCE);
    }
    public void MakeupResource$Builder(MakeupResource$1 p0){
       super();
    }
    public MakeupResource$Builder clearIntensity(){
       this.copyOnWrite();
       this.instance.clearIntensity();
       return this;
    }
    public MakeupResource$Builder clearPriority(){
       this.copyOnWrite();
       this.instance.clearPriority();
       return this;
    }
    public MakeupResource$Builder clearResourceDir(){
       this.copyOnWrite();
       this.instance.clearResourceDir();
       return this;
    }
    public MakeupResource$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public float getIntensity(){
       return this.instance.getIntensity();
    }
    public int getPriority(){
       return this.instance.getPriority();
    }
    public String getResourceDir(){
       return this.instance.getResourceDir();
    }
    public ByteString getResourceDirBytes(){
       return this.instance.getResourceDirBytes();
    }
    public String getType(){
       return this.instance.getType();
    }
    public ByteString getTypeBytes(){
       return this.instance.getTypeBytes();
    }
    public MakeupResource$Builder setIntensity(float p0){
       this.copyOnWrite();
       this.instance.setIntensity(p0);
       return this;
    }
    public MakeupResource$Builder setPriority(int p0){
       this.copyOnWrite();
       this.instance.setPriority(p0);
       return this;
    }
    public MakeupResource$Builder setResourceDir(String p0){
       this.copyOnWrite();
       this.instance.setResourceDir(p0);
       return this;
    }
    public MakeupResource$Builder setResourceDirBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setResourceDirBytes(p0);
       return this;
    }
    public MakeupResource$Builder setType(String p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public MakeupResource$Builder setTypeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTypeBytes(p0);
       return this;
    }
}
