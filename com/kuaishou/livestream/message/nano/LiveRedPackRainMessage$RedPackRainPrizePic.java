package com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPrizePic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveRedPackRainMessage$RedPackRainPrizePic extends MessageNano	// class@001273
{
    public UserInfos$PicUrl[] picUrl;
    public String prizeId;
    public int prizeType;
    public static LiveRedPackRainMessage$RedPackRainPrizePic[] _emptyArray;

    public void LiveRedPackRainMessage$RedPackRainPrizePic(){
       super();
       this.clear();
    }
    public static LiveRedPackRainMessage$RedPackRainPrizePic[] emptyArray(){
       if (LiveRedPackRainMessage$RedPackRainPrizePic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackRainMessage$RedPackRainPrizePic._emptyArray == null) {
             LiveRedPackRainMessage$RedPackRainPrizePic[] redPackRainP = new LiveRedPackRainMessage$RedPackRainPrizePic[0];
             LiveRedPackRainMessage$RedPackRainPrizePic._emptyArray = redPackRainP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackRainMessage$RedPackRainPrizePic._emptyArray;
    }
    public static LiveRedPackRainMessage$RedPackRainPrizePic parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackRainMessage$RedPackRainPrizePic().mergeFrom(p0);
    }
    public static LiveRedPackRainMessage$RedPackRainPrizePic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackRainMessage$RedPackRainPrizePic(), p0);
    }
    public LiveRedPackRainMessage$RedPackRainPrizePic clear(){
       this.prizeType = 0;
       this.prizeId = "";
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRedPackRainMessage$RedPackRainPrizePic tprizeType = this.prizeType;
       if (tprizeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tprizeType);
       }
       if (!(this.prizeId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.prizeId);
       }
       tprizeType = this.picUrl;
       if (tprizeType != null && tprizeType.length > 0) {
          int i1 = 0;
          LiveRedPackRainMessage$RedPackRainPrizePic tpicUrl = this.picUrl;
          while (i1 < tpicUrl.length) {
             object oobject = tpicUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackRainMessage$RedPackRainPrizePic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveRedPackRainMessage$RedPackRainPrizePic tpicUrl = this.picUrl;
                   int i2 = (tpicUrl == null)? 0: tpicUrl.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tpicUrl, 0, picUrlArray, 0, i2);
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
                   this.picUrl = picUrlArray;
                }
             }else {
                this.prizeId = p0.readString();
             }
          }else {
             this.prizeType = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRedPackRainMessage$RedPackRainPrizePic tprizeType = this.prizeType;
       if (tprizeType != null) {
          p0.writeInt32(1, tprizeType);
       }
       if (!(this.prizeId).equals("")) {
          p0.writeString(2, this.prizeId);
       }
       tprizeType = this.picUrl;
       if (tprizeType != null && tprizeType.length > 0) {
          int i = 0;
          LiveRedPackRainMessage$RedPackRainPrizePic tpicUrl = this.picUrl;
          while (i < tpicUrl.length) {
             object oobject = tpicUrl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
