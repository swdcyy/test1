package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAuthorBirthday;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCAuthorBirthday extends MessageNano	// class@001324
{
    public String enterRoomToastContent;
    public UserInfos$PicUrl[] hatUrl;
    public String liveStreamId;
    public int toastDurationSeconds;
    public static LiveStreamMessages$SCAuthorBirthday[] _emptyArray;

    public void LiveStreamMessages$SCAuthorBirthday(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCAuthorBirthday[] emptyArray(){
       if (LiveStreamMessages$SCAuthorBirthday._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCAuthorBirthday._emptyArray == null) {
             LiveStreamMessages$SCAuthorBirthday[] sCAuthorBirt = new LiveStreamMessages$SCAuthorBirthday[0];
             LiveStreamMessages$SCAuthorBirthday._emptyArray = sCAuthorBirt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCAuthorBirthday._emptyArray;
    }
    public static LiveStreamMessages$SCAuthorBirthday parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCAuthorBirthday().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCAuthorBirthday parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCAuthorBirthday(), p0);
    }
    public LiveStreamMessages$SCAuthorBirthday clear(){
       this.liveStreamId = "";
       this.hatUrl = UserInfos$PicUrl.emptyArray();
       this.enterRoomToastContent = "";
       this.toastDurationSeconds = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveStreamMessages$SCAuthorBirthday thatUrl = this.hatUrl;
       if (thatUrl != null && thatUrl.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCAuthorBirthday thatUrl1 = this.hatUrl;
          while (i1 < thatUrl1.length) {
             object oobject = thatUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.enterRoomToastContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.enterRoomToastContent);
       }
       thatUrl = this.toastDurationSeconds;
       if (thatUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, thatUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCAuthorBirthday mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.toastDurationSeconds = p0.readUInt32();
                   }
                }else {
                   this.enterRoomToastContent = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveStreamMessages$SCAuthorBirthday thatUrl = this.hatUrl;
                int i2 = (thatUrl == null)? 0: thatUrl.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(thatUrl, 0, picUrlArray, 0, i2);
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
                this.hatUrl = picUrlArray;
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       LiveStreamMessages$SCAuthorBirthday thatUrl = this.hatUrl;
       if (thatUrl != null && thatUrl.length > 0) {
          int i = 0;
          LiveStreamMessages$SCAuthorBirthday thatUrl1 = this.hatUrl;
          while (i < thatUrl1.length) {
             object oobject = thatUrl1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.enterRoomToastContent).equals(str)) {
          p0.writeString(3, this.enterRoomToastContent);
       }
       thatUrl = this.toastDurationSeconds;
       if (thatUrl != null) {
          p0.writeUInt32(4, thatUrl);
       }
       super.writeTo(p0);
       return;
    }
}
