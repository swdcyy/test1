package com.kuaishou.livestream.message.nano.SCLiveAllDayBVRPSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonRoute;
import com.kuaishou.livestream.message.nano.RangeInfo;

public final class SCLiveAllDayBVRPSignal extends MessageNano	// class@001402
{
    public long acaTagDeadlineTime;
    public String encryptKey;
    public String encryptRoundsId;
    public LiveCommonRoute liveBrandRoute;
    public RangeInfo rangeInfo;
    public long requestRandomDelayMs;
    public int rpCount;
    public static SCLiveAllDayBVRPSignal[] _emptyArray;

    public void SCLiveAllDayBVRPSignal(){
       super();
       this.clear();
    }
    public static SCLiveAllDayBVRPSignal[] emptyArray(){
       if (SCLiveAllDayBVRPSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAllDayBVRPSignal._emptyArray == null) {
             SCLiveAllDayBVRPSignal[] sCLiveAllDay = new SCLiveAllDayBVRPSignal[0];
             SCLiveAllDayBVRPSignal._emptyArray = sCLiveAllDay;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAllDayBVRPSignal._emptyArray;
    }
    public static SCLiveAllDayBVRPSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAllDayBVRPSignal().mergeFrom(p0);
    }
    public static SCLiveAllDayBVRPSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAllDayBVRPSignal(), p0);
    }
    public SCLiveAllDayBVRPSignal clear(){
       this.encryptKey = "";
       this.encryptRoundsId = "";
       this.rpCount = 0;
       this.requestRandomDelayMs = 0;
       this.rangeInfo = null;
       this.liveBrandRoute = null;
       this.acaTagDeadlineTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.encryptKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.encryptKey);
       }
       if (!(this.encryptRoundsId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.encryptRoundsId);
       }
       SCLiveAllDayBVRPSignal trpCount = this.rpCount;
       if (trpCount != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, trpCount);
       }
       trpCount = this.requestRandomDelayMs;
       int i1 = 0;
       if (trpCount - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, trpCount);
       }
       trpCount = this.rangeInfo;
       if (trpCount != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, trpCount);
       }
       trpCount = this.liveBrandRoute;
       if (trpCount != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, trpCount);
       }
       trpCount = this.acaTagDeadlineTime;
       if (trpCount - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(7, trpCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAllDayBVRPSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.acaTagDeadlineTime = p0.readInt64();
                            }
                         }else if(this.liveBrandRoute == null){
                            this.liveBrandRoute = new LiveCommonRoute();
                         }
                         p0.readMessage(this.liveBrandRoute);
                      }else if(this.rangeInfo == null){
                         this.rangeInfo = new RangeInfo();
                      }
                      p0.readMessage(this.rangeInfo);
                   }else {
                      this.requestRandomDelayMs = p0.readInt64();
                   }
                }else {
                   this.rpCount = p0.readInt32();
                }
             }else {
                this.encryptRoundsId = p0.readString();
             }
          }else {
             this.encryptKey = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.encryptKey).equals(str)) {
          p0.writeString(1, this.encryptKey);
       }
       if (!(this.encryptRoundsId).equals(str)) {
          p0.writeString(2, this.encryptRoundsId);
       }
       SCLiveAllDayBVRPSignal trpCount = this.rpCount;
       if (trpCount != null) {
          p0.writeInt32(3, trpCount);
       }
       trpCount = this.requestRandomDelayMs;
       int i = 0;
       if (trpCount - i) {
          p0.writeInt64(4, trpCount);
       }
       trpCount = this.rangeInfo;
       if (trpCount != null) {
          p0.writeMessage(5, trpCount);
       }
       trpCount = this.liveBrandRoute;
       if (trpCount != null) {
          p0.writeMessage(6, trpCount);
       }
       trpCount = this.acaTagDeadlineTime;
       if (trpCount - i) {
          p0.writeInt64(7, trpCount);
       }
       super.writeTo(p0);
       return;
    }
}
