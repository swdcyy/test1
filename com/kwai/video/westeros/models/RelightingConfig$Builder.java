package com.kwai.video.westeros.models.RelightingConfig$Builder;
import com.kwai.video.westeros.models.RelightingConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.RelightingConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.RelightingConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class RelightingConfig$Builder extends GeneratedMessageLite$Builder implements RelightingConfigOrBuilder	// class@001027
{

    public void RelightingConfig$Builder(){
       super(RelightingConfig.DEFAULT_INSTANCE);
    }
    public void RelightingConfig$Builder(RelightingConfig$1 p0){
       super();
    }
    public RelightingConfig$Builder clearFace3DLightContent(){
       this.copyOnWrite();
       this.instance.clearFace3DLightContent();
       return this;
    }
    public RelightingConfig$Builder clearMaterialPath(){
       this.copyOnWrite();
       this.instance.clearMaterialPath();
       return this;
    }
    public String getFace3DLightContent(){
       return this.instance.getFace3DLightContent();
    }
    public ByteString getFace3DLightContentBytes(){
       return this.instance.getFace3DLightContentBytes();
    }
    public String getMaterialPath(){
       return this.instance.getMaterialPath();
    }
    public ByteString getMaterialPathBytes(){
       return this.instance.getMaterialPathBytes();
    }
    public RelightingConfig$Builder setFace3DLightContent(String p0){
       this.copyOnWrite();
       this.instance.setFace3DLightContent(p0);
       return this;
    }
    public RelightingConfig$Builder setFace3DLightContentBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setFace3DLightContentBytes(p0);
       return this;
    }
    public RelightingConfig$Builder setMaterialPath(String p0){
       this.copyOnWrite();
       this.instance.setMaterialPath(p0);
       return this;
    }
    public RelightingConfig$Builder setMaterialPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMaterialPathBytes(p0);
       return this;
    }
}
