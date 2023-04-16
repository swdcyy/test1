package com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinButtonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class LiveRedPackSkinMessage$RedPackSkinButtonInfo extends MessageNano	// class@00127a
{
    public String buttonBorderColor;
    public String buttonClickUrl;
    public String[] buttonColor;
    public UserInfos$PicUrl[] buttonPict;
    public boolean disableAuthorShow;
    public UserInfos$PicUrl[] iconPict;
    public int insertLeftDp;
    public int insertRightDp;
    public String text;
    public String textColor;
    public static LiveRedPackSkinMessage$RedPackSkinButtonInfo[] _emptyArray;

    public void LiveRedPackSkinMessage$RedPackSkinButtonInfo(){
       super();
       this.clear();
    }
    public static LiveRedPackSkinMessage$RedPackSkinButtonInfo[] emptyArray(){
       if (LiveRedPackSkinMessage$RedPackSkinButtonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackSkinMessage$RedPackSkinButtonInfo._emptyArray == null) {
             LiveRedPackSkinMessage$RedPackSkinButtonInfo[] redPackSkinB = new LiveRedPackSkinMessage$RedPackSkinButtonInfo[0];
             LiveRedPackSkinMessage$RedPackSkinButtonInfo._emptyArray = redPackSkinB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackSkinMessage$RedPackSkinButtonInfo._emptyArray;
    }
    public static LiveRedPackSkinMessage$RedPackSkinButtonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackSkinMessage$RedPackSkinButtonInfo().mergeFrom(p0);
    }
    public static LiveRedPackSkinMessage$RedPackSkinButtonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackSkinMessage$RedPackSkinButtonInfo(), p0);
    }
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo clear(){
       this.textColor = "";
       this.text = "";
       this.buttonColor = WireFormatNano.EMPTY_STRING_ARRAY;
       this.buttonBorderColor = "";
       this.buttonPict = UserInfos$PicUrl.emptyArray();
       this.iconPict = UserInfos$PicUrl.emptyArray();
       this.insertLeftDp = 0;
       this.insertRightDp = 0;
       this.disableAuthorShow = false;
       this.buttonClickUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i = super.computeSerializedSize();
       String str = "";
       int i1 = 1;
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.textColor);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       LiveRedPackSkinMessage$RedPackSkinButtonInfo tbuttonColor = this.buttonColor;
       int i2 = 0;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i3 = 0;
          int i4 = 0;
          int i5 = 0;
          LiveRedPackSkinMessage$RedPackSkinButtonInfo tbuttonColor1 = this.buttonColor;
          while (i3 < tbuttonColor1.length) {
             object oobject = tbuttonColor1[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       if (!(this.buttonBorderColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.buttonBorderColor);
       }
       tbuttonColor = this.buttonPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i3 = 0;
          LiveRedPackSkinMessage$RedPackSkinButtonInfo tbuttonPict = this.buttonPict;
          while (i3 < tbuttonPict.length) {
             object oobject1 = tbuttonPict[i3];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i3 = i3 + 1;
          }
       }
       tbuttonColor = this.iconPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          tbuttonColor = this.iconPict;
          while (i2 < tbuttonColor.length) {
             object oobject2 = tbuttonColor[i2];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject2);
             }
             i2 = i2 + 1;
          }
       }
       tbuttonColor = this.insertLeftDp;
       if (tbuttonColor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tbuttonColor);
       }
       tbuttonColor = this.insertRightDp;
       if (tbuttonColor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tbuttonColor);
       }
       tbuttonColor = this.disableAuthorShow;
       if (tbuttonColor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tbuttonColor);
       }
       if (!(this.buttonClickUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.buttonClickUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveRedPackSkinMessage$RedPackSkinButtonInfo tbuttonColor;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.textColor = p0.readString();
                break;
              case 18:
                this.text = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tbuttonColor = this.buttonColor;
                i2 = (tbuttonColor == null)? 0: tbuttonColor.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tbuttonColor, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.buttonColor = stringArray;
                break;
              case '"':
                this.buttonBorderColor = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tbuttonColor = this.buttonPict;
                i2 = (tbuttonColor == null)? 0: tbuttonColor.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbuttonColor, i1, picUrlArray, i1, i2);
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
                this.buttonPict = picUrlArray;
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tbuttonColor = this.iconPict;
                i2 = (tbuttonColor == null)? 0: tbuttonColor.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbuttonColor, i1, picUrlArray, i1, i2);
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
                this.iconPict = picUrlArray;
                break;
              case '8':
                this.insertLeftDp = p0.readInt32();
                break;
              case '@':
                this.insertRightDp = p0.readInt32();
                break;
              case 'H':
                this.disableAuthorShow = p0.readBool();
                break;
              case 'R':
                this.buttonClickUrl = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveRedPackSkinMessage$RedPackSkinButtonInfo tbuttonColor1;
       object oobject;
       String str = "";
       if (!(this.textColor).equals(str)) {
          p0.writeString(1, this.textColor);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       LiveRedPackSkinMessage$RedPackSkinButtonInfo tbuttonColor = this.buttonColor;
       int i = 0;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i1 = 0;
          tbuttonColor1 = this.buttonColor;
          while (i1 < tbuttonColor1.length) {
             oobject = tbuttonColor1[i1];
             if (oobject != null) {
                p0.writeString(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.buttonBorderColor).equals(str)) {
          p0.writeString(4, this.buttonBorderColor);
       }
       tbuttonColor = this.buttonPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          i1 = 0;
          tbuttonColor1 = this.buttonPict;
          while (i1 < tbuttonColor1.length) {
             oobject = tbuttonColor1[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbuttonColor = this.iconPict;
       if (tbuttonColor != null && tbuttonColor.length > 0) {
          tbuttonColor = this.iconPict;
          while (i < tbuttonColor.length) {
             object oobject1 = tbuttonColor[i];
             if (oobject1 != null) {
                p0.writeMessage(6, oobject1);
             }
             i = i + 1;
          }
       }
       tbuttonColor = this.insertLeftDp;
       if (tbuttonColor != null) {
          p0.writeInt32(7, tbuttonColor);
       }
       tbuttonColor = this.insertRightDp;
       if (tbuttonColor != null) {
          p0.writeInt32(8, tbuttonColor);
       }
       tbuttonColor = this.disableAuthorShow;
       if (tbuttonColor != null) {
          p0.writeBool(9, tbuttonColor);
       }
       if (!(this.buttonClickUrl).equals(str)) {
          p0.writeString(10, this.buttonClickUrl);
       }
       super.writeTo(p0);
       return;
    }
}
