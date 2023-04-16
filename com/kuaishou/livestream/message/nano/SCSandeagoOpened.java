package com.kuaishou.livestream.message.nano.SCSandeagoOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCSandeagoOpened extends MessageNano	// class@001461
{
    public String bubbleDesc;
    public long displayIntervalMillis;
    public UserInfos$PicUrl[] imageUrls;
    public String itemId;
    public String liveStreamId;
    public long maxDelayMillis;
    public String price;
    public long totalStock;
    public static SCSandeagoOpened[] _emptyArray;

    public void SCSandeagoOpened(){
       super();
       this.clear();
    }
    public static SCSandeagoOpened[] emptyArray(){
       if (SCSandeagoOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCSandeagoOpened._emptyArray == null) {
             SCSandeagoOpened[] sCSandeagoOp = new SCSandeagoOpened[0];
             SCSandeagoOpened._emptyArray = sCSandeagoOp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCSandeagoOpened._emptyArray;
    }
    public static SCSandeagoOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCSandeagoOpened().mergeFrom(p0);
    }
    public static SCSandeagoOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCSandeagoOpened(), p0);
    }
    public SCSandeagoOpened clear(){
       this.liveStreamId = "";
       this.itemId = "";
       this.imageUrls = UserInfos$PicUrl.emptyArray();
       this.totalStock = 0;
       this.displayIntervalMillis = 0;
       this.maxDelayMillis = 0;
       this.price = "";
       this.bubbleDesc = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       SCSandeagoOpened timageUrls1;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.itemId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.itemId);
       }
       SCSandeagoOpened timageUrls = this.imageUrls;
       if (timageUrls != null && timageUrls.length > 0) {
          int i1 = 0;
          timageUrls1 = this.imageUrls;
          while (i1 < timageUrls1.length) {
             object oobject = timageUrls1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       timageUrls1 = this.totalStock;
       if (timageUrls1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, timageUrls1);
       }
       timageUrls1 = this.displayIntervalMillis;
       if (timageUrls1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, timageUrls1);
       }
       timageUrls1 = this.maxDelayMillis;
       if (timageUrls1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, timageUrls1);
       }
       if (!(this.price).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.price);
       }
       if (!(this.bubbleDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.bubbleDesc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCSandeagoOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.bubbleDesc = p0.readString();
                               }
                            }else {
                               this.price = p0.readString();
                            }
                         }else {
                            this.maxDelayMillis = p0.readUInt64();
                         }
                      }else {
                         this.displayIntervalMillis = p0.readUInt64();
                      }
                   }else {
                      this.totalStock = p0.readUInt64();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCSandeagoOpened timageUrls = this.imageUrls;
                   int i2 = (timageUrls == null)? 0: timageUrls.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(timageUrls, 0, picUrlArray, 0, i2);
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
                   this.imageUrls = picUrlArray;
                }
             }else {
                this.itemId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCSandeagoOpened timageUrls1;
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.itemId).equals(str)) {
          p0.writeString(2, this.itemId);
       }
       SCSandeagoOpened timageUrls = this.imageUrls;
       if (timageUrls != null && timageUrls.length > 0) {
          int i = 0;
          timageUrls1 = this.imageUrls;
          while (i < timageUrls1.length) {
             object oobject = timageUrls1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       timageUrls1 = this.totalStock;
       if (timageUrls1) {
          p0.writeUInt64(4, timageUrls1);
       }
       timageUrls1 = this.displayIntervalMillis;
       if (timageUrls1) {
          p0.writeUInt64(5, timageUrls1);
       }
       timageUrls1 = this.maxDelayMillis;
       if (timageUrls1) {
          p0.writeUInt64(6, timageUrls1);
       }
       if (!(this.price).equals(str)) {
          p0.writeString(7, this.price);
       }
       if (!(this.bubbleDesc).equals(str)) {
          p0.writeString(8, this.bubbleDesc);
       }
       super.writeTo(p0);
       return;
    }
}
