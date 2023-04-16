package com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryPopUp;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveHousePendantMessages$LiveHouseLotteryPopUp extends MessageNano	// class@0011c5
{
    public String activityCode;
    public String buttonText;
    public String subTitle;
    public String title;
    public static LiveHousePendantMessages$LiveHouseLotteryPopUp[] _emptyArray;

    public void LiveHousePendantMessages$LiveHouseLotteryPopUp(){
       super();
       this.clear();
    }
    public static LiveHousePendantMessages$LiveHouseLotteryPopUp[] emptyArray(){
       if (LiveHousePendantMessages$LiveHouseLotteryPopUp._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveHousePendantMessages$LiveHouseLotteryPopUp._emptyArray == null) {
             LiveHousePendantMessages$LiveHouseLotteryPopUp[] liveHouseLot = new LiveHousePendantMessages$LiveHouseLotteryPopUp[0];
             LiveHousePendantMessages$LiveHouseLotteryPopUp._emptyArray = liveHouseLot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveHousePendantMessages$LiveHouseLotteryPopUp._emptyArray;
    }
    public static LiveHousePendantMessages$LiveHouseLotteryPopUp parseFrom(CodedInputByteBufferNano p0){
       return new LiveHousePendantMessages$LiveHouseLotteryPopUp().mergeFrom(p0);
    }
    public static LiveHousePendantMessages$LiveHouseLotteryPopUp parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveHousePendantMessages$LiveHouseLotteryPopUp(), p0);
    }
    public LiveHousePendantMessages$LiveHouseLotteryPopUp clear(){
       this.activityCode = "";
       this.buttonText = "";
       this.subTitle = "";
       this.title = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.activityCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityCode);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.buttonText);
       }
       if (!(this.subTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.subTitle);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.title);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveHousePendantMessages$LiveHouseLotteryPopUp mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.title = p0.readString();
                   }
                }else {
                   this.subTitle = p0.readString();
                }
             }else {
                this.buttonText = p0.readString();
             }
          }else {
             this.activityCode = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.activityCode).equals(str)) {
          p0.writeString(1, this.activityCode);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(2, this.buttonText);
       }
       if (!(this.subTitle).equals(str)) {
          p0.writeString(3, this.subTitle);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(4, this.title);
       }
       super.writeTo(p0);
       return;
    }
}
