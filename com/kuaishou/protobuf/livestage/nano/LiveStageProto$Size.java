package com.kuaishou.protobuf.livestage.nano.LiveStageProto$Size;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStageProto$Size extends MessageNano	// class@000bfd
{
    public int height;
    public int width;
    public static LiveStageProto$Size[] _emptyArray;

    public void LiveStageProto$Size(){
       super();
       this.clear();
    }
    public static LiveStageProto$Size[] emptyArray(){
       if (LiveStageProto$Size._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStageProto$Size._emptyArray == null) {
             LiveStageProto$Size[] sizeArray = new LiveStageProto$Size[0];
             LiveStageProto$Size._emptyArray = sizeArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStageProto$Size._emptyArray;
    }
    public static LiveStageProto$Size parseFrom(CodedInputByteBufferNano p0){
       return new LiveStageProto$Size().mergeFrom(p0);
    }
    public static LiveStageProto$Size parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStageProto$Size(), p0);
    }
    public LiveStageProto$Size clear(){
       this.width = 0;
       this.height = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStageProto$Size twidth = this.width;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, twidth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStageProto$Size mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.height = p0.readUInt32();
             }
          }else {
             this.width = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStageProto$Size twidth = this.width;
       if (twidth != null) {
          p0.writeUInt32(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          p0.writeUInt32(2, twidth);
       }
       super.writeTo(p0);
       return;
    }
}
