package com.kwai.video.westeros.models.TriggerInputTextGroupConfig;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig$Builder;
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
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class TriggerInputTextGroupConfig extends GeneratedMessageLite implements TriggerInputTextGroupConfigOrBuilder	// class@00106c
{
    public int defaultGroup_;
    public int groupMemberNum_;
    public String groupName_;
    public int maxGroup_;
    public int minGroup_;
    public static final TriggerInputTextGroupConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TriggerInputTextGroupConfig triggerInput = new TriggerInputTextGroupConfig();
       TriggerInputTextGroupConfig.DEFAULT_INSTANCE = triggerInput;
       GeneratedMessageLite.registerDefaultInstance(TriggerInputTextGroupConfig.class, triggerInput);
    }
    public void TriggerInputTextGroupConfig(){
       super();
       this.groupName_ = "";
    }
    public static TriggerInputTextGroupConfig getDefaultInstance(){
       return TriggerInputTextGroupConfig.DEFAULT_INSTANCE;
    }
    public static TriggerInputTextGroupConfig$Builder newBuilder(){
       return TriggerInputTextGroupConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static TriggerInputTextGroupConfig$Builder newBuilder(TriggerInputTextGroupConfig p0){
       return TriggerInputTextGroupConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TriggerInputTextGroupConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextGroupConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextGroupConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextGroupConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextGroupConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextGroupConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextGroupConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextGroupConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextGroupConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextGroupConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static TriggerInputTextGroupConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0);
    }
    public static TriggerInputTextGroupConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return TriggerInputTextGroupConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDefaultGroup(){
       this.defaultGroup_ = 0;
    }
    public void clearGroupMemberNum(){
       this.groupMemberNum_ = 0;
    }
    public void clearGroupName(){
       this.groupName_ = TriggerInputTextGroupConfig.getDefaultInstance().getGroupName();
    }
    public void clearMaxGroup(){
       this.maxGroup_ = 0;
    }
    public void clearMinGroup(){
       this.minGroup_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (TriggerInputTextGroupConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new TriggerInputTextGroupConfig();
           case 2:
             return new TriggerInputTextGroupConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"groupMemberNum_","minGroup_","maxGroup_","defaultGroup_","groupName_"};
             return GeneratedMessageLite.newMessageInfo(TriggerInputTextGroupConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\x04\x04\x04\x05\x02\x02\x00", objArray);
           case 4:
             return TriggerInputTextGroupConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TriggerInputTextGroupConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(TriggerInputTextGroupConfig.class);
                pARSER = TriggerInputTextGroupConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TriggerInputTextGroupConfig.DEFAULT_INSTANCE);
                   TriggerInputTextGroupConfig.PARSER = pARSER;
                }
                _monitor_exit(TriggerInputTextGroupConfig.class);
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
    public int getDefaultGroup(){
       return this.defaultGroup_;
    }
    public int getGroupMemberNum(){
       return this.groupMemberNum_;
    }
    public String getGroupName(){
       return this.groupName_;
    }
    public ByteString getGroupNameBytes(){
       return ByteString.copyFromUtf8(this.groupName_);
    }
    public int getMaxGroup(){
       return this.maxGroup_;
    }
    public int getMinGroup(){
       return this.minGroup_;
    }
    public void setDefaultGroup(int p0){
       this.defaultGroup_ = p0;
    }
    public void setGroupMemberNum(int p0){
       this.groupMemberNum_ = p0;
    }
    public void setGroupName(String p0){
       Objects.requireNonNull(p0);
       this.groupName_ = p0;
    }
    public void setGroupNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.groupName_ = p0.toStringUtf8();
    }
    public void setMaxGroup(int p0){
       this.maxGroup_ = p0;
    }
    public void setMinGroup(int p0){
       this.minGroup_ = p0;
    }
}
