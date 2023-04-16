package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$SCActivityWidgetClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivityWidgetProto$SCActivityWidgetClose extends MessageNano	// class@0010e0
{
    public long id;
    public static LiveActivityWidgetProto$SCActivityWidgetClose[] _emptyArray;

    public void LiveActivityWidgetProto$SCActivityWidgetClose(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$SCActivityWidgetClose[] emptyArray(){
       if (LiveActivityWidgetProto$SCActivityWidgetClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$SCActivityWidgetClose._emptyArray == null) {
             LiveActivityWidgetProto$SCActivityWidgetClose[] sCActivityWi = new LiveActivityWidgetProto$SCActivityWidgetClose[0];
             LiveActivityWidgetProto$SCActivityWidgetClose._emptyArray = sCActivityWi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$SCActivityWidgetClose._emptyArray;
    }
    public static LiveActivityWidgetProto$SCActivityWidgetClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$SCActivityWidgetClose().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$SCActivityWidgetClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$SCActivityWidgetClose(), p0);
    }
    public LiveActivityWidgetProto$SCActivityWidgetClose clear(){
       this.id = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivityWidgetProto$SCActivityWidgetClose tid = this.id;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$SCActivityWidgetClose mergeFrom(CodedInputByteBufferNano p0){
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
             this.id = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivityWidgetProto$SCActivityWidgetClose tid = this.id;
       if (tid) {
          p0.writeUInt64(1, tid);
       }
       super.writeTo(p0);
       return;
    }
}
