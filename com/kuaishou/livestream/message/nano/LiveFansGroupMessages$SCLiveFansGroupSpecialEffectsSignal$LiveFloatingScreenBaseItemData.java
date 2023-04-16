package com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData extends MessageNano	// class@0011af
{
    public int itemType;
    public String text;
    public String textColor;
    public long textSize;
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData[] _emptyArray;

    public void LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData(){
       super();
       this.clear();
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData[] emptyArray(){
       if (LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData._emptyArray == null) {
             LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData[] sCLiveFansGr = new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData[0];
             LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData._emptyArray = sCLiveFansGr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData._emptyArray;
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData().mergeFrom(p0);
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData(), p0);
    }
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData clear(){
       this.itemType = 0;
       this.text = "";
       this.textColor = "";
       this.textSize = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData titemType = this.itemType;
       if (titemType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, titemType);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.textColor);
       }
       titemType = this.textSize;
       if (titemType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, titemType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.textSize = p0.readUInt64();
                   }
                }else {
                   this.textColor = p0.readString();
                }
             }else {
                this.text = p0.readString();
             }
          }else {
             this.itemType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData titemType = this.itemType;
       if (titemType != null) {
          p0.writeUInt32(1, titemType);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(3, this.textColor);
       }
       titemType = this.textSize;
       if (titemType) {
          p0.writeUInt64(4, titemType);
       }
       super.writeTo(p0);
       return;
    }
}
