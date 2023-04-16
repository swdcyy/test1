package com.kuaishou.livestream.message.nano.LivePkMessages$PkTopScoreUser;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkTopScoreUserDetailInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LivePkMessages$PkTopScoreUser extends MessageNano	// class@001220
{
    public long authorId;
    public LivePkMessages$PkTopScoreUserDetailInfo[] detailInfo;
    public static LivePkMessages$PkTopScoreUser[] _emptyArray;

    public void LivePkMessages$PkTopScoreUser(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkTopScoreUser[] emptyArray(){
       if (LivePkMessages$PkTopScoreUser._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkTopScoreUser._emptyArray == null) {
             LivePkMessages$PkTopScoreUser[] pkTopScoreUs = new LivePkMessages$PkTopScoreUser[0];
             LivePkMessages$PkTopScoreUser._emptyArray = pkTopScoreUs;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkTopScoreUser._emptyArray;
    }
    public static LivePkMessages$PkTopScoreUser parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkTopScoreUser().mergeFrom(p0);
    }
    public static LivePkMessages$PkTopScoreUser parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkTopScoreUser(), p0);
    }
    public LivePkMessages$PkTopScoreUser clear(){
       this.authorId = 0;
       this.detailInfo = LivePkMessages$PkTopScoreUserDetailInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkTopScoreUser tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tauthorId);
       }
       tauthorId = this.detailInfo;
       if (tauthorId != null && tauthorId.length > 0) {
          int i1 = 0;
          LivePkMessages$PkTopScoreUser tdetailInfo = this.detailInfo;
          while (i1 < tdetailInfo.length) {
             object oobject = tdetailInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkTopScoreUser mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LivePkMessages$PkTopScoreUser tdetailInfo = this.detailInfo;
                int i2 = (tdetailInfo == null)? 0: tdetailInfo.length;
                i = i + i2;
                LivePkMessages$PkTopScoreUserDetailInfo[] pkTopScoreUs = new LivePkMessages$PkTopScoreUserDetailInfo[i];
                if (i2) {
                   System.arraycopy(tdetailInfo, 0, pkTopScoreUs, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   pkTopScoreUs[i2] = new LivePkMessages$PkTopScoreUserDetailInfo();
                   p0.readMessage(pkTopScoreUs[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                pkTopScoreUs[i2] = new LivePkMessages$PkTopScoreUserDetailInfo();
                p0.readMessage(pkTopScoreUs[i2]);
                this.detailInfo = pkTopScoreUs;
             }
          }else {
             this.authorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkTopScoreUser tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(1, tauthorId);
       }
       tauthorId = this.detailInfo;
       if (tauthorId != null && tauthorId.length > 0) {
          int i = 0;
          LivePkMessages$PkTopScoreUser tdetailInfo = this.detailInfo;
          while (i < tdetailInfo.length) {
             object oobject = tdetailInfo[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
