package com.kuaishou.edit.draft.Beauty$Item;
import com.kuaishou.edit.draft.Beauty$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.Beauty$Item$a;
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
import com.kuaishou.edit.draft.Beauty$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Beauty$Item$ID;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Beauty$Item extends GeneratedMessageLite implements Beauty$c	// class@001734
{
    public int id_;
    public boolean isAdjusted_;
    public String logName_;
    public float value_;
    public static final Beauty$Item DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Beauty$Item item = new Beauty$Item();
       Beauty$Item.DEFAULT_INSTANCE = item;
       GeneratedMessageLite.registerDefaultInstance(Beauty$Item.class, item);
    }
    public void Beauty$Item(){
       super();
       this.logName_ = "";
    }
    public static Beauty$Item getDefaultInstance(){
       return Beauty$Item.DEFAULT_INSTANCE;
    }
    public static Beauty$Item$a newBuilder(){
       return Beauty$Item.DEFAULT_INSTANCE.createBuilder();
    }
    public static Beauty$Item$a newBuilder(Beauty$Item p0){
       return Beauty$Item.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Beauty$Item parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Beauty$Item.DEFAULT_INSTANCE, p0);
    }
    public static Beauty$Item parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Beauty$Item.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty$Item parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0);
    }
    public static Beauty$Item parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty$Item parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0);
    }
    public static Beauty$Item parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty$Item parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0);
    }
    public static Beauty$Item parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty$Item parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0);
    }
    public static Beauty$Item parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty$Item parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0);
    }
    public static Beauty$Item parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty$Item.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Beauty$Item.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearId(){
       this.id_ = 0;
    }
    public void clearIsAdjusted(){
       this.isAdjusted_ = false;
    }
    public void clearLogName(){
       this.logName_ = Beauty$Item.getDefaultInstance().getLogName();
    }
    public void clearValue(){
       this.value_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Beauty$a.a[p0.ordinal()]){
           case 1:
             return new Beauty$Item();
           case 2:
             return new Beauty$Item$a(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","value_","isAdjusted_","logName_"};
             return GeneratedMessageLite.newMessageInfo(Beauty$Item.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x01\x03\x07\x04\x02\x02\x00", objArray);
           case 4:
             return Beauty$Item.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Beauty$Item.PARSER;
             if (pARSER == null) {
                _monitor_enter(Beauty$Item.class);
                pARSER = Beauty$Item.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Beauty$Item.DEFAULT_INSTANCE);
                   Beauty$Item.PARSER = pARSER;
                }
                _monitor_exit(Beauty$Item.class);
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
    public Beauty$Item$ID getId(){
       Beauty$Item$ID item$ID = Beauty$Item$ID.forNumber(this.id_);
       if (item$ID == null) {
          item$ID = Beauty$Item$ID.UNRECOGNIZED;
       }
       return item$ID;
    }
    public int getIdValue(){
       return this.id_;
    }
    public boolean getIsAdjusted(){
       return this.isAdjusted_;
    }
    public String getLogName(){
       return this.logName_;
    }
    public ByteString getLogNameBytes(){
       return ByteString.copyFromUtf8(this.logName_);
    }
    public float getValue(){
       return this.value_;
    }
    public void setId(Beauty$Item$ID p0){
       Objects.requireNonNull(p0);
       this.id_ = p0.getNumber();
    }
    public void setIdValue(int p0){
       this.id_ = p0;
    }
    public void setIsAdjusted(boolean p0){
       this.isAdjusted_ = p0;
    }
    public void setLogName(String p0){
       Objects.requireNonNull(p0);
       this.logName_ = p0;
    }
    public void setLogNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.logName_ = p0.toStringUtf8();
    }
    public void setValue(float p0){
       this.value_ = p0;
    }
}
