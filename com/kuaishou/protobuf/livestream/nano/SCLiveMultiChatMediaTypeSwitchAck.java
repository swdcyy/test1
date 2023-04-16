package com.kuaishou.protobuf.livestream.nano.SCLiveMultiChatMediaTypeSwitchAck;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveMultiChatMediaTypeSwitchAck extends MessageNano	// class@000d59
{
    public String liveStreamId;
    public int result;
    public int targetType;
    public long timestamp;
    public String userSessionId;
    public static SCLiveMultiChatMediaTypeSwitchAck[] _emptyArray;

    public void SCLiveMultiChatMediaTypeSwitchAck(){
       super();
       this.clear();
    }
    public static SCLiveMultiChatMediaTypeSwitchAck[] emptyArray(){
       if (SCLiveMultiChatMediaTypeSwitchAck._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiChatMediaTypeSwitchAck._emptyArray == null) {
             SCLiveMultiChatMediaTypeSwitchAck[] sCLiveMultiC = new SCLiveMultiChatMediaTypeSwitchAck[0];
             SCLiveMultiChatMediaTypeSwitchAck._emptyArray = sCLiveMultiC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiChatMediaTypeSwitchAck._emptyArray;
    }
    public static SCLiveMultiChatMediaTypeSwitchAck parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiChatMediaTypeSwitchAck().mergeFrom(p0);
    }
    public static SCLiveMultiChatMediaTypeSwitchAck parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiChatMediaTypeSwitchAck(), p0);
    }
    public SCLiveMultiChatMediaTypeSwitchAck clear(){
       this.liveStreamId = "";
       this.userSessionId = "";
       this.result = 0;
       this.timestamp = 0;
       this.targetType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.userSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.userSessionId);
       }
       SCLiveMultiChatMediaTypeSwitchAck tresult = this.result;
       if (tresult != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tresult);
       }
       tresult = this.timestamp;
       if (tresult) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tresult);
       }
       tresult = this.targetType;
       if (tresult != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tresult);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiChatMediaTypeSwitchAck mergeFrom(CodedInputByteBufferNano p0){
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
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.targetType = i;
                         }
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.result = i;
                   }
                }
             }else {
                this.userSessionId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.userSessionId).equals(str)) {
          p0.writeString(2, this.userSessionId);
       }
       SCLiveMultiChatMediaTypeSwitchAck tresult = this.result;
       if (tresult != null) {
          p0.writeInt32(3, tresult);
       }
       tresult = this.timestamp;
       if (tresult) {
          p0.writeUInt64(4, tresult);
       }
       tresult = this.targetType;
       if (tresult != null) {
          p0.writeInt32(5, tresult);
       }
       super.writeTo(p0);
       return;
    }
}
