package com.kwai.video.westeros.models.ARConfig$Builder;
import com.kwai.video.westeros.models.ARConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.ARConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.ARConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class ARConfig$Builder extends GeneratedMessageLite$Builder implements ARConfigOrBuilder	// class@000e8e
{

    public void ARConfig$Builder(){
       super(ARConfig.DEFAULT_INSTANCE);
    }
    public void ARConfig$Builder(ARConfig$1 p0){
       super();
    }
    public ARConfig$Builder clearArMeshType(){
       this.copyOnWrite();
       this.instance.clearArMeshType();
       return this;
    }
    public ARConfig$Builder clearRequireDepthData(){
       this.copyOnWrite();
       this.instance.clearRequireDepthData();
       return this;
    }
    public ARConfig$Builder clearRequireMeshData(){
       this.copyOnWrite();
       this.instance.clearRequireMeshData();
       return this;
    }
    public ARConfig$Builder clearRequirePersonMask(){
       this.copyOnWrite();
       this.instance.clearRequirePersonMask();
       return this;
    }
    public ARConfig$Builder clearUseSystemAr(){
       this.copyOnWrite();
       this.instance.clearUseSystemAr();
       return this;
    }
    public String getArMeshType(){
       return this.instance.getArMeshType();
    }
    public ByteString getArMeshTypeBytes(){
       return this.instance.getArMeshTypeBytes();
    }
    public boolean getRequireDepthData(){
       return this.instance.getRequireDepthData();
    }
    public boolean getRequireMeshData(){
       return this.instance.getRequireMeshData();
    }
    public boolean getRequirePersonMask(){
       return this.instance.getRequirePersonMask();
    }
    public boolean getUseSystemAr(){
       return this.instance.getUseSystemAr();
    }
    public ARConfig$Builder setArMeshType(String p0){
       this.copyOnWrite();
       this.instance.setArMeshType(p0);
       return this;
    }
    public ARConfig$Builder setArMeshTypeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setArMeshTypeBytes(p0);
       return this;
    }
    public ARConfig$Builder setRequireDepthData(boolean p0){
       this.copyOnWrite();
       this.instance.setRequireDepthData(p0);
       return this;
    }
    public ARConfig$Builder setRequireMeshData(boolean p0){
       this.copyOnWrite();
       this.instance.setRequireMeshData(p0);
       return this;
    }
    public ARConfig$Builder setRequirePersonMask(boolean p0){
       this.copyOnWrite();
       this.instance.setRequirePersonMask(p0);
       return this;
    }
    public ARConfig$Builder setUseSystemAr(boolean p0){
       this.copyOnWrite();
       this.instance.setUseSystemAr(p0);
       return this;
    }
}
