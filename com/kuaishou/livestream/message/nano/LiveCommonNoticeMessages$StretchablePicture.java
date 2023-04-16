package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$StretchablePicture;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveCommonNoticeMessages$StretchablePicture extends MessageNano	// class@001161
{
    public int insetBottomDp;
    public int insetLeftDp;
    public int insetRightDp;
    public int insetTopDp;
    public UserInfos$PicUrl[] picUrl;
    public static LiveCommonNoticeMessages$StretchablePicture[] _emptyArray;

    public void LiveCommonNoticeMessages$StretchablePicture(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$StretchablePicture[] emptyArray(){
       if (LiveCommonNoticeMessages$StretchablePicture._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$StretchablePicture._emptyArray == null) {
             LiveCommonNoticeMessages$StretchablePicture[] stretchableP = new LiveCommonNoticeMessages$StretchablePicture[0];
             LiveCommonNoticeMessages$StretchablePicture._emptyArray = stretchableP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$StretchablePicture._emptyArray;
    }
    public static LiveCommonNoticeMessages$StretchablePicture parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$StretchablePicture().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$StretchablePicture parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$StretchablePicture(), p0);
    }
    public LiveCommonNoticeMessages$StretchablePicture clear(){
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.insetLeftDp = 0;
       this.insetRightDp = 0;
       this.insetTopDp = 0;
       this.insetBottomDp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonNoticeMessages$StretchablePicture tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i1 = 0;
          LiveCommonNoticeMessages$StretchablePicture tpicUrl1 = this.picUrl;
          while (i1 < tpicUrl1.length) {
             object oobject = tpicUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpicUrl = this.insetLeftDp;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tpicUrl);
       }
       tpicUrl = this.insetRightDp;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tpicUrl);
       }
       tpicUrl = this.insetTopDp;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tpicUrl);
       }
       tpicUrl = this.insetBottomDp;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tpicUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$StretchablePicture mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.insetBottomDp = p0.readUInt32();
                      }
                   }else {
                      this.insetTopDp = p0.readUInt32();
                   }
                }else {
                   this.insetRightDp = p0.readUInt32();
                }
             }else {
                this.insetLeftDp = p0.readUInt32();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveCommonNoticeMessages$StretchablePicture tpicUrl = this.picUrl;
             int i2 = (tpicUrl == null)? 0: tpicUrl.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tpicUrl, 0, picUrlArray, 0, i2);
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
             this.picUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonNoticeMessages$StretchablePicture tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i = 0;
          LiveCommonNoticeMessages$StretchablePicture tpicUrl1 = this.picUrl;
          while (i < tpicUrl1.length) {
             object oobject = tpicUrl1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tpicUrl = this.insetLeftDp;
       if (tpicUrl != null) {
          p0.writeUInt32(2, tpicUrl);
       }
       tpicUrl = this.insetRightDp;
       if (tpicUrl != null) {
          p0.writeUInt32(3, tpicUrl);
       }
       tpicUrl = this.insetTopDp;
       if (tpicUrl != null) {
          p0.writeUInt32(4, tpicUrl);
       }
       tpicUrl = this.insetBottomDp;
       if (tpicUrl != null) {
          p0.writeUInt32(5, tpicUrl);
       }
       super.writeTo(p0);
       return;
    }
}
