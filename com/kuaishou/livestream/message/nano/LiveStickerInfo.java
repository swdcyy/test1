package com.kuaishou.livestream.message.nano.LiveStickerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveSticker;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveStickerInfo extends MessageNano	// class@0012b5
{
    public LiveSticker[] sticker;
    public static LiveStickerInfo[] _emptyArray;

    public void LiveStickerInfo(){
       super();
       this.clear();
    }
    public static LiveStickerInfo[] emptyArray(){
       if (LiveStickerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStickerInfo._emptyArray == null) {
             LiveStickerInfo[] liveStickerI = new LiveStickerInfo[0];
             LiveStickerInfo._emptyArray = liveStickerI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStickerInfo._emptyArray;
    }
    public static LiveStickerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStickerInfo().mergeFrom(p0);
    }
    public static LiveStickerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStickerInfo(), p0);
    }
    public LiveStickerInfo clear(){
       this.sticker = LiveSticker.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStickerInfo tsticker = this.sticker;
       if (tsticker != null && tsticker.length > 0) {
          int i1 = 0;
          LiveStickerInfo tsticker1 = this.sticker;
          while (i1 < tsticker1.length) {
             object oobject = tsticker1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStickerInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveStickerInfo tsticker = this.sticker;
             int i2 = (tsticker == null)? 0: tsticker.length;
             i = i + i2;
             LiveSticker[] liveStickerA = new LiveSticker[i];
             if (i2) {
                System.arraycopy(tsticker, 0, liveStickerA, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveStickerA[i2] = new LiveSticker();
                p0.readMessage(liveStickerA[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveStickerA[i2] = new LiveSticker();
             p0.readMessage(liveStickerA[i2]);
             this.sticker = liveStickerA;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStickerInfo tsticker = this.sticker;
       if (tsticker != null && tsticker.length > 0) {
          int i = 0;
          LiveStickerInfo tsticker1 = this.sticker;
          while (i < tsticker1.length) {
             object oobject = tsticker1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
