package com.kuaishou.livestream.message.nano.LiveGiftNamingDisplayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextMessage;
import com.kuaishou.protobuf.livestream.nano.LiveUiMarkLabel;

public final class LiveGiftNamingDisplayInfo extends MessageNano	// class@0011ba
{
    public String actionUrl;
    public String buttonText;
    public UserInfos$PicUrl[] icon;
    public LiveUiMarkLabel markLabel;
    public UserInfos$PicUrl[] rightIcon;
    public LiveCommentRichTextMessage$CommentRichTextMessage text;
    public static LiveGiftNamingDisplayInfo[] _emptyArray;

    public void LiveGiftNamingDisplayInfo(){
       super();
       this.clear();
    }
    public static LiveGiftNamingDisplayInfo[] emptyArray(){
       if (LiveGiftNamingDisplayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGiftNamingDisplayInfo._emptyArray == null) {
             LiveGiftNamingDisplayInfo[] liveGiftNami = new LiveGiftNamingDisplayInfo[0];
             LiveGiftNamingDisplayInfo._emptyArray = liveGiftNami;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGiftNamingDisplayInfo._emptyArray;
    }
    public static LiveGiftNamingDisplayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveGiftNamingDisplayInfo().mergeFrom(p0);
    }
    public static LiveGiftNamingDisplayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGiftNamingDisplayInfo(), p0);
    }
    public LiveGiftNamingDisplayInfo clear(){
       this.actionUrl = "";
       this.icon = UserInfos$PicUrl.emptyArray();
       this.markLabel = null;
       this.text = null;
       this.buttonText = "";
       this.rightIcon = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.actionUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.actionUrl);
       }
       LiveGiftNamingDisplayInfo ticon = this.icon;
       int i1 = 0;
       if (ticon != null && ticon.length > 0) {
          int i2 = 0;
          LiveGiftNamingDisplayInfo ticon1 = this.icon;
          while (i2 < ticon1.length) {
             object oobject = ticon1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ticon = this.markLabel;
       if (ticon != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ticon);
       }
       ticon = this.text;
       if (ticon != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, ticon);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.buttonText);
       }
       ticon = this.rightIcon;
       if (ticon != null && ticon.length > 0) {
          ticon = this.rightIcon;
          while (i1 < ticon.length) {
             object oobject1 = ticon[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGiftNamingDisplayInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveGiftNamingDisplayInfo trightIcon;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         i1 = 50;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            trightIcon = this.rightIcon;
                            i2 = (trightIcon == null)? 0: trightIcon.length;
                            i = i + i2;
                            picUrlArray = new UserInfos$PicUrl[i];
                            if (i2) {
                               System.arraycopy(trightIcon, 0, picUrlArray, 0, i2);
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
                            this.rightIcon = picUrlArray;
                         }
                      }else {
                         this.buttonText = p0.readString();
                      }
                   }else if(this.text == null){
                      this.text = new LiveCommentRichTextMessage$CommentRichTextMessage();
                   }
                   p0.readMessage(this.text);
                }else if(this.markLabel == null){
                   this.markLabel = new LiveUiMarkLabel();
                }
                p0.readMessage(this.markLabel);
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                trightIcon = this.icon;
                i2 = (trightIcon == null)? 0: trightIcon.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(trightIcon, 0, picUrlArray, 0, i2);
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
             this.actionUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.actionUrl).equals(str)) {
          p0.writeString(1, this.actionUrl);
       }
       LiveGiftNamingDisplayInfo ticon = this.icon;
       int i = 0;
       if (ticon != null && ticon.length > 0) {
          int i1 = 0;
          LiveGiftNamingDisplayInfo ticon1 = this.icon;
          while (i1 < ticon1.length) {
             object oobject = ticon1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ticon = this.markLabel;
       if (ticon != null) {
          p0.writeMessage(3, ticon);
       }
       ticon = this.text;
       if (ticon != null) {
          p0.writeMessage(4, ticon);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(5, this.buttonText);
       }
       ticon = this.rightIcon;
       if (ticon != null && ticon.length > 0) {
          ticon = this.rightIcon;
          while (i < ticon.length) {
             object oobject1 = ticon[i];
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
