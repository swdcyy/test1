package com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatLastPkInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiLineChatLastPkInfo extends MessageNano	// class@000cb2
{
    public int lastPkEndInfo;
    public long lastPkId;
    public int lastPkPlayType;
    public int lastPkStartWay;
    public static LiveMultiLineChatLastPkInfo[] _emptyArray;

    public void LiveMultiLineChatLastPkInfo(){
       super();
       this.clear();
    }
    public static LiveMultiLineChatLastPkInfo[] emptyArray(){
       if (LiveMultiLineChatLastPkInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiLineChatLastPkInfo._emptyArray == null) {
             LiveMultiLineChatLastPkInfo[] liveMultiLin = new LiveMultiLineChatLastPkInfo[0];
             LiveMultiLineChatLastPkInfo._emptyArray = liveMultiLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiLineChatLastPkInfo._emptyArray;
    }
    public static LiveMultiLineChatLastPkInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiLineChatLastPkInfo().mergeFrom(p0);
    }
    public static LiveMultiLineChatLastPkInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiLineChatLastPkInfo(), p0);
    }
    public LiveMultiLineChatLastPkInfo clear(){
       this.lastPkEndInfo = 0;
       this.lastPkStartWay = 0;
       this.lastPkPlayType = 0;
       this.lastPkId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiLineChatLastPkInfo tlastPkEndIn = this.lastPkEndInfo;
       if (tlastPkEndIn != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tlastPkEndIn);
       }
       tlastPkEndIn = this.lastPkStartWay;
       if (tlastPkEndIn != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tlastPkEndIn);
       }
       tlastPkEndIn = this.lastPkPlayType;
       if (tlastPkEndIn != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tlastPkEndIn);
       }
       tlastPkEndIn = this.lastPkId;
       if (tlastPkEndIn) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tlastPkEndIn);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiLineChatLastPkInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.lastPkId = p0.readUInt64();
                   }
                }else {
                   this.lastPkPlayType = p0.readUInt32();
                }
             }else {
                this.lastPkStartWay = p0.readUInt32();
             }
          }else {
             this.lastPkEndInfo = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiLineChatLastPkInfo tlastPkEndIn = this.lastPkEndInfo;
       if (tlastPkEndIn != null) {
          p0.writeUInt32(1, tlastPkEndIn);
       }
       tlastPkEndIn = this.lastPkStartWay;
       if (tlastPkEndIn != null) {
          p0.writeUInt32(2, tlastPkEndIn);
       }
       tlastPkEndIn = this.lastPkPlayType;
       if (tlastPkEndIn != null) {
          p0.writeUInt32(3, tlastPkEndIn);
       }
       tlastPkEndIn = this.lastPkId;
       if (tlastPkEndIn) {
          p0.writeUInt64(4, tlastPkEndIn);
       }
       super.writeTo(p0);
       return;
    }
}
