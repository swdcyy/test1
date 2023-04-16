package com.kuaishou.livestream.message.nano.LiveRedPackMessage$SCAudienceRedPackShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPack;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveRedPackMessage$SCAudienceRedPackShow extends MessageNano	// class@00126e
{
    public boolean enableQueryFollowStatus;
    public LiveRedPackMessage$AudienceRedPack[] redPack;
    public int totalRedPackCount;
    public String totalRedPackDisplayCount;
    public long totalRedPackMaxDisplayCount;
    public static LiveRedPackMessage$SCAudienceRedPackShow[] _emptyArray;

    public void LiveRedPackMessage$SCAudienceRedPackShow(){
       super();
       this.clear();
    }
    public static LiveRedPackMessage$SCAudienceRedPackShow[] emptyArray(){
       if (LiveRedPackMessage$SCAudienceRedPackShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackMessage$SCAudienceRedPackShow._emptyArray == null) {
             LiveRedPackMessage$SCAudienceRedPackShow[] sCAudienceRe = new LiveRedPackMessage$SCAudienceRedPackShow[0];
             LiveRedPackMessage$SCAudienceRedPackShow._emptyArray = sCAudienceRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackMessage$SCAudienceRedPackShow._emptyArray;
    }
    public static LiveRedPackMessage$SCAudienceRedPackShow parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackMessage$SCAudienceRedPackShow().mergeFrom(p0);
    }
    public static LiveRedPackMessage$SCAudienceRedPackShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackMessage$SCAudienceRedPackShow(), p0);
    }
    public LiveRedPackMessage$SCAudienceRedPackShow clear(){
       this.redPack = LiveRedPackMessage$AudienceRedPack.emptyArray();
       this.totalRedPackCount = 0;
       this.totalRedPackDisplayCount = "";
       this.totalRedPackMaxDisplayCount = 0;
       this.enableQueryFollowStatus = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRedPackMessage$SCAudienceRedPackShow tredPack = this.redPack;
       if (tredPack != null && tredPack.length > 0) {
          int i1 = 0;
          LiveRedPackMessage$SCAudienceRedPackShow tredPack1 = this.redPack;
          while (i1 < tredPack1.length) {
             object oobject = tredPack1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tredPack = this.totalRedPackCount;
       if (tredPack != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tredPack);
       }
       if (!(this.totalRedPackDisplayCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.totalRedPackDisplayCount);
       }
       tredPack = this.totalRedPackMaxDisplayCount;
       if (tredPack) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tredPack);
       }
       tredPack = this.enableQueryFollowStatus;
       if (tredPack != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tredPack);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackMessage$SCAudienceRedPackShow mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.enableQueryFollowStatus = p0.readBool();
                      }
                   }else {
                      this.totalRedPackMaxDisplayCount = p0.readUInt64();
                   }
                }else {
                   this.totalRedPackDisplayCount = p0.readString();
                }
             }else {
                this.totalRedPackCount = p0.readUInt32();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveRedPackMessage$SCAudienceRedPackShow tredPack = this.redPack;
             int i2 = (tredPack == null)? 0: tredPack.length;
             i = i + i2;
             LiveRedPackMessage$AudienceRedPack[] uAudienceRed = new LiveRedPackMessage$AudienceRedPack[i];
             if (i2) {
                System.arraycopy(tredPack, 0, uAudienceRed, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uAudienceRed[i2] = new LiveRedPackMessage$AudienceRedPack();
                p0.readMessage(uAudienceRed[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uAudienceRed[i2] = new LiveRedPackMessage$AudienceRedPack();
             p0.readMessage(uAudienceRed[i2]);
             this.redPack = uAudienceRed;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRedPackMessage$SCAudienceRedPackShow tredPack = this.redPack;
       if (tredPack != null && tredPack.length > 0) {
          int i = 0;
          LiveRedPackMessage$SCAudienceRedPackShow tredPack1 = this.redPack;
          while (i < tredPack1.length) {
             object oobject = tredPack1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tredPack = this.totalRedPackCount;
       if (tredPack != null) {
          p0.writeUInt32(2, tredPack);
       }
       if (!(this.totalRedPackDisplayCount).equals("")) {
          p0.writeString(3, this.totalRedPackDisplayCount);
       }
       tredPack = this.totalRedPackMaxDisplayCount;
       if (tredPack) {
          p0.writeUInt64(4, tredPack);
       }
       tredPack = this.enableQueryFollowStatus;
       if (tredPack != null) {
          p0.writeBool(5, tredPack);
       }
       super.writeTo(p0);
       return;
    }
}
