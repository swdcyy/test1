package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCSuspectedViolation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCSuspectedViolation extends MessageNano	// class@00136d
{
    public boolean suspectedViolation;
    public static LiveStreamMessages$SCSuspectedViolation[] _emptyArray;

    public void LiveStreamMessages$SCSuspectedViolation(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCSuspectedViolation[] emptyArray(){
       if (LiveStreamMessages$SCSuspectedViolation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCSuspectedViolation._emptyArray == null) {
             LiveStreamMessages$SCSuspectedViolation[] sCSuspectedV = new LiveStreamMessages$SCSuspectedViolation[0];
             LiveStreamMessages$SCSuspectedViolation._emptyArray = sCSuspectedV;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCSuspectedViolation._emptyArray;
    }
    public static LiveStreamMessages$SCSuspectedViolation parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCSuspectedViolation().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCSuspectedViolation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCSuspectedViolation(), p0);
    }
    public LiveStreamMessages$SCSuspectedViolation clear(){
       this.suspectedViolation = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCSuspectedViolation tsuspectedVi = this.suspectedViolation;
       if (tsuspectedVi != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tsuspectedVi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCSuspectedViolation mergeFrom(CodedInputByteBufferNano p0){
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
             this.suspectedViolation = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCSuspectedViolation tsuspectedVi = this.suspectedViolation;
       if (tsuspectedVi != null) {
          p0.writeBool(1, tsuspectedVi);
       }
       super.writeTo(p0);
       return;
    }
}
