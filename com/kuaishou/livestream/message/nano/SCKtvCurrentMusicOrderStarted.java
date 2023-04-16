package com.kuaishou.livestream.message.nano.SCKtvCurrentMusicOrderStarted;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKtvCurrentMusicOrderStarted extends MessageNano	// class@0013f5
{
    public String ktvId;
    public String liveStreamId;
    public String musicOrderId;
    public String voicePartyId;
    public static SCKtvCurrentMusicOrderStarted[] _emptyArray;

    public void SCKtvCurrentMusicOrderStarted(){
       super();
       this.clear();
    }
    public static SCKtvCurrentMusicOrderStarted[] emptyArray(){
       if (SCKtvCurrentMusicOrderStarted._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKtvCurrentMusicOrderStarted._emptyArray == null) {
             SCKtvCurrentMusicOrderStarted[] sCKtvCurrent = new SCKtvCurrentMusicOrderStarted[0];
             SCKtvCurrentMusicOrderStarted._emptyArray = sCKtvCurrent;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKtvCurrentMusicOrderStarted._emptyArray;
    }
    public static SCKtvCurrentMusicOrderStarted parseFrom(CodedInputByteBufferNano p0){
       return new SCKtvCurrentMusicOrderStarted().mergeFrom(p0);
    }
    public static SCKtvCurrentMusicOrderStarted parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKtvCurrentMusicOrderStarted(), p0);
    }
    public SCKtvCurrentMusicOrderStarted clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.ktvId = "";
       this.musicOrderId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       if (!(this.ktvId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ktvId);
       }
       if (!(this.musicOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.musicOrderId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKtvCurrentMusicOrderStarted mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.musicOrderId = p0.readString();
                   }
                }else {
                   this.ktvId = p0.readString();
                }
             }else {
                this.voicePartyId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       if (!(this.ktvId).equals(str)) {
          p0.writeString(3, this.ktvId);
       }
       if (!(this.musicOrderId).equals(str)) {
          p0.writeString(4, this.musicOrderId);
       }
       super.writeTo(p0);
       return;
    }
}
