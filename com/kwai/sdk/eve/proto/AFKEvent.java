package com.kwai.sdk.eve.proto.AFKEvent;
import com.kwai.sdk.eve.proto.AFKEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.sdk.eve.proto.AFKEvent$Builder;
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
import com.kwai.sdk.eve.proto.AFKEvent$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.sdk.eve.proto.AFKEvent$Action;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class AFKEvent extends GeneratedMessageLite implements AFKEventOrBuilder	// class@0015d9
{
    public int action_;
    public String date_;
    public long duration_;
    public String level_;
    public String page_;
    public String sessionId_;
    public long timestamp_;
    public static final AFKEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AFKEvent uAFKEvent = new AFKEvent();
       AFKEvent.DEFAULT_INSTANCE = uAFKEvent;
       GeneratedMessageLite.registerDefaultInstance(AFKEvent.class, uAFKEvent);
    }
    public void AFKEvent(){
       super();
       this.date_ = "";
       this.sessionId_ = "";
       this.level_ = "";
       this.page_ = "";
    }
    public static AFKEvent getDefaultInstance(){
       return AFKEvent.DEFAULT_INSTANCE;
    }
    public static AFKEvent$Builder newBuilder(){
       return AFKEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static AFKEvent$Builder newBuilder(AFKEvent p0){
       return AFKEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AFKEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AFKEvent.DEFAULT_INSTANCE, p0);
    }
    public static AFKEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AFKEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AFKEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0);
    }
    public static AFKEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AFKEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0);
    }
    public static AFKEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AFKEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0);
    }
    public static AFKEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AFKEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0);
    }
    public static AFKEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static AFKEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0);
    }
    public static AFKEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AFKEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AFKEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAction(){
       this.action_ = 0;
    }
    public void clearDate(){
       this.date_ = AFKEvent.getDefaultInstance().getDate();
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearLevel(){
       this.level_ = AFKEvent.getDefaultInstance().getLevel();
    }
    public void clearPage(){
       this.page_ = AFKEvent.getDefaultInstance().getPage();
    }
    public void clearSessionId(){
       this.sessionId_ = AFKEvent.getDefaultInstance().getSessionId();
    }
    public void clearTimestamp(){
       this.timestamp_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AFKEvent$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new AFKEvent();
           case 2:
             return new AFKEvent$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"action_","timestamp_","duration_","date_","sessionId_","level_","page_"};
             return GeneratedMessageLite.newMessageInfo(AFKEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x03\x03\x03\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\x00", objArray);
           case 4:
             return AFKEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AFKEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(AFKEvent.class);
                pARSER = AFKEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AFKEvent.DEFAULT_INSTANCE);
                   AFKEvent.PARSER = pARSER;
                }
                _monitor_exit(AFKEvent.class);
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
    public AFKEvent$Action getAction(){
       AFKEvent$Action uAction = AFKEvent$Action.forNumber(this.action_);
       if (uAction == null) {
          uAction = AFKEvent$Action.UNRECOGNIZED;
       }
       return uAction;
    }
    public int getActionValue(){
       return this.action_;
    }
    public String getDate(){
       return this.date_;
    }
    public ByteString getDateBytes(){
       return ByteString.copyFromUtf8(this.date_);
    }
    public long getDuration(){
       return this.duration_;
    }
    public String getLevel(){
       return this.level_;
    }
    public ByteString getLevelBytes(){
       return ByteString.copyFromUtf8(this.level_);
    }
    public String getPage(){
       return this.page_;
    }
    public ByteString getPageBytes(){
       return ByteString.copyFromUtf8(this.page_);
    }
    public String getSessionId(){
       return this.sessionId_;
    }
    public ByteString getSessionIdBytes(){
       return ByteString.copyFromUtf8(this.sessionId_);
    }
    public long getTimestamp(){
       return this.timestamp_;
    }
    public void setAction(AFKEvent$Action p0){
       Objects.requireNonNull(p0);
       this.action_ = p0.getNumber();
    }
    public void setActionValue(int p0){
       this.action_ = p0;
    }
    public void setDate(String p0){
       Objects.requireNonNull(p0);
       this.date_ = p0;
    }
    public void setDateBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.date_ = p0.toStringUtf8();
    }
    public void setDuration(long p0){
       this.duration_ = p0;
    }
    public void setLevel(String p0){
       Objects.requireNonNull(p0);
       this.level_ = p0;
    }
    public void setLevelBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.level_ = p0.toStringUtf8();
    }
    public void setPage(String p0){
       Objects.requireNonNull(p0);
       this.page_ = p0;
    }
    public void setPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.page_ = p0.toStringUtf8();
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
    public void setTimestamp(long p0){
       this.timestamp_ = p0;
    }
}
