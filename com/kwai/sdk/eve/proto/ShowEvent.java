package com.kwai.sdk.eve.proto.ShowEvent;
import com.kwai.sdk.eve.proto.ShowEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.sdk.eve.proto.ShowEvent$Builder;
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
import com.kwai.sdk.eve.proto.ShowEvent$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.ImageType;
import com.kwai.sdk.eve.proto.ShowEvent$ShowType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ShowEvent extends GeneratedMessageLite implements ShowEventOrBuilder	// class@001607
{
    public String authorId_;
    public int clickCount_;
    public String contentId_;
    public int contentType_;
    public long enterTimestamp_;
    public String expTag_;
    public int imageType_;
    public double latitude_;
    public long leaveTimestamp_;
    public String llsid_;
    public double longitude_;
    public String page_;
    public int position_;
    public String referPage_;
    public String sessionId_;
    public int showCount_;
    public int type_;
    public static final ShowEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ShowEvent showEvent = new ShowEvent();
       ShowEvent.DEFAULT_INSTANCE = showEvent;
       GeneratedMessageLite.registerDefaultInstance(ShowEvent.class, showEvent);
    }
    public void ShowEvent(){
       super();
       this.contentId_ = "";
       this.authorId_ = "";
       this.expTag_ = "";
       this.page_ = "";
       this.referPage_ = "";
       this.llsid_ = "";
       this.sessionId_ = "";
    }
    public static ShowEvent getDefaultInstance(){
       return ShowEvent.DEFAULT_INSTANCE;
    }
    public static ShowEvent$Builder newBuilder(){
       return ShowEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static ShowEvent$Builder newBuilder(ShowEvent p0){
       return ShowEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ShowEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ShowEvent.DEFAULT_INSTANCE, p0);
    }
    public static ShowEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ShowEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ShowEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0);
    }
    public static ShowEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ShowEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0);
    }
    public static ShowEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ShowEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0);
    }
    public static ShowEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ShowEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0);
    }
    public static ShowEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static ShowEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0);
    }
    public static ShowEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ShowEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ShowEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAuthorId(){
       this.authorId_ = ShowEvent.getDefaultInstance().getAuthorId();
    }
    public void clearClickCount(){
       this.clickCount_ = 0;
    }
    public void clearContentId(){
       this.contentId_ = ShowEvent.getDefaultInstance().getContentId();
    }
    public void clearContentType(){
       this.contentType_ = 0;
    }
    public void clearEnterTimestamp(){
       this.enterTimestamp_ = 0;
    }
    public void clearExpTag(){
       this.expTag_ = ShowEvent.getDefaultInstance().getExpTag();
    }
    public void clearImageType(){
       this.imageType_ = 0;
    }
    public void clearLatitude(){
       this.latitude_ = 0;
    }
    public void clearLeaveTimestamp(){
       this.leaveTimestamp_ = 0;
    }
    public void clearLlsid(){
       this.llsid_ = ShowEvent.getDefaultInstance().getLlsid();
    }
    public void clearLongitude(){
       this.longitude_ = 0;
    }
    public void clearPage(){
       this.page_ = ShowEvent.getDefaultInstance().getPage();
    }
    public void clearPosition(){
       this.position_ = 0;
    }
    public void clearReferPage(){
       this.referPage_ = ShowEvent.getDefaultInstance().getReferPage();
    }
    public void clearSessionId(){
       this.sessionId_ = ShowEvent.getDefaultInstance().getSessionId();
    }
    public void clearShowCount(){
       this.showCount_ = 0;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ShowEvent$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ShowEvent();
           case 2:
             return new ShowEvent$Builder(p2);
           case 3:
             Object[] objArray = new Object[17];
             objArray[0] = "contentId_";
             objArray[i] = "contentType_";
             objArray[2] = "enterTimestamp_";
             objArray[3] = "leaveTimestamp_";
             objArray[4] = "authorId_";
             objArray[5] = "expTag_";
             objArray[6] = "type_";
             objArray[7] = "position_";
             objArray[8] = "page_";
             objArray[9] = "referPage_";
             objArray[10] = "showCount_";
             objArray[11] = "clickCount_";
             objArray[12] = "llsid_";
             objArray[13] = "sessionId_";
             objArray[14] = "imageType_";
             objArray[15] = "latitude_";
             objArray[16] = "longitude_";
             return GeneratedMessageLite.newMessageInfo(ShowEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x11\xff\x02\xff\x02\xff\x02\xff\x02\x01H\x11\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x03\x04\x03\x05\x02\x02\x06\x02\x02\x07\f\b\x0b\t\x02\x02\n\x02\x02\f\x0b\r\x0b\x0e\x02\x02\x0f\x02\x023\fG\xff\x02\xff\x02H\xff\x02\xff\x02\x00", objArray);
           case 4:
             return ShowEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ShowEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(ShowEvent.class);
                pARSER = ShowEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ShowEvent.DEFAULT_INSTANCE);
                   ShowEvent.PARSER = pARSER;
                }
                _monitor_exit(ShowEvent.class);
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
    public String getAuthorId(){
       return this.authorId_;
    }
    public ByteString getAuthorIdBytes(){
       return ByteString.copyFromUtf8(this.authorId_);
    }
    public int getClickCount(){
       return this.clickCount_;
    }
    public String getContentId(){
       return this.contentId_;
    }
    public ByteString getContentIdBytes(){
       return ByteString.copyFromUtf8(this.contentId_);
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
    public long getEnterTimestamp(){
       return this.enterTimestamp_;
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
    public long getLeaveTimestamp(){
       return this.leaveTimestamp_;
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
    public int getShowCount(){
       return this.showCount_;
    }
    public ShowEvent$ShowType getType(){
       ShowEvent$ShowType showType = ShowEvent$ShowType.forNumber(this.type_);
       if (showType == null) {
          showType = ShowEvent$ShowType.UNRECOGNIZED;
       }
       return showType;
    }
    public int getTypeValue(){
       return this.type_;
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
    public void setClickCount(int p0){
       this.clickCount_ = p0;
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
    public void setContentType(ContentType p0){
       Objects.requireNonNull(p0);
       this.contentType_ = p0.getNumber();
    }
    public void setContentTypeValue(int p0){
       this.contentType_ = p0;
    }
    public void setEnterTimestamp(long p0){
       this.enterTimestamp_ = p0;
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
    public void setLeaveTimestamp(long p0){
       this.leaveTimestamp_ = p0;
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
    public void setShowCount(int p0){
       this.showCount_ = p0;
    }
    public void setType(ShowEvent$ShowType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
