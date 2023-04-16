package com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceId;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveKtraceProto$AppKTraceId extends MessageNano	// class@0011d6
{
    public int counter;
    public long serviceInstanceId;
    public int threadId;
    public long timestamp;
    public int version;
    public static LiveKtraceProto$AppKTraceId[] _emptyArray;

    public void LiveKtraceProto$AppKTraceId(){
       super();
       this.clear();
    }
    public static LiveKtraceProto$AppKTraceId[] emptyArray(){
       if (LiveKtraceProto$AppKTraceId._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKtraceProto$AppKTraceId._emptyArray == null) {
             LiveKtraceProto$AppKTraceId[] uAppKTraceId = new LiveKtraceProto$AppKTraceId[0];
             LiveKtraceProto$AppKTraceId._emptyArray = uAppKTraceId;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKtraceProto$AppKTraceId._emptyArray;
    }
    public static LiveKtraceProto$AppKTraceId parseFrom(CodedInputByteBufferNano p0){
       return new LiveKtraceProto$AppKTraceId().mergeFrom(p0);
    }
    public static LiveKtraceProto$AppKTraceId parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKtraceProto$AppKTraceId(), p0);
    }
    public LiveKtraceProto$AppKTraceId clear(){
       this.version = 0;
       this.serviceInstanceId = 0;
       this.threadId = 0;
       this.timestamp = 0;
       this.counter = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveKtraceProto$AppKTraceId tversion = this.version;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tversion);
       }
       tversion = this.serviceInstanceId;
       int i1 = 0;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tversion);
       }
       tversion = this.threadId;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tversion);
       }
       tversion = this.timestamp;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tversion);
       }
       tversion = this.counter;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveKtraceProto$AppKTraceId mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.counter = p0.readUInt32();
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else {
                   this.threadId = p0.readUInt32();
                }
             }else {
                this.serviceInstanceId = p0.readUInt64();
             }
          }else {
             this.version = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveKtraceProto$AppKTraceId tversion = this.version;
       if (tversion != null) {
          p0.writeUInt32(1, tversion);
       }
       tversion = this.serviceInstanceId;
       int i = 0;
       if (tversion - i) {
          p0.writeUInt64(2, tversion);
       }
       tversion = this.threadId;
       if (tversion != null) {
          p0.writeUInt32(3, tversion);
       }
       tversion = this.timestamp;
       if (tversion - i) {
          p0.writeUInt64(4, tversion);
       }
       tversion = this.counter;
       if (tversion != null) {
          p0.writeUInt32(5, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
