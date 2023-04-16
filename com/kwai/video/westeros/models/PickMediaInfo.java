package com.kwai.video.westeros.models.PickMediaInfo;
import com.kwai.video.westeros.models.PickMediaInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.PickMediaInfo$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.PickMediaInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.PickMediaOutput;
import com.kwai.video.westeros.models.FMSize;
import java.util.Objects;
import com.kwai.video.westeros.models.PickMediaOutput$Builder;
import com.kwai.video.westeros.models.FMSize$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class PickMediaInfo extends GeneratedMessageLite implements PickMediaInfoOrBuilder	// class@000fed
{
    public float duration_;
    public int maxLength_;
    public PickMediaOutput output_;
    public String serverEffect_;
    public FMSize size_;
    public static final PickMediaInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PickMediaInfo pickMediaInf = new PickMediaInfo();
       PickMediaInfo.DEFAULT_INSTANCE = pickMediaInf;
       GeneratedMessageLite.registerDefaultInstance(PickMediaInfo.class, pickMediaInf);
    }
    public void PickMediaInfo(){
       super();
       this.serverEffect_ = "";
    }
    public static PickMediaInfo getDefaultInstance(){
       return PickMediaInfo.DEFAULT_INSTANCE;
    }
    public static PickMediaInfo$Builder newBuilder(){
       return PickMediaInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static PickMediaInfo$Builder newBuilder(PickMediaInfo p0){
       return PickMediaInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PickMediaInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PickMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PickMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PickMediaInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearMaxLength(){
       this.maxLength_ = 0;
    }
    public void clearOutput(){
       this.output_ = null;
    }
    public void clearServerEffect(){
       this.serverEffect_ = PickMediaInfo.getDefaultInstance().getServerEffect();
    }
    public void clearSize(){
       this.size_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PickMediaInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PickMediaInfo();
           case 2:
             return new PickMediaInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"serverEffect_","size_","output_","duration_","maxLength_"};
             return GeneratedMessageLite.newMessageInfo(PickMediaInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t\x03\t\x04\x01\x05\x04\x00", objArray);
           case 4:
             return PickMediaInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PickMediaInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(PickMediaInfo.class);
                pARSER = PickMediaInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PickMediaInfo.DEFAULT_INSTANCE);
                   PickMediaInfo.PARSER = pARSER;
                }
                _monitor_exit(PickMediaInfo.class);
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
    public float getDuration(){
       return this.duration_;
    }
    public int getMaxLength(){
       return this.maxLength_;
    }
    public PickMediaOutput getOutput(){
       PickMediaInfo toutput_ = this.output_;
       if (toutput_ == null) {
          toutput_ = PickMediaOutput.getDefaultInstance();
       }
       return toutput_;
    }
    public String getServerEffect(){
       return this.serverEffect_;
    }
    public ByteString getServerEffectBytes(){
       return ByteString.copyFromUtf8(this.serverEffect_);
    }
    public FMSize getSize(){
       PickMediaInfo tsize_ = this.size_;
       if (tsize_ == null) {
          tsize_ = FMSize.getDefaultInstance();
       }
       return tsize_;
    }
    public boolean hasOutput(){
       boolean b = (this.output_ != null)? true: false;
       return b;
    }
    public boolean hasSize(){
       boolean b = (this.size_ != null)? true: false;
       return b;
    }
    public void mergeOutput(PickMediaOutput p0){
       Objects.requireNonNull(p0);
       PickMediaInfo toutput_ = this.output_;
       this.output_ = (toutput_ != null && toutput_ != PickMediaOutput.getDefaultInstance())? PickMediaOutput.newBuilder(this.output_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSize(FMSize p0){
       Objects.requireNonNull(p0);
       PickMediaInfo tsize_ = this.size_;
       this.size_ = (tsize_ != null && tsize_ != FMSize.getDefaultInstance())? FMSize.newBuilder(this.size_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setDuration(float p0){
       this.duration_ = p0;
    }
    public void setMaxLength(int p0){
       this.maxLength_ = p0;
    }
    public void setOutput(PickMediaOutput$Builder p0){
       this.output_ = p0.build();
    }
    public void setOutput(PickMediaOutput p0){
       Objects.requireNonNull(p0);
       this.output_ = p0;
    }
    public void setServerEffect(String p0){
       Objects.requireNonNull(p0);
       this.serverEffect_ = p0;
    }
    public void setServerEffectBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.serverEffect_ = p0.toStringUtf8();
    }
    public void setSize(FMSize$Builder p0){
       this.size_ = p0.build();
    }
    public void setSize(FMSize p0){
       Objects.requireNonNull(p0);
       this.size_ = p0;
    }
}
