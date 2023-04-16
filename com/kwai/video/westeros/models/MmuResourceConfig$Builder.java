package com.kwai.video.westeros.models.MmuResourceConfig$Builder;
import com.kwai.video.westeros.models.MmuResourceConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MmuResourceConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MmuResourceConfig$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class MmuResourceConfig$Builder extends GeneratedMessageLite$Builder implements MmuResourceConfigOrBuilder	// class@000fe1
{

    public void MmuResourceConfig$Builder(){
       super(MmuResourceConfig.DEFAULT_INSTANCE);
    }
    public void MmuResourceConfig$Builder(MmuResourceConfig$1 p0){
       super();
    }
    public MmuResourceConfig$Builder addAllMmuModelPath(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMmuModelPath(p0);
       return this;
    }
    public MmuResourceConfig$Builder addMmuModelPath(String p0){
       this.copyOnWrite();
       this.instance.addMmuModelPath(p0);
       return this;
    }
    public MmuResourceConfig$Builder addMmuModelPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addMmuModelPathBytes(p0);
       return this;
    }
    public MmuResourceConfig$Builder clearIsBuiltin(){
       this.copyOnWrite();
       this.instance.clearIsBuiltin();
       return this;
    }
    public MmuResourceConfig$Builder clearMmuModelPath(){
       this.copyOnWrite();
       this.instance.clearMmuModelPath();
       return this;
    }
    public MmuResourceConfig$Builder clearResourcePath(){
       this.copyOnWrite();
       this.instance.clearResourcePath();
       return this;
    }
    public MmuResourceConfig$Builder clearYcnnModelPath(){
       this.copyOnWrite();
       this.instance.clearYcnnModelPath();
       return this;
    }
    public boolean getIsBuiltin(){
       return this.instance.getIsBuiltin();
    }
    public String getMmuModelPath(int p0){
       return this.instance.getMmuModelPath(p0);
    }
    public ByteString getMmuModelPathBytes(int p0){
       return this.instance.getMmuModelPathBytes(p0);
    }
    public int getMmuModelPathCount(){
       return this.instance.getMmuModelPathCount();
    }
    public List getMmuModelPathList(){
       return Collections.unmodifiableList(this.instance.getMmuModelPathList());
    }
    public String getResourcePath(){
       return this.instance.getResourcePath();
    }
    public ByteString getResourcePathBytes(){
       return this.instance.getResourcePathBytes();
    }
    public String getYcnnModelPath(){
       return this.instance.getYcnnModelPath();
    }
    public ByteString getYcnnModelPathBytes(){
       return this.instance.getYcnnModelPathBytes();
    }
    public MmuResourceConfig$Builder setIsBuiltin(boolean p0){
       this.copyOnWrite();
       this.instance.setIsBuiltin(p0);
       return this;
    }
    public MmuResourceConfig$Builder setMmuModelPath(int p0,String p1){
       this.copyOnWrite();
       this.instance.setMmuModelPath(p0, p1);
       return this;
    }
    public MmuResourceConfig$Builder setResourcePath(String p0){
       this.copyOnWrite();
       this.instance.setResourcePath(p0);
       return this;
    }
    public MmuResourceConfig$Builder setResourcePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setResourcePathBytes(p0);
       return this;
    }
    public MmuResourceConfig$Builder setYcnnModelPath(String p0){
       this.copyOnWrite();
       this.instance.setYcnnModelPath(p0);
       return this;
    }
    public MmuResourceConfig$Builder setYcnnModelPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setYcnnModelPathBytes(p0);
       return this;
    }
}
