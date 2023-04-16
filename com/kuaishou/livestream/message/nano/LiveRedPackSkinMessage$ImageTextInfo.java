package com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$ImageTextInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveRedPackSkinMessage$ImageTextInfo extends MessageNano	// class@001279
{
    public UserInfos$PicUrl[] backGround;
    public int insertLeftDp;
    public int insertRightDp;
    public String messageContent;
    public String messageFontColor;
    public static LiveRedPackSkinMessage$ImageTextInfo[] _emptyArray;

    public void LiveRedPackSkinMessage$ImageTextInfo(){
       super();
       this.clear();
    }
    public static LiveRedPackSkinMessage$ImageTextInfo[] emptyArray(){
       if (LiveRedPackSkinMessage$ImageTextInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackSkinMessage$ImageTextInfo._emptyArray == null) {
             LiveRedPackSkinMessage$ImageTextInfo[] imageTextInf = new LiveRedPackSkinMessage$ImageTextInfo[0];
             LiveRedPackSkinMessage$ImageTextInfo._emptyArray = imageTextInf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackSkinMessage$ImageTextInfo._emptyArray;
    }
    public static LiveRedPackSkinMessage$ImageTextInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackSkinMessage$ImageTextInfo().mergeFrom(p0);
    }
    public static LiveRedPackSkinMessage$ImageTextInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackSkinMessage$ImageTextInfo(), p0);
    }
    public LiveRedPackSkinMessage$ImageTextInfo clear(){
       this.backGround = UserInfos$PicUrl.emptyArray();
       this.messageContent = "";
       this.messageFontColor = "";
       this.insertLeftDp = 0;
       this.insertRightDp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRedPackSkinMessage$ImageTextInfo tbackGround = this.backGround;
       if (tbackGround != null && tbackGround.length > 0) {
          int i1 = 0;
          LiveRedPackSkinMessage$ImageTextInfo tbackGround1 = this.backGround;
          while (i1 < tbackGround1.length) {
             object oobject = tbackGround1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.messageContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.messageContent);
       }
       if (!(this.messageFontColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.messageFontColor);
       }
       tbackGround = this.insertLeftDp;
       if (tbackGround != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tbackGround);
       }
       tbackGround = this.insertRightDp;
       if (tbackGround != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tbackGround);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackSkinMessage$ImageTextInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.insertRightDp = p0.readInt32();
                      }
                   }else {
                      this.insertLeftDp = p0.readInt32();
                   }
                }else {
                   this.messageFontColor = p0.readString();
                }
             }else {
                this.messageContent = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveRedPackSkinMessage$ImageTextInfo tbackGround = this.backGround;
             int i2 = (tbackGround == null)? 0: tbackGround.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tbackGround, 0, picUrlArray, 0, i2);
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
             this.backGround = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRedPackSkinMessage$ImageTextInfo tbackGround = this.backGround;
       if (tbackGround != null && tbackGround.length > 0) {
          int i = 0;
          LiveRedPackSkinMessage$ImageTextInfo tbackGround1 = this.backGround;
          while (i < tbackGround1.length) {
             object oobject = tbackGround1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.messageContent).equals(str)) {
          p0.writeString(2, this.messageContent);
       }
       if (!(this.messageFontColor).equals(str)) {
          p0.writeString(3, this.messageFontColor);
       }
       tbackGround = this.insertLeftDp;
       if (tbackGround != null) {
          p0.writeInt32(4, tbackGround);
       }
       tbackGround = this.insertRightDp;
       if (tbackGround != null) {
          p0.writeInt32(5, tbackGround);
       }
       super.writeTo(p0);
       return;
    }
}
