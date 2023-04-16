package com.kwai.video.westeros.models.PickMoreMediaInfo$Builder;
import com.kwai.video.westeros.models.PickMoreMediaInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PickMoreMediaInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PickMoreMediaInfo$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.EmbeddedPickingMedia$Builder;
import com.kwai.video.westeros.models.EmbeddedPickingMedia;
import com.kwai.video.westeros.models.PickMediaInfo$Builder;
import com.kwai.video.westeros.models.PickMediaInfo;
import com.kwai.video.westeros.models.PickMediaServerInfo$Builder;
import com.kwai.video.westeros.models.PickMediaServerInfo;
import java.util.List;
import java.util.Collections;

public final class PickMoreMediaInfo$Builder extends GeneratedMessageLite$Builder implements PickMoreMediaInfoOrBuilder	// class@000ff8
{

    public void PickMoreMediaInfo$Builder(){
       super(PickMoreMediaInfo.DEFAULT_INSTANCE);
    }
    public void PickMoreMediaInfo$Builder(PickMoreMediaInfo$1 p0){
       super();
    }
    public PickMoreMediaInfo$Builder addAllDefaultInfo(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllDefaultInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addAllMediaInfo(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMediaInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addAllServiceInfo(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllServiceInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addDefaultInfo(int p0,EmbeddedPickingMedia$Builder p1){
       this.copyOnWrite();
       this.instance.addDefaultInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder addDefaultInfo(int p0,EmbeddedPickingMedia p1){
       this.copyOnWrite();
       this.instance.addDefaultInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder addDefaultInfo(EmbeddedPickingMedia$Builder p0){
       this.copyOnWrite();
       this.instance.addDefaultInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addDefaultInfo(EmbeddedPickingMedia p0){
       this.copyOnWrite();
       this.instance.addDefaultInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addMediaInfo(int p0,PickMediaInfo$Builder p1){
       this.copyOnWrite();
       this.instance.addMediaInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder addMediaInfo(int p0,PickMediaInfo p1){
       this.copyOnWrite();
       this.instance.addMediaInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder addMediaInfo(PickMediaInfo$Builder p0){
       this.copyOnWrite();
       this.instance.addMediaInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addMediaInfo(PickMediaInfo p0){
       this.copyOnWrite();
       this.instance.addMediaInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addServiceInfo(int p0,PickMediaServerInfo$Builder p1){
       this.copyOnWrite();
       this.instance.addServiceInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder addServiceInfo(int p0,PickMediaServerInfo p1){
       this.copyOnWrite();
       this.instance.addServiceInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder addServiceInfo(PickMediaServerInfo$Builder p0){
       this.copyOnWrite();
       this.instance.addServiceInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder addServiceInfo(PickMediaServerInfo p0){
       this.copyOnWrite();
       this.instance.addServiceInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder clearDefaultInfo(){
       this.copyOnWrite();
       this.instance.clearDefaultInfo();
       return this;
    }
    public PickMoreMediaInfo$Builder clearMediaInfo(){
       this.copyOnWrite();
       this.instance.clearMediaInfo();
       return this;
    }
    public PickMoreMediaInfo$Builder clearMinMediaNum(){
       this.copyOnWrite();
       this.instance.clearMinMediaNum();
       return this;
    }
    public PickMoreMediaInfo$Builder clearNeedUploadCustomResource(){
       this.copyOnWrite();
       this.instance.clearNeedUploadCustomResource();
       return this;
    }
    public PickMoreMediaInfo$Builder clearRequireFacialReco(){
       this.copyOnWrite();
       this.instance.clearRequireFacialReco();
       return this;
    }
    public PickMoreMediaInfo$Builder clearServiceInfo(){
       this.copyOnWrite();
       this.instance.clearServiceInfo();
       return this;
    }
    public EmbeddedPickingMedia getDefaultInfo(int p0){
       return this.instance.getDefaultInfo(p0);
    }
    public int getDefaultInfoCount(){
       return this.instance.getDefaultInfoCount();
    }
    public List getDefaultInfoList(){
       return Collections.unmodifiableList(this.instance.getDefaultInfoList());
    }
    public PickMediaInfo getMediaInfo(int p0){
       return this.instance.getMediaInfo(p0);
    }
    public int getMediaInfoCount(){
       return this.instance.getMediaInfoCount();
    }
    public List getMediaInfoList(){
       return Collections.unmodifiableList(this.instance.getMediaInfoList());
    }
    public int getMinMediaNum(){
       return this.instance.getMinMediaNum();
    }
    public boolean getNeedUploadCustomResource(){
       return this.instance.getNeedUploadCustomResource();
    }
    public boolean getRequireFacialReco(){
       return this.instance.getRequireFacialReco();
    }
    public PickMediaServerInfo getServiceInfo(int p0){
       return this.instance.getServiceInfo(p0);
    }
    public int getServiceInfoCount(){
       return this.instance.getServiceInfoCount();
    }
    public List getServiceInfoList(){
       return Collections.unmodifiableList(this.instance.getServiceInfoList());
    }
    public PickMoreMediaInfo$Builder removeDefaultInfo(int p0){
       this.copyOnWrite();
       this.instance.removeDefaultInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder removeMediaInfo(int p0){
       this.copyOnWrite();
       this.instance.removeMediaInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder removeServiceInfo(int p0){
       this.copyOnWrite();
       this.instance.removeServiceInfo(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder setDefaultInfo(int p0,EmbeddedPickingMedia$Builder p1){
       this.copyOnWrite();
       this.instance.setDefaultInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder setDefaultInfo(int p0,EmbeddedPickingMedia p1){
       this.copyOnWrite();
       this.instance.setDefaultInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder setMediaInfo(int p0,PickMediaInfo$Builder p1){
       this.copyOnWrite();
       this.instance.setMediaInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder setMediaInfo(int p0,PickMediaInfo p1){
       this.copyOnWrite();
       this.instance.setMediaInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder setMinMediaNum(int p0){
       this.copyOnWrite();
       this.instance.setMinMediaNum(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder setNeedUploadCustomResource(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedUploadCustomResource(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder setRequireFacialReco(boolean p0){
       this.copyOnWrite();
       this.instance.setRequireFacialReco(p0);
       return this;
    }
    public PickMoreMediaInfo$Builder setServiceInfo(int p0,PickMediaServerInfo$Builder p1){
       this.copyOnWrite();
       this.instance.setServiceInfo(p0, p1);
       return this;
    }
    public PickMoreMediaInfo$Builder setServiceInfo(int p0,PickMediaServerInfo p1){
       this.copyOnWrite();
       this.instance.setServiceInfo(p0, p1);
       return this;
    }
}
