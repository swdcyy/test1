package com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState$Button;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveBsStateMessages$SCLiveCurrentBsState$Button extends MessageNano	// class@00112b
{
    public int buttonType;
    public String desc;
    public UserInfos$PicUrl[] icon;
    public UserInfos$PicUrl[] iconV2;
    public String link;
    public UserInfos$PicUrl[] lottieIcon;
    public String name;
    public static LiveBsStateMessages$SCLiveCurrentBsState$Button[] _emptyArray;

    public void LiveBsStateMessages$SCLiveCurrentBsState$Button(){
       super();
       this.clear();
    }
    public static LiveBsStateMessages$SCLiveCurrentBsState$Button[] emptyArray(){
       if (LiveBsStateMessages$SCLiveCurrentBsState$Button._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBsStateMessages$SCLiveCurrentBsState$Button._emptyArray == null) {
             LiveBsStateMessages$SCLiveCurrentBsState$Button[] sCLiveCurren = new LiveBsStateMessages$SCLiveCurrentBsState$Button[0];
             LiveBsStateMessages$SCLiveCurrentBsState$Button._emptyArray = sCLiveCurren;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBsStateMessages$SCLiveCurrentBsState$Button._emptyArray;
    }
    public static LiveBsStateMessages$SCLiveCurrentBsState$Button parseFrom(CodedInputByteBufferNano p0){
       return new LiveBsStateMessages$SCLiveCurrentBsState$Button().mergeFrom(p0);
    }
    public static LiveBsStateMessages$SCLiveCurrentBsState$Button parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBsStateMessages$SCLiveCurrentBsState$Button(), p0);
    }
    public LiveBsStateMessages$SCLiveCurrentBsState$Button clear(){
       this.buttonType = 0;
       this.name = "";
       this.desc = "";
       this.link = "";
       this.icon = UserInfos$PicUrl.emptyArray();
       this.iconV2 = UserInfos$PicUrl.emptyArray();
       this.lottieIcon = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveBsStateMessages$SCLiveCurrentBsState$Button ticon;
       object oobject;
       int i = super.computeSerializedSize();
       LiveBsStateMessages$SCLiveCurrentBsState$Button tbuttonType = this.buttonType;
       if (tbuttonType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbuttonType);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.desc);
       }
       if (!(this.link).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.link);
       }
       tbuttonType = this.icon;
       int i1 = 0;
       if (tbuttonType != null && tbuttonType.length > 0) {
          i2 = 0;
          ticon = this.icon;
          while (i2 < ticon.length) {
             oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbuttonType = this.iconV2;
       if (tbuttonType != null && tbuttonType.length > 0) {
          i2 = 0;
          ticon = this.iconV2;
          while (i2 < ticon.length) {
             oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbuttonType = this.lottieIcon;
       if (tbuttonType != null && tbuttonType.length > 0) {
          tbuttonType = this.lottieIcon;
          while (i1 < tbuttonType.length) {
             object oobject1 = tbuttonType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBsStateMessages$SCLiveCurrentBsState$Button mergeFrom(CodedInputByteBufferNano p0){
       LiveBsStateMessages$SCLiveCurrentBsState$Button tlottieIcon;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 42;
                      if (i != i1) {
                         i1 = 50;
                         if (i != i1) {
                            i1 = 58;
                            if (i != i1) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               tlottieIcon = this.lottieIcon;
                               i2 = (tlottieIcon == null)? 0: tlottieIcon.length;
                               i = i + i2;
                               picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(tlottieIcon, 0, picUrlArray, 0, i2);
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
                               this.lottieIcon = picUrlArray;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tlottieIcon = this.iconV2;
                            i2 = (tlottieIcon == null)? 0: tlottieIcon.length;
                            i = i + i2;
                            picUrlArray = new UserInfos$PicUrl[i];
                            if (i2) {
                               System.arraycopy(tlottieIcon, 0, picUrlArray, 0, i2);
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
                            this.iconV2 = picUrlArray;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         tlottieIcon = this.icon;
                         i2 = (tlottieIcon == null)? 0: tlottieIcon.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(tlottieIcon, 0, picUrlArray, 0, i2);
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
                      this.link = p0.readString();
                   }
                }else {
                   this.desc = p0.readString();
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 1:
                   break;
                 default:
             }
             this.buttonType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveBsStateMessages$SCLiveCurrentBsState$Button ticon;
       object oobject;
       LiveBsStateMessages$SCLiveCurrentBsState$Button tbuttonType = this.buttonType;
       if (tbuttonType != null) {
          p0.writeInt32(1, tbuttonType);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(3, this.desc);
       }
       if (!(this.link).equals(str)) {
          p0.writeString(4, this.link);
       }
       tbuttonType = this.icon;
       int i = 0;
       if (tbuttonType != null && tbuttonType.length > 0) {
          i1 = 0;
          ticon = this.icon;
          while (i1 < ticon.length) {
             oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbuttonType = this.iconV2;
       if (tbuttonType != null && tbuttonType.length > 0) {
          i1 = 0;
          ticon = this.iconV2;
          while (i1 < ticon.length) {
             oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbuttonType = this.lottieIcon;
       if (tbuttonType != null && tbuttonType.length > 0) {
          tbuttonType = this.lottieIcon;
          while (i < tbuttonType.length) {
             object oobject1 = tbuttonType[i];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
