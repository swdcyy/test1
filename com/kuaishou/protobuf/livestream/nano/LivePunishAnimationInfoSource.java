package com.kuaishou.protobuf.livestream.nano.LivePunishAnimationInfoSource;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LivePunishAnimationInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePunishAnimationInfoSource extends MessageNano	// class@000cd4
{
    public LivePunishAnimationInfo[] punishAnimationInfo;
    public String punishAudioDefaultResource;
    public String punishAudioResource;
    public static LivePunishAnimationInfoSource[] _emptyArray;

    public void LivePunishAnimationInfoSource(){
       super();
       this.clear();
    }
    public static LivePunishAnimationInfoSource[] emptyArray(){
       if (LivePunishAnimationInfoSource._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePunishAnimationInfoSource._emptyArray == null) {
             LivePunishAnimationInfoSource[] livePunishAn = new LivePunishAnimationInfoSource[0];
             LivePunishAnimationInfoSource._emptyArray = livePunishAn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePunishAnimationInfoSource._emptyArray;
    }
    public static LivePunishAnimationInfoSource parseFrom(CodedInputByteBufferNano p0){
       return new LivePunishAnimationInfoSource().mergeFrom(p0);
    }
    public static LivePunishAnimationInfoSource parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePunishAnimationInfoSource(), p0);
    }
    public LivePunishAnimationInfoSource clear(){
       this.punishAnimationInfo = LivePunishAnimationInfo.emptyArray();
       this.punishAudioResource = "";
       this.punishAudioDefaultResource = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePunishAnimationInfoSource tpunishAnima = this.punishAnimationInfo;
       if (tpunishAnima != null && tpunishAnima.length > 0) {
          int i1 = 0;
          LivePunishAnimationInfoSource tpunishAnima1 = this.punishAnimationInfo;
          while (i1 < tpunishAnima1.length) {
             object oobject = tpunishAnima1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.punishAudioResource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.punishAudioResource);
       }
       if (!(this.punishAudioDefaultResource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.punishAudioDefaultResource);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePunishAnimationInfoSource mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 26) {
                if (i != 34) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.punishAudioDefaultResource = p0.readString();
                }
             }else {
                this.punishAudioResource = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LivePunishAnimationInfoSource tpunishAnima = this.punishAnimationInfo;
             int i2 = (tpunishAnima == null)? 0: tpunishAnima.length;
             i = i + i2;
             LivePunishAnimationInfo[] livePunishAn = new LivePunishAnimationInfo[i];
             if (i2) {
                System.arraycopy(tpunishAnima, 0, livePunishAn, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                livePunishAn[i2] = new LivePunishAnimationInfo();
                p0.readMessage(livePunishAn[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             livePunishAn[i2] = new LivePunishAnimationInfo();
             p0.readMessage(livePunishAn[i2]);
             this.punishAnimationInfo = livePunishAn;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePunishAnimationInfoSource tpunishAnima = this.punishAnimationInfo;
       if (tpunishAnima != null && tpunishAnima.length > 0) {
          int i = 0;
          LivePunishAnimationInfoSource tpunishAnima1 = this.punishAnimationInfo;
          while (i < tpunishAnima1.length) {
             object oobject = tpunishAnima1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.punishAudioResource).equals(str)) {
          p0.writeString(3, this.punishAudioResource);
       }
       if (!(this.punishAudioDefaultResource).equals(str)) {
          p0.writeString(4, this.punishAudioDefaultResource);
       }
       super.writeTo(p0);
       return;
    }
}
