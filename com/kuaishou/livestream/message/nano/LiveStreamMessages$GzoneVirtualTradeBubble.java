package com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneVirtualTradeBubble;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$GzoneVirtualTradeBubble extends MessageNano	// class@0012de
{
    public UserInfos$PicUrl[] backgroundPicUrl;
    public int displaySeconds;
    public String gameName;
    public String text;
    public String url;
    public static LiveStreamMessages$GzoneVirtualTradeBubble[] _emptyArray;

    public void LiveStreamMessages$GzoneVirtualTradeBubble(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$GzoneVirtualTradeBubble[] emptyArray(){
       if (LiveStreamMessages$GzoneVirtualTradeBubble._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$GzoneVirtualTradeBubble._emptyArray == null) {
             LiveStreamMessages$GzoneVirtualTradeBubble[] gzoneVirtual = new LiveStreamMessages$GzoneVirtualTradeBubble[0];
             LiveStreamMessages$GzoneVirtualTradeBubble._emptyArray = gzoneVirtual;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$GzoneVirtualTradeBubble._emptyArray;
    }
    public static LiveStreamMessages$GzoneVirtualTradeBubble parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$GzoneVirtualTradeBubble().mergeFrom(p0);
    }
    public static LiveStreamMessages$GzoneVirtualTradeBubble parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$GzoneVirtualTradeBubble(), p0);
    }
    public LiveStreamMessages$GzoneVirtualTradeBubble clear(){
       this.backgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.text = "";
       this.url = "";
       this.displaySeconds = 0;
       this.gameName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$GzoneVirtualTradeBubble tbackgroundP = this.backgroundPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i1 = 0;
          LiveStreamMessages$GzoneVirtualTradeBubble tbackgroundP1 = this.backgroundPicUrl;
          while (i1 < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.url);
       }
       tbackgroundP = this.displaySeconds;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tbackgroundP);
       }
       if (!(this.gameName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.gameName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$GzoneVirtualTradeBubble mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.gameName = p0.readString();
                      }
                   }else {
                      this.displaySeconds = p0.readUInt32();
                   }
                }else {
                   this.url = p0.readString();
                }
             }else {
                this.text = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveStreamMessages$GzoneVirtualTradeBubble tbackgroundP = this.backgroundPicUrl;
             int i2 = (tbackgroundP == null)? 0: tbackgroundP.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tbackgroundP, 0, picUrlArray, 0, i2);
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
             this.backgroundPicUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$GzoneVirtualTradeBubble tbackgroundP = this.backgroundPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i = 0;
          LiveStreamMessages$GzoneVirtualTradeBubble tbackgroundP1 = this.backgroundPicUrl;
          while (i < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(3, this.url);
       }
       tbackgroundP = this.displaySeconds;
       if (tbackgroundP != null) {
          p0.writeUInt32(4, tbackgroundP);
       }
       if (!(this.gameName).equals(str)) {
          p0.writeString(5, this.gameName);
       }
       super.writeTo(p0);
       return;
    }
}
