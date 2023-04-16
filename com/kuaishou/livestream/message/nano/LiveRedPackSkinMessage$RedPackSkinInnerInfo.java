package com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinInnerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class LiveRedPackSkinMessage$RedPackSkinInnerInfo extends MessageNano	// class@00127b
{
    public String[] bgSubscriptColor;
    public String[] borderColor;
    public String[] gbInnerColor;
    public String luckyFontColor;
    public String luckyTitleColor;
    public String resultFontColor;
    public int skinType;
    public String subscriptFontColor;
    public String topLuckyEmptyColor;
    public UserInfos$PicUrl[] topLuckyEmptyPict;
    public UserInfos$PicUrl[] topLuckyProcessingPict;
    public static LiveRedPackSkinMessage$RedPackSkinInnerInfo[] _emptyArray;

    public void LiveRedPackSkinMessage$RedPackSkinInnerInfo(){
       super();
       this.clear();
    }
    public static LiveRedPackSkinMessage$RedPackSkinInnerInfo[] emptyArray(){
       if (LiveRedPackSkinMessage$RedPackSkinInnerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackSkinMessage$RedPackSkinInnerInfo._emptyArray == null) {
             LiveRedPackSkinMessage$RedPackSkinInnerInfo[] redPackSkinI = new LiveRedPackSkinMessage$RedPackSkinInnerInfo[0];
             LiveRedPackSkinMessage$RedPackSkinInnerInfo._emptyArray = redPackSkinI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackSkinMessage$RedPackSkinInnerInfo._emptyArray;
    }
    public static LiveRedPackSkinMessage$RedPackSkinInnerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackSkinMessage$RedPackSkinInnerInfo().mergeFrom(p0);
    }
    public static LiveRedPackSkinMessage$RedPackSkinInnerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackSkinMessage$RedPackSkinInnerInfo(), p0);
    }
    public LiveRedPackSkinMessage$RedPackSkinInnerInfo clear(){
       this.skinType = 0;
       this.luckyTitleColor = "";
       this.luckyFontColor = "";
       this.resultFontColor = "";
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.gbInnerColor = eMPTY_STRING;
       this.borderColor = eMPTY_STRING;
       this.subscriptFontColor = "";
       this.bgSubscriptColor = eMPTY_STRING;
       this.topLuckyEmptyPict = UserInfos$PicUrl.emptyArray();
       this.topLuckyEmptyColor = "";
       this.topLuckyProcessingPict = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i4;
       int i5;
       LiveRedPackSkinMessage$RedPackSkinInnerInfo tgbInnerColo;
       object oobject;
       int i = super.computeSerializedSize();
       LiveRedPackSkinMessage$RedPackSkinInnerInfo tskinType = this.skinType;
       int i1 = 1;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, tskinType);
       }
       if (!(this.luckyTitleColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.luckyTitleColor);
       }
       if (!(this.luckyFontColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.luckyFontColor);
       }
       if (!(this.resultFontColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.resultFontColor);
       }
       tskinType = this.gbInnerColor;
       int i2 = 0;
       if (tskinType != null && tskinType.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tgbInnerColo = this.gbInnerColor;
          while (i3 < tgbInnerColo.length) {
             oobject = tgbInnerColo[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       tskinType = this.borderColor;
       if (tskinType != null && tskinType.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tgbInnerColo = this.borderColor;
          while (i3 < tgbInnerColo.length) {
             oobject = tgbInnerColo[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       if (!(this.subscriptFontColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.subscriptFontColor);
       }
       tskinType = this.bgSubscriptColor;
       if (tskinType != null && tskinType.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tgbInnerColo = this.bgSubscriptColor;
          while (i3 < tgbInnerColo.length) {
             oobject = tgbInnerColo[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       tskinType = this.topLuckyEmptyPict;
       if (tskinType != null && tskinType.length > 0) {
          i3 = 0;
          LiveRedPackSkinMessage$RedPackSkinInnerInfo ttopLuckyEmp = this.topLuckyEmptyPict;
          while (i3 < ttopLuckyEmp.length) {
             object oobject1 = ttopLuckyEmp[i3];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.topLuckyEmptyColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.topLuckyEmptyColor);
       }
       tskinType = this.topLuckyProcessingPict;
       if (tskinType != null && tskinType.length > 0) {
          tskinType = this.topLuckyProcessingPict;
          while (i2 < tskinType.length) {
             object oobject2 = tskinType[i2];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject2);
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackSkinMessage$RedPackSkinInnerInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveRedPackSkinMessage$RedPackSkinInnerInfo tgbInnerColo;
       int i2;
       String[] stringArray;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.skinType = i;
                }
                break;
              case 18:
                this.luckyTitleColor = p0.readString();
                break;
              case 26:
                this.luckyFontColor = p0.readString();
                break;
              case '"':
                this.resultFontColor = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tgbInnerColo = this.gbInnerColor;
                i2 = (tgbInnerColo == null)? 0: tgbInnerColo.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tgbInnerColo, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.gbInnerColor = stringArray;
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tgbInnerColo = this.borderColor;
                i2 = (tgbInnerColo == null)? 0: tgbInnerColo.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tgbInnerColo, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.borderColor = stringArray;
                break;
              case ':':
                this.subscriptFontColor = p0.readString();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tgbInnerColo = this.bgSubscriptColor;
                i2 = (tgbInnerColo == null)? 0: tgbInnerColo.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tgbInnerColo, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.bgSubscriptColor = stringArray;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tgbInnerColo = this.topLuckyEmptyPict;
                i2 = (tgbInnerColo == null)? 0: tgbInnerColo.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tgbInnerColo, i1, picUrlArray, i1, i2);
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
                this.topLuckyEmptyPict = picUrlArray;
                break;
              case 'R':
                this.topLuckyEmptyColor = p0.readString();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tgbInnerColo = this.topLuckyProcessingPict;
                i2 = (tgbInnerColo == null)? 0: tgbInnerColo.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tgbInnerColo, i1, picUrlArray, i1, i2);
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
                this.topLuckyProcessingPict = picUrlArray;
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
       LiveRedPackSkinMessage$RedPackSkinInnerInfo tgbInnerColo;
       object oobject;
       LiveRedPackSkinMessage$RedPackSkinInnerInfo tskinType = this.skinType;
       if (tskinType != null) {
          p0.writeInt32(1, tskinType);
       }
       String str = "";
       if (!(this.luckyTitleColor).equals(str)) {
          p0.writeString(2, this.luckyTitleColor);
       }
       if (!(this.luckyFontColor).equals(str)) {
          p0.writeString(3, this.luckyFontColor);
       }
       if (!(this.resultFontColor).equals(str)) {
          p0.writeString(4, this.resultFontColor);
       }
       tskinType = this.gbInnerColor;
       int i = 0;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tgbInnerColo = this.gbInnerColor;
          while (i1 < tgbInnerColo.length) {
             oobject = tgbInnerColo[i1];
             if (oobject != null) {
                p0.writeString(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.borderColor;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tgbInnerColo = this.borderColor;
          while (i1 < tgbInnerColo.length) {
             oobject = tgbInnerColo[i1];
             if (oobject != null) {
                p0.writeString(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.subscriptFontColor).equals(str)) {
          p0.writeString(7, this.subscriptFontColor);
       }
       tskinType = this.bgSubscriptColor;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tgbInnerColo = this.bgSubscriptColor;
          while (i1 < tgbInnerColo.length) {
             oobject = tgbInnerColo[i1];
             if (oobject != null) {
                p0.writeString(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.topLuckyEmptyPict;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tgbInnerColo = this.topLuckyEmptyPict;
          while (i1 < tgbInnerColo.length) {
             oobject = tgbInnerColo[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.topLuckyEmptyColor).equals(str)) {
          p0.writeString(10, this.topLuckyEmptyColor);
       }
       tskinType = this.topLuckyProcessingPict;
       if (tskinType != null && tskinType.length > 0) {
          tskinType = this.topLuckyProcessingPict;
          while (i < tskinType.length) {
             object oobject1 = tskinType[i];
             if (oobject1 != null) {
                p0.writeMessage(11, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
