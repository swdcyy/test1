package com.kuaishou.protobuf.livestage.nano.LiveStageProto$StreamId$UserStreamId;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStageProto$StreamId$UserStreamId extends MessageNano	// class@000bfe
{
    public long userId;
    public static LiveStageProto$StreamId$UserStreamId[] _emptyArray;

    public void LiveStageProto$StreamId$UserStreamId(){
       super();
       this.clear();
    }
    public static LiveStageProto$StreamId$UserStreamId[] emptyArray(){
       if (LiveStageProto$StreamId$UserStreamId._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStageProto$StreamId$UserStreamId._emptyArray == null) {
             LiveStageProto$StreamId$UserStreamId[] streamId$Use = new LiveStageProto$StreamId$UserStreamId[0];
             LiveStageProto$StreamId$UserStreamId._emptyArray = streamId$Use;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStageProto$StreamId$UserStreamId._emptyArray;
    }
    public static LiveStageProto$StreamId$UserStreamId parseFrom(CodedInputByteBufferNano p0){
       return new LiveStageProto$StreamId$UserStreamId().mergeFrom(p0);
    }
    public static LiveStageProto$StreamId$UserStreamId parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStageProto$StreamId$UserStreamId(), p0);
    }
    public LiveStageProto$StreamId$UserStreamId clear(){
       this.userId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStageProto$StreamId$UserStreamId tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStageProto$StreamId$UserStreamId mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStageProto$StreamId$UserStreamId tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(1, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
