package com.kuaishou.protobuf.livestream.nano.BountyGameResultInfo$UserHead;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class BountyGameResultInfo$UserHead extends MessageNano	// class@000c07
{
    public UserInfos$PicUrl[] headUrl;
    public static BountyGameResultInfo$UserHead[] _emptyArray;

    public void BountyGameResultInfo$UserHead(){
       super();
       this.clear();
    }
    public static BountyGameResultInfo$UserHead[] emptyArray(){
       if (BountyGameResultInfo$UserHead._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (BountyGameResultInfo$UserHead._emptyArray == null) {
             BountyGameResultInfo$UserHead[] userHeadArra = new BountyGameResultInfo$UserHead[0];
             BountyGameResultInfo$UserHead._emptyArray = userHeadArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return BountyGameResultInfo$UserHead._emptyArray;
    }
    public static BountyGameResultInfo$UserHead parseFrom(CodedInputByteBufferNano p0){
       return new BountyGameResultInfo$UserHead().mergeFrom(p0);
    }
    public static BountyGameResultInfo$UserHead parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new BountyGameResultInfo$UserHead(), p0);
    }
    public BountyGameResultInfo$UserHead clear(){
       this.headUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       BountyGameResultInfo$UserHead theadUrl = this.headUrl;
       if (theadUrl != null && theadUrl.length > 0) {
          int i1 = 0;
          BountyGameResultInfo$UserHead theadUrl1 = this.headUrl;
          while (i1 < theadUrl1.length) {
             object oobject = theadUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public BountyGameResultInfo$UserHead mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             BountyGameResultInfo$UserHead theadUrl = this.headUrl;
             int i2 = (theadUrl == null)? 0: theadUrl.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(theadUrl, 0, picUrlArray, 0, i2);
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
             this.headUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       BountyGameResultInfo$UserHead theadUrl = this.headUrl;
       if (theadUrl != null && theadUrl.length > 0) {
          int i = 0;
          BountyGameResultInfo$UserHead theadUrl1 = this.headUrl;
          while (i < theadUrl1.length) {
             object oobject = theadUrl1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
