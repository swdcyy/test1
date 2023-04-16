package com.kuaishou.livestream.message.nano.LiveStreamMessages$DynamicBackground;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$DynamicBackground extends MessageNano	// class@0012d0
{
    public int dynamicBackgroundResType;
    public UserInfos$PicUrl[] dynamicBackgroundResUrl;
    public String md5;
    public static LiveStreamMessages$DynamicBackground[] _emptyArray;

    public void LiveStreamMessages$DynamicBackground(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$DynamicBackground[] emptyArray(){
       if (LiveStreamMessages$DynamicBackground._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$DynamicBackground._emptyArray == null) {
             LiveStreamMessages$DynamicBackground[] uDynamicBack = new LiveStreamMessages$DynamicBackground[0];
             LiveStreamMessages$DynamicBackground._emptyArray = uDynamicBack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$DynamicBackground._emptyArray;
    }
    public static LiveStreamMessages$DynamicBackground parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$DynamicBackground().mergeFrom(p0);
    }
    public static LiveStreamMessages$DynamicBackground parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$DynamicBackground(), p0);
    }
    public LiveStreamMessages$DynamicBackground clear(){
       this.dynamicBackgroundResUrl = UserInfos$PicUrl.emptyArray();
       this.dynamicBackgroundResType = 0;
       this.md5 = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$DynamicBackground tdynamicBack = this.dynamicBackgroundResUrl;
       if (tdynamicBack != null && tdynamicBack.length > 0) {
          int i1 = 0;
          LiveStreamMessages$DynamicBackground tdynamicBack1 = this.dynamicBackgroundResUrl;
          while (i1 < tdynamicBack1.length) {
             object oobject = tdynamicBack1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tdynamicBack = this.dynamicBackgroundResType;
       if (tdynamicBack != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tdynamicBack);
       }
       if (!(this.md5).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.md5);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$DynamicBackground mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.md5 = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.dynamicBackgroundResType = i;
                }
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveStreamMessages$DynamicBackground tdynamicBack = this.dynamicBackgroundResUrl;
             int i2 = (tdynamicBack == null)? 0: tdynamicBack.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tdynamicBack, 0, picUrlArray, 0, i2);
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
             this.dynamicBackgroundResUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$DynamicBackground tdynamicBack = this.dynamicBackgroundResUrl;
       if (tdynamicBack != null && tdynamicBack.length > 0) {
          int i = 0;
          LiveStreamMessages$DynamicBackground tdynamicBack1 = this.dynamicBackgroundResUrl;
          while (i < tdynamicBack1.length) {
             object oobject = tdynamicBack1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tdynamicBack = this.dynamicBackgroundResType;
       if (tdynamicBack != null) {
          p0.writeInt32(2, tdynamicBack);
       }
       if (!(this.md5).equals("")) {
          p0.writeString(3, this.md5);
       }
       super.writeTo(p0);
       return;
    }
}
