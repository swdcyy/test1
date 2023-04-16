package com.kuaishou.livestream.message.nano.GzoneLiveRedDotFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class GzoneLiveRedDotFeed extends MessageNano	// class@0010b3
{
    public long entranceId;
    public long randomTime;
    public UserInfos$PicUrl[] redDotIconUrl;
    public long redDotId;
    public static GzoneLiveRedDotFeed[] _emptyArray;

    public void GzoneLiveRedDotFeed(){
       super();
       this.clear();
    }
    public static GzoneLiveRedDotFeed[] emptyArray(){
       if (GzoneLiveRedDotFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneLiveRedDotFeed._emptyArray == null) {
             GzoneLiveRedDotFeed[] gzoneLiveRed = new GzoneLiveRedDotFeed[0];
             GzoneLiveRedDotFeed._emptyArray = gzoneLiveRed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneLiveRedDotFeed._emptyArray;
    }
    public static GzoneLiveRedDotFeed parseFrom(CodedInputByteBufferNano p0){
       return new GzoneLiveRedDotFeed().mergeFrom(p0);
    }
    public static GzoneLiveRedDotFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneLiveRedDotFeed(), p0);
    }
    public GzoneLiveRedDotFeed clear(){
       this.entranceId = 0;
       this.redDotId = 0;
       this.redDotIconUrl = UserInfos$PicUrl.emptyArray();
       this.randomTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneLiveRedDotFeed tentranceId = this.entranceId;
       int i1 = 0;
       if (tentranceId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tentranceId);
       }
       tentranceId = this.redDotId;
       if (tentranceId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tentranceId);
       }
       tentranceId = this.redDotIconUrl;
       if (tentranceId != null && tentranceId.length > 0) {
          int i2 = 0;
          GzoneLiveRedDotFeed tredDotIconU = this.redDotIconUrl;
          while (i2 < tredDotIconU.length) {
             object oobject = tredDotIconU[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tentranceId = this.randomTime;
       if (tentranceId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tentranceId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneLiveRedDotFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.randomTime = p0.readUInt64();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   GzoneLiveRedDotFeed tredDotIconU = this.redDotIconUrl;
                   int i2 = (tredDotIconU == null)? 0: tredDotIconU.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tredDotIconU, 0, picUrlArray, 0, i2);
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
                   this.redDotIconUrl = picUrlArray;
                }
             }else {
                this.redDotId = p0.readUInt64();
             }
          }else {
             this.entranceId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneLiveRedDotFeed tentranceId = this.entranceId;
       int i = 0;
       if (tentranceId - i) {
          p0.writeUInt64(1, tentranceId);
       }
       tentranceId = this.redDotId;
       if (tentranceId - i) {
          p0.writeUInt64(2, tentranceId);
       }
       tentranceId = this.redDotIconUrl;
       if (tentranceId != null && tentranceId.length > 0) {
          int i1 = 0;
          GzoneLiveRedDotFeed tredDotIconU = this.redDotIconUrl;
          while (i1 < tredDotIconU.length) {
             object oobject = tredDotIconU[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tentranceId = this.randomTime;
       if (tentranceId - i) {
          p0.writeUInt64(4, tentranceId);
       }
       super.writeTo(p0);
       return;
    }
}
