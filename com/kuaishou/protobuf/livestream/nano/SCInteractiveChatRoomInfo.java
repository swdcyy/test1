package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;

public final class SCInteractiveChatRoomInfo extends MessageNano	// class@000d3b
{
    public String extraInfoPb;
    public InteractiveChatRoomInfo roomInfo;
    public long timestamp;
    public static SCInteractiveChatRoomInfo[] _emptyArray;

    public void SCInteractiveChatRoomInfo(){
       super();
       this.clear();
    }
    public static SCInteractiveChatRoomInfo[] emptyArray(){
       if (SCInteractiveChatRoomInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatRoomInfo._emptyArray == null) {
             SCInteractiveChatRoomInfo[] sCInteractiv = new SCInteractiveChatRoomInfo[0];
             SCInteractiveChatRoomInfo._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatRoomInfo._emptyArray;
    }
    public static SCInteractiveChatRoomInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatRoomInfo().mergeFrom(p0);
    }
    public static SCInteractiveChatRoomInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatRoomInfo(), p0);
    }
    public SCInteractiveChatRoomInfo clear(){
       this.roomInfo = null;
       this.extraInfoPb = "";
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatRoomInfo troomInfo = this.roomInfo;
       if (troomInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, troomInfo);
       }
       if (!(this.extraInfoPb).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.extraInfoPb);
       }
       troomInfo = this.timestamp;
       if (troomInfo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, troomInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatRoomInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                this.extraInfoPb = p0.readString();
             }
          }else if(this.roomInfo == null){
             this.roomInfo = new InteractiveChatRoomInfo();
          }
          p0.readMessage(this.roomInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatRoomInfo troomInfo = this.roomInfo;
       if (troomInfo != null) {
          p0.writeMessage(1, troomInfo);
       }
       if (!(this.extraInfoPb).equals("")) {
          p0.writeString(2, this.extraInfoPb);
       }
       troomInfo = this.timestamp;
       if (troomInfo) {
          p0.writeUInt64(3, troomInfo);
       }
       super.writeTo(p0);
       return;
    }
}
