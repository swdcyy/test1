package com.kuaishou.livestream.message.nano.LiveVoicePartyMicSeatUserLevelUpEffects;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveVoicePartyMicSeatUserLevelUpEffects extends MessageNano	// class@0013cc
{
    public LiveCdnNodeView[] material;
    public long userId;
    public static LiveVoicePartyMicSeatUserLevelUpEffects[] _emptyArray;

    public void LiveVoicePartyMicSeatUserLevelUpEffects(){
       super();
       this.clear();
    }
    public static LiveVoicePartyMicSeatUserLevelUpEffects[] emptyArray(){
       if (LiveVoicePartyMicSeatUserLevelUpEffects._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyMicSeatUserLevelUpEffects._emptyArray == null) {
             LiveVoicePartyMicSeatUserLevelUpEffects[] liveVoicePar = new LiveVoicePartyMicSeatUserLevelUpEffects[0];
             LiveVoicePartyMicSeatUserLevelUpEffects._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyMicSeatUserLevelUpEffects._emptyArray;
    }
    public static LiveVoicePartyMicSeatUserLevelUpEffects parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyMicSeatUserLevelUpEffects().mergeFrom(p0);
    }
    public static LiveVoicePartyMicSeatUserLevelUpEffects parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyMicSeatUserLevelUpEffects(), p0);
    }
    public LiveVoicePartyMicSeatUserLevelUpEffects clear(){
       this.material = LiveCdnNodeView.emptyArray();
       this.userId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveVoicePartyMicSeatUserLevelUpEffects tmaterial = this.material;
       if (tmaterial != null && tmaterial.length > 0) {
          int i1 = 0;
          LiveVoicePartyMicSeatUserLevelUpEffects tmaterial1 = this.material;
          while (i1 < tmaterial1.length) {
             object oobject = tmaterial1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tmaterial = this.userId;
       if (tmaterial) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tmaterial);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyMicSeatUserLevelUpEffects mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.userId = p0.readUInt64();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveVoicePartyMicSeatUserLevelUpEffects tmaterial = this.material;
             int i2 = (tmaterial == null)? 0: tmaterial.length;
             i = i + i2;
             LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
             if (i2) {
                System.arraycopy(tmaterial, 0, liveCdnNodeV, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveCdnNodeV[i2] = new LiveCdnNodeView();
             p0.readMessage(liveCdnNodeV[i2]);
             this.material = liveCdnNodeV;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveVoicePartyMicSeatUserLevelUpEffects tmaterial = this.material;
       if (tmaterial != null && tmaterial.length > 0) {
          int i = 0;
          LiveVoicePartyMicSeatUserLevelUpEffects tmaterial1 = this.material;
          while (i < tmaterial1.length) {
             object oobject = tmaterial1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tmaterial = this.userId;
       if (tmaterial) {
          p0.writeUInt64(2, tmaterial);
       }
       super.writeTo(p0);
       return;
    }
}
