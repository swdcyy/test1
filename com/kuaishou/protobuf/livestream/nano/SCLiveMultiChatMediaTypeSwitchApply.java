package com.kuaishou.protobuf.livestream.nano.SCLiveMultiChatMediaTypeSwitchApply;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCLiveMultiChatMediaTypeSwitchApply extends MessageNano	// class@000d5a
{
    public UserInfos$UserInfo applier;
    public long countdownMs;
    public String liveStreamId;
    public int targetMediaType;
    public long timestamp;
    public static SCLiveMultiChatMediaTypeSwitchApply[] _emptyArray;

    public void SCLiveMultiChatMediaTypeSwitchApply(){
       super();
       this.clear();
    }
    public static SCLiveMultiChatMediaTypeSwitchApply[] emptyArray(){
       if (SCLiveMultiChatMediaTypeSwitchApply._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiChatMediaTypeSwitchApply._emptyArray == null) {
             SCLiveMultiChatMediaTypeSwitchApply[] sCLiveMultiC = new SCLiveMultiChatMediaTypeSwitchApply[0];
             SCLiveMultiChatMediaTypeSwitchApply._emptyArray = sCLiveMultiC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiChatMediaTypeSwitchApply._emptyArray;
    }
    public static SCLiveMultiChatMediaTypeSwitchApply parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiChatMediaTypeSwitchApply().mergeFrom(p0);
    }
    public static SCLiveMultiChatMediaTypeSwitchApply parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiChatMediaTypeSwitchApply(), p0);
    }
    public SCLiveMultiChatMediaTypeSwitchApply clear(){
       this.liveStreamId = "";
       this.applier = null;
       this.targetMediaType = 0;
       this.countdownMs = 0;
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLiveMultiChatMediaTypeSwitchApply tapplier = this.applier;
       if (tapplier != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tapplier);
       }
       tapplier = this.targetMediaType;
       if (tapplier != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tapplier);
       }
       tapplier = this.countdownMs;
       int i1 = 0;
       if (tapplier - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tapplier);
       }
       tapplier = this.timestamp;
       if (tapplier - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tapplier);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiChatMediaTypeSwitchApply mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.countdownMs = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.targetMediaType = i;
                   }
                }
             }else if(this.applier == null){
                this.applier = new UserInfos$UserInfo();
             }
             p0.readMessage(this.applier);
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLiveMultiChatMediaTypeSwitchApply tapplier = this.applier;
       if (tapplier != null) {
          p0.writeMessage(2, tapplier);
       }
       tapplier = this.targetMediaType;
       if (tapplier != null) {
          p0.writeInt32(3, tapplier);
       }
       tapplier = this.countdownMs;
       int i = 0;
       if (tapplier - i) {
          p0.writeUInt64(4, tapplier);
       }
       tapplier = this.timestamp;
       if (tapplier - i) {
          p0.writeUInt64(5, tapplier);
       }
       super.writeTo(p0);
       return;
    }
}
