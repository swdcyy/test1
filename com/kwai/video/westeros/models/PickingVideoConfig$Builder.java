package com.kwai.video.westeros.models.PickingVideoConfig$Builder;
import com.kwai.video.westeros.models.PickingVideoConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PickingVideoConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PickingVideoConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class PickingVideoConfig$Builder extends GeneratedMessageLite$Builder implements PickingVideoConfigOrBuilder	// class@001003
{

    public void PickingVideoConfig$Builder(){
       super(PickingVideoConfig.DEFAULT_INSTANCE);
    }
    public void PickingVideoConfig$Builder(PickingVideoConfig$1 p0){
       super();
    }
    public PickingVideoConfig$Builder clearDuration(){
       this.copyOnWrite();
       this.instance.clearDuration();
       return this;
    }
    public PickingVideoConfig$Builder clearHeight(){
       this.copyOnWrite();
       this.instance.clearHeight();
       return this;
    }
    public PickingVideoConfig$Builder clearJsonExtraSettings(){
       this.copyOnWrite();
       this.instance.clearJsonExtraSettings();
       return this;
    }
    public PickingVideoConfig$Builder clearWidth(){
       this.copyOnWrite();
       this.instance.clearWidth();
       return this;
    }
    public float getDuration(){
       return this.instance.getDuration();
    }
    public int getHeight(){
       return this.instance.getHeight();
    }
    public String getJsonExtraSettings(){
       return this.instance.getJsonExtraSettings();
    }
    public ByteString getJsonExtraSettingsBytes(){
       return this.instance.getJsonExtraSettingsBytes();
    }
    public int getWidth(){
       return this.instance.getWidth();
    }
    public PickingVideoConfig$Builder setDuration(float p0){
       this.copyOnWrite();
       this.instance.setDuration(p0);
       return this;
    }
    public PickingVideoConfig$Builder setHeight(int p0){
       this.copyOnWrite();
       this.instance.setHeight(p0);
       return this;
    }
    public PickingVideoConfig$Builder setJsonExtraSettings(String p0){
       this.copyOnWrite();
       this.instance.setJsonExtraSettings(p0);
       return this;
    }
    public PickingVideoConfig$Builder setJsonExtraSettingsBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setJsonExtraSettingsBytes(p0);
       return this;
    }
    public PickingVideoConfig$Builder setWidth(int p0){
       this.copyOnWrite();
       this.instance.setWidth(p0);
       return this;
    }
}
