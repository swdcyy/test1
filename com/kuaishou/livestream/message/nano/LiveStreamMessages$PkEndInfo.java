package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkEndInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerEndInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$PkEndInfo extends MessageNano	// class@001311
{
    public int endType;
    public LiveStreamMessages$PkPlayerEndInfo[] playerEndInfo;
    public static LiveStreamMessages$PkEndInfo[] _emptyArray;

    public void LiveStreamMessages$PkEndInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkEndInfo[] emptyArray(){
       if (LiveStreamMessages$PkEndInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkEndInfo._emptyArray == null) {
             LiveStreamMessages$PkEndInfo[] pkEndInfoArr = new LiveStreamMessages$PkEndInfo[0];
             LiveStreamMessages$PkEndInfo._emptyArray = pkEndInfoArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkEndInfo._emptyArray;
    }
    public static LiveStreamMessages$PkEndInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkEndInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkEndInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkEndInfo(), p0);
    }
    public LiveStreamMessages$PkEndInfo clear(){
       this.endType = 0;
       this.playerEndInfo = LiveStreamMessages$PkPlayerEndInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkEndInfo tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tendType);
       }
       tendType = this.playerEndInfo;
       if (tendType != null && tendType.length > 0) {
          int i1 = 0;
          LiveStreamMessages$PkEndInfo tplayerEndIn = this.playerEndInfo;
          while (i1 < tplayerEndIn.length) {
             object oobject = tplayerEndIn[i1];
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
    public LiveStreamMessages$PkEndInfo mergeFrom(CodedInputByteBufferNano p0){
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
                LiveStreamMessages$PkEndInfo tplayerEndIn = this.playerEndInfo;
                int i2 = (tplayerEndIn == null)? 0: tplayerEndIn.length;
                i = i + i2;
                LiveStreamMessages$PkPlayerEndInfo[] pkPlayerEndI = new LiveStreamMessages$PkPlayerEndInfo[i];
                if (i2) {
                   System.arraycopy(tplayerEndIn, 0, pkPlayerEndI, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   pkPlayerEndI[i2] = new LiveStreamMessages$PkPlayerEndInfo();
                   p0.readMessage(pkPlayerEndI[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                pkPlayerEndI[i2] = new LiveStreamMessages$PkPlayerEndInfo();
                p0.readMessage(pkPlayerEndI[i2]);
                this.playerEndInfo = pkPlayerEndI;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.endType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PkEndInfo tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(1, tendType);
       }
       tendType = this.playerEndInfo;
       if (tendType != null && tendType.length > 0) {
          int i = 0;
          LiveStreamMessages$PkEndInfo tplayerEndIn = this.playerEndInfo;
          while (i < tplayerEndIn.length) {
             object oobject = tplayerEndIn[i];
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
