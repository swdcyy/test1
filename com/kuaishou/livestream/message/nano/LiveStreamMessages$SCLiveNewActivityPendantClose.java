package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveNewActivityPendantClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$SCLiveNewActivityPendantClose extends MessageNano	// class@00134a
{
    public boolean isCloseAll;
    public boolean largePendant;
    public String[] pendantId;
    public static LiveStreamMessages$SCLiveNewActivityPendantClose[] _emptyArray;

    public void LiveStreamMessages$SCLiveNewActivityPendantClose(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveNewActivityPendantClose[] emptyArray(){
       if (LiveStreamMessages$SCLiveNewActivityPendantClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveNewActivityPendantClose._emptyArray == null) {
             LiveStreamMessages$SCLiveNewActivityPendantClose[] sCLiveNewAct = new LiveStreamMessages$SCLiveNewActivityPendantClose[0];
             LiveStreamMessages$SCLiveNewActivityPendantClose._emptyArray = sCLiveNewAct;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveNewActivityPendantClose._emptyArray;
    }
    public static LiveStreamMessages$SCLiveNewActivityPendantClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveNewActivityPendantClose().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveNewActivityPendantClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveNewActivityPendantClose(), p0);
    }
    public LiveStreamMessages$SCLiveNewActivityPendantClose clear(){
       this.isCloseAll = false;
       this.pendantId = WireFormatNano.EMPTY_STRING_ARRAY;
       this.largePendant = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveNewActivityPendantClose tisCloseAll = this.isCloseAll;
       int i1 = 1;
       if (tisCloseAll != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(i1, tisCloseAll);
       }
       tisCloseAll = this.pendantId;
       if (tisCloseAll != null && tisCloseAll.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          LiveStreamMessages$SCLiveNewActivityPendantClose tpendantId = this.pendantId;
          while (i2 < tpendantId.length) {
             object oobject = tpendantId[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tisCloseAll = this.largePendant;
       if (tisCloseAll != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tisCloseAll);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveNewActivityPendantClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.largePendant = p0.readBool();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveStreamMessages$SCLiveNewActivityPendantClose tpendantId = this.pendantId;
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
       LiveStreamMessages$SCLiveNewActivityPendantClose tisCloseAll = this.isCloseAll;
       if (tisCloseAll != null) {
          p0.writeBool(1, tisCloseAll);
       }
       tisCloseAll = this.pendantId;
       if (tisCloseAll != null && tisCloseAll.length > 0) {
          int i = 0;
          LiveStreamMessages$SCLiveNewActivityPendantClose tpendantId = this.pendantId;
          while (i < tpendantId.length) {
             object oobject = tpendantId[i];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i = i + 1;
          }
       }
       tisCloseAll = this.largePendant;
       if (tisCloseAll != null) {
          p0.writeBool(3, tisCloseAll);
       }
       super.writeTo(p0);
       return;
    }
}
