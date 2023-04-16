package com.kuaishou.livestream.message.nano.SCKtvNextMusicOrderInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;

public final class SCKtvNextMusicOrderInfo extends MessageNano	// class@0013f9
{
    public String ktvId;
    public KtvMusicOrderInfo ktvMusicOrderInfo;
    public String liveStreamId;
    public String voicePartyId;
    public static SCKtvNextMusicOrderInfo[] _emptyArray;

    public void SCKtvNextMusicOrderInfo(){
       super();
       this.clear();
    }
    public static SCKtvNextMusicOrderInfo[] emptyArray(){
       if (SCKtvNextMusicOrderInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKtvNextMusicOrderInfo._emptyArray == null) {
             SCKtvNextMusicOrderInfo[] sCKtvNextMus = new SCKtvNextMusicOrderInfo[0];
             SCKtvNextMusicOrderInfo._emptyArray = sCKtvNextMus;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKtvNextMusicOrderInfo._emptyArray;
    }
    public static SCKtvNextMusicOrderInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCKtvNextMusicOrderInfo().mergeFrom(p0);
    }
    public static SCKtvNextMusicOrderInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKtvNextMusicOrderInfo(), p0);
    }
    public SCKtvNextMusicOrderInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.ktvId = "";
       this.ktvMusicOrderInfo = null;
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
       SCKtvNextMusicOrderInfo tktvMusicOrd = this.ktvMusicOrderInfo;
       if (tktvMusicOrd != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tktvMusicOrd);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKtvNextMusicOrderInfo mergeFrom(CodedInputByteBufferNano p0){
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
                   }else if(this.ktvMusicOrderInfo == null){
                      this.ktvMusicOrderInfo = new KtvMusicOrderInfo();
                   }
                   p0.readMessage(this.ktvMusicOrderInfo);
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
       SCKtvNextMusicOrderInfo tktvMusicOrd = this.ktvMusicOrderInfo;
       if (tktvMusicOrd != null) {
          p0.writeMessage(4, tktvMusicOrd);
       }
       super.writeTo(p0);
       return;
    }
}
