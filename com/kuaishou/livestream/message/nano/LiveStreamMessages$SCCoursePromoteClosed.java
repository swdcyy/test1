package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCCoursePromoteClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCCoursePromoteClosed extends MessageNano	// class@00132b
{
    public long time;
    public static LiveStreamMessages$SCCoursePromoteClosed[] _emptyArray;

    public void LiveStreamMessages$SCCoursePromoteClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCCoursePromoteClosed[] emptyArray(){
       if (LiveStreamMessages$SCCoursePromoteClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCCoursePromoteClosed._emptyArray == null) {
             LiveStreamMessages$SCCoursePromoteClosed[] sCCourseProm = new LiveStreamMessages$SCCoursePromoteClosed[0];
             LiveStreamMessages$SCCoursePromoteClosed._emptyArray = sCCourseProm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCCoursePromoteClosed._emptyArray;
    }
    public static LiveStreamMessages$SCCoursePromoteClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCCoursePromoteClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCCoursePromoteClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCCoursePromoteClosed(), p0);
    }
    public LiveStreamMessages$SCCoursePromoteClosed clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCCoursePromoteClosed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCCoursePromoteClosed mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCCoursePromoteClosed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
