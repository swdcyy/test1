package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveMagicFaceEffectSyncMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveMagicFaceEffectSyncMessage extends MessageNano	// class@000c7a
{
    public boolean cleanEffectsImmediately;
    public long magicFaceId;
    public long playCount;
    public long time;
    public static LiveFlvStream$LiveMagicFaceEffectSyncMessage[] _emptyArray;

    public void LiveFlvStream$LiveMagicFaceEffectSyncMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveMagicFaceEffectSyncMessage[] emptyArray(){
       if (LiveFlvStream$LiveMagicFaceEffectSyncMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveMagicFaceEffectSyncMessage._emptyArray == null) {
             LiveFlvStream$LiveMagicFaceEffectSyncMessage[] liveMagicFac = new LiveFlvStream$LiveMagicFaceEffectSyncMessage[0];
             LiveFlvStream$LiveMagicFaceEffectSyncMessage._emptyArray = liveMagicFac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveMagicFaceEffectSyncMessage._emptyArray;
    }
    public static LiveFlvStream$LiveMagicFaceEffectSyncMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveMagicFaceEffectSyncMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveMagicFaceEffectSyncMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveMagicFaceEffectSyncMessage(), p0);
    }
    public LiveFlvStream$LiveMagicFaceEffectSyncMessage clear(){
       this.cleanEffectsImmediately = false;
       this.magicFaceId = 0;
       this.playCount = 0;
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveMagicFaceEffectSyncMessage tcleanEffect = this.cleanEffectsImmediately;
       if (tcleanEffect != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tcleanEffect);
       }
       tcleanEffect = this.magicFaceId;
       int i1 = 0;
       if (tcleanEffect - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcleanEffect);
       }
       tcleanEffect = this.playCount;
       if (tcleanEffect - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcleanEffect);
       }
       tcleanEffect = this.time;
       if (tcleanEffect - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcleanEffect);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveMagicFaceEffectSyncMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.time = p0.readUInt64();
                   }
                }else {
                   this.playCount = p0.readUInt64();
                }
             }else {
                this.magicFaceId = p0.readUInt64();
             }
          }else {
             this.cleanEffectsImmediately = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveMagicFaceEffectSyncMessage tcleanEffect = this.cleanEffectsImmediately;
       if (tcleanEffect != null) {
          p0.writeBool(1, tcleanEffect);
       }
       tcleanEffect = this.magicFaceId;
       int i = 0;
       if (tcleanEffect - i) {
          p0.writeUInt64(2, tcleanEffect);
       }
       tcleanEffect = this.playCount;
       if (tcleanEffect - i) {
          p0.writeUInt64(3, tcleanEffect);
       }
       tcleanEffect = this.time;
       if (tcleanEffect - i) {
          p0.writeUInt64(4, tcleanEffect);
       }
       super.writeTo(p0);
       return;
    }
}
