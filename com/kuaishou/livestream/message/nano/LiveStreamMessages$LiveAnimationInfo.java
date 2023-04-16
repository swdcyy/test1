package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveAnimationInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$LiveAnimationInfo extends MessageNano	// class@0012ef
{
    public UserInfos$PicUrl[] animationImage;
    public long endShowTimeStamp;
    public long startShowTimeStamp;
    public static LiveStreamMessages$LiveAnimationInfo[] _emptyArray;

    public void LiveStreamMessages$LiveAnimationInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveAnimationInfo[] emptyArray(){
       if (LiveStreamMessages$LiveAnimationInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveAnimationInfo._emptyArray == null) {
             LiveStreamMessages$LiveAnimationInfo[] liveAnimatio = new LiveStreamMessages$LiveAnimationInfo[0];
             LiveStreamMessages$LiveAnimationInfo._emptyArray = liveAnimatio;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveAnimationInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveAnimationInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveAnimationInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveAnimationInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveAnimationInfo(), p0);
    }
    public LiveStreamMessages$LiveAnimationInfo clear(){
       this.startShowTimeStamp = 0;
       this.endShowTimeStamp = 0;
       this.animationImage = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveAnimationInfo tstartShowTi = this.startShowTimeStamp;
       int i1 = 0;
       if (tstartShowTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartShowTi);
       }
       tstartShowTi = this.endShowTimeStamp;
       if (tstartShowTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartShowTi);
       }
       tstartShowTi = this.animationImage;
       if (tstartShowTi != null && tstartShowTi.length > 0) {
          int i2 = 0;
          LiveStreamMessages$LiveAnimationInfo tanimationIm = this.animationImage;
          while (i2 < tanimationIm.length) {
             object oobject = tanimationIm[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveAnimationInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveStreamMessages$LiveAnimationInfo tanimationIm = this.animationImage;
                   int i2 = (tanimationIm == null)? 0: tanimationIm.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tanimationIm, 0, picUrlArray, 0, i2);
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
                   this.animationImage = picUrlArray;
                }
             }else {
                this.endShowTimeStamp = p0.readUInt64();
             }
          }else {
             this.startShowTimeStamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$LiveAnimationInfo tstartShowTi = this.startShowTimeStamp;
       int i = 0;
       if (tstartShowTi - i) {
          p0.writeUInt64(1, tstartShowTi);
       }
       tstartShowTi = this.endShowTimeStamp;
       if (tstartShowTi - i) {
          p0.writeUInt64(2, tstartShowTi);
       }
       tstartShowTi = this.animationImage;
       if (tstartShowTi != null && tstartShowTi.length > 0) {
          int i1 = 0;
          LiveStreamMessages$LiveAnimationInfo tanimationIm = this.animationImage;
          while (i1 < tanimationIm.length) {
             object oobject = tanimationIm[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
