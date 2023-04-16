package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatSwitchBizExtraInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;

public final class SCInteractiveChatSwitchBiz extends MessageNano	// class@000d3c
{
    public InteractiveChatSwitchBizExtraInfo endExtraInfo;
    public InteractiveChatRoomInfo roomInfo;
    public InteractiveChatSwitchBizExtraInfo startExtraInfo;
    public long timestamp;
    public long version;
    public static SCInteractiveChatSwitchBiz[] _emptyArray;

    public void SCInteractiveChatSwitchBiz(){
       super();
       this.clear();
    }
    public static SCInteractiveChatSwitchBiz[] emptyArray(){
       if (SCInteractiveChatSwitchBiz._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatSwitchBiz._emptyArray == null) {
             SCInteractiveChatSwitchBiz[] sCInteractiv = new SCInteractiveChatSwitchBiz[0];
             SCInteractiveChatSwitchBiz._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatSwitchBiz._emptyArray;
    }
    public static SCInteractiveChatSwitchBiz parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatSwitchBiz().mergeFrom(p0);
    }
    public static SCInteractiveChatSwitchBiz parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatSwitchBiz(), p0);
    }
    public SCInteractiveChatSwitchBiz clear(){
       this.roomInfo = null;
       this.endExtraInfo = null;
       this.startExtraInfo = null;
       this.timestamp = 0;
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatSwitchBiz troomInfo = this.roomInfo;
       if (troomInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, troomInfo);
       }
       troomInfo = this.endExtraInfo;
       if (troomInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, troomInfo);
       }
       troomInfo = this.startExtraInfo;
       if (troomInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, troomInfo);
       }
       troomInfo = this.timestamp;
       int i1 = 0;
       if (troomInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, troomInfo);
       }
       troomInfo = this.version;
       if (troomInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, troomInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatSwitchBiz mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.version = p0.readUInt64();
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else if(this.startExtraInfo == null){
                   this.startExtraInfo = new InteractiveChatSwitchBizExtraInfo();
                }
                p0.readMessage(this.startExtraInfo);
             }else if(this.endExtraInfo == null){
                this.endExtraInfo = new InteractiveChatSwitchBizExtraInfo();
             }
             p0.readMessage(this.endExtraInfo);
          }else if(this.roomInfo == null){
             this.roomInfo = new InteractiveChatRoomInfo();
          }
          p0.readMessage(this.roomInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatSwitchBiz troomInfo = this.roomInfo;
       if (troomInfo != null) {
          p0.writeMessage(1, troomInfo);
       }
       troomInfo = this.endExtraInfo;
       if (troomInfo != null) {
          p0.writeMessage(2, troomInfo);
       }
       troomInfo = this.startExtraInfo;
       if (troomInfo != null) {
          p0.writeMessage(3, troomInfo);
       }
       troomInfo = this.timestamp;
       int i = 0;
       if (troomInfo - i) {
          p0.writeUInt64(4, troomInfo);
       }
       troomInfo = this.version;
       if (troomInfo - i) {
          p0.writeUInt64(5, troomInfo);
       }
       super.writeTo(p0);
       return;
    }
}
