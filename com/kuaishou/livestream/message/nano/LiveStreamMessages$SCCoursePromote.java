package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCCoursePromote;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCCoursePromote extends MessageNano	// class@00132a
{
    public String redirectPath;
    public long time;
    public static LiveStreamMessages$SCCoursePromote[] _emptyArray;

    public void LiveStreamMessages$SCCoursePromote(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCCoursePromote[] emptyArray(){
       if (LiveStreamMessages$SCCoursePromote._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCCoursePromote._emptyArray == null) {
             LiveStreamMessages$SCCoursePromote[] sCCourseProm = new LiveStreamMessages$SCCoursePromote[0];
             LiveStreamMessages$SCCoursePromote._emptyArray = sCCourseProm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCCoursePromote._emptyArray;
    }
    public static LiveStreamMessages$SCCoursePromote parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCCoursePromote().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCCoursePromote parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCCoursePromote(), p0);
    }
    public LiveStreamMessages$SCCoursePromote clear(){
       this.redirectPath = "";
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.redirectPath).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.redirectPath);
       }
       LiveStreamMessages$SCCoursePromote ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCCoursePromote mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.time = p0.readUInt64();
             }
          }else {
             this.redirectPath = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.redirectPath).equals("")) {
          p0.writeString(1, this.redirectPath);
       }
       LiveStreamMessages$SCCoursePromote ttime = this.time;
       if (ttime) {
          p0.writeUInt64(2, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
