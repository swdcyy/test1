package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLivePlusActivityPendantClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$SCLivePlusActivityPendantClose extends MessageNano	// class@00134c
{
    public boolean isCloseAll;
    public String[] pendantId;
    public static LiveStreamMessages$SCLivePlusActivityPendantClose[] _emptyArray;

    public void LiveStreamMessages$SCLivePlusActivityPendantClose(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLivePlusActivityPendantClose[] emptyArray(){
       if (LiveStreamMessages$SCLivePlusActivityPendantClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLivePlusActivityPendantClose._emptyArray == null) {
             LiveStreamMessages$SCLivePlusActivityPendantClose[] sCLivePlusAc = new LiveStreamMessages$SCLivePlusActivityPendantClose[0];
             LiveStreamMessages$SCLivePlusActivityPendantClose._emptyArray = sCLivePlusAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLivePlusActivityPendantClose._emptyArray;
    }
    public static LiveStreamMessages$SCLivePlusActivityPendantClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLivePlusActivityPendantClose().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLivePlusActivityPendantClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLivePlusActivityPendantClose(), p0);
    }
    public LiveStreamMessages$SCLivePlusActivityPendantClose clear(){
       this.isCloseAll = false;
       this.pendantId = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLivePlusActivityPendantClose tisCloseAll = this.isCloseAll;
       if (tisCloseAll != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tisCloseAll);
       }
       tisCloseAll = this.pendantId;
       if (tisCloseAll != null && tisCloseAll.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveStreamMessages$SCLivePlusActivityPendantClose tpendantId = this.pendantId;
          while (i1 < tpendantId.length) {
             object oobject = tpendantId[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLivePlusActivityPendantClose mergeFrom(CodedInputByteBufferNano p0){
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
                LiveStreamMessages$SCLivePlusActivityPendantClose tpendantId = this.pendantId;
                int i2 = (tpendantId == null)? 0: tpendantId.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tpendantId, 0, stringArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.pendantId = stringArray;
             }
          }else {
             this.isCloseAll = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLivePlusActivityPendantClose tisCloseAll = this.isCloseAll;
       if (tisCloseAll != null) {
          p0.writeBool(1, tisCloseAll);
       }
       tisCloseAll = this.pendantId;
       if (tisCloseAll != null && tisCloseAll.length > 0) {
          int i = 0;
          LiveStreamMessages$SCLivePlusActivityPendantClose tpendantId = this.pendantId;
          while (i < tpendantId.length) {
             object oobject = tpendantId[i];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
