package com.kwai.video.westeros.models.PickMediaOutput;
import com.kwai.video.westeros.models.PickMediaOutputOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.PickMediaOutput$Builder;
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
import com.kwai.video.westeros.models.PickMediaOutput$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.PickingMediaResType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PickMediaOutput extends GeneratedMessageLite implements PickMediaOutputOrBuilder	// class@000ff1
{
    public String key_;
    public boolean needFaceData_;
    public int type_;
    public static final PickMediaOutput DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PickMediaOutput pickMediaOut = new PickMediaOutput();
       PickMediaOutput.DEFAULT_INSTANCE = pickMediaOut;
       GeneratedMessageLite.registerDefaultInstance(PickMediaOutput.class, pickMediaOut);
    }
    public void PickMediaOutput(){
       super();
       this.key_ = "";
    }
    public static PickMediaOutput getDefaultInstance(){
       return PickMediaOutput.DEFAULT_INSTANCE;
    }
    public static PickMediaOutput$Builder newBuilder(){
       return PickMediaOutput.DEFAULT_INSTANCE.createBuilder();
    }
    public static PickMediaOutput$Builder newBuilder(PickMediaOutput p0){
       return PickMediaOutput.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PickMediaOutput parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PickMediaOutput.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaOutput parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PickMediaOutput.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaOutput parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaOutput parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaOutput parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaOutput parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaOutput parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaOutput parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaOutput parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaOutput parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0, p1);
    }
    public static PickMediaOutput parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0);
    }
    public static PickMediaOutput parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PickMediaOutput.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PickMediaOutput.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearKey(){
       this.key_ = PickMediaOutput.getDefaultInstance().getKey();
    }
    public void clearNeedFaceData(){
       this.needFaceData_ = false;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PickMediaOutput$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PickMediaOutput();
           case 2:
             return new PickMediaOutput$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"key_","type_","needFaceData_"};
             return GeneratedMessageLite.newMessageInfo(PickMediaOutput.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x07\x00", objArray);
           case 4:
             return PickMediaOutput.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PickMediaOutput.PARSER;
             if (pARSER == null) {
                _monitor_enter(PickMediaOutput.class);
                pARSER = PickMediaOutput.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PickMediaOutput.DEFAULT_INSTANCE);
                   PickMediaOutput.PARSER = pARSER;
                }
                _monitor_exit(PickMediaOutput.class);
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
    public String getKey(){
       return this.key_;
    }
    public ByteString getKeyBytes(){
       return ByteString.copyFromUtf8(this.key_);
    }
    public boolean getNeedFaceData(){
       return this.needFaceData_;
    }
    public PickingMediaResType getType(){
       PickingMediaResType pickingMedia = PickingMediaResType.forNumber(this.type_);
       if (pickingMedia == null) {
          pickingMedia = PickingMediaResType.UNRECOGNIZED;
       }
       return pickingMedia;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void setKey(String p0){
       Objects.requireNonNull(p0);
       this.key_ = p0;
    }
    public void setKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.key_ = p0.toStringUtf8();
    }
    public void setNeedFaceData(boolean p0){
       this.needFaceData_ = p0;
    }
    public void setType(PickingMediaResType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
