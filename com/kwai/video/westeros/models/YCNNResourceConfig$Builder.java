package com.kwai.video.westeros.models.YCNNResourceConfig$Builder;
import com.kwai.video.westeros.models.YCNNResourceConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YCNNResourceConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YCNNResourceConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.YCNNModelInConfig;
import com.kwai.video.westeros.models.YCNNModelInConfig$Builder;

public final class YCNNResourceConfig$Builder extends GeneratedMessageLite$Builder implements YCNNResourceConfigOrBuilder	// class@0010a1
{

    public void YCNNResourceConfig$Builder(){
       super(YCNNResourceConfig.DEFAULT_INSTANCE);
    }
    public void YCNNResourceConfig$Builder(YCNNResourceConfig$1 p0){
       super();
    }
    public YCNNResourceConfig$Builder clearIsBuiltin(){
       this.copyOnWrite();
       this.instance.clearIsBuiltin();
       return this;
    }
    public YCNNResourceConfig$Builder clearMmuModelPath(){
       this.copyOnWrite();
       this.instance.clearMmuModelPath();
       return this;
    }
    public YCNNResourceConfig$Builder clearModelinConfig(){
       this.copyOnWrite();
       this.instance.clearModelinConfig();
       return this;
    }
    public YCNNResourceConfig$Builder clearResourcePath(){
       this.copyOnWrite();
       this.instance.clearResourcePath();
       return this;
    }
    public YCNNResourceConfig$Builder clearYcnnModelPath(){
       this.copyOnWrite();
       this.instance.clearYcnnModelPath();
       return this;
    }
    public boolean getIsBuiltin(){
       return this.instance.getIsBuiltin();
    }
    public String getMmuModelPath(){
       return this.instance.getMmuModelPath();
    }
    public ByteString getMmuModelPathBytes(){
       return this.instance.getMmuModelPathBytes();
    }
    public YCNNModelInConfig getModelinConfig(){
       return this.instance.getModelinConfig();
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
    public boolean hasModelinConfig(){
       return this.instance.hasModelinConfig();
    }
    public YCNNResourceConfig$Builder mergeModelinConfig(YCNNModelInConfig p0){
       this.copyOnWrite();
       this.instance.mergeModelinConfig(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setIsBuiltin(boolean p0){
       this.copyOnWrite();
       this.instance.setIsBuiltin(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setMmuModelPath(String p0){
       this.copyOnWrite();
       this.instance.setMmuModelPath(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setMmuModelPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMmuModelPathBytes(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setModelinConfig(YCNNModelInConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setModelinConfig(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setModelinConfig(YCNNModelInConfig p0){
       this.copyOnWrite();
       this.instance.setModelinConfig(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setResourcePath(String p0){
       this.copyOnWrite();
       this.instance.setResourcePath(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setResourcePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setResourcePathBytes(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setYcnnModelPath(String p0){
       this.copyOnWrite();
       this.instance.setYcnnModelPath(p0);
       return this;
    }
    public YCNNResourceConfig$Builder setYcnnModelPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setYcnnModelPathBytes(p0);
       return this;
    }
}
