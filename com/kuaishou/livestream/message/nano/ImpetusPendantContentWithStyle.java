package com.kuaishou.livestream.message.nano.ImpetusPendantContentWithStyle;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ImpetusPendantContentWithStyle extends MessageNano	// class@0010b8
{
    public int align;
    public boolean bold;
    public String color;
    public String content;
    public UserInfos$PicUrl[] cornerPicUrl;
    public int size;
    public static ImpetusPendantContentWithStyle[] _emptyArray;

    public void ImpetusPendantContentWithStyle(){
       super();
       this.clear();
    }
    public static ImpetusPendantContentWithStyle[] emptyArray(){
       if (ImpetusPendantContentWithStyle._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ImpetusPendantContentWithStyle._emptyArray == null) {
             ImpetusPendantContentWithStyle[] impetusPenda = new ImpetusPendantContentWithStyle[0];
             ImpetusPendantContentWithStyle._emptyArray = impetusPenda;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ImpetusPendantContentWithStyle._emptyArray;
    }
    public static ImpetusPendantContentWithStyle parseFrom(CodedInputByteBufferNano p0){
       return new ImpetusPendantContentWithStyle().mergeFrom(p0);
    }
    public static ImpetusPendantContentWithStyle parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ImpetusPendantContentWithStyle(), p0);
    }
    public ImpetusPendantContentWithStyle clear(){
       this.content = "";
       this.color = "";
       this.bold = false;
       this.align = 0;
       this.size = 0;
       this.cornerPicUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       if (!(this.color).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.color);
       }
       ImpetusPendantContentWithStyle tbold = this.bold;
       if (tbold != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tbold);
       }
       tbold = this.align;
       if (tbold != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tbold);
       }
       tbold = this.size;
       if (tbold != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tbold);
       }
       tbold = this.cornerPicUrl;
       if (tbold != null && tbold.length > 0) {
          int i1 = 0;
          ImpetusPendantContentWithStyle tcornerPicUr = this.cornerPicUrl;
          while (i1 < tcornerPicUr.length) {
             object oobject = tcornerPicUr[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ImpetusPendantContentWithStyle mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         int i1 = 50;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            ImpetusPendantContentWithStyle tcornerPicUr = this.cornerPicUrl;
                            int i2 = (tcornerPicUr == null)? 0: tcornerPicUr.length;
                            i = i + i2;
                            UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                            if (i2) {
                               System.arraycopy(tcornerPicUr, 0, picUrlArray, 0, i2);
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
                            this.cornerPicUrl = picUrlArray;
                         }
                      }else {
                         this.size = p0.readInt32();
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.align = i;
                      }
                   }
                }else {
                   this.bold = p0.readBool();
                }
             }else {
                this.color = p0.readString();
             }
          }else {
             this.content = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(1, this.content);
       }
       if (!(this.color).equals(str)) {
          p0.writeString(2, this.color);
       }
       ImpetusPendantContentWithStyle tbold = this.bold;
       if (tbold != null) {
          p0.writeBool(3, tbold);
       }
       tbold = this.align;
       if (tbold != null) {
          p0.writeInt32(4, tbold);
       }
       tbold = this.size;
       if (tbold != null) {
          p0.writeInt32(5, tbold);
       }
       tbold = this.cornerPicUrl;
       if (tbold != null && tbold.length > 0) {
          int i = 0;
          ImpetusPendantContentWithStyle tcornerPicUr = this.cornerPicUrl;
          while (i < tcornerPicUr.length) {
             object oobject = tcornerPicUr[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
