package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkHighValueStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkHighValueStatistic extends MessageNano	// class@001314
{
    public String fansCount;
    public String fansCountFromOpponent;
    public String giftValue;
    public boolean highValue;
    public boolean showCommentNotice;
    public static LiveStreamMessages$PkHighValueStatistic[] _emptyArray;

    public void LiveStreamMessages$PkHighValueStatistic(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkHighValueStatistic[] emptyArray(){
       if (LiveStreamMessages$PkHighValueStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkHighValueStatistic._emptyArray == null) {
             LiveStreamMessages$PkHighValueStatistic[] pkHighValueS = new LiveStreamMessages$PkHighValueStatistic[0];
             LiveStreamMessages$PkHighValueStatistic._emptyArray = pkHighValueS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkHighValueStatistic._emptyArray;
    }
    public static LiveStreamMessages$PkHighValueStatistic parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkHighValueStatistic().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkHighValueStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkHighValueStatistic(), p0);
    }
    public LiveStreamMessages$PkHighValueStatistic clear(){
       this.highValue = false;
       this.showCommentNotice = false;
       this.giftValue = "";
       this.fansCount = "";
       this.fansCountFromOpponent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkHighValueStatistic thighValue = this.highValue;
       if (thighValue != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, thighValue);
       }
       thighValue = this.showCommentNotice;
       if (thighValue != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, thighValue);
       }
       String str = "";
       if (!(this.giftValue).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.giftValue);
       }
       if (!(this.fansCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.fansCount);
       }
       if (!(this.fansCountFromOpponent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.fansCountFromOpponent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkHighValueStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.fansCountFromOpponent = p0.readString();
                      }
                   }else {
                      this.fansCount = p0.readString();
                   }
                }else {
                   this.giftValue = p0.readString();
                }
             }else {
                this.showCommentNotice = p0.readBool();
             }
          }else {
             this.highValue = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PkHighValueStatistic thighValue = this.highValue;
       if (thighValue != null) {
          p0.writeBool(1, thighValue);
       }
       thighValue = this.showCommentNotice;
       if (thighValue != null) {
          p0.writeBool(2, thighValue);
       }
       String str = "";
       if (!(this.giftValue).equals(str)) {
          p0.writeString(3, this.giftValue);
       }
       if (!(this.fansCount).equals(str)) {
          p0.writeString(4, this.fansCount);
       }
       if (!(this.fansCountFromOpponent).equals(str)) {
          p0.writeString(5, this.fansCountFromOpponent);
       }
       super.writeTo(p0);
       return;
    }
}
