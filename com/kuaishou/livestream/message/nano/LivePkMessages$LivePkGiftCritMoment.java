package com.kuaishou.livestream.message.nano.LivePkMessages$LivePkGiftCritMoment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePkMessages$LivePkGiftCritMoment extends MessageNano	// class@001214
{
    public UserInfos$PicUrl[] countdownRuleHintPic;
    public long endTime;
    public String pkId;
    public long startTime;
    public static LivePkMessages$LivePkGiftCritMoment[] _emptyArray;

    public void LivePkMessages$LivePkGiftCritMoment(){
       super();
       this.clear();
    }
    public static LivePkMessages$LivePkGiftCritMoment[] emptyArray(){
       if (LivePkMessages$LivePkGiftCritMoment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$LivePkGiftCritMoment._emptyArray == null) {
             LivePkMessages$LivePkGiftCritMoment[] livePkGiftCr = new LivePkMessages$LivePkGiftCritMoment[0];
             LivePkMessages$LivePkGiftCritMoment._emptyArray = livePkGiftCr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$LivePkGiftCritMoment._emptyArray;
    }
    public static LivePkMessages$LivePkGiftCritMoment parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$LivePkGiftCritMoment().mergeFrom(p0);
    }
    public static LivePkMessages$LivePkGiftCritMoment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$LivePkGiftCritMoment(), p0);
    }
    public LivePkMessages$LivePkGiftCritMoment clear(){
       this.pkId = "";
       this.startTime = 0;
       this.endTime = 0;
       this.countdownRuleHintPic = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$LivePkGiftCritMoment tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstartTime);
       }
       tstartTime = this.countdownRuleHintPic;
       if (tstartTime != null && tstartTime.length > 0) {
          int i2 = 0;
          LivePkMessages$LivePkGiftCritMoment tcountdownRu = this.countdownRuleHintPic;
          while (i2 < tcountdownRu.length) {
             object oobject = tcountdownRu[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$LivePkGiftCritMoment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LivePkMessages$LivePkGiftCritMoment tcountdownRu = this.countdownRuleHintPic;
                      int i2 = (tcountdownRu == null)? 0: tcountdownRu.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tcountdownRu, 0, picUrlArray, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         picUrlArray[i2] = new UserInfos$PicUrl();
                         p0.readMessage(picUrlArray[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      this.countdownRuleHintPic = picUrlArray;
                   }
                }else {
                   this.endTime = p0.readUInt64();
                }
             }else {
                this.startTime = p0.readUInt64();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       LivePkMessages$LivePkGiftCritMoment tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i) {
          p0.writeUInt64(3, tstartTime);
       }
       tstartTime = this.countdownRuleHintPic;
       if (tstartTime != null && tstartTime.length > 0) {
          int i1 = 0;
          LivePkMessages$LivePkGiftCritMoment tcountdownRu = this.countdownRuleHintPic;
          while (i1 < tcountdownRu.length) {
             object oobject = tcountdownRu[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
