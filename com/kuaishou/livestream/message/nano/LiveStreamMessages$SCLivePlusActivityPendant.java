package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLivePlusActivityPendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityNewPendantKdsInfo;

public final class LiveStreamMessages$SCLivePlusActivityPendant extends MessageNano	// class@00134b
{
    public long displayDurationMs;
    public long endTime;
    public LiveStreamMessages$LiveActivityNewPendantKdsInfo kdsInfo;
    public String logParams;
    public String logStatus;
    public String pendantId;
    public static LiveStreamMessages$SCLivePlusActivityPendant[] _emptyArray;

    public void LiveStreamMessages$SCLivePlusActivityPendant(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLivePlusActivityPendant[] emptyArray(){
       if (LiveStreamMessages$SCLivePlusActivityPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLivePlusActivityPendant._emptyArray == null) {
             LiveStreamMessages$SCLivePlusActivityPendant[] sCLivePlusAc = new LiveStreamMessages$SCLivePlusActivityPendant[0];
             LiveStreamMessages$SCLivePlusActivityPendant._emptyArray = sCLivePlusAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLivePlusActivityPendant._emptyArray;
    }
    public static LiveStreamMessages$SCLivePlusActivityPendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLivePlusActivityPendant().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLivePlusActivityPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLivePlusActivityPendant(), p0);
    }
    public LiveStreamMessages$SCLivePlusActivityPendant clear(){
       this.pendantId = "";
       this.kdsInfo = null;
       this.logParams = "";
       this.logStatus = "";
       this.endTime = 0;
       this.displayDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pendantId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pendantId);
       }
       LiveStreamMessages$SCLivePlusActivityPendant tkdsInfo = this.kdsInfo;
       if (tkdsInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tkdsInfo);
       }
       if (!(this.logParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.logParams);
       }
       if (!(this.logStatus).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.logStatus);
       }
       tkdsInfo = this.endTime;
       int i1 = 0;
       if (tkdsInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tkdsInfo);
       }
       tkdsInfo = this.displayDurationMs;
       if (tkdsInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tkdsInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLivePlusActivityPendant mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.displayDurationMs = p0.readUInt64();
                         }
                      }else {
                         this.endTime = p0.readUInt64();
                      }
                   }else {
                      this.logStatus = p0.readString();
                   }
                }else {
                   this.logParams = p0.readString();
                }
             }else if(this.kdsInfo == null){
                this.kdsInfo = new LiveStreamMessages$LiveActivityNewPendantKdsInfo();
             }
             p0.readMessage(this.kdsInfo);
          }else {
             this.pendantId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.pendantId).equals(str)) {
          p0.writeString(1, this.pendantId);
       }
       LiveStreamMessages$SCLivePlusActivityPendant tkdsInfo = this.kdsInfo;
       if (tkdsInfo != null) {
          p0.writeMessage(2, tkdsInfo);
       }
       if (!(this.logParams).equals(str)) {
          p0.writeString(3, this.logParams);
       }
       if (!(this.logStatus).equals(str)) {
          p0.writeString(4, this.logStatus);
       }
       tkdsInfo = this.endTime;
       int i = 0;
       if (tkdsInfo - i) {
          p0.writeUInt64(5, tkdsInfo);
       }
       tkdsInfo = this.displayDurationMs;
       if (tkdsInfo - i) {
          p0.writeUInt64(6, tkdsInfo);
       }
       super.writeTo(p0);
       return;
    }
}
