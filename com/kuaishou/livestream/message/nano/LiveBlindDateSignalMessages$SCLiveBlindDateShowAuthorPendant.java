package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$LiveBlindDatePendantImageInfo;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant extends MessageNano	// class@00111c
{
    public String bizId;
    public String buttonLinkUrl;
    public String contentKey;
    public String guideDescription;
    public String highlightDescription;
    public LiveBlindDateSignalMessages$LiveBlindDatePendantImageInfo largeImgInfo;
    public String liveStreamId;
    public String pendantLinkUrl;
    public long pendantStyle;
    public LiveBlindDateSignalMessages$LiveBlindDatePendantImageInfo smallImgInfo;
    public String topImgLinkUrl;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant clear(){
       this.liveStreamId = "";
       this.pendantStyle = 0;
       this.largeImgInfo = null;
       this.smallImgInfo = null;
       this.topImgLinkUrl = "";
       this.buttonLinkUrl = "";
       this.guideDescription = "";
       this.highlightDescription = "";
       this.contentKey = "";
       this.bizId = "";
       this.pendantLinkUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant tpendantStyl = this.pendantStyle;
       if (tpendantStyl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tpendantStyl);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant tlargeImgInf = this.largeImgInfo;
       if (tlargeImgInf != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tlargeImgInf);
       }
       tlargeImgInf = this.smallImgInfo;
       if (tlargeImgInf != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tlargeImgInf);
       }
       if (!(this.topImgLinkUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.topImgLinkUrl);
       }
       if (!(this.buttonLinkUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.buttonLinkUrl);
       }
       if (!(this.guideDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.guideDescription);
       }
       if (!(this.highlightDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.highlightDescription);
       }
       if (!(this.contentKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.contentKey);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.bizId);
       }
       if (!(this.pendantLinkUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.pendantLinkUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 16:
                this.pendantStyle = p0.readUInt64();
                break;
              case 26:
                if (this.largeImgInfo == null) {
                   this.largeImgInfo = new LiveBlindDateSignalMessages$LiveBlindDatePendantImageInfo();
                }
                p0.readMessage(this.largeImgInfo);
                break;
              case '"':
                if (this.smallImgInfo == null) {
                   this.smallImgInfo = new LiveBlindDateSignalMessages$LiveBlindDatePendantImageInfo();
                }
                p0.readMessage(this.smallImgInfo);
                break;
              case '*':
                this.topImgLinkUrl = p0.readString();
                break;
              case '2':
                this.buttonLinkUrl = p0.readString();
                break;
              case ':':
                this.guideDescription = p0.readString();
                break;
              case 'B':
                this.highlightDescription = p0.readString();
                break;
              case 'J':
                this.contentKey = p0.readString();
                break;
              case 'R':
                this.bizId = p0.readString();
                break;
              case 'Z':
                this.pendantLinkUrl = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant tpendantStyl = this.pendantStyle;
       if (tpendantStyl) {
          p0.writeUInt64(2, tpendantStyl);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAuthorPendant tlargeImgInf = this.largeImgInfo;
       if (tlargeImgInf != null) {
          p0.writeMessage(3, tlargeImgInf);
       }
       tlargeImgInf = this.smallImgInfo;
       if (tlargeImgInf != null) {
          p0.writeMessage(4, tlargeImgInf);
       }
       if (!(this.topImgLinkUrl).equals(str)) {
          p0.writeString(5, this.topImgLinkUrl);
       }
       if (!(this.buttonLinkUrl).equals(str)) {
          p0.writeString(6, this.buttonLinkUrl);
       }
       if (!(this.guideDescription).equals(str)) {
          p0.writeString(7, this.guideDescription);
       }
       if (!(this.highlightDescription).equals(str)) {
          p0.writeString(8, this.highlightDescription);
       }
       if (!(this.contentKey).equals(str)) {
          p0.writeString(9, this.contentKey);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(10, this.bizId);
       }
       if (!(this.pendantLinkUrl).equals(str)) {
          p0.writeString(11, this.pendantLinkUrl);
       }
       super.writeTo(p0);
       return;
    }
}
