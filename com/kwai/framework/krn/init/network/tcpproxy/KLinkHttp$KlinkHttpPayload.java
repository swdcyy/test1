package com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload;
import com.kwai.framework.krn.init.network.tcpproxy.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.ByteString;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import z86.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method;

public final class KLinkHttp$KlinkHttpPayload extends GeneratedMessageLite implements a	// class@0015f4
{
    public ByteString httpBody_;
    public int httpCode_;
    public Internal$ProtobufList httpHeaderKeys_;
    public Internal$ProtobufList httpHeaderValues_;
    public String httpUrl_;
    public int method_;
    public static final KLinkHttp$KlinkHttpPayload DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       KLinkHttp$KlinkHttpPayload klinkHttpPay = new KLinkHttp$KlinkHttpPayload();
       KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE = klinkHttpPay;
       GeneratedMessageLite.registerDefaultInstance(KLinkHttp$KlinkHttpPayload.class, klinkHttpPay);
    }
    public void KLinkHttp$KlinkHttpPayload(){
       super();
       this.httpUrl_ = "";
       this.httpHeaderKeys_ = GeneratedMessageLite.emptyProtobufList();
       this.httpHeaderValues_ = GeneratedMessageLite.emptyProtobufList();
       this.httpBody_ = ByteString.EMPTY;
    }
    public static KLinkHttp$KlinkHttpPayload getDefaultInstance(){
       return KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE;
    }
    public static KLinkHttp$KlinkHttpPayload$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, KLinkHttp$KlinkHttpPayload.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE.createBuilder();
    }
    public static KLinkHttp$KlinkHttpPayload$a newBuilder(KLinkHttp$KlinkHttpPayload p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static KLinkHttp$KlinkHttpPayload parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0);
    }
    public static KLinkHttp$KlinkHttpPayload parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KLinkHttp$KlinkHttpPayload.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0, p1);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KLinkHttp$KlinkHttpPayload.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0, p1);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KLinkHttp$KlinkHttpPayload.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0, p1);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KLinkHttp$KlinkHttpPayload.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0, p1);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KLinkHttp$KlinkHttpPayload.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0, p1);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0);
    }
    public static KLinkHttp$KlinkHttpPayload parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KLinkHttp$KlinkHttpPayload.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, KLinkHttp$KlinkHttpPayload.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllHttpHeaderKeys(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "11")) {
          return;
       }
       this.ensureHttpHeaderKeysIsMutable();
       AbstractMessageLite.addAll(p0, this.httpHeaderKeys_);
       return;
    }
    public void addAllHttpHeaderValues(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "20")) {
          return;
       }
       this.ensureHttpHeaderValuesIsMutable();
       AbstractMessageLite.addAll(p0, this.httpHeaderValues_);
       return;
    }
    public void addHttpHeaderKeys(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureHttpHeaderKeysIsMutable();
       this.httpHeaderKeys_.add(p0);
       return;
    }
    public void addHttpHeaderKeysBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "13")) {
          return;
       }
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureHttpHeaderKeysIsMutable();
       this.httpHeaderKeys_.add(p0.toStringUtf8());
       return;
    }
    public void addHttpHeaderValues(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "19")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureHttpHeaderValuesIsMutable();
       this.httpHeaderValues_.add(p0);
       return;
    }
    public void addHttpHeaderValuesBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "22")) {
          return;
       }
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureHttpHeaderValuesIsMutable();
       this.httpHeaderValues_.add(p0.toStringUtf8());
       return;
    }
    public void clearHttpBody(){
       if (PatchProxy.applyVoid(null, this, KLinkHttp$KlinkHttpPayload.class, "24")) {
          return;
       }
       this.httpBody_ = KLinkHttp$KlinkHttpPayload.getDefaultInstance().getHttpBody();
       return;
    }
    public void clearHttpCode(){
       this.httpCode_ = 0;
    }
    public void clearHttpHeaderKeys(){
       if (PatchProxy.applyVoid(null, this, KLinkHttp$KlinkHttpPayload.class, "12")) {
          return;
       }
       this.httpHeaderKeys_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearHttpHeaderValues(){
       if (PatchProxy.applyVoid(null, this, KLinkHttp$KlinkHttpPayload.class, "21")) {
          return;
       }
       this.httpHeaderValues_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearHttpUrl(){
       if (PatchProxy.applyVoid(null, this, KLinkHttp$KlinkHttpPayload.class, "3")) {
          return;
       }
       this.httpUrl_ = KLinkHttp$KlinkHttpPayload.getDefaultInstance().getHttpUrl();
       return;
    }
    public void clearMethod(){
       this.method_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KLinkHttp$KlinkHttpPayload.class, "41");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new KLinkHttp$KlinkHttpPayload();
           case 2:
             return new KLinkHttp$KlinkHttpPayload$a(p2);
           case 3:
             Object[] objArray = new Object[]{"httpUrl_","httpHeaderKeys_","httpHeaderValues_","httpBody_","method_","httpCode_"};
             return GeneratedMessageLite.newMessageInfo(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\n\x05\f\x06\x04\x00", objArray);
           case 4:
             return KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = KLinkHttp$KlinkHttpPayload.PARSER;
             if (pARSER == null) {
                _monitor_enter(KLinkHttp$KlinkHttpPayload.class);
                pARSER = KLinkHttp$KlinkHttpPayload.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE);
                   KLinkHttp$KlinkHttpPayload.PARSER = pARSER;
                }
                _monitor_exit(KLinkHttp$KlinkHttpPayload.class);
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
    public final void ensureHttpHeaderKeysIsMutable(){
       if (PatchProxy.applyVoid(null, this, KLinkHttp$KlinkHttpPayload.class, "8")) {
          return;
       }
       KLinkHttp$KlinkHttpPayload thttpHeaderK = this.httpHeaderKeys_;
       if (!thttpHeaderK.isModifiable()) {
          this.httpHeaderKeys_ = GeneratedMessageLite.mutableCopy(thttpHeaderK);
       }
       return;
    }
    public final void ensureHttpHeaderValuesIsMutable(){
       if (PatchProxy.applyVoid(null, this, KLinkHttp$KlinkHttpPayload.class, "17")) {
          return;
       }
       KLinkHttp$KlinkHttpPayload thttpHeaderV = this.httpHeaderValues_;
       if (!thttpHeaderV.isModifiable()) {
          this.httpHeaderValues_ = GeneratedMessageLite.mutableCopy(thttpHeaderV);
       }
       return;
    }
    public ByteString getHttpBody(){
       return this.httpBody_;
    }
    public int getHttpCode(){
       return this.httpCode_;
    }
    public String getHttpHeaderKeys(int p0){
       KLinkHttp$KlinkHttpPayload klinkHttpPay = KLinkHttp$KlinkHttpPayload.class;
       if (PatchProxy.isSupport(klinkHttpPay)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, klinkHttpPay, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.httpHeaderKeys_.get(p0);
    }
    public ByteString getHttpHeaderKeysBytes(int p0){
       KLinkHttp$KlinkHttpPayload klinkHttpPay = KLinkHttp$KlinkHttpPayload.class;
       if (PatchProxy.isSupport(klinkHttpPay)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, klinkHttpPay, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ByteString.copyFromUtf8(this.httpHeaderKeys_.get(p0));
    }
    public int getHttpHeaderKeysCount(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.httpHeaderKeys_.size();
    }
    public List getHttpHeaderKeysList(){
       return this.httpHeaderKeys_;
    }
    public String getHttpHeaderValues(int p0){
       KLinkHttp$KlinkHttpPayload klinkHttpPay = KLinkHttp$KlinkHttpPayload.class;
       if (PatchProxy.isSupport(klinkHttpPay)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, klinkHttpPay, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.httpHeaderValues_.get(p0);
    }
    public ByteString getHttpHeaderValuesBytes(int p0){
       KLinkHttp$KlinkHttpPayload klinkHttpPay = KLinkHttp$KlinkHttpPayload.class;
       if (PatchProxy.isSupport(klinkHttpPay)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, klinkHttpPay, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ByteString.copyFromUtf8(this.httpHeaderValues_.get(p0));
    }
    public int getHttpHeaderValuesCount(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.httpHeaderValues_.size();
    }
    public List getHttpHeaderValuesList(){
       return this.httpHeaderValues_;
    }
    public String getHttpUrl(){
       return this.httpUrl_;
    }
    public ByteString getHttpUrlBytes(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.httpUrl_);
    }
    public KLinkHttp$KlinkHttpPayload$Method getMethod(){
       KLinkHttp$KlinkHttpPayload$Method obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KLinkHttp$KlinkHttpPayload$Method.forNumber(this.method_);
       if (obj == null) {
          obj = KLinkHttp$KlinkHttpPayload$Method.UNRECOGNIZED;
       }
       return obj;
    }
    public int getMethodValue(){
       return this.method_;
    }
    public void setHttpBody(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "23")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.httpBody_ = p0;
       return;
    }
    public void setHttpCode(int p0){
       this.httpCode_ = p0;
    }
    public void setHttpHeaderKeys(int p0,String p1){
       KLinkHttp$KlinkHttpPayload klinkHttpPay = KLinkHttp$KlinkHttpPayload.class;
       if (PatchProxy.isSupport(klinkHttpPay) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, klinkHttpPay, "9")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureHttpHeaderKeysIsMutable();
       this.httpHeaderKeys_.set(p0, p1);
       return;
    }
    public void setHttpHeaderValues(int p0,String p1){
       KLinkHttp$KlinkHttpPayload klinkHttpPay = KLinkHttp$KlinkHttpPayload.class;
       if (PatchProxy.isSupport(klinkHttpPay) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, klinkHttpPay, "18")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureHttpHeaderValuesIsMutable();
       this.httpHeaderValues_.set(p0, p1);
       return;
    }
    public void setHttpUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.httpUrl_ = p0;
       return;
    }
    public void setHttpUrlBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "4")) {
          return;
       }
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.httpUrl_ = p0.toStringUtf8();
       return;
    }
    public void setMethod(KLinkHttp$KlinkHttpPayload$Method p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KLinkHttp$KlinkHttpPayload.class, "26")) {
          return;
       }
       this.method_ = p0.getNumber();
       return;
    }
    public void setMethodValue(int p0){
       this.method_ = p0;
    }
}
