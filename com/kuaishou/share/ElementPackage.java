package com.kuaishou.share.ElementPackage;
import com.kuaishou.share.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.share.ElementPackage$b;
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
import com.kuaishou.share.ElementPackage$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.share.ElementPackage$ResultStatus;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ElementPackage extends GeneratedMessageLite implements a	// class@000f20
{
    public String businessInfo_;
    public String errorCode_;
    public String errorMessage_;
    public String shareActionKey_;
    public String shareContentId_;
    public String shareContent_;
    public String shareId_;
    public String shareMethod_;
    public String shareMode_;
    public int shareResult_;
    public String subBiz_;
    public static final ElementPackage DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ElementPackage uElementPack = new ElementPackage();
       ElementPackage.DEFAULT_INSTANCE = uElementPack;
       GeneratedMessageLite.registerDefaultInstance(ElementPackage.class, uElementPack);
    }
    public void ElementPackage(){
       super();
       this.subBiz_ = "";
       this.shareContentId_ = "";
       this.shareContent_ = "";
       this.shareActionKey_ = "";
       this.shareMethod_ = "";
       this.shareId_ = "";
       this.shareMode_ = "";
       this.businessInfo_ = "";
       this.errorCode_ = "";
       this.errorMessage_ = "";
    }
    public static ElementPackage getDefaultInstance(){
       return ElementPackage.DEFAULT_INSTANCE;
    }
    public static ElementPackage$b newBuilder(){
       return ElementPackage.DEFAULT_INSTANCE.createBuilder();
    }
    public static ElementPackage$b newBuilder(ElementPackage p0){
       return ElementPackage.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ElementPackage parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ElementPackage.DEFAULT_INSTANCE, p0);
    }
    public static ElementPackage parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ElementPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ElementPackage parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0);
    }
    public static ElementPackage parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ElementPackage parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0);
    }
    public static ElementPackage parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ElementPackage parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0);
    }
    public static ElementPackage parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ElementPackage parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0);
    }
    public static ElementPackage parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ElementPackage parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0);
    }
    public static ElementPackage parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ElementPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ElementPackage.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBusinessInfo(){
       this.businessInfo_ = ElementPackage.getDefaultInstance().getBusinessInfo();
    }
    public void clearErrorCode(){
       this.errorCode_ = ElementPackage.getDefaultInstance().getErrorCode();
    }
    public void clearErrorMessage(){
       this.errorMessage_ = ElementPackage.getDefaultInstance().getErrorMessage();
    }
    public void clearShareActionKey(){
       this.shareActionKey_ = ElementPackage.getDefaultInstance().getShareActionKey();
    }
    public void clearShareContent(){
       this.shareContent_ = ElementPackage.getDefaultInstance().getShareContent();
    }
    public void clearShareContentId(){
       this.shareContentId_ = ElementPackage.getDefaultInstance().getShareContentId();
    }
    public void clearShareId(){
       this.shareId_ = ElementPackage.getDefaultInstance().getShareId();
    }
    public void clearShareMethod(){
       this.shareMethod_ = ElementPackage.getDefaultInstance().getShareMethod();
    }
    public void clearShareMode(){
       this.shareMode_ = ElementPackage.getDefaultInstance().getShareMode();
    }
    public void clearShareResult(){
       this.shareResult_ = 0;
    }
    public void clearSubBiz(){
       this.subBiz_ = ElementPackage.getDefaultInstance().getSubBiz();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ElementPackage$a.a[p0.ordinal()]){
           case 1:
             return new ElementPackage();
           case 2:
             return new ElementPackage$b(p2);
           case 3:
             Object[] objArray = new Object[11];
             objArray[0] = "subBiz_";
             objArray[i] = "shareContentId_";
             objArray[2] = "shareContent_";
             objArray[3] = "shareResult_";
             objArray[4] = "shareActionKey_";
             objArray[5] = "shareMethod_";
             objArray[6] = "shareId_";
             objArray[7] = "shareMode_";
             objArray[8] = "businessInfo_";
             objArray[9] = "errorCode_";
             objArray[10] = "errorMessage_";
             return GeneratedMessageLite.newMessageInfo(ElementPackage.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x0b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\f\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x02\x02\t\x02\x02\n\x02\x02\x0b\x02\x02\x00", objArray);
           case 4:
             return ElementPackage.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ElementPackage.PARSER;
             if (pARSER == null) {
                _monitor_enter(ElementPackage.class);
                pARSER = ElementPackage.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ElementPackage.DEFAULT_INSTANCE);
                   ElementPackage.PARSER = pARSER;
                }
                _monitor_exit(ElementPackage.class);
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
    public String getBusinessInfo(){
       return this.businessInfo_;
    }
    public ByteString getBusinessInfoBytes(){
       return ByteString.copyFromUtf8(this.businessInfo_);
    }
    public String getErrorCode(){
       return this.errorCode_;
    }
    public ByteString getErrorCodeBytes(){
       return ByteString.copyFromUtf8(this.errorCode_);
    }
    public String getErrorMessage(){
       return this.errorMessage_;
    }
    public ByteString getErrorMessageBytes(){
       return ByteString.copyFromUtf8(this.errorMessage_);
    }
    public String getShareActionKey(){
       return this.shareActionKey_;
    }
    public ByteString getShareActionKeyBytes(){
       return ByteString.copyFromUtf8(this.shareActionKey_);
    }
    public String getShareContent(){
       return this.shareContent_;
    }
    public ByteString getShareContentBytes(){
       return ByteString.copyFromUtf8(this.shareContent_);
    }
    public String getShareContentId(){
       return this.shareContentId_;
    }
    public ByteString getShareContentIdBytes(){
       return ByteString.copyFromUtf8(this.shareContentId_);
    }
    public String getShareId(){
       return this.shareId_;
    }
    public ByteString getShareIdBytes(){
       return ByteString.copyFromUtf8(this.shareId_);
    }
    public String getShareMethod(){
       return this.shareMethod_;
    }
    public ByteString getShareMethodBytes(){
       return ByteString.copyFromUtf8(this.shareMethod_);
    }
    public String getShareMode(){
       return this.shareMode_;
    }
    public ByteString getShareModeBytes(){
       return ByteString.copyFromUtf8(this.shareMode_);
    }
    public ElementPackage$ResultStatus getShareResult(){
       ElementPackage$ResultStatus resultStatus = ElementPackage$ResultStatus.forNumber(this.shareResult_);
       if (resultStatus == null) {
          resultStatus = ElementPackage$ResultStatus.UNRECOGNIZED;
       }
       return resultStatus;
    }
    public int getShareResultValue(){
       return this.shareResult_;
    }
    public String getSubBiz(){
       return this.subBiz_;
    }
    public ByteString getSubBizBytes(){
       return ByteString.copyFromUtf8(this.subBiz_);
    }
    public void setBusinessInfo(String p0){
       Objects.requireNonNull(p0);
       this.businessInfo_ = p0;
    }
    public void setBusinessInfoBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.businessInfo_ = p0.toStringUtf8();
    }
    public void setErrorCode(String p0){
       Objects.requireNonNull(p0);
       this.errorCode_ = p0;
    }
    public void setErrorCodeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.errorCode_ = p0.toStringUtf8();
    }
    public void setErrorMessage(String p0){
       Objects.requireNonNull(p0);
       this.errorMessage_ = p0;
    }
    public void setErrorMessageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.errorMessage_ = p0.toStringUtf8();
    }
    public void setShareActionKey(String p0){
       Objects.requireNonNull(p0);
       this.shareActionKey_ = p0;
    }
    public void setShareActionKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.shareActionKey_ = p0.toStringUtf8();
    }
    public void setShareContent(String p0){
       Objects.requireNonNull(p0);
       this.shareContent_ = p0;
    }
    public void setShareContentBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.shareContent_ = p0.toStringUtf8();
    }
    public void setShareContentId(String p0){
       Objects.requireNonNull(p0);
       this.shareContentId_ = p0;
    }
    public void setShareContentIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.shareContentId_ = p0.toStringUtf8();
    }
    public void setShareId(String p0){
       Objects.requireNonNull(p0);
       this.shareId_ = p0;
    }
    public void setShareIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.shareId_ = p0.toStringUtf8();
    }
    public void setShareMethod(String p0){
       Objects.requireNonNull(p0);
       this.shareMethod_ = p0;
    }
    public void setShareMethodBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.shareMethod_ = p0.toStringUtf8();
    }
    public void setShareMode(String p0){
       Objects.requireNonNull(p0);
       this.shareMode_ = p0;
    }
    public void setShareModeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.shareMode_ = p0.toStringUtf8();
    }
    public void setShareResult(ElementPackage$ResultStatus p0){
       Objects.requireNonNull(p0);
       this.shareResult_ = p0.getNumber();
    }
    public void setShareResultValue(int p0){
       this.shareResult_ = p0;
    }
    public void setSubBiz(String p0){
       Objects.requireNonNull(p0);
       this.subBiz_ = p0;
    }
    public void setSubBizBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.subBiz_ = p0.toStringUtf8();
    }
}
