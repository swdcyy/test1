package com.kuaishou.protobuf.livestream.nano.LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 extends MessageNano	// class@000c2b
{
    public String encryptRoundsId;
    public long signalDeadlineTime;
    public long userId;
    public boolean videoReadyFlag;
    public static LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023[] _emptyArray;

    public void LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023(){
       super();
       this.clear();
    }
    public static LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023[] emptyArray(){
       if (LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023._emptyArray == null) {
             LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023[] liveAllDayBv = new LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023[0];
             LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023._emptyArray = liveAllDayBv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023._emptyArray;
    }
    public static LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023().mergeFrom(p0);
    }
    public static LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023(), p0);
    }
    public LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 clear(){
       this.videoReadyFlag = false;
       this.userId = 0;
       this.encryptRoundsId = "";
       this.signalDeadlineTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 tvideoReadyF = this.videoReadyFlag;
       if (tvideoReadyF != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tvideoReadyF);
       }
       tvideoReadyF = this.userId;
       int i1 = 0;
       if (tvideoReadyF - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tvideoReadyF);
       }
       if (!(this.encryptRoundsId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.encryptRoundsId);
       }
       tvideoReadyF = this.signalDeadlineTime;
       if (tvideoReadyF - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, tvideoReadyF);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.signalDeadlineTime = p0.readInt64();
                   }
                }else {
                   this.encryptRoundsId = p0.readString();
                }
             }else {
                this.userId = p0.readUInt64();
             }
          }else {
             this.videoReadyFlag = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 tvideoReadyF = this.videoReadyFlag;
       if (tvideoReadyF != null) {
          p0.writeBool(1, tvideoReadyF);
       }
       tvideoReadyF = this.userId;
       int i = 0;
       if (tvideoReadyF - i) {
          p0.writeUInt64(2, tvideoReadyF);
       }
       if (!(this.encryptRoundsId).equals("")) {
          p0.writeString(3, this.encryptRoundsId);
       }
       tvideoReadyF = this.signalDeadlineTime;
       if (tvideoReadyF - i) {
          p0.writeInt64(4, tvideoReadyF);
       }
       super.writeTo(p0);
       return;
    }
}
