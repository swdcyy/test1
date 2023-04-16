package com.kuaishou.protobuf.livestream.nano.MultiPKPlayFashionInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class MultiPKPlayFashionInfo extends MessageNano	// class@000d28
{
    public byte[] data;
    public long endTimestamp;
    public long leftEndTimeMinDuration;
    public int playFashionType;
    public long startTimestamp;
    public static MultiPKPlayFashionInfo[] _emptyArray;

    public void MultiPKPlayFashionInfo(){
       super();
       this.clear();
    }
    public static MultiPKPlayFashionInfo[] emptyArray(){
       if (MultiPKPlayFashionInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MultiPKPlayFashionInfo._emptyArray == null) {
             MultiPKPlayFashionInfo[] multiPKPlayF = new MultiPKPlayFashionInfo[0];
             MultiPKPlayFashionInfo._emptyArray = multiPKPlayF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MultiPKPlayFashionInfo._emptyArray;
    }
    public static MultiPKPlayFashionInfo parseFrom(CodedInputByteBufferNano p0){
       return new MultiPKPlayFashionInfo().mergeFrom(p0);
    }
    public static MultiPKPlayFashionInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MultiPKPlayFashionInfo(), p0);
    }
    public MultiPKPlayFashionInfo clear(){
       this.startTimestamp = 0;
       this.endTimestamp = 0;
       this.playFashionType = 0;
       this.leftEndTimeMinDuration = 0;
       this.data = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       MultiPKPlayFashionInfo tstartTimest = this.startTimestamp;
       int i1 = 0;
       if (tstartTimest - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartTimest);
       }
       tstartTimest = this.endTimestamp;
       if (tstartTimest - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTimest);
       }
       tstartTimest = this.playFashionType;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tstartTimest);
       }
       tstartTimest = this.leftEndTimeMinDuration;
       if (tstartTimest - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tstartTimest);
       }
       if (!Arrays.equals(this.data, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(5, this.data);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MultiPKPlayFashionInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.data = p0.readBytes();
                      }
                   }else {
                      this.leftEndTimeMinDuration = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.playFashionType = i;
                   }
                }
             }else {
                this.endTimestamp = p0.readUInt64();
             }
          }else {
             this.startTimestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       MultiPKPlayFashionInfo tstartTimest = this.startTimestamp;
       int i = 0;
       if (tstartTimest - i) {
          p0.writeUInt64(1, tstartTimest);
       }
       tstartTimest = this.endTimestamp;
       if (tstartTimest - i) {
          p0.writeUInt64(2, tstartTimest);
       }
       tstartTimest = this.playFashionType;
       if (tstartTimest != null) {
          p0.writeInt32(3, tstartTimest);
       }
       tstartTimest = this.leftEndTimeMinDuration;
       if (tstartTimest - i) {
          p0.writeUInt64(4, tstartTimest);
       }
       if (!Arrays.equals(this.data, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(5, this.data);
       }
       super.writeTo(p0);
       return;
    }
}
