package com.kwai.video.westeros.models.PickMoreMediaInfo;
import com.kwai.video.westeros.models.PickMoreMediaInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.PickMoreMediaInfo$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.models.EmbeddedPickingMedia$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.EmbeddedPickingMedia;
import java.util.Objects;
import com.kwai.video.westeros.models.PickMediaInfo$Builder;
import com.kwai.video.westeros.models.PickMediaInfo;
import com.kwai.video.westeros.models.PickMediaServerInfo$Builder;
import com.kwai.video.westeros.models.PickMediaServerInfo;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.PickMoreMediaInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.EmbeddedPickingMediaOrBuilder;
import com.kwai.video.westeros.models.PickMediaInfoOrBuilder;
import com.kwai.video.westeros.models.PickMediaServerInfoOrBuilder;

public final class PickMoreMediaInfo extends GeneratedMessageLite implements PickMoreMediaInfoOrBuilder	// class@000ff9
{
    public Internal$ProtobufList defaultInfo_;
    public Internal$ProtobufList mediaInfo_;
    public int minMediaNum_;
    public boolean needUploadCustomResource_;
    public boolean requireFacialReco_;
    public Internal$ProtobufList serviceInfo_;
    public static final PickMoreMediaInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PickMoreMediaInfo pickMoreMedi = new PickMoreMediaInfo();
       PickMoreMediaInfo.DEFAULT_INSTANCE = pickMoreMedi;
       GeneratedMessageLite.registerDefaultInstance(PickMoreMediaInfo.class, pickMoreMedi);
    }
    public void PickMoreMediaInfo(){
       super();
       this.mediaInfo_ = GeneratedMessageLite.emptyProtobufList();
       this.defaultInfo_ = GeneratedMessageLite.emptyProtobufList();
       this.serviceInfo_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static PickMoreMediaInfo getDefaultInstance(){
       return PickMoreMediaInfo.DEFAULT_INSTANCE;
    }
    public static PickMoreMediaInfo$Builder newBuilder(){
       return PickMoreMediaInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static PickMoreMediaInfo$Builder newBuilder(PickMoreMediaInfo p0){
       return PickMoreMediaInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PickMoreMediaInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMoreMediaInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMoreMediaInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMoreMediaInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMoreMediaInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMoreMediaInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMoreMediaInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMoreMediaInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMoreMediaInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMoreMediaInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMoreMediaInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMoreMediaInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMoreMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PickMoreMediaInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllDefaultInfo(Iterable p0){
       this.ensureDefaultInfoIsMutable();
       AbstractMessageLite.addAll(p0, this.defaultInfo_);
    }
    public void addAllMediaInfo(Iterable p0){
       this.ensureMediaInfoIsMutable();
       AbstractMessageLite.addAll(p0, this.mediaInfo_);
    }
    public void addAllServiceInfo(Iterable p0){
       this.ensureServiceInfoIsMutable();
       AbstractMessageLite.addAll(p0, this.serviceInfo_);
    }
    public void addDefaultInfo(int p0,EmbeddedPickingMedia$Builder p1){
       this.ensureDefaultInfoIsMutable();
       this.defaultInfo_.add(p0, p1.build());
    }
    public void addDefaultInfo(int p0,EmbeddedPickingMedia p1){
       Objects.requireNonNull(p1);
       this.ensureDefaultInfoIsMutable();
       this.defaultInfo_.add(p0, p1);
    }
    public void addDefaultInfo(EmbeddedPickingMedia$Builder p0){
       this.ensureDefaultInfoIsMutable();
       this.defaultInfo_.add(p0.build());
    }
    public void addDefaultInfo(EmbeddedPickingMedia p0){
       Objects.requireNonNull(p0);
       this.ensureDefaultInfoIsMutable();
       this.defaultInfo_.add(p0);
    }
    public void addMediaInfo(int p0,PickMediaInfo$Builder p1){
       this.ensureMediaInfoIsMutable();
       this.mediaInfo_.add(p0, p1.build());
    }
    public void addMediaInfo(int p0,PickMediaInfo p1){
       Objects.requireNonNull(p1);
       this.ensureMediaInfoIsMutable();
       this.mediaInfo_.add(p0, p1);
    }
    public void addMediaInfo(PickMediaInfo$Builder p0){
       this.ensureMediaInfoIsMutable();
       this.mediaInfo_.add(p0.build());
    }
    public void addMediaInfo(PickMediaInfo p0){
       Objects.requireNonNull(p0);
       this.ensureMediaInfoIsMutable();
       this.mediaInfo_.add(p0);
    }
    public void addServiceInfo(int p0,PickMediaServerInfo$Builder p1){
       this.ensureServiceInfoIsMutable();
       this.serviceInfo_.add(p0, p1.build());
    }
    public void addServiceInfo(int p0,PickMediaServerInfo p1){
       Objects.requireNonNull(p1);
       this.ensureServiceInfoIsMutable();
       this.serviceInfo_.add(p0, p1);
    }
    public void addServiceInfo(PickMediaServerInfo$Builder p0){
       this.ensureServiceInfoIsMutable();
       this.serviceInfo_.add(p0.build());
    }
    public void addServiceInfo(PickMediaServerInfo p0){
       Objects.requireNonNull(p0);
       this.ensureServiceInfoIsMutable();
       this.serviceInfo_.add(p0);
    }
    public void clearDefaultInfo(){
       this.defaultInfo_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMediaInfo(){
       this.mediaInfo_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMinMediaNum(){
       this.minMediaNum_ = 0;
    }
    public void clearNeedUploadCustomResource(){
       this.needUploadCustomResource_ = false;
    }
    public void clearRequireFacialReco(){
       this.requireFacialReco_ = false;
    }
    public void clearServiceInfo(){
       this.serviceInfo_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PickMoreMediaInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PickMoreMediaInfo();
           case 2:
             return new PickMoreMediaInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[9];
             objArray[0] = "mediaInfo_";
             objArray[i] = PickMediaInfo.class;
             objArray[2] = "defaultInfo_";
             objArray[3] = EmbeddedPickingMedia.class;
             objArray[4] = "serviceInfo_";
             objArray[5] = PickMediaServerInfo.class;
             objArray[6] = "requireFacialReco_";
             objArray[7] = "minMediaNum_";
             objArray[8] = "needUploadCustomResource_";
             return GeneratedMessageLite.newMessageInfo(PickMoreMediaInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x1b\x02\x1b\x03\x1b\x04\x07\x05\x04\x06\x07\x00", objArray);
           case 4:
             return PickMoreMediaInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PickMoreMediaInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(PickMoreMediaInfo.class);
                pARSER = PickMoreMediaInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PickMoreMediaInfo.DEFAULT_INSTANCE);
                   PickMoreMediaInfo.PARSER = pARSER;
                }
                _monitor_exit(PickMoreMediaInfo.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureDefaultInfoIsMutable(){
       if (!this.defaultInfo_.isModifiable()) {
          this.defaultInfo_ = GeneratedMessageLite.mutableCopy(this.defaultInfo_);
       }
       return;
    }
    public final void ensureMediaInfoIsMutable(){
       if (!this.mediaInfo_.isModifiable()) {
          this.mediaInfo_ = GeneratedMessageLite.mutableCopy(this.mediaInfo_);
       }
       return;
    }
    public final void ensureServiceInfoIsMutable(){
       if (!this.serviceInfo_.isModifiable()) {
          this.serviceInfo_ = GeneratedMessageLite.mutableCopy(this.serviceInfo_);
       }
       return;
    }
    public EmbeddedPickingMedia getDefaultInfo(int p0){
       return this.defaultInfo_.get(p0);
    }
    public int getDefaultInfoCount(){
       return this.defaultInfo_.size();
    }
    public List getDefaultInfoList(){
       return this.defaultInfo_;
    }
    public EmbeddedPickingMediaOrBuilder getDefaultInfoOrBuilder(int p0){
       return this.defaultInfo_.get(p0);
    }
    public List getDefaultInfoOrBuilderList(){
       return this.defaultInfo_;
    }
    public PickMediaInfo getMediaInfo(int p0){
       return this.mediaInfo_.get(p0);
    }
    public int getMediaInfoCount(){
       return this.mediaInfo_.size();
    }
    public List getMediaInfoList(){
       return this.mediaInfo_;
    }
    public PickMediaInfoOrBuilder getMediaInfoOrBuilder(int p0){
       return this.mediaInfo_.get(p0);
    }
    public List getMediaInfoOrBuilderList(){
       return this.mediaInfo_;
    }
    public int getMinMediaNum(){
       return this.minMediaNum_;
    }
    public boolean getNeedUploadCustomResource(){
       return this.needUploadCustomResource_;
    }
    public boolean getRequireFacialReco(){
       return this.requireFacialReco_;
    }
    public PickMediaServerInfo getServiceInfo(int p0){
       return this.serviceInfo_.get(p0);
    }
    public int getServiceInfoCount(){
       return this.serviceInfo_.size();
    }
    public List getServiceInfoList(){
       return this.serviceInfo_;
    }
    public PickMediaServerInfoOrBuilder getServiceInfoOrBuilder(int p0){
       return this.serviceInfo_.get(p0);
    }
    public List getServiceInfoOrBuilderList(){
       return this.serviceInfo_;
    }
    public void removeDefaultInfo(int p0){
       this.ensureDefaultInfoIsMutable();
       this.defaultInfo_.remove(p0);
    }
    public void removeMediaInfo(int p0){
       this.ensureMediaInfoIsMutable();
       this.mediaInfo_.remove(p0);
    }
    public void removeServiceInfo(int p0){
       this.ensureServiceInfoIsMutable();
       this.serviceInfo_.remove(p0);
    }
    public void setDefaultInfo(int p0,EmbeddedPickingMedia$Builder p1){
       this.ensureDefaultInfoIsMutable();
       this.defaultInfo_.set(p0, p1.build());
    }
    public void setDefaultInfo(int p0,EmbeddedPickingMedia p1){
       Objects.requireNonNull(p1);
       this.ensureDefaultInfoIsMutable();
       this.defaultInfo_.set(p0, p1);
    }
    public void setMediaInfo(int p0,PickMediaInfo$Builder p1){
       this.ensureMediaInfoIsMutable();
       this.mediaInfo_.set(p0, p1.build());
    }
    public void setMediaInfo(int p0,PickMediaInfo p1){
       Objects.requireNonNull(p1);
       this.ensureMediaInfoIsMutable();
       this.mediaInfo_.set(p0, p1);
    }
    public void setMinMediaNum(int p0){
       this.minMediaNum_ = p0;
    }
    public void setNeedUploadCustomResource(boolean p0){
       this.needUploadCustomResource_ = p0;
    }
    public void setRequireFacialReco(boolean p0){
       this.requireFacialReco_ = p0;
    }
    public void setServiceInfo(int p0,PickMediaServerInfo$Builder p1){
       this.ensureServiceInfoIsMutable();
       this.serviceInfo_.set(p0, p1.build());
    }
    public void setServiceInfo(int p0,PickMediaServerInfo p1){
       Objects.requireNonNull(p1);
       this.ensureServiceInfoIsMutable();
       this.serviceInfo_.set(p0, p1);
    }
}
