package com.kuaishou.livestream.message.nano.SCLiveAttachGiftNoticeAnimation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveAttachGiftGuideConfigMessage;

public final class SCLiveAttachGiftNoticeAnimation extends MessageNano	// class@00140c
{
    public LiveAttachGiftGuideConfigMessage attachGiftConfig;
    public long executeDeadlineTime;
    public long executeTime;
    public int giftId;
    public String giftToken;
    public String liveStreamId;
    public int noticeType;
    public int priority;
    public long protectIntervalTime;
    public long showTime;
    public static SCLiveAttachGiftNoticeAnimation[] _emptyArray;

    public void SCLiveAttachGiftNoticeAnimation(){
       super();
       this.clear();
    }
    public static SCLiveAttachGiftNoticeAnimation[] emptyArray(){
       if (SCLiveAttachGiftNoticeAnimation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAttachGiftNoticeAnimation._emptyArray == null) {
             SCLiveAttachGiftNoticeAnimation[] sCLiveAttach = new SCLiveAttachGiftNoticeAnimation[0];
             SCLiveAttachGiftNoticeAnimation._emptyArray = sCLiveAttach;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAttachGiftNoticeAnimation._emptyArray;
    }
    public static SCLiveAttachGiftNoticeAnimation parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAttachGiftNoticeAnimation().mergeFrom(p0);
    }
    public static SCLiveAttachGiftNoticeAnimation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAttachGiftNoticeAnimation(), p0);
    }
    public SCLiveAttachGiftNoticeAnimation clear(){
       this.executeTime = 0;
       this.executeDeadlineTime = 0;
       this.showTime = 0;
       this.protectIntervalTime = 0;
       this.liveStreamId = "";
       this.noticeType = 0;
       this.giftId = 0;
       this.giftToken = "";
       this.priority = 0;
       this.attachGiftConfig = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveAttachGiftNoticeAnimation texecuteTime = this.executeTime;
       SCLiveAttachGiftNoticeAnimation sCLiveAttach = null;
       if (texecuteTime - sCLiveAttach) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, texecuteTime);
       }
       texecuteTime = this.executeDeadlineTime;
       if (texecuteTime - sCLiveAttach) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, texecuteTime);
       }
       texecuteTime = this.showTime;
       if (texecuteTime - sCLiveAttach) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, texecuteTime);
       }
       texecuteTime = this.protectIntervalTime;
       if (texecuteTime - sCLiveAttach) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, texecuteTime);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.liveStreamId);
       }
       texecuteTime = this.noticeType;
       if (texecuteTime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, texecuteTime);
       }
       texecuteTime = this.giftId;
       if (texecuteTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, texecuteTime);
       }
       if (!(this.giftToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.giftToken);
       }
       texecuteTime = this.priority;
       if (texecuteTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, texecuteTime);
       }
       texecuteTime = this.attachGiftConfig;
       if (texecuteTime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, texecuteTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAttachGiftNoticeAnimation mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.executeTime = p0.readUInt64();
                break;
              case 16:
                this.executeDeadlineTime = p0.readUInt64();
                break;
              case 24:
                this.showTime = p0.readUInt64();
                break;
              case 32:
                this.protectIntervalTime = p0.readUInt64();
                break;
              case '*':
                this.liveStreamId = p0.readString();
                break;
              case '0':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 1:
                      break;
                    default:
                }
                this.noticeType = i;
                break;
              case '8':
                this.giftId = p0.readUInt32();
                break;
              case 'B':
                this.giftToken = p0.readString();
                break;
              case 'H':
                this.priority = p0.readUInt32();
                break;
              case 'R':
                if (this.attachGiftConfig == null) {
                   this.attachGiftConfig = new LiveAttachGiftGuideConfigMessage();
                }
                p0.readMessage(this.attachGiftConfig);
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
       SCLiveAttachGiftNoticeAnimation texecuteTime = this.executeTime;
       SCLiveAttachGiftNoticeAnimation sCLiveAttach = null;
       if (texecuteTime - sCLiveAttach) {
          p0.writeUInt64(1, texecuteTime);
       }
       texecuteTime = this.executeDeadlineTime;
       if (texecuteTime - sCLiveAttach) {
          p0.writeUInt64(2, texecuteTime);
       }
       texecuteTime = this.showTime;
       if (texecuteTime - sCLiveAttach) {
          p0.writeUInt64(3, texecuteTime);
       }
       texecuteTime = this.protectIntervalTime;
       if (texecuteTime - sCLiveAttach) {
          p0.writeUInt64(4, texecuteTime);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(5, this.liveStreamId);
       }
       texecuteTime = this.noticeType;
       if (texecuteTime != null) {
          p0.writeInt32(6, texecuteTime);
       }
       texecuteTime = this.giftId;
       if (texecuteTime != null) {
          p0.writeUInt32(7, texecuteTime);
       }
       if (!(this.giftToken).equals(str)) {
          p0.writeString(8, this.giftToken);
       }
       texecuteTime = this.priority;
       if (texecuteTime != null) {
          p0.writeUInt32(9, texecuteTime);
       }
       texecuteTime = this.attachGiftConfig;
       if (texecuteTime != null) {
          p0.writeMessage(10, texecuteTime);
       }
       super.writeTo(p0);
       return;
    }
}
