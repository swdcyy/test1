package com.kuaishou.protobuf.photo.funnel.EncodeStat;
import com.kuaishou.protobuf.photo.funnel.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status;
import java.util.Objects;

public final class EncodeStat extends GeneratedMessageLite implements c	// class@000e1b
{
    public long encodeCost_;
    public long startTimeStamp_;
    public int status_;
    public static final EncodeStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EncodeStat uEncodeStat = new EncodeStat();
       EncodeStat.DEFAULT_INSTANCE = uEncodeStat;
       GeneratedMessageLite.registerDefaultInstance(EncodeStat.class, uEncodeStat);
    }
    public void EncodeStat(){
       super();
    }
    public static EncodeStat getDefaultInstance(){
       return EncodeStat.DEFAULT_INSTANCE;
    }
    public static EncodeStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, EncodeStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EncodeStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static EncodeStat$b newBuilder(EncodeStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EncodeStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EncodeStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(EncodeStat.DEFAULT_INSTANCE, p0);
    }
    public static EncodeStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EncodeStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(EncodeStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static EncodeStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0);
    }
    public static EncodeStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EncodeStat.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static EncodeStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0);
    }
    public static EncodeStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EncodeStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static EncodeStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0);
    }
    public static EncodeStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EncodeStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static EncodeStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0);
    }
    public static EncodeStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EncodeStat.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static EncodeStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0);
    }
    public static EncodeStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EncodeStat.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(EncodeStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, EncodeStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EncodeStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearEncodeCost(){
       this.encodeCost_ = 0;
    }
    public void clearStartTimeStamp(){
       this.startTimeStamp_ = 0;
    }
    public void clearStatus(){
       this.status_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EncodeStat.class, "17");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (EncodeStat$a.a[p0.ordinal()]){
           case 1:
             return new EncodeStat();
           case 2:
             return new EncodeStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"startTimeStamp_","encodeCost_","status_"};
             return GeneratedMessageLite.newMessageInfo(EncodeStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x03\f\x00", objArray);
           case 4:
             return EncodeStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EncodeStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(EncodeStat.class);
                pARSER = EncodeStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EncodeStat.DEFAULT_INSTANCE);
                   EncodeStat.PARSER = pARSER;
                }
                _monitor_exit(EncodeStat.class);
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
    public long getEncodeCost(){
       return this.encodeCost_;
    }
    public long getStartTimeStamp(){
       return this.startTimeStamp_;
    }
    public EncodeStat$Status getStatus(){
       EncodeStat$Status obj = PatchProxy.apply(null, this, EncodeStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = EncodeStat$Status.forNumber(this.status_);
       if (obj == null) {
          obj = EncodeStat$Status.UNRECOGNIZED;
       }
       return obj;
    }
    public int getStatusValue(){
       return this.status_;
    }
    public void setEncodeCost(long p0){
       this.encodeCost_ = p0;
    }
    public void setStartTimeStamp(long p0){
       this.startTimeStamp_ = p0;
    }
    public void setStatus(EncodeStat$Status p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.status_ = p0.getNumber();
       return;
    }
    public void setStatusValue(int p0){
       this.status_ = p0;
    }
}
