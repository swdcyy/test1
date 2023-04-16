package com.kuaishou.livestream.message.nano.LivePopUp$LiveDialog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePopUp$LiveDialog extends MessageNano	// class@001249
{
    public String bizType;
    public String button;
    public String content;
    public UserInfos$PicUrl[] icon;
    public String title;
    public static LivePopUp$LiveDialog[] _emptyArray;

    public void LivePopUp$LiveDialog(){
       super();
       this.clear();
    }
    public static LivePopUp$LiveDialog[] emptyArray(){
       if (LivePopUp$LiveDialog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePopUp$LiveDialog._emptyArray == null) {
             LivePopUp$LiveDialog[] liveDialogAr = new LivePopUp$LiveDialog[0];
             LivePopUp$LiveDialog._emptyArray = liveDialogAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePopUp$LiveDialog._emptyArray;
    }
    public static LivePopUp$LiveDialog parseFrom(CodedInputByteBufferNano p0){
       return new LivePopUp$LiveDialog().mergeFrom(p0);
    }
    public static LivePopUp$LiveDialog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePopUp$LiveDialog(), p0);
    }
    public LivePopUp$LiveDialog clear(){
       this.title = "";
       this.content = "";
       this.button = "";
       this.icon = UserInfos$PicUrl.emptyArray();
       this.bizType = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       if (!(this.button).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.button);
       }
       LivePopUp$LiveDialog ticon = this.icon;
       if (ticon != null && ticon.length > 0) {
          int i1 = 0;
          LivePopUp$LiveDialog ticon1 = this.icon;
          while (i1 < ticon1.length) {
             object oobject = ticon1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.bizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePopUp$LiveDialog mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.bizType = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LivePopUp$LiveDialog ticon = this.icon;
                      int i2 = (ticon == null)? 0: ticon.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(ticon, 0, picUrlArray, 0, i2);
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
                      this.icon = picUrlArray;
                   }
                }else {
                   this.button = p0.readString();
                }
             }else {
                this.content = p0.readString();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       if (!(this.button).equals(str)) {
          p0.writeString(3, this.button);
       }
       LivePopUp$LiveDialog ticon = this.icon;
       if (ticon != null && ticon.length > 0) {
          int i = 0;
          LivePopUp$LiveDialog ticon1 = this.icon;
          while (i < ticon1.length) {
             object oobject = ticon1[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(5, this.bizType);
       }
       super.writeTo(p0);
       return;
    }
}
