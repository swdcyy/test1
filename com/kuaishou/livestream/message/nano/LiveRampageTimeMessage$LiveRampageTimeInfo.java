package com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampage100StageInfo;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeTextInfo;

public final class LiveRampageTimeMessage$LiveRampageTimeInfo extends MessageNano	// class@001265
{
    public String backColor;
    public LiveRampageTimeMessage$LiveRampage100StageInfo countDownInfo;
    public int effectRateLimit;
    public int giftId;
    public double progress;
    public String route;
    public int stage;
    public LiveRampageTimeMessage$LiveRampageTimeTextInfo textInfo;
    public static LiveRampageTimeMessage$LiveRampageTimeInfo[] _emptyArray;

    public void LiveRampageTimeMessage$LiveRampageTimeInfo(){
       super();
       this.clear();
    }
    public static LiveRampageTimeMessage$LiveRampageTimeInfo[] emptyArray(){
       if (LiveRampageTimeMessage$LiveRampageTimeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRampageTimeMessage$LiveRampageTimeInfo._emptyArray == null) {
             LiveRampageTimeMessage$LiveRampageTimeInfo[] liveRampageT = new LiveRampageTimeMessage$LiveRampageTimeInfo[0];
             LiveRampageTimeMessage$LiveRampageTimeInfo._emptyArray = liveRampageT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRampageTimeMessage$LiveRampageTimeInfo._emptyArray;
    }
    public static LiveRampageTimeMessage$LiveRampageTimeInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRampageTimeMessage$LiveRampageTimeInfo().mergeFrom(p0);
    }
    public static LiveRampageTimeMessage$LiveRampageTimeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRampageTimeMessage$LiveRampageTimeInfo(), p0);
    }
    public LiveRampageTimeMessage$LiveRampageTimeInfo clear(){
       this.giftId = 0;
       this.stage = 0;
       this.textInfo = null;
       this.progress = 0;
       this.countDownInfo = null;
       this.route = "";
       this.backColor = "";
       this.effectRateLimit = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRampageTimeMessage$LiveRampageTimeInfo tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       tgiftId = this.stage;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tgiftId);
       }
       tgiftId = this.textInfo;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tgiftId);
       }
       if (Double.doubleToLongBits(this.progress) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(4, this.progress);
       }
       tgiftId = this.countDownInfo;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tgiftId);
       }
       String str = "";
       if (!(this.route).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.route);
       }
       if (!(this.backColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.backColor);
       }
       tgiftId = this.effectRateLimit;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRampageTimeMessage$LiveRampageTimeInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 33) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.effectRateLimit = p0.readUInt32();
                               }
                            }else {
                               this.backColor = p0.readString();
                            }
                         }else {
                            this.route = p0.readString();
                         }
                      }else if(this.countDownInfo == null){
                         this.countDownInfo = new LiveRampageTimeMessage$LiveRampage100StageInfo();
                      }
                      p0.readMessage(this.countDownInfo);
                   }else {
                      this.progress = p0.readDouble();
                   }
                }else if(this.textInfo == null){
                   this.textInfo = new LiveRampageTimeMessage$LiveRampageTimeTextInfo();
                }
                p0.readMessage(this.textInfo);
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.stage = i;
                }
             }
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRampageTimeMessage$LiveRampageTimeInfo tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       tgiftId = this.stage;
       if (tgiftId != null) {
          p0.writeInt32(2, tgiftId);
       }
       tgiftId = this.textInfo;
       if (tgiftId != null) {
          p0.writeMessage(3, tgiftId);
       }
       if (Double.doubleToLongBits(this.progress) - Double.doubleToLongBits(0)) {
          p0.writeDouble(4, this.progress);
       }
       tgiftId = this.countDownInfo;
       if (tgiftId != null) {
          p0.writeMessage(5, tgiftId);
       }
       String str = "";
       if (!(this.route).equals(str)) {
          p0.writeString(6, this.route);
       }
       if (!(this.backColor).equals(str)) {
          p0.writeString(7, this.backColor);
       }
       tgiftId = this.effectRateLimit;
       if (tgiftId != null) {
          p0.writeUInt32(8, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
