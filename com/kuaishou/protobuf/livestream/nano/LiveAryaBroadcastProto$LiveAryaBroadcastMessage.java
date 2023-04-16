package com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage;
import com.kuaishou.livestream.message.nano.LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage;

public final class LiveAryaBroadcastProto$LiveAryaBroadcastMessage extends MessageNano	// class@000c34
{
    public String bizId;
    public LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage interactiveMagicFaceInfo;
    public LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo multiInteractiveInfo;
    public LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage pkGameInfo;
    public String senderId;
    public long senderTimestamp;
    public int type;
    public boolean videoStatus;
    public LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage voicePartyTheater;
    public static LiveAryaBroadcastProto$LiveAryaBroadcastMessage[] _emptyArray;

    public void LiveAryaBroadcastProto$LiveAryaBroadcastMessage(){
       super();
       this.clear();
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastMessage[] emptyArray(){
       if (LiveAryaBroadcastProto$LiveAryaBroadcastMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAryaBroadcastProto$LiveAryaBroadcastMessage._emptyArray == null) {
             LiveAryaBroadcastProto$LiveAryaBroadcastMessage[] liveAryaBroa = new LiveAryaBroadcastProto$LiveAryaBroadcastMessage[0];
             LiveAryaBroadcastProto$LiveAryaBroadcastMessage._emptyArray = liveAryaBroa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAryaBroadcastProto$LiveAryaBroadcastMessage._emptyArray;
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveAryaBroadcastProto$LiveAryaBroadcastMessage().mergeFrom(p0);
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAryaBroadcastProto$LiveAryaBroadcastMessage(), p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastMessage clear(){
       this.type = 0;
       this.senderId = "";
       this.bizId = "";
       this.senderTimestamp = 0;
       this.voicePartyTheater = null;
       this.pkGameInfo = null;
       this.videoStatus = false;
       this.multiInteractiveInfo = null;
       this.interactiveMagicFaceInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAryaBroadcastProto$LiveAryaBroadcastMessage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.senderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.senderId);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bizId);
       }
       ttype = this.senderTimestamp;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttype);
       }
       ttype = this.voicePartyTheater;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, ttype);
       }
       ttype = this.pkGameInfo;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, ttype);
       }
       ttype = this.videoStatus;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, ttype);
       }
       ttype = this.multiInteractiveInfo;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, ttype);
       }
       ttype = this.interactiveMagicFaceInfo;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else if(this.interactiveMagicFaceInfo == null){
                                     this.interactiveMagicFaceInfo = new LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage();
                                  }
                                  p0.readMessage(this.interactiveMagicFaceInfo);
                               }else if(this.multiInteractiveInfo == null){
                                  this.multiInteractiveInfo = new LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo();
                               }
                               p0.readMessage(this.multiInteractiveInfo);
                            }else {
                               this.videoStatus = p0.readBool();
                            }
                         }else if(this.pkGameInfo == null){
                            this.pkGameInfo = new LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage();
                         }
                         p0.readMessage(this.pkGameInfo);
                      }else if(this.voicePartyTheater == null){
                         this.voicePartyTheater = new LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage();
                      }
                      p0.readMessage(this.voicePartyTheater);
                   }else {
                      this.senderTimestamp = p0.readUInt64();
                   }
                }else {
                   this.bizId = p0.readString();
                }
             }else {
                this.senderId = p0.readString();
             }
          }else {
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
                 case 10:
                 case 11:
                 case 12:
                 case 13:
                 case 14:
                 case 15:
                 case 1:
                   break;
                 default:
             }
             this.type = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAryaBroadcastProto$LiveAryaBroadcastMessage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.senderId).equals(str)) {
          p0.writeString(2, this.senderId);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(3, this.bizId);
       }
       ttype = this.senderTimestamp;
       if (ttype) {
          p0.writeUInt64(4, ttype);
       }
       ttype = this.voicePartyTheater;
       if (ttype != null) {
          p0.writeMessage(5, ttype);
       }
       ttype = this.pkGameInfo;
       if (ttype != null) {
          p0.writeMessage(6, ttype);
       }
       ttype = this.videoStatus;
       if (ttype != null) {
          p0.writeBool(7, ttype);
       }
       ttype = this.multiInteractiveInfo;
       if (ttype != null) {
          p0.writeMessage(8, ttype);
       }
       ttype = this.interactiveMagicFaceInfo;
       if (ttype != null) {
          p0.writeMessage(9, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
