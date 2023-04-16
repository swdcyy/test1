package com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData extends MessageNano	// class@0011ae
{
    public String[] backgroundGradientColors;
    public int backgroundType;
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData[] _emptyArray;

    public void LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData(){
       super();
       this.clear();
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData[] emptyArray(){
       if (LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData._emptyArray == null) {
             LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData[] sCLiveFansGr = new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData[0];
             LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData._emptyArray = sCLiveFansGr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData._emptyArray;
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData().mergeFrom(p0);
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData(), p0);
    }
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData clear(){
       this.backgroundType = 0;
       this.backgroundGradientColors = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData tbackgroundT = this.backgroundType;
       if (tbackgroundT != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tbackgroundT);
       }
       tbackgroundT = this.backgroundGradientColors;
       if (tbackgroundT != null && tbackgroundT.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData tbackgroundG = this.backgroundGradientColors;
          while (i1 < tbackgroundG.length) {
             object oobject = tbackgroundG[i1];
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
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData mergeFrom(CodedInputByteBufferNano p0){
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
                LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData tbackgroundG = this.backgroundGradientColors;
                int i2 = (tbackgroundG == null)? 0: tbackgroundG.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tbackgroundG, 0, stringArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.backgroundGradientColors = stringArray;
             }
          }else {
             this.backgroundType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData tbackgroundT = this.backgroundType;
       if (tbackgroundT != null) {
          p0.writeUInt32(1, tbackgroundT);
       }
       tbackgroundT = this.backgroundGradientColors;
       if (tbackgroundT != null && tbackgroundT.length > 0) {
          int i = 0;
          LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData tbackgroundG = this.backgroundGradientColors;
          while (i < tbackgroundG.length) {
             object oobject = tbackgroundG[i];
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
