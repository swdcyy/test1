package com.kwai.sdk.eve.proto.PageEvent;
import com.kwai.sdk.eve.proto.PageEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.sdk.eve.proto.PageEvent$Builder;
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
import com.kwai.sdk.eve.proto.PageEvent$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.sdk.eve.proto.PageEvent$Action;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.PageEvent$SubAction;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class PageEvent extends GeneratedMessageLite implements PageEventOrBuilder	// class@0015f9
{
    public int action_;
    public String authorId_;
    public String contentId_;
    public String contentParamField1_;
    public int contentType_;
    public String entryPageId_;
    public String entryPageSource_;
    public String expTag_;
    public long foregroundTime_;
    public String identity_;
    public String lastPage_;
    public double latitude_;
    public String llsid_;
    public double longitude_;
    public int pageShowSeq_;
    public String page_;
    public int position_;
    public String referPage_;
    public String sessionId_;
    public int subAction_;
    public long timestamp_;
    public String urlParamField1_;
    public String urlParamField2_;
    public static final PageEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PageEvent pageEvent = new PageEvent();
       PageEvent.DEFAULT_INSTANCE = pageEvent;
       GeneratedMessageLite.registerDefaultInstance(PageEvent.class, pageEvent);
    }
    public void PageEvent(){
       super();
       this.page_ = "";
       this.identity_ = "";
       this.referPage_ = "";
       this.lastPage_ = "";
       this.entryPageId_ = "";
       this.entryPageSource_ = "";
       this.sessionId_ = "";
       this.contentId_ = "";
       this.authorId_ = "";
       this.expTag_ = "";
       this.llsid_ = "";
       this.urlParamField1_ = "";
       this.urlParamField2_ = "";
       this.contentParamField1_ = "";
    }
    public static PageEvent getDefaultInstance(){
       return PageEvent.DEFAULT_INSTANCE;
    }
    public static PageEvent$Builder newBuilder(){
       return PageEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static PageEvent$Builder newBuilder(PageEvent p0){
       return PageEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PageEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PageEvent.DEFAULT_INSTANCE, p0);
    }
    public static PageEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PageEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0);
    }
    public static PageEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0);
    }
    public static PageEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0);
    }
    public static PageEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0);
    }
    public static PageEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PageEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0);
    }
    public static PageEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PageEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PageEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAction(){
       this.action_ = 0;
    }
    public void clearAuthorId(){
       this.authorId_ = PageEvent.getDefaultInstance().getAuthorId();
    }
    public void clearContentId(){
       this.contentId_ = PageEvent.getDefaultInstance().getContentId();
    }
    public void clearContentParamField1(){
       this.contentParamField1_ = PageEvent.getDefaultInstance().getContentParamField1();
    }
    public void clearContentType(){
       this.contentType_ = 0;
    }
    public void clearEntryPageId(){
       this.entryPageId_ = PageEvent.getDefaultInstance().getEntryPageId();
    }
    public void clearEntryPageSource(){
       this.entryPageSource_ = PageEvent.getDefaultInstance().getEntryPageSource();
    }
    public void clearExpTag(){
       this.expTag_ = PageEvent.getDefaultInstance().getExpTag();
    }
    public void clearForegroundTime(){
       this.foregroundTime_ = 0;
    }
    public void clearIdentity(){
       this.identity_ = PageEvent.getDefaultInstance().getIdentity();
    }
    public void clearLastPage(){
       this.lastPage_ = PageEvent.getDefaultInstance().getLastPage();
    }
    public void clearLatitude(){
       this.latitude_ = 0;
    }
    public void clearLlsid(){
       this.llsid_ = PageEvent.getDefaultInstance().getLlsid();
    }
    public void clearLongitude(){
       this.longitude_ = 0;
    }
    public void clearPage(){
       this.page_ = PageEvent.getDefaultInstance().getPage();
    }
    public void clearPageShowSeq(){
       this.pageShowSeq_ = 0;
    }
    public void clearPosition(){
       this.position_ = 0;
    }
    public void clearReferPage(){
       this.referPage_ = PageEvent.getDefaultInstance().getReferPage();
    }
    public void clearSessionId(){
       this.sessionId_ = PageEvent.getDefaultInstance().getSessionId();
    }
    public void clearSubAction(){
       this.subAction_ = 0;
    }
    public void clearTimestamp(){
       this.timestamp_ = 0;
    }
    public void clearUrlParamField1(){
       this.urlParamField1_ = PageEvent.getDefaultInstance().getUrlParamField1();
    }
    public void clearUrlParamField2(){
       this.urlParamField2_ = PageEvent.getDefaultInstance().getUrlParamField2();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PageEvent$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PageEvent();
           case 2:
             return new PageEvent$Builder(p2);
           case 3:
             Object[] objArray = new Object[23];
             objArray[0] = "action_";
             objArray[i] = "subAction_";
             objArray[2] = "timestamp_";
             objArray[3] = "page_";
             objArray[4] = "identity_";
             objArray[5] = "referPage_";
             objArray[6] = "lastPage_";
             objArray[7] = "entryPageId_";
             objArray[8] = "entryPageSource_";
             objArray[9] = "foregroundTime_";
             objArray[10] = "pageShowSeq_";
             objArray[11] = "sessionId_";
             objArray[12] = "contentId_";
             objArray[13] = "contentType_";
             objArray[14] = "authorId_";
             objArray[15] = "expTag_";
             objArray[16] = "position_";
             objArray[17] = "llsid_";
             objArray[18] = "latitude_";
             objArray[19] = "longitude_";
             objArray[20] = "urlParamField1_";
             objArray[21] = "urlParamField2_";
             objArray[22] = "contentParamField1_";
             return GeneratedMessageLite.newMessageInfo(PageEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x17\xff\x02\xff\x02\xff\x02\xff\x02\x01e\x17\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\f\x03\x03\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x02\x02\t\x02\x02\n\x03\x0b\x04\f\x02\x02\r\x02\x02\x0e\f\x0f\x02\x02\x10\x02\x02\x11\x0b\x12\x02\x02G\xff\x02\xff\x02H\xff\x02\xff\x02Q\x02\x02R\x02\x02e\x02\x02\x00", objArray);
           case 4:
             return PageEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PageEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(PageEvent.class);
                pARSER = PageEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PageEvent.DEFAULT_INSTANCE);
                   PageEvent.PARSER = pARSER;
                }
                _monitor_exit(PageEvent.class);
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
    public PageEvent$Action getAction(){
       PageEvent$Action uAction = PageEvent$Action.forNumber(this.action_);
       if (uAction == null) {
          uAction = PageEvent$Action.UNRECOGNIZED;
       }
       return uAction;
    }
    public int getActionValue(){
       return this.action_;
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
    public String getEntryPageId(){
       return this.entryPageId_;
    }
    public ByteString getEntryPageIdBytes(){
       return ByteString.copyFromUtf8(this.entryPageId_);
    }
    public String getEntryPageSource(){
       return this.entryPageSource_;
    }
    public ByteString getEntryPageSourceBytes(){
       return ByteString.copyFromUtf8(this.entryPageSource_);
    }
    public String getExpTag(){
       return this.expTag_;
    }
    public ByteString getExpTagBytes(){
       return ByteString.copyFromUtf8(this.expTag_);
    }
    public long getForegroundTime(){
       return this.foregroundTime_;
    }
    public String getIdentity(){
       return this.identity_;
    }
    public ByteString getIdentityBytes(){
       return ByteString.copyFromUtf8(this.identity_);
    }
    public String getLastPage(){
       return this.lastPage_;
    }
    public ByteString getLastPageBytes(){
       return ByteString.copyFromUtf8(this.lastPage_);
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
    public int getPageShowSeq(){
       return this.pageShowSeq_;
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
    public PageEvent$SubAction getSubAction(){
       PageEvent$SubAction subAction = PageEvent$SubAction.forNumber(this.subAction_);
       if (subAction == null) {
          subAction = PageEvent$SubAction.UNRECOGNIZED;
       }
       return subAction;
    }
    public int getSubActionValue(){
       return this.subAction_;
    }
    public long getTimestamp(){
       return this.timestamp_;
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
    public void setAction(PageEvent$Action p0){
       Objects.requireNonNull(p0);
       this.action_ = p0.getNumber();
    }
    public void setActionValue(int p0){
       this.action_ = p0;
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
    public void setEntryPageId(String p0){
       Objects.requireNonNull(p0);
       this.entryPageId_ = p0;
    }
    public void setEntryPageIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.entryPageId_ = p0.toStringUtf8();
    }
    public void setEntryPageSource(String p0){
       Objects.requireNonNull(p0);
       this.entryPageSource_ = p0;
    }
    public void setEntryPageSourceBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.entryPageSource_ = p0.toStringUtf8();
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
    public void setForegroundTime(long p0){
       this.foregroundTime_ = p0;
    }
    public void setIdentity(String p0){
       Objects.requireNonNull(p0);
       this.identity_ = p0;
    }
    public void setIdentityBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.identity_ = p0.toStringUtf8();
    }
    public void setLastPage(String p0){
       Objects.requireNonNull(p0);
       this.lastPage_ = p0;
    }
    public void setLastPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lastPage_ = p0.toStringUtf8();
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
    public void setPageShowSeq(int p0){
       this.pageShowSeq_ = p0;
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
    public void setSubAction(PageEvent$SubAction p0){
       Objects.requireNonNull(p0);
       this.subAction_ = p0.getNumber();
    }
    public void setSubActionValue(int p0){
       this.subAction_ = p0;
    }
    public void setTimestamp(long p0){
       this.timestamp_ = p0;
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
