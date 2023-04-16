package com.kuaishou.livestream.message.nano.LiveStreamMessages$RedPackRainInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$RedPackRainInfo extends MessageNano	// class@001321
{
    public long countDownMillis;
    public long latestStartTime;
    public long normalStartTime;
    public long rainDuration;
    public String redPackRainId;
    public long requestMaxDelayMillis;
    public static LiveStreamMessages$RedPackRainInfo[] _emptyArray;

    public void LiveStreamMessages$RedPackRainInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$RedPackRainInfo[] emptyArray(){
       if (LiveStreamMessages$RedPackRainInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$RedPackRainInfo._emptyArray == null) {
             LiveStreamMessages$RedPackRainInfo[] redPackRainI = new LiveStreamMessages$RedPackRainInfo[0];
             LiveStreamMessages$RedPackRainInfo._emptyArray = redPackRainI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$RedPackRainInfo._emptyArray;
    }
    public static LiveStreamMessages$RedPackRainInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$RedPackRainInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$RedPackRainInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$RedPackRainInfo(), p0);
    }
    public LiveStreamMessages$RedPackRainInfo clear(){
       this.redPackRainId = "";
       this.countDownMillis = 0;
       this.normalStartTime = 0;
       this.latestStartTime = 0;
       this.rainDuration = 0;
       this.requestMaxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.redPackRainId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.redPackRainId);
       }
       LiveStreamMessages$RedPackRainInfo tcountDownMi = this.countDownMillis;
       int i1 = 0;
       if (tcountDownMi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcountDownMi);
       }
       tcountDownMi = this.normalStartTime;
       if (tcountDownMi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcountDownMi);
       }
       tcountDownMi = this.latestStartTime;
       if (tcountDownMi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcountDownMi);
       }
       tcountDownMi = this.rainDuration;
       if (tcountDownMi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcountDownMi);
       }
       tcountDownMi = this.requestMaxDelayMillis;
       if (tcountDownMi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tcountDownMi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$RedPackRainInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.requestMaxDelayMillis = p0.readUInt64();
                         }
                      }else {
                         this.rainDuration = p0.readUInt64();
                      }
                   }else {
                      this.latestStartTime = p0.readUInt64();
                   }
                }else {
                   this.normalStartTime = p0.readUInt64();
                }
             }else {
                this.countDownMillis = p0.readUInt64();
             }
          }else {
             this.redPackRainId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.redPackRainId).equals("")) {
          p0.writeString(1, this.redPackRainId);
       }
       LiveStreamMessages$RedPackRainInfo tcountDownMi = this.countDownMillis;
       int i = 0;
       if (tcountDownMi - i) {
          p0.writeUInt64(2, tcountDownMi);
       }
       tcountDownMi = this.normalStartTime;
       if (tcountDownMi - i) {
          p0.writeUInt64(3, tcountDownMi);
       }
       tcountDownMi = this.latestStartTime;
       if (tcountDownMi - i) {
          p0.writeUInt64(4, tcountDownMi);
       }
       tcountDownMi = this.rainDuration;
       if (tcountDownMi - i) {
          p0.writeUInt64(5, tcountDownMi);
       }
       tcountDownMi = this.requestMaxDelayMillis;
       if (tcountDownMi - i) {
          p0.writeUInt64(6, tcountDownMi);
       }
       super.writeTo(p0);
       return;
    }
}
