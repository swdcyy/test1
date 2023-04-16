package com.kwai.video.westeros.models.MemojiResultSingleFace;
import com.kwai.video.westeros.models.MemojiResultSingleFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.MemojiResultSingleFace$Builder;
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
import com.kwai.video.westeros.models.MemojiResultSingleFace$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.MemojiHint;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class MemojiResultSingleFace extends GeneratedMessageLite implements MemojiResultSingleFaceOrBuilder	// class@000fba
{
    public int hint_;
    public String resultJson_;
    public boolean success_;
    public static final MemojiResultSingleFace DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MemojiResultSingleFace memojiResult = new MemojiResultSingleFace();
       MemojiResultSingleFace.DEFAULT_INSTANCE = memojiResult;
       GeneratedMessageLite.registerDefaultInstance(MemojiResultSingleFace.class, memojiResult);
    }
    public void MemojiResultSingleFace(){
       super();
       this.resultJson_ = "";
    }
    public static MemojiResultSingleFace getDefaultInstance(){
       return MemojiResultSingleFace.DEFAULT_INSTANCE;
    }
    public static MemojiResultSingleFace$Builder newBuilder(){
       return MemojiResultSingleFace.DEFAULT_INSTANCE.createBuilder();
    }
    public static MemojiResultSingleFace$Builder newBuilder(MemojiResultSingleFace p0){
       return MemojiResultSingleFace.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MemojiResultSingleFace parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResultSingleFace parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResultSingleFace parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResultSingleFace parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResultSingleFace parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResultSingleFace parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResultSingleFace parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResultSingleFace parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResultSingleFace parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResultSingleFace parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static MemojiResultSingleFace parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0);
    }
    public static MemojiResultSingleFace parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(MemojiResultSingleFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return MemojiResultSingleFace.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearHint(){
       this.hint_ = 0;
    }
    public void clearResultJson(){
       this.resultJson_ = MemojiResultSingleFace.getDefaultInstance().getResultJson();
    }
    public void clearSuccess(){
       this.success_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (MemojiResultSingleFace$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new MemojiResultSingleFace();
           case 2:
             return new MemojiResultSingleFace$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"success_","hint_","resultJson_"};
             return GeneratedMessageLite.newMessageInfo(MemojiResultSingleFace.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\f\x03\x02\x02\x00", objArray);
           case 4:
             return MemojiResultSingleFace.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MemojiResultSingleFace.PARSER;
             if (pARSER == null) {
                _monitor_enter(MemojiResultSingleFace.class);
                pARSER = MemojiResultSingleFace.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MemojiResultSingleFace.DEFAULT_INSTANCE);
                   MemojiResultSingleFace.PARSER = pARSER;
                }
                _monitor_exit(MemojiResultSingleFace.class);
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
    public MemojiHint getHint(){
       MemojiHint memojiHint = MemojiHint.forNumber(this.hint_);
       if (memojiHint == null) {
          memojiHint = MemojiHint.UNRECOGNIZED;
       }
       return memojiHint;
    }
    public int getHintValue(){
       return this.hint_;
    }
    public String getResultJson(){
       return this.resultJson_;
    }
    public ByteString getResultJsonBytes(){
       return ByteString.copyFromUtf8(this.resultJson_);
    }
    public boolean getSuccess(){
       return this.success_;
    }
    public void setHint(MemojiHint p0){
       Objects.requireNonNull(p0);
       this.hint_ = p0.getNumber();
    }
    public void setHintValue(int p0){
       this.hint_ = p0;
    }
    public void setResultJson(String p0){
       Objects.requireNonNull(p0);
       this.resultJson_ = p0;
    }
    public void setResultJsonBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.resultJson_ = p0.toStringUtf8();
    }
    public void setSuccess(boolean p0){
       this.success_ = p0;
    }
}
