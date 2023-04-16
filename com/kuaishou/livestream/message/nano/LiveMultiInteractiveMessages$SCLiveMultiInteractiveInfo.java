package com.kuaishou.livestream.message.nano.LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo extends MessageNano	// class@0011ff
{
    public LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo[] effectInfo;
    public String id;
    public String[] otherParticipantId;
    public static LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo[] _emptyArray;

    public void LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo(){
       super();
       this.clear();
    }
    public static LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo[] emptyArray(){
       if (LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo._emptyArray == null) {
             LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo[] sCLiveMultiI = new LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo[0];
             LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo._emptyArray = sCLiveMultiI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo._emptyArray;
    }
    public static LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo().mergeFrom(p0);
    }
    public static LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo(), p0);
    }
    public LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo clear(){
       this.effectInfo = LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo.emptyArray();
       this.id = "";
       this.otherParticipantId = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i = super.computeSerializedSize();
       LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo teffectInfo = this.effectInfo;
       int i1 = 0;
       if (teffectInfo != null && teffectInfo.length > 0) {
          i2 = 0;
          LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo teffectInfo1 = this.effectInfo;
          while (i2 < teffectInfo1.length) {
             object oobject = teffectInfo1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.id);
       }
       teffectInfo = this.otherParticipantId;
       if (teffectInfo != null && teffectInfo.length > 0) {
          i2 = 0;
          int i3 = 0;
          LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo totherPartic = this.otherParticipantId;
          while (i1 < totherPartic.length) {
             object oobject1 = totherPartic[i1];
             if (oobject1 != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
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
    public LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo totherPartic;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   totherPartic = this.otherParticipantId;
                   i2 = (totherPartic == null)? 0: totherPartic.length;
                   i = i + i2;
                   String[] stringArray = new String[i];
                   if (i2) {
                      System.arraycopy(totherPartic, 0, stringArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      stringArray[i2] = p0.readString();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   stringArray[i2] = p0.readString();
                   this.otherParticipantId = stringArray;
                }
             }else {
                this.id = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             totherPartic = this.effectInfo;
             i2 = (totherPartic == null)? 0: totherPartic.length;
             i = i + i2;
             LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo[] liveMultiInt = new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo[i];
             if (i2) {
                System.arraycopy(totherPartic, 0, liveMultiInt, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveMultiInt[i2] = new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo();
                p0.readMessage(liveMultiInt[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveMultiInt[i2] = new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo();
             p0.readMessage(liveMultiInt[i2]);
             this.effectInfo = liveMultiInt;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo teffectInfo = this.effectInfo;
       int i = 0;
       if (teffectInfo != null && teffectInfo.length > 0) {
          int i1 = 0;
          LiveMultiInteractiveMessages$SCLiveMultiInteractiveInfo teffectInfo1 = this.effectInfo;
          while (i1 < teffectInfo1.length) {
             object oobject = teffectInfo1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.id).equals("")) {
          p0.writeString(2, this.id);
       }
       teffectInfo = this.otherParticipantId;
       if (teffectInfo != null && teffectInfo.length > 0) {
          teffectInfo = this.otherParticipantId;
          while (i < teffectInfo.length) {
             object oobject1 = teffectInfo[i];
             if (oobject1 != null) {
                p0.writeString(3, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
