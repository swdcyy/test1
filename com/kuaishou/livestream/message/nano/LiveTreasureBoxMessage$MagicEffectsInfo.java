package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$MagicEffectsInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveTreasureBoxMessage$MagicEffectsInfo extends MessageNano	// class@0013b2
{
    public boolean cannotBeBreak;
    public boolean isDisplayImmediately;
    public String magicEffectKey;
    public int rank;
    public static LiveTreasureBoxMessage$MagicEffectsInfo[] _emptyArray;

    public void LiveTreasureBoxMessage$MagicEffectsInfo(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$MagicEffectsInfo[] emptyArray(){
       if (LiveTreasureBoxMessage$MagicEffectsInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$MagicEffectsInfo._emptyArray == null) {
             LiveTreasureBoxMessage$MagicEffectsInfo[] magicEffects = new LiveTreasureBoxMessage$MagicEffectsInfo[0];
             LiveTreasureBoxMessage$MagicEffectsInfo._emptyArray = magicEffects;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$MagicEffectsInfo._emptyArray;
    }
    public static LiveTreasureBoxMessage$MagicEffectsInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$MagicEffectsInfo().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$MagicEffectsInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$MagicEffectsInfo(), p0);
    }
    public LiveTreasureBoxMessage$MagicEffectsInfo clear(){
       this.magicEffectKey = "";
       this.rank = 0;
       this.cannotBeBreak = false;
       this.isDisplayImmediately = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.magicEffectKey).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.magicEffectKey);
       }
       LiveTreasureBoxMessage$MagicEffectsInfo trank = this.rank;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, trank);
       }
       trank = this.cannotBeBreak;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, trank);
       }
       trank = this.isDisplayImmediately;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, trank);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$MagicEffectsInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.isDisplayImmediately = p0.readBool();
                   }
                }else {
                   this.cannotBeBreak = p0.readBool();
                }
             }else {
                this.rank = p0.readInt32();
             }
          }else {
             this.magicEffectKey = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.magicEffectKey).equals("")) {
          p0.writeString(1, this.magicEffectKey);
       }
       LiveTreasureBoxMessage$MagicEffectsInfo trank = this.rank;
       if (trank != null) {
          p0.writeInt32(2, trank);
       }
       trank = this.cannotBeBreak;
       if (trank != null) {
          p0.writeBool(3, trank);
       }
       trank = this.isDisplayImmediately;
       if (trank != null) {
          p0.writeBool(4, trank);
       }
       super.writeTo(p0);
       return;
    }
}
