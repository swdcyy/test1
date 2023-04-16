package com.kuaishou.livestream.message.nano.SCKtvMusicOrderFinished;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKtvMusicOrderFinished extends MessageNano	// class@0013f8
{
    public String ktvId;
    public String liveStreamId;
    public String voicePartyId;
    public static SCKtvMusicOrderFinished[] _emptyArray;

    public void SCKtvMusicOrderFinished(){
       super();
       this.clear();
    }
    public static SCKtvMusicOrderFinished[] emptyArray(){
       if (SCKtvMusicOrderFinished._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKtvMusicOrderFinished._emptyArray == null) {
             SCKtvMusicOrderFinished[] sCKtvMusicOr = new SCKtvMusicOrderFinished[0];
             SCKtvMusicOrderFinished._emptyArray = sCKtvMusicOr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKtvMusicOrderFinished._emptyArray;
    }
    public static SCKtvMusicOrderFinished parseFrom(CodedInputByteBufferNano p0){
       return new SCKtvMusicOrderFinished().mergeFrom(p0);
    }
    public static SCKtvMusicOrderFinished parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKtvMusicOrderFinished(), p0);
    }
    public SCKtvMusicOrderFinished clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.ktvId = "";
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
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKtvMusicOrderFinished mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
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
       super.writeTo(p0);
       return;
    }
}
