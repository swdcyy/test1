package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo extends MessageNano	// class@00117b
{
    public UserInfos$PicUrl[] buttonBgPict;
    public String[] buttonColor;
    public UserInfos$PicUrl[] buttonOpenAnimationPict;
    public UserInfos$PicUrl[] buttonOpenPict;
    public String buttonProgressBgColor;
    public String buttonProgressColor;
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo[] uCustomRedPa = new LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo[0];
             LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo._emptyArray = uCustomRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo(), p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo clear(){
       this.buttonColor = WireFormatNano.EMPTY_STRING_ARRAY;
       this.buttonProgressColor = "";
       this.buttonProgressBgColor = "";
       this.buttonBgPict = UserInfos$PicUrl.emptyArray();
       this.buttonOpenPict = UserInfos$PicUrl.emptyArray();
       this.buttonOpenAnimationPict = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo tbuttonBgPic;
       object oobject1;
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo tbuttonColor = this.buttonColor;
       int i1 = 0;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i2 = 0;
          int i3 = 0;
          int i4 = 0;
          LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo tbuttonColor1 = this.buttonColor;
          while (i2 < tbuttonColor1.length) {
             object oobject = tbuttonColor1[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       String str = "";
       if (!(this.buttonProgressColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.buttonProgressColor);
       }
       if (!(this.buttonProgressBgColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.buttonProgressBgColor);
       }
       tbuttonColor = this.buttonBgPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i2 = 0;
          tbuttonBgPic = this.buttonBgPict;
          while (i2 < tbuttonBgPic.length) {
             oobject1 = tbuttonBgPic[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tbuttonColor = this.buttonOpenPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i2 = 0;
          tbuttonBgPic = this.buttonOpenPict;
          while (i2 < tbuttonBgPic.length) {
             oobject1 = tbuttonBgPic[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tbuttonColor = this.buttonOpenAnimationPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          tbuttonColor = this.buttonOpenAnimationPict;
          while (i1 < tbuttonColor.length) {
             object oobject2 = tbuttonColor[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo tbuttonOpenA;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   i1 = 34;
                   if (i != i1) {
                      i1 = 42;
                      if (i != i1) {
                         i1 = 50;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tbuttonOpenA = this.buttonOpenAnimationPict;
                            i2 = (tbuttonOpenA == null)? 0: tbuttonOpenA.length;
                            i = i + i2;
                            picUrlArray = new UserInfos$PicUrl[i];
                            if (i2) {
                               System.arraycopy(tbuttonOpenA, 0, picUrlArray, 0, i2);
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
                            this.buttonOpenAnimationPict = picUrlArray;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         tbuttonOpenA = this.buttonOpenPict;
                         i2 = (tbuttonOpenA == null)? 0: tbuttonOpenA.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(tbuttonOpenA, 0, picUrlArray, 0, i2);
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
                         this.buttonOpenPict = picUrlArray;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tbuttonOpenA = this.buttonBgPict;
                      i2 = (tbuttonOpenA == null)? 0: tbuttonOpenA.length;
                      i = i + i2;
                      picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tbuttonOpenA, 0, picUrlArray, 0, i2);
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
                      this.buttonBgPict = picUrlArray;
                   }
                }else {
                   this.buttonProgressBgColor = p0.readString();
                }
             }else {
                this.buttonProgressColor = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tbuttonOpenA = this.buttonColor;
             i2 = (tbuttonOpenA == null)? 0: tbuttonOpenA.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(tbuttonOpenA, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.buttonColor = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo tbuttonColor1;
       object oobject;
       LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo tbuttonColor = this.buttonColor;
       int i = 0;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i1 = 0;
          tbuttonColor1 = this.buttonColor;
          while (i1 < tbuttonColor1.length) {
             oobject = tbuttonColor1[i1];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.buttonProgressColor).equals(str)) {
          p0.writeString(2, this.buttonProgressColor);
       }
       if (!(this.buttonProgressBgColor).equals(str)) {
          p0.writeString(3, this.buttonProgressBgColor);
       }
       tbuttonColor = this.buttonBgPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i1 = 0;
          tbuttonColor1 = this.buttonBgPict;
          while (i1 < tbuttonColor1.length) {
             oobject = tbuttonColor1[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbuttonColor = this.buttonOpenPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i1 = 0;
          tbuttonColor1 = this.buttonOpenPict;
          while (i1 < tbuttonColor1.length) {
             oobject = tbuttonColor1[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbuttonColor = this.buttonOpenAnimationPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          tbuttonColor = this.buttonOpenAnimationPict;
          while (i < tbuttonColor.length) {
             object oobject1 = tbuttonColor[i];
             if (oobject1 != null) {
                p0.writeMessage(6, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
