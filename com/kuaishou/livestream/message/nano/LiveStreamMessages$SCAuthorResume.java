package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAuthorResume;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCAuthorResume extends MessageNano	// class@001326
{
    public long time;
    public static LiveStreamMessages$SCAuthorResume[] _emptyArray;

    public void LiveStreamMessages$SCAuthorResume(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCAuthorResume[] emptyArray(){
       if (LiveStreamMessages$SCAuthorResume._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCAuthorResume._emptyArray == null) {
             LiveStreamMessages$SCAuthorResume[] sCAuthorResu = new LiveStreamMessages$SCAuthorResume[0];
             LiveStreamMessages$SCAuthorResume._emptyArray = sCAuthorResu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCAuthorResume._emptyArray;
    }
    public static LiveStreamMessages$SCAuthorResume parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCAuthorResume().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCAuthorResume parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCAuthorResume(), p0);
    }
    public LiveStreamMessages$SCAuthorResume clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCAuthorResume ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCAuthorResume mergeFrom(CodedInputByteBufferNano p0){
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
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCAuthorResume ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
