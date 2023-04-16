package com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatDetailInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatUserInfo;

public final class MicSeatDetailInfo extends MessageNano	// class@000baf
{
    public int micSeatId;
    public int state;
    public MicSeatUserInfo userInfo;
    public static MicSeatDetailInfo[] _emptyArray;

    public void MicSeatDetailInfo(){
       super();
       this.clear();
    }
    public static MicSeatDetailInfo[] emptyArray(){
       if (MicSeatDetailInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MicSeatDetailInfo._emptyArray == null) {
             MicSeatDetailInfo[] micSeatDetai = new MicSeatDetailInfo[0];
             MicSeatDetailInfo._emptyArray = micSeatDetai;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MicSeatDetailInfo._emptyArray;
    }
    public static MicSeatDetailInfo parseFrom(CodedInputByteBufferNano p0){
       return new MicSeatDetailInfo().mergeFrom(p0);
    }
    public static MicSeatDetailInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MicSeatDetailInfo(), p0);
    }
    public MicSeatDetailInfo clear(){
       this.micSeatId = 0;
       this.state = 0;
       this.userInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       MicSeatDetailInfo tmicSeatId = this.micSeatId;
       if (tmicSeatId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tmicSeatId);
       }
       tmicSeatId = this.state;
       if (tmicSeatId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tmicSeatId);
       }
       tmicSeatId = this.userInfo;
       if (tmicSeatId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tmicSeatId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MicSeatDetailInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.userInfo == null){
                   this.userInfo = new MicSeatUserInfo();
                }
                p0.readMessage(this.userInfo);
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.state = i;
                }
             }
          }else {
             this.micSeatId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       MicSeatDetailInfo tmicSeatId = this.micSeatId;
       if (tmicSeatId != null) {
          p0.writeUInt32(1, tmicSeatId);
       }
       tmicSeatId = this.state;
       if (tmicSeatId != null) {
          p0.writeInt32(2, tmicSeatId);
       }
       tmicSeatId = this.userInfo;
       if (tmicSeatId != null) {
          p0.writeMessage(3, tmicSeatId);
       }
       super.writeTo(p0);
       return;
    }
}
