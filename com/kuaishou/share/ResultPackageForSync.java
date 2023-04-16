package com.kuaishou.share.ResultPackageForSync;
import com.kuaishou.share.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.share.ResultPackageForSync$b;
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
import com.kuaishou.share.ResultPackageForSync$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent;
import java.util.Objects;
import com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent$a;
import com.google.protobuf.AbstractMessageLite;

public final class ResultPackageForSync extends GeneratedMessageLite implements b	// class@000f29
{
    public long clientIncrementId_;
    public long clientTimestamp_;
    public ResultPackageForSync$InternalCustomProtoEvent customProtoEvent_;
    public long serverTimestamp_;
    public String sessionId_;
    public static final ResultPackageForSync DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ResultPackageForSync resultPackag = new ResultPackageForSync();
       ResultPackageForSync.DEFAULT_INSTANCE = resultPackag;
       GeneratedMessageLite.registerDefaultInstance(ResultPackageForSync.class, resultPackag);
    }
    public void ResultPackageForSync(){
       super();
       this.sessionId_ = "";
    }
    public static ResultPackageForSync getDefaultInstance(){
       return ResultPackageForSync.DEFAULT_INSTANCE;
    }
    public static ResultPackageForSync$b newBuilder(){
       return ResultPackageForSync.DEFAULT_INSTANCE.createBuilder();
    }
    public static ResultPackageForSync$b newBuilder(ResultPackageForSync p0){
       return ResultPackageForSync.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ResultPackageForSync parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackageForSync parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackageForSync parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackageForSync.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ResultPackageForSync.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearClientIncrementId(){
       this.clientIncrementId_ = 0;
    }
    public void clearClientTimestamp(){
       this.clientTimestamp_ = 0;
    }
    public void clearCustomProtoEvent(){
       this.customProtoEvent_ = null;
    }
    public void clearServerTimestamp(){
       this.serverTimestamp_ = 0;
    }
    public void clearSessionId(){
       this.sessionId_ = ResultPackageForSync.getDefaultInstance().getSessionId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ResultPackageForSync$a.a[p0.ordinal()]){
           case 1:
             return new ResultPackageForSync();
           case 2:
             return new ResultPackageForSync$b(p2);
           case 3:
             Object[] objArray = new Object[]{"customProtoEvent_","serverTimestamp_","clientTimestamp_","clientIncrementId_","sessionId_"};
             return GeneratedMessageLite.newMessageInfo(ResultPackageForSync.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x02\x07\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02\t\x04\x03\x05\x03\x06\x03\x07\x02\x02\x00", objArray);
           case 4:
             return ResultPackageForSync.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ResultPackageForSync.PARSER;
             if (pARSER == null) {
                _monitor_enter(ResultPackageForSync.class);
                pARSER = ResultPackageForSync.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ResultPackageForSync.DEFAULT_INSTANCE);
                   ResultPackageForSync.PARSER = pARSER;
                }
                _monitor_exit(ResultPackageForSync.class);
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
    public long getClientIncrementId(){
       return this.clientIncrementId_;
    }
    public long getClientTimestamp(){
       return this.clientTimestamp_;
    }
    public ResultPackageForSync$InternalCustomProtoEvent getCustomProtoEvent(){
       ResultPackageForSync tcustomProto = this.customProtoEvent_;
       if (tcustomProto == null) {
          tcustomProto = ResultPackageForSync$InternalCustomProtoEvent.getDefaultInstance();
       }
       return tcustomProto;
    }
    public long getServerTimestamp(){
       return this.serverTimestamp_;
    }
    public String getSessionId(){
       return this.sessionId_;
    }
    public ByteString getSessionIdBytes(){
       return ByteString.copyFromUtf8(this.sessionId_);
    }
    public boolean hasCustomProtoEvent(){
       boolean b = (this.customProtoEvent_ != null)? true: false;
       return b;
    }
    public void mergeCustomProtoEvent(ResultPackageForSync$InternalCustomProtoEvent p0){
       Objects.requireNonNull(p0);
       ResultPackageForSync tcustomProto = this.customProtoEvent_;
       this.customProtoEvent_ = (tcustomProto != null && tcustomProto != ResultPackageForSync$InternalCustomProtoEvent.getDefaultInstance())? ResultPackageForSync$InternalCustomProtoEvent.newBuilder(this.customProtoEvent_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setClientIncrementId(long p0){
       this.clientIncrementId_ = p0;
    }
    public void setClientTimestamp(long p0){
       this.clientTimestamp_ = p0;
    }
    public void setCustomProtoEvent(ResultPackageForSync$InternalCustomProtoEvent$a p0){
       this.customProtoEvent_ = p0.build();
    }
    public void setCustomProtoEvent(ResultPackageForSync$InternalCustomProtoEvent p0){
       Objects.requireNonNull(p0);
       this.customProtoEvent_ = p0;
    }
    public void setServerTimestamp(long p0){
       this.serverTimestamp_ = p0;
    }
    public void setSessionId(String p0){
       Objects.requireNonNull(p0);
       this.sessionId_ = p0;
    }
    public void setSessionIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.sessionId_ = p0.toStringUtf8();
    }
}
