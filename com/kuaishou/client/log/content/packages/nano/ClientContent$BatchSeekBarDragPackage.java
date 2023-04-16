package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchSeekBarDragPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoSeekBarDragPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchSeekBarDragPackage extends MessageNano	// class@001215
{
    public ClientContent$PhotoSeekBarDragPackage[] seekBarDragPackage;
    public static ClientContent$BatchSeekBarDragPackage[] _emptyArray;

    public void ClientContent$BatchSeekBarDragPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchSeekBarDragPackage[] emptyArray(){
       if (ClientContent$BatchSeekBarDragPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchSeekBarDragPackage._emptyArray == null) {
             ClientContent$BatchSeekBarDragPackage[] uBatchSeekBa = new ClientContent$BatchSeekBarDragPackage[0];
             ClientContent$BatchSeekBarDragPackage._emptyArray = uBatchSeekBa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchSeekBarDragPackage._emptyArray;
    }
    public static ClientContent$BatchSeekBarDragPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchSeekBarDragPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchSeekBarDragPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchSeekBarDragPackage(), p0);
    }
    public ClientContent$BatchSeekBarDragPackage clear(){
       this.seekBarDragPackage = ClientContent$PhotoSeekBarDragPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchSeekBarDragPackage tseekBarDrag = this.seekBarDragPackage;
       if (tseekBarDrag != null && tseekBarDrag.length > 0) {
          int i1 = 0;
          ClientContent$BatchSeekBarDragPackage tseekBarDrag1 = this.seekBarDragPackage;
          while (i1 < tseekBarDrag1.length) {
             object oobject = tseekBarDrag1[i1];
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
    public ClientContent$BatchSeekBarDragPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchSeekBarDragPackage tseekBarDrag = this.seekBarDragPackage;
             int i2 = (tseekBarDrag == null)? 0: tseekBarDrag.length;
             i = i + i2;
             ClientContent$PhotoSeekBarDragPackage[] photoSeekBar = new ClientContent$PhotoSeekBarDragPackage[i];
             if (i2) {
                System.arraycopy(tseekBarDrag, 0, photoSeekBar, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                photoSeekBar[i2] = new ClientContent$PhotoSeekBarDragPackage();
                p0.readMessage(photoSeekBar[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             photoSeekBar[i2] = new ClientContent$PhotoSeekBarDragPackage();
             p0.readMessage(photoSeekBar[i2]);
             this.seekBarDragPackage = photoSeekBar;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchSeekBarDragPackage tseekBarDrag = this.seekBarDragPackage;
       if (tseekBarDrag != null && tseekBarDrag.length > 0) {
          int i = 0;
          ClientContent$BatchSeekBarDragPackage tseekBarDrag1 = this.seekBarDragPackage;
          while (i < tseekBarDrag1.length) {
             object oobject = tseekBarDrag1[i];
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
