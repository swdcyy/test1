package com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPackShowPage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class LiveKrnRedPackMessage$LiveKrnRedPackShowPage extends MessageNano	// class@0011d2
{
    public UserInfos$PicUrl[] bgPict;
    public UserInfos$PicUrl[] bgPictV2;
    public String[] capsuleColor;
    public String contentText;
    public String fontColor;
    public String fontColorV2;
    public String iconBorderColor;
    public UserInfos$PicUrl[] iconPict;
    public int type;
    public static LiveKrnRedPackMessage$LiveKrnRedPackShowPage[] _emptyArray;

    public void LiveKrnRedPackMessage$LiveKrnRedPackShowPage(){
       super();
       this.clear();
    }
    public static LiveKrnRedPackMessage$LiveKrnRedPackShowPage[] emptyArray(){
       if (LiveKrnRedPackMessage$LiveKrnRedPackShowPage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKrnRedPackMessage$LiveKrnRedPackShowPage._emptyArray == null) {
             LiveKrnRedPackMessage$LiveKrnRedPackShowPage[] liveKrnRedPa = new LiveKrnRedPackMessage$LiveKrnRedPackShowPage[0];
             LiveKrnRedPackMessage$LiveKrnRedPackShowPage._emptyArray = liveKrnRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKrnRedPackMessage$LiveKrnRedPackShowPage._emptyArray;
    }
    public static LiveKrnRedPackMessage$LiveKrnRedPackShowPage parseFrom(CodedInputByteBufferNano p0){
       return new LiveKrnRedPackMessage$LiveKrnRedPackShowPage().mergeFrom(p0);
    }
    public static LiveKrnRedPackMessage$LiveKrnRedPackShowPage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKrnRedPackMessage$LiveKrnRedPackShowPage(), p0);
    }
    public LiveKrnRedPackMessage$LiveKrnRedPackShowPage clear(){
       this.type = 0;
       this.bgPict = UserInfos$PicUrl.emptyArray();
       this.iconPict = UserInfos$PicUrl.emptyArray();
       this.contentText = "";
       this.fontColor = "";
       this.capsuleColor = WireFormatNano.EMPTY_STRING_ARRAY;
       this.iconBorderColor = "";
       this.bgPictV2 = UserInfos$PicUrl.emptyArray();
       this.fontColorV2 = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       LiveKrnRedPackMessage$LiveKrnRedPackShowPage tbgPict;
       object oobject;
       int i = super.computeSerializedSize();
       LiveKrnRedPackMessage$LiveKrnRedPackShowPage ttype = this.type;
       int i1 = 1;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, ttype);
       }
       ttype = this.bgPict;
       int i2 = 0;
       if (ttype != null && ttype.length > 0) {
          i3 = 0;
          tbgPict = this.bgPict;
          while (i3 < tbgPict.length) {
             oobject = tbgPict[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i3 = i3 + 1;
          }
       }
       ttype = this.iconPict;
       if (ttype != null && ttype.length > 0) {
          i3 = 0;
          tbgPict = this.iconPict;
          while (i3 < tbgPict.length) {
             oobject = tbgPict[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.contentText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.contentText);
       }
       if (!(this.fontColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.fontColor);
       }
       ttype = this.capsuleColor;
       if (ttype != null && ttype.length > 0) {
          i3 = 0;
          int i4 = 0;
          int i5 = 0;
          LiveKrnRedPackMessage$LiveKrnRedPackShowPage tcapsuleColo = this.capsuleColor;
          while (i3 < tcapsuleColo.length) {
             object oobject1 = tcapsuleColo[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       if (!(this.iconBorderColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.iconBorderColor);
       }
       ttype = this.bgPictV2;
       if (ttype != null && ttype.length > 0) {
          ttype = this.bgPictV2;
          while (i2 < ttype.length) {
             object oobject2 = ttype[i2];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject2);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.fontColorV2).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.fontColorV2);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveKrnRedPackMessage$LiveKrnRedPackShowPage mergeFrom(CodedInputByteBufferNano p0){
       LiveKrnRedPackMessage$LiveKrnRedPackShowPage tbgPictV2;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 26;
             if (i != i1) {
                i1 = 34;
                if (i != i1) {
                   if (i != 42) {
                      if (i != 50) {
                         i1 = 58;
                         if (i != i1) {
                            if (i != 66) {
                               i1 = 74;
                               if (i != i1) {
                                  if (i != 82) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.fontColorV2 = p0.readString();
                                  }
                               }else {
                                  i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                  tbgPictV2 = this.bgPictV2;
                                  i2 = (tbgPictV2 == null)? 0: tbgPictV2.length;
                                  i = i + i2;
                                  picUrlArray = new UserInfos$PicUrl[i];
                                  if (i2) {
                                     System.arraycopy(tbgPictV2, 0, picUrlArray, 0, i2);
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
                                  this.bgPictV2 = picUrlArray;
                               }
                            }else {
                               this.iconBorderColor = p0.readString();
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tbgPictV2 = this.capsuleColor;
                            i2 = (tbgPictV2 == null)? 0: tbgPictV2.length;
                            i = i + i2;
                            String[] stringArray = new String[i];
                            if (i2) {
                               System.arraycopy(tbgPictV2, 0, stringArray, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               stringArray[i2] = p0.readString();
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            stringArray[i2] = p0.readString();
                            this.capsuleColor = stringArray;
                         }
                      }else {
                         this.fontColor = p0.readString();
                      }
                   }else {
                      this.contentText = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tbgPictV2 = this.iconPict;
                   i2 = (tbgPictV2 == null)? 0: tbgPictV2.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tbgPictV2, 0, picUrlArray, 0, i2);
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
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tbgPictV2 = this.bgPict;
                i2 = (tbgPictV2 == null)? 0: tbgPictV2.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbgPictV2, 0, picUrlArray, 0, i2);
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
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveKrnRedPackMessage$LiveKrnRedPackShowPage tbgPict;
       object oobject;
       LiveKrnRedPackMessage$LiveKrnRedPackShowPage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.bgPict;
       int i = 0;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tbgPict = this.bgPict;
          while (i1 < tbgPict.length) {
             oobject = tbgPict[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.iconPict;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tbgPict = this.iconPict;
          while (i1 < tbgPict.length) {
             oobject = tbgPict[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.contentText).equals("")) {
          p0.writeString(5, this.contentText);
       }
       if (!(this.fontColor).equals("")) {
          p0.writeString(6, this.fontColor);
       }
       ttype = this.capsuleColor;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          LiveKrnRedPackMessage$LiveKrnRedPackShowPage tcapsuleColo = this.capsuleColor;
          while (i1 < tcapsuleColo.length) {
             object oobject1 = tcapsuleColo[i1];
             if (oobject1 != null) {
                p0.writeString(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.iconBorderColor).equals("")) {
          p0.writeString(8, this.iconBorderColor);
       }
       ttype = this.bgPictV2;
       if (ttype != null && ttype.length > 0) {
          ttype = this.bgPictV2;
          while (i < ttype.length) {
             object oobject2 = ttype[i];
             if (oobject2 != null) {
                p0.writeMessage(9, oobject2);
             }
             i = i + 1;
          }
       }
       if (!(this.fontColorV2).equals("")) {
          p0.writeString(10, this.fontColorV2);
       }
       super.writeTo(p0);
       return;
    }
}
