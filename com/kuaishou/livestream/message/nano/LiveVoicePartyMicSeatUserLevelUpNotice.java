package com.kuaishou.livestream.message.nano.LiveVoicePartyMicSeatUserLevelUpNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveVoicePartyMicSeatUserLevelUpNotice extends MessageNano	// class@0013cd
{
    public int level;
    public LiveCdnNodeView[] material;
    public int subLevel;
    public String title;
    public String toast;
    public static LiveVoicePartyMicSeatUserLevelUpNotice[] _emptyArray;

    public void LiveVoicePartyMicSeatUserLevelUpNotice(){
       super();
       this.clear();
    }
    public static LiveVoicePartyMicSeatUserLevelUpNotice[] emptyArray(){
       if (LiveVoicePartyMicSeatUserLevelUpNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyMicSeatUserLevelUpNotice._emptyArray == null) {
             LiveVoicePartyMicSeatUserLevelUpNotice[] liveVoicePar = new LiveVoicePartyMicSeatUserLevelUpNotice[0];
             LiveVoicePartyMicSeatUserLevelUpNotice._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyMicSeatUserLevelUpNotice._emptyArray;
    }
    public static LiveVoicePartyMicSeatUserLevelUpNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyMicSeatUserLevelUpNotice().mergeFrom(p0);
    }
    public static LiveVoicePartyMicSeatUserLevelUpNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyMicSeatUserLevelUpNotice(), p0);
    }
    public LiveVoicePartyMicSeatUserLevelUpNotice clear(){
       this.material = LiveCdnNodeView.emptyArray();
       this.title = "";
       this.toast = "";
       this.level = 0;
       this.subLevel = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveVoicePartyMicSeatUserLevelUpNotice tmaterial = this.material;
       if (tmaterial != null && tmaterial.length > 0) {
          int i1 = 0;
          LiveVoicePartyMicSeatUserLevelUpNotice tmaterial1 = this.material;
          while (i1 < tmaterial1.length) {
             object oobject = tmaterial1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.toast).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.toast);
       }
       tmaterial = this.level;
       if (tmaterial != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tmaterial);
       }
       tmaterial = this.subLevel;
       if (tmaterial != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tmaterial);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyMicSeatUserLevelUpNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.subLevel = p0.readInt32();
                      }
                   }else {
                      this.level = p0.readInt32();
                   }
                }else {
                   this.toast = p0.readString();
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveVoicePartyMicSeatUserLevelUpNotice tmaterial = this.material;
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
       LiveVoicePartyMicSeatUserLevelUpNotice tmaterial = this.material;
       if (tmaterial != null && tmaterial.length > 0) {
          int i = 0;
          LiveVoicePartyMicSeatUserLevelUpNotice tmaterial1 = this.material;
          while (i < tmaterial1.length) {
             object oobject = tmaterial1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.toast).equals(str)) {
          p0.writeString(3, this.toast);
       }
       tmaterial = this.level;
       if (tmaterial != null) {
          p0.writeInt32(4, tmaterial);
       }
       tmaterial = this.subLevel;
       if (tmaterial != null) {
          p0.writeInt32(5, tmaterial);
       }
       super.writeTo(p0);
       return;
    }
}
