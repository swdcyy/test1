package com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialNoticeCard;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAdSocialMessages$LiveAdSocialNoticeCard extends MessageNano	// class@0010eb
{
    public String button;
    public long delayTime;
    public boolean displayCard;
    public int displayModel;
    public long displayStartTime;
    public long displayThreshold;
    public long duration;
    public String image;
    public String subTitle;
    public String title;
    public static LiveAdSocialMessages$LiveAdSocialNoticeCard[] _emptyArray;

    public void LiveAdSocialMessages$LiveAdSocialNoticeCard(){
       super();
       this.clear();
    }
    public static LiveAdSocialMessages$LiveAdSocialNoticeCard[] emptyArray(){
       if (LiveAdSocialMessages$LiveAdSocialNoticeCard._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdSocialMessages$LiveAdSocialNoticeCard._emptyArray == null) {
             LiveAdSocialMessages$LiveAdSocialNoticeCard[] liveAdSocial = new LiveAdSocialMessages$LiveAdSocialNoticeCard[0];
             LiveAdSocialMessages$LiveAdSocialNoticeCard._emptyArray = liveAdSocial;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdSocialMessages$LiveAdSocialNoticeCard._emptyArray;
    }
    public static LiveAdSocialMessages$LiveAdSocialNoticeCard parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdSocialMessages$LiveAdSocialNoticeCard().mergeFrom(p0);
    }
    public static LiveAdSocialMessages$LiveAdSocialNoticeCard parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdSocialMessages$LiveAdSocialNoticeCard(), p0);
    }
    public LiveAdSocialMessages$LiveAdSocialNoticeCard clear(){
       this.title = "";
       this.subTitle = "";
       this.image = "";
       this.button = "";
       this.displayCard = false;
       this.displayModel = 0;
       this.displayStartTime = 0;
       this.displayThreshold = 0;
       this.duration = 0;
       this.delayTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       if (!(this.subTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.subTitle);
       }
       if (!(this.image).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.image);
       }
       if (!(this.button).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.button);
       }
       LiveAdSocialMessages$LiveAdSocialNoticeCard tdisplayCard = this.displayCard;
       if (tdisplayCard != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tdisplayCard);
       }
       tdisplayCard = this.displayModel;
       if (tdisplayCard != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tdisplayCard);
       }
       tdisplayCard = this.displayStartTime;
       int i1 = 0;
       if (tdisplayCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tdisplayCard);
       }
       tdisplayCard = this.displayThreshold;
       if (tdisplayCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tdisplayCard);
       }
       tdisplayCard = this.duration;
       if (tdisplayCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tdisplayCard);
       }
       tdisplayCard = this.delayTime;
       if (tdisplayCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tdisplayCard);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdSocialMessages$LiveAdSocialNoticeCard mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.title = p0.readString();
                break;
              case 18:
                this.subTitle = p0.readString();
                break;
              case 26:
                this.image = p0.readString();
                break;
              case '"':
                this.button = p0.readString();
                break;
              case '(':
                this.displayCard = p0.readBool();
                break;
              case '0':
                this.displayModel = p0.readUInt32();
                break;
              case '8':
                this.displayStartTime = p0.readUInt64();
                break;
              case '@':
                this.displayThreshold = p0.readUInt64();
                break;
              case 'H':
                this.duration = p0.readUInt64();
                break;
              case 'P':
                this.delayTime = p0.readUInt64();
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
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       if (!(this.subTitle).equals(str)) {
          p0.writeString(2, this.subTitle);
       }
       if (!(this.image).equals(str)) {
          p0.writeString(3, this.image);
       }
       if (!(this.button).equals(str)) {
          p0.writeString(4, this.button);
       }
       LiveAdSocialMessages$LiveAdSocialNoticeCard tdisplayCard = this.displayCard;
       if (tdisplayCard != null) {
          p0.writeBool(5, tdisplayCard);
       }
       tdisplayCard = this.displayModel;
       if (tdisplayCard != null) {
          p0.writeUInt32(6, tdisplayCard);
       }
       tdisplayCard = this.displayStartTime;
       int i = 0;
       if (tdisplayCard - i) {
          p0.writeUInt64(7, tdisplayCard);
       }
       tdisplayCard = this.displayThreshold;
       if (tdisplayCard - i) {
          p0.writeUInt64(8, tdisplayCard);
       }
       tdisplayCard = this.duration;
       if (tdisplayCard - i) {
          p0.writeUInt64(9, tdisplayCard);
       }
       tdisplayCard = this.delayTime;
       if (tdisplayCard - i) {
          p0.writeUInt64(10, tdisplayCard);
       }
       super.writeTo(p0);
       return;
    }
}
