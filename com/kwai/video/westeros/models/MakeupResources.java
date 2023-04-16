package com.kwai.video.westeros.models.MakeupResources;
import com.kwai.video.westeros.models.MakeupResourcesOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.MakeupResources$Builder;
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
import com.kwai.video.westeros.models.MakeupResource$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.MakeupResource;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.MakeupResources$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kwai.video.westeros.models.MakeupResourceOrBuilder;

public final class MakeupResources extends GeneratedMessageLite implements MakeupResourcesOrBuilder	// class@000fab
{
    public Internal$ProtobufList resource_;
    public static final MakeupResources DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MakeupResources makeupResour = new MakeupResources();
       MakeupResources.DEFAULT_INSTANCE = makeupResour;
       GeneratedMessageLite.registerDefaultInstance(MakeupResources.class, makeupResour);
    }
    public void MakeupResources(){
       super();
       this.resource_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static MakeupResources getDefaultInstance(){
       return MakeupResources.DEFAULT_INSTANCE;
    }
    public static MakeupResources$Builder newBuilder(){
       return MakeupResources.DEFAULT_INSTANCE.createBuilder();
    }
    public static MakeupResources$Builder newBuilder(MakeupResources p0){
       return MakeupResources.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MakeupResources parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupResources.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResources parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MakeupResources.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResources parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResources parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResources parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResources parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResources parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResources parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResources parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResources parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeupResources parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0);
    }
    public static MakeupResources parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MakeupResources.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MakeupResources.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllResource(Iterable p0){
       this.ensureResourceIsMutable();
       AbstractMessageLite.addAll(p0, this.resource_);
    }
    public void addResource(int p0,MakeupResource$Builder p1){
       this.ensureResourceIsMutable();
       this.resource_.add(p0, p1.build());
    }
    public void addResource(int p0,MakeupResource p1){
       Objects.requireNonNull(p1);
       this.ensureResourceIsMutable();
       this.resource_.add(p0, p1);
    }
    public void addResource(MakeupResource$Builder p0){
       this.ensureResourceIsMutable();
       this.resource_.add(p0.build());
    }
    public void addResource(MakeupResource p0){
       Objects.requireNonNull(p0);
       this.ensureResourceIsMutable();
       this.resource_.add(p0);
    }
    public void clearResource(){
       this.resource_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MakeupResources$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MakeupResources();
           case 2:
             return new MakeupResources$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"resource_",MakeupResource.class};
             return GeneratedMessageLite.newMessageInfo(MakeupResources.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return MakeupResources.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MakeupResources.PARSER;
             if (pARSER == null) {
                _monitor_enter(MakeupResources.class);
                pARSER = MakeupResources.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MakeupResources.DEFAULT_INSTANCE);
                   MakeupResources.PARSER = pARSER;
                }
                _monitor_exit(MakeupResources.class);
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
    public final void ensureResourceIsMutable(){
       if (!this.resource_.isModifiable()) {
          this.resource_ = GeneratedMessageLite.mutableCopy(this.resource_);
       }
       return;
    }
    public MakeupResource getResource(int p0){
       return this.resource_.get(p0);
    }
    public int getResourceCount(){
       return this.resource_.size();
    }
    public List getResourceList(){
       return this.resource_;
    }
    public MakeupResourceOrBuilder getResourceOrBuilder(int p0){
       return this.resource_.get(p0);
    }
    public List getResourceOrBuilderList(){
       return this.resource_;
    }
    public void removeResource(int p0){
       this.ensureResourceIsMutable();
       this.resource_.remove(p0);
    }
    public void setResource(int p0,MakeupResource$Builder p1){
       this.ensureResourceIsMutable();
       this.resource_.set(p0, p1.build());
    }
    public void setResource(int p0,MakeupResource p1){
       Objects.requireNonNull(p1);
       this.ensureResourceIsMutable();
       this.resource_.set(p0, p1);
    }
}
