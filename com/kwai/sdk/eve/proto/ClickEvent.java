package com.kwai.sdk.eve.proto.ClickEvent;
import com.kwai.sdk.eve.proto.ClickEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.sdk.eve.proto.ClickEvent$Builder;
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
import com.kwai.sdk.eve.proto.ClickEvent$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.ImageType;
import com.kwai.sdk.eve.proto.ClickEvent$ClickType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ClickEvent extends GeneratedMessageLite implements ClickEventOrBuilder	// class@0015e0
{
    public String action_;
    public String authorId_;
    public String contentId_;
    public String contentParamField1_;
    public int contentType_;
    public String elementId_;
    public String elementParamField1_;
    public String expTag_;
    public int imageType_;
    public double latitude_;
    public String llsid_;
    public double longitude_;
    public String page_;
    public int position_;
    public String referPage_;
    public String sessionId_;
    public long timestamp_;
    public int type_;
    public String urlParamField1_;
    public String urlParamField2_;
    public static final ClickEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ClickEvent uClickEvent = new ClickEvent();
       ClickEvent.DEFAULT_INSTANCE = uClickEvent;
       GeneratedMessageLite.registerDefaultInstance(ClickEvent.class, uClickEvent);
    }
    public void ClickEvent(){
       super();
       this.contentId_ = "";
       this.authorId_ = "";
       this.expTag_ = "";
       this.action_ = "";
       this.page_ = "";
       this.referPage_ = "";
       this.elementId_ = "";
       this.llsid_ = "";
       this.sessionId_ = "";
       this.urlParamField1_ = "";
       this.urlParamField2_ = "";
       this.elementParamField1_ = "";
       this.contentParamField1_ = "";
    }
    public static ClickEvent getDefaultInstance(){
       return ClickEvent.DEFAULT_INSTANCE;
    }
    public static ClickEvent$Builder newBuilder(){
       return ClickEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static ClickEvent$Builder newBuilder(ClickEvent p0){
       return ClickEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ClickEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ClickEvent.DEFAULT_INSTANCE, p0);
    }
    public static ClickEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ClickEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClickEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0);
    }
    public static ClickEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClickEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0);
    }
    public static ClickEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClickEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0);
    }
    public static ClickEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClickEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0);
    }
    public static ClickEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClickEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0);
    }
    public static ClickEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClickEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ClickEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAction(){
       this.action_ = ClickEvent.getDefaultInstance().getAction();
    }
    public void clearAuthorId(){
       this.authorId_ = ClickEvent.getDefaultInstance().getAuthorId();
    }
    public void clearContentId(){
       this.contentId_ = ClickEvent.getDefaultInstance().getContentId();
    }
    public void clearContentParamField1(){
       this.contentParamField1_ = ClickEvent.getDefaultInstance().getContentParamField1();
    }
    public void clearContentType(){
       this.contentType_ = 0;
    }
    public void clearElementId(){
       this.elementId_ = ClickEvent.getDefaultInstance().getElementId();
    }
    public void clearElementParamField1(){
       this.elementParamField1_ = ClickEvent.getDefaultInstance().getElementParamField1();
    }
    public void clearExpTag(){
       this.expTag_ = ClickEvent.getDefaultInstance().getExpTag();
    }
    public void clearImageType(){
       this.imageType_ = 0;
    }
    public void clearLatitude(){
       this.latitude_ = 0;
    }
    public void clearLlsid(){
       this.llsid_ = ClickEvent.getDefaultInstance().getLlsid();
    }
    public void clearLongitude(){
       this.longitude_ = 0;
    }
    public void clearPage(){
       this.page_ = ClickEvent.getDefaultInstance().getPage();
    }
    public void clearPosition(){
       this.position_ = 0;
    }
    public void clearReferPage(){
       this.referPage_ = ClickEvent.getDefaultInstance().getReferPage();
    }
    public void clearSessionId(){
       this.sessionId_ = ClickEvent.getDefaultInstance().getSessionId();
    }
    public void clearTimestamp(){
       this.timestamp_ = 0;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearUrlParamField1(){
       this.urlParamField1_ = ClickEvent.getDefaultInstance().getUrlParamField1();
    }
    public void clearUrlParamField2(){
       this.urlParamField2_ = ClickEvent.getDefaultInstance().getUrlParamField2();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ClickEvent$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ClickEvent();
           case 2:
             return new ClickEvent$Builder(p2);
           case 3:
             Object[] objArray = new Object[20];
             objArray[0] = "contentId_";
             objArray[i] = "contentType_";
             objArray[2] = "timestamp_";
             objArray[3] = "authorId_";
             objArray[4] = "expTag_";
             objArray[5] = "type_";
             objArray[6] = "action_";
             objArray[7] = "position_";
             objArray[8] = "page_";
             objArray[9] = "referPage_";
             objArray[10] = "elementId_";
             objArray[11] = "llsid_";
             objArray[12] = "sessionId_";
             objArray[13] = "imageType_";
             objArray[14] = "latitude_";
             objArray[15] = "longitude_";
             objArray[16] = "urlParamField1_";
             objArray[17] = "urlParamField2_";
             objArray[18] = "elementParamField1_";
             objArray[19] = "contentParamField1_";
             return GeneratedMessageLite.newMessageInfo(ClickEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x14\xff\x02\xff\x02\xff\x02\xff\x02\x01e\x14\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x03\x04\x02\x02\x05\x02\x02\x06\f\x07\x02\x02\b\x0b\t\x02\x02\n\x02\x02\x0b\x02\x02\f\x02\x02\r\x02\x023\fG\xff\x02\xff\x02H\xff\x02\xff\x02Q\x02\x02R\x02\x02[\x02\x02e\x02\x02\x00", objArray);
           case 4:
             return ClickEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ClickEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(ClickEvent.class);
                pARSER = ClickEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ClickEvent.DEFAULT_INSTANCE);
                   ClickEvent.PARSER = pARSER;
                }
                _monitor_exit(ClickEvent.class);
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
    public String getAction(){
       return this.action_;
    }
    public ByteString getActionBytes(){
       return ByteString.copyFromUtf8(this.action_);
    }
    public String getAuthorId(){
       return this.authorId_;
    }
    public ByteString getAuthorIdBytes(){
       return ByteString.copyFromUtf8(this.authorId_);
    }
    public String getContentId(){
       return this.contentId_;
    }
    public ByteString getContentIdBytes(){
       return ByteString.copyFromUtf8(this.contentId_);
    }
    public String getContentParamField1(){
       return this.contentParamField1_;
    }
    public ByteString getContentParamField1Bytes(){
       return ByteString.copyFromUtf8(this.contentParamField1_);
    }
    public ContentType getContentType(){
       ContentType uContentType = ContentType.forNumber(this.contentType_);
       if (uContentType == null) {
          uContentType = ContentType.UNRECOGNIZED;
       }
       return uContentType;
    }
    public int getContentTypeValue(){
       return this.contentType_;
    }
    public String getElementId(){
       return this.elementId_;
    }
    public ByteString getElementIdBytes(){
       return ByteString.copyFromUtf8(this.elementId_);
    }
    public String getElementParamField1(){
       return this.elementParamField1_;
    }
    public ByteString getElementParamField1Bytes(){
       return ByteString.copyFromUtf8(this.elementParamField1_);
    }
    public String getExpTag(){
       return this.expTag_;
    }
    public ByteString getExpTagBytes(){
       return ByteString.copyFromUtf8(this.expTag_);
    }
    public ImageType getImageType(){
       ImageType imageType = ImageType.forNumber(this.imageType_);
       if (imageType == null) {
          imageType = ImageType.UNRECOGNIZED;
       }
       return imageType;
    }
    public int getImageTypeValue(){
       return this.imageType_;
    }
    public double getLatitude(){
       return this.latitude_;
    }
    public String getLlsid(){
       return this.llsid_;
    }
    public ByteString getLlsidBytes(){
       return ByteString.copyFromUtf8(this.llsid_);
    }
    public double getLongitude(){
       return this.longitude_;
    }
    public String getPage(){
       return this.page_;
    }
    public ByteString getPageBytes(){
       return ByteString.copyFromUtf8(this.page_);
    }
    public int getPosition(){
       return this.position_;
    }
    public String getReferPage(){
       return this.referPage_;
    }
    public ByteString getReferPageBytes(){
       return ByteString.copyFromUtf8(this.referPage_);
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
    public ClickEvent$ClickType getType(){
       ClickEvent$ClickType uClickType = ClickEvent$ClickType.forNumber(this.type_);
       if (uClickType == null) {
          uClickType = ClickEvent$ClickType.UNRECOGNIZED;
       }
       return uClickType;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public String getUrlParamField1(){
       return this.urlParamField1_;
    }
    public ByteString getUrlParamField1Bytes(){
       return ByteString.copyFromUtf8(this.urlParamField1_);
    }
    public String getUrlParamField2(){
       return this.urlParamField2_;
    }
    public ByteString getUrlParamField2Bytes(){
       return ByteString.copyFromUtf8(this.urlParamField2_);
    }
    public void setAction(String p0){
       Objects.requireNonNull(p0);
       this.action_ = p0;
    }
    public void setActionBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.action_ = p0.toStringUtf8();
    }
    public void setAuthorId(String p0){
       Objects.requireNonNull(p0);
       this.authorId_ = p0;
    }
    public void setAuthorIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.authorId_ = p0.toStringUtf8();
    }
    public void setContentId(String p0){
       Objects.requireNonNull(p0);
       this.contentId_ = p0;
    }
    public void setContentIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.contentId_ = p0.toStringUtf8();
    }
    public void setContentParamField1(String p0){
       Objects.requireNonNull(p0);
       this.contentParamField1_ = p0;
    }
    public void setContentParamField1Bytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.contentParamField1_ = p0.toStringUtf8();
    }
    public void setContentType(ContentType p0){
       Objects.requireNonNull(p0);
       this.contentType_ = p0.getNumber();
    }
    public void setContentTypeValue(int p0){
       this.contentType_ = p0;
    }
    public void setElementId(String p0){
       Objects.requireNonNull(p0);
       this.elementId_ = p0;
    }
    public void setElementIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.elementId_ = p0.toStringUtf8();
    }
    public void setElementParamField1(String p0){
       Objects.requireNonNull(p0);
       this.elementParamField1_ = p0;
    }
    public void setElementParamField1Bytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.elementParamField1_ = p0.toStringUtf8();
    }
    public void setExpTag(String p0){
       Objects.requireNonNull(p0);
       this.expTag_ = p0;
    }
    public void setExpTagBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.expTag_ = p0.toStringUtf8();
    }
    public void setImageType(ImageType p0){
       Objects.requireNonNull(p0);
       this.imageType_ = p0.getNumber();
    }
    public void setImageTypeValue(int p0){
       this.imageType_ = p0;
    }
    public void setLatitude(double p0){
       this.latitude_ = p0;
    }
    public void setLlsid(String p0){
       Objects.requireNonNull(p0);
       this.llsid_ = p0;
    }
    public void setLlsidBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.llsid_ = p0.toStringUtf8();
    }
    public void setLongitude(double p0){
       this.longitude_ = p0;
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
    public void setPosition(int p0){
       this.position_ = p0;
    }
    public void setReferPage(String p0){
       Objects.requireNonNull(p0);
       this.referPage_ = p0;
    }
    public void setReferPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.referPage_ = p0.toStringUtf8();
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
    public void setType(ClickEvent$ClickType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
    public void setUrlParamField1(String p0){
       Objects.requireNonNull(p0);
       this.urlParamField1_ = p0;
    }
    public void setUrlParamField1Bytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.urlParamField1_ = p0.toStringUtf8();
    }
    public void setUrlParamField2(String p0){
       Objects.requireNonNull(p0);
       this.urlParamField2_ = p0;
    }
    public void setUrlParamField2Bytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.urlParamField2_ = p0.toStringUtf8();
    }
}
