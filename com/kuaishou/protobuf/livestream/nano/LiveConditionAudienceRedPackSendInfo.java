package com.kuaishou.protobuf.livestream.nano.LiveConditionAudienceRedPackSendInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveConditionAudienceRedPackSendInfo extends MessageNano	// class@000c5b
{
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme customRedPackSkinTheme;
    public long displayDeadline;
    public String extraInfo;
    public String liveStreamId;
    public long lotteryTime;
    public long queryLotteryDeadline;
    public long queryLotteryMaxDelayDuration;
    public String redPackId;
    public int redPackType;
    public UserInfos$UserInfo senderInfo;
    public long showResultDeadline;
    public static LiveConditionAudienceRedPackSendInfo[] _emptyArray;

    public void LiveConditionAudienceRedPackSendInfo(){
       super();
       this.clear();
    }
    public static LiveConditionAudienceRedPackSendInfo[] emptyArray(){
       if (LiveConditionAudienceRedPackSendInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveConditionAudienceRedPackSendInfo._emptyArray == null) {
             LiveConditionAudienceRedPackSendInfo[] liveConditio = new LiveConditionAudienceRedPackSendInfo[0];
             LiveConditionAudienceRedPackSendInfo._emptyArray = liveConditio;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveConditionAudienceRedPackSendInfo._emptyArray;
    }
    public static LiveConditionAudienceRedPackSendInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveConditionAudienceRedPackSendInfo().mergeFrom(p0);
    }
    public static LiveConditionAudienceRedPackSendInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveConditionAudienceRedPackSendInfo(), p0);
    }
    public LiveConditionAudienceRedPackSendInfo clear(){
       this.liveStreamId = "";
       this.redPackType = 0;
       this.redPackId = "";
       this.lotteryTime = 0;
       this.senderInfo = null;
       this.displayDeadline = 0;
       this.queryLotteryDeadline = 0;
       this.queryLotteryMaxDelayDuration = 0;
       this.showResultDeadline = 0;
       this.extraInfo = "";
       this.customRedPackSkinTheme = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveConditionAudienceRedPackSendInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.redPackId);
       }
       LiveConditionAudienceRedPackSendInfo tlotteryTime = this.lotteryTime;
       if (tlotteryTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tlotteryTime);
       }
       tredPackType = this.senderInfo;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tredPackType);
       }
       tlotteryTime = this.displayDeadline;
       if (tlotteryTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tlotteryTime);
       }
       tlotteryTime = this.queryLotteryDeadline;
       if (tlotteryTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tlotteryTime);
       }
       tlotteryTime = this.queryLotteryMaxDelayDuration;
       if (tlotteryTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tlotteryTime);
       }
       tlotteryTime = this.showResultDeadline;
       if (tlotteryTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tlotteryTime);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.extraInfo);
       }
       tredPackType = this.customRedPackSkinTheme;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tredPackType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveConditionAudienceRedPackSendInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.redPackType = i;
                break;
              case 26:
                this.redPackId = p0.readString();
                break;
              case 32:
                this.lotteryTime = p0.readUInt64();
                break;
              case '*':
                if (this.senderInfo == null) {
                   this.senderInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.senderInfo);
                break;
              case '0':
                this.displayDeadline = p0.readUInt64();
                break;
              case '8':
                this.queryLotteryDeadline = p0.readUInt64();
                break;
              case '@':
                this.queryLotteryMaxDelayDuration = p0.readUInt64();
                break;
              case 'H':
                this.showResultDeadline = p0.readUInt64();
                break;
              case 'R':
                this.extraInfo = p0.readString();
                break;
              case 'Z':
                if (this.customRedPackSkinTheme == null) {
                   this.customRedPackSkinTheme = new LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme();
                }
                p0.readMessage(this.customRedPackSkinTheme);
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
       LiveConditionAudienceRedPackSendInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          p0.writeInt32(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          p0.writeString(3, this.redPackId);
       }
       LiveConditionAudienceRedPackSendInfo tlotteryTime = this.lotteryTime;
       if (tlotteryTime) {
          p0.writeUInt64(4, tlotteryTime);
       }
       tredPackType = this.senderInfo;
       if (tredPackType != null) {
          p0.writeMessage(5, tredPackType);
       }
       tlotteryTime = this.displayDeadline;
       if (tlotteryTime) {
          p0.writeUInt64(6, tlotteryTime);
       }
       tlotteryTime = this.queryLotteryDeadline;
       if (tlotteryTime) {
          p0.writeUInt64(7, tlotteryTime);
       }
       tlotteryTime = this.queryLotteryMaxDelayDuration;
       if (tlotteryTime) {
          p0.writeUInt64(8, tlotteryTime);
       }
       tlotteryTime = this.showResultDeadline;
       if (tlotteryTime) {
          p0.writeUInt64(9, tlotteryTime);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(10, this.extraInfo);
       }
       tredPackType = this.customRedPackSkinTheme;
       if (tredPackType != null) {
          p0.writeMessage(11, tredPackType);
       }
       super.writeTo(p0);
       return;
    }
}
