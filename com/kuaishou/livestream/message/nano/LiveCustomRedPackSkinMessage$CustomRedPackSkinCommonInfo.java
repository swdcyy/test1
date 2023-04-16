package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo extends MessageNano	// class@001179
{
    public UserInfos$PicUrl[] ambientBottomPict;
    public UserInfos$PicUrl[] ambientTopPict;
    public UserInfos$PicUrl[] bgPict;
    public UserInfos$PicUrl[] coverBottomPict;
    public UserInfos$PicUrl[] coverTopPict;
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo[] uCustomRedPa = new LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo[0];
             LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo._emptyArray = uCustomRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo(), p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo clear(){
       this.coverTopPict = UserInfos$PicUrl.emptyArray();
       this.coverBottomPict = UserInfos$PicUrl.emptyArray();
       this.bgPict = UserInfos$PicUrl.emptyArray();
       this.ambientTopPict = UserInfos$PicUrl.emptyArray();
       this.ambientBottomPict = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo tcoverTopPic1;
       object oobject;
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo tcoverTopPic = this.coverTopPict;
       int i1 = 0;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i2 = 0;
          tcoverTopPic1 = this.coverTopPict;
          while (i2 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcoverTopPic = this.coverBottomPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i2 = 0;
          tcoverTopPic1 = this.coverBottomPict;
          while (i2 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcoverTopPic = this.bgPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i2 = 0;
          tcoverTopPic1 = this.bgPict;
          while (i2 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcoverTopPic = this.ambientTopPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i2 = 0;
          tcoverTopPic1 = this.ambientTopPict;
          while (i2 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcoverTopPic = this.ambientBottomPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          tcoverTopPic = this.ambientBottomPict;
          while (i1 < tcoverTopPic.length) {
             object oobject1 = tcoverTopPic[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo tambientBott;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                i1 = 26;
                if (i != i1) {
                   i1 = 34;
                   if (i != i1) {
                      i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         tambientBott = this.ambientBottomPict;
                         i2 = (tambientBott == null)? 0: tambientBott.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(tambientBott, 0, picUrlArray, 0, i2);
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
                         this.ambientBottomPict = picUrlArray;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tambientBott = this.ambientTopPict;
                      i2 = (tambientBott == null)? 0: tambientBott.length;
                      i = i + i2;
                      picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tambientBott, 0, picUrlArray, 0, i2);
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
                      this.ambientTopPict = picUrlArray;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tambientBott = this.bgPict;
                   i2 = (tambientBott == null)? 0: tambientBott.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tambientBott, 0, picUrlArray, 0, i2);
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
                   this.bgPict = picUrlArray;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tambientBott = this.coverBottomPict;
                i2 = (tambientBott == null)? 0: tambientBott.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tambientBott, 0, picUrlArray, 0, i2);
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
                this.coverBottomPict = picUrlArray;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tambientBott = this.coverTopPict;
             i2 = (tambientBott == null)? 0: tambientBott.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tambientBott, 0, picUrlArray, 0, i2);
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
             this.coverTopPict = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo tcoverTopPic1;
       object oobject;
       LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo tcoverTopPic = this.coverTopPict;
       int i = 0;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i1 = 0;
          tcoverTopPic1 = this.coverTopPict;
          while (i1 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcoverTopPic = this.coverBottomPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i1 = 0;
          tcoverTopPic1 = this.coverBottomPict;
          while (i1 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcoverTopPic = this.bgPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i1 = 0;
          tcoverTopPic1 = this.bgPict;
          while (i1 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcoverTopPic = this.ambientTopPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          i1 = 0;
          tcoverTopPic1 = this.ambientTopPict;
          while (i1 < tcoverTopPic1.length) {
             oobject = tcoverTopPic1[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcoverTopPic = this.ambientBottomPict;
       if (tcoverTopPic != null && tcoverTopPic.length > 0) {
          tcoverTopPic = this.ambientBottomPict;
          while (i < tcoverTopPic.length) {
             object oobject1 = tcoverTopPic[i];
             if (oobject1 != null) {
                p0.writeMessage(5, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
