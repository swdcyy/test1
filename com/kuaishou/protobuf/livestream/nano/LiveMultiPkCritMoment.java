package com.kuaishou.protobuf.livestream.nano.LiveMultiPkCritMoment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkCritMoment extends MessageNano	// class@000cbd
{
    public long critMomentEndTime;
    public long critMomentId;
    public long critMomentStartTime;
    public String multiPkBandText;
    public String multiPkId;
    public int showAnimationEndIntervalSecond;
    public long timestamp;
    public static LiveMultiPkCritMoment[] _emptyArray;

    public void LiveMultiPkCritMoment(){
       super();
       this.clear();
    }
    public static LiveMultiPkCritMoment[] emptyArray(){
       if (LiveMultiPkCritMoment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkCritMoment._emptyArray == null) {
             LiveMultiPkCritMoment[] liveMultiPkC = new LiveMultiPkCritMoment[0];
             LiveMultiPkCritMoment._emptyArray = liveMultiPkC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkCritMoment._emptyArray;
    }
    public static LiveMultiPkCritMoment parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkCritMoment().mergeFrom(p0);
    }
    public static LiveMultiPkCritMoment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkCritMoment(), p0);
    }
    public LiveMultiPkCritMoment clear(){
       this.critMomentStartTime = 0;
       this.critMomentEndTime = 0;
       this.multiPkBandText = "";
       this.showAnimationEndIntervalSecond = 0;
       this.timestamp = 0;
       this.multiPkId = "";
       this.critMomentId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkCritMoment tcritMomentS = this.critMomentStartTime;
       int i1 = 0;
       if (tcritMomentS - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tcritMomentS);
       }
       tcritMomentS = this.critMomentEndTime;
       if (tcritMomentS - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcritMomentS);
       }
       String str = "";
       if (!(this.multiPkBandText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.multiPkBandText);
       }
       tcritMomentS = this.showAnimationEndIntervalSecond;
       if (tcritMomentS != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tcritMomentS);
       }
       LiveMultiPkCritMoment ttimestamp = this.timestamp;
       if (ttimestamp - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttimestamp);
       }
       if (!(this.multiPkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.multiPkId);
       }
       tcritMomentS = this.critMomentId;
       if (tcritMomentS - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tcritMomentS);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkCritMoment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.critMomentId = p0.readUInt64();
                            }
                         }else {
                            this.multiPkId = p0.readString();
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.showAnimationEndIntervalSecond = p0.readUInt32();
                   }
                }else {
                   this.multiPkBandText = p0.readString();
                }
             }else {
                this.critMomentEndTime = p0.readUInt64();
             }
          }else {
             this.critMomentStartTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkCritMoment tcritMomentS = this.critMomentStartTime;
       int i = 0;
       if (tcritMomentS - i) {
          p0.writeUInt64(1, tcritMomentS);
       }
       tcritMomentS = this.critMomentEndTime;
       if (tcritMomentS - i) {
          p0.writeUInt64(2, tcritMomentS);
       }
       String str = "";
       if (!(this.multiPkBandText).equals(str)) {
          p0.writeString(3, this.multiPkBandText);
       }
       tcritMomentS = this.showAnimationEndIntervalSecond;
       if (tcritMomentS != null) {
          p0.writeUInt32(4, tcritMomentS);
       }
       LiveMultiPkCritMoment ttimestamp = this.timestamp;
       if (ttimestamp - i) {
          p0.writeUInt64(5, ttimestamp);
       }
       if (!(this.multiPkId).equals(str)) {
          p0.writeString(6, this.multiPkId);
       }
       tcritMomentS = this.critMomentId;
       if (tcritMomentS - i) {
          p0.writeUInt64(7, tcritMomentS);
       }
       super.writeTo(p0);
       return;
    }
}
