package com.kwai.video.westeros.models.TitleDatas;
import com.kwai.video.westeros.models.TitleDatasOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.TitleDatas$Builder;
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
import com.kwai.video.westeros.models.TitleDatas$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class TitleDatas extends GeneratedMessageLite implements TitleDatasOrBuilder	// class@00104f
{
    public String firstInput_;
    public String modify_;
    public static final TitleDatas DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TitleDatas titleDatas = new TitleDatas();
       TitleDatas.DEFAULT_INSTANCE = titleDatas;
       GeneratedMessageLite.registerDefaultInstance(TitleDatas.class, titleDatas);
    }
    public void TitleDatas(){
       super();
       this.firstInput_ = "";
       this.modify_ = "";
    }
    public static TitleDatas getDefaultInstance(){
       return TitleDatas.DEFAULT_INSTANCE;
    }
    public static TitleDatas$Builder newBuilder(){
       return TitleDatas.DEFAULT_INSTANCE.createBuilder();
    }
    public static TitleDatas$Builder newBuilder(TitleDatas p0){
       return TitleDatas.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TitleDatas parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TitleDatas.DEFAULT_INSTANCE, p0);
    }
    public static TitleDatas parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TitleDatas.DEFAULT_INSTANCE, p0, p1);
    }
    public static TitleDatas parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0);
    }
    public static TitleDatas parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0, p1);
    }
    public static TitleDatas parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0);
    }
    public static TitleDatas parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0, p1);
    }
    public static TitleDatas parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0);
    }
    public static TitleDatas parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0, p1);
    }
    public static TitleDatas parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0);
    }
    public static TitleDatas parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0, p1);
    }
    public static TitleDatas parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0);
    }
    public static TitleDatas parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TitleDatas.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TitleDatas.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearFirstInput(){
       this.firstInput_ = TitleDatas.getDefaultInstance().getFirstInput();
    }
    public void clearModify(){
       this.modify_ = TitleDatas.getDefaultInstance().getModify();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (TitleDatas$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TitleDatas();
           case 2:
             return new TitleDatas$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"firstInput_","modify_"};
             return GeneratedMessageLite.newMessageInfo(TitleDatas.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return TitleDatas.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TitleDatas.PARSER;
             if (pARSER == null) {
                _monitor_enter(TitleDatas.class);
                pARSER = TitleDatas.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TitleDatas.DEFAULT_INSTANCE);
                   TitleDatas.PARSER = pARSER;
                }
                _monitor_exit(TitleDatas.class);
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
    public String getFirstInput(){
       return this.firstInput_;
    }
    public ByteString getFirstInputBytes(){
       return ByteString.copyFromUtf8(this.firstInput_);
    }
    public String getModify(){
       return this.modify_;
    }
    public ByteString getModifyBytes(){
       return ByteString.copyFromUtf8(this.modify_);
    }
    public void setFirstInput(String p0){
       Objects.requireNonNull(p0);
       this.firstInput_ = p0;
    }
    public void setFirstInputBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.firstInput_ = p0.toStringUtf8();
    }
    public void setModify(String p0){
       Objects.requireNonNull(p0);
       this.modify_ = p0;
    }
    public void setModifyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.modify_ = p0.toStringUtf8();
    }
}
