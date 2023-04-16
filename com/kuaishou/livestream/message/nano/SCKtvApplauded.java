package com.kuaishou.livestream.message.nano.SCKtvApplauded;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKtvApplauded extends MessageNano	// class@0013f3
{
    public String applauseId;
    public String ktvId;
    public String liveStreamId;
    public String musicOrderId;
    public String voicePartyId;
    public static SCKtvApplauded[] _emptyArray;

    public void SCKtvApplauded(){
       super();
       this.clear();
    }
    public static SCKtvApplauded[] emptyArray(){
       if (SCKtvApplauded._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKtvApplauded._emptyArray == null) {
             SCKtvApplauded[] sCKtvApplaud = new SCKtvApplauded[0];
             SCKtvApplauded._emptyArray = sCKtvApplaud;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKtvApplauded._emptyArray;
    }
    public static SCKtvApplauded parseFrom(CodedInputByteBufferNano p0){
       return new SCKtvApplauded().mergeFrom(p0);
    }
    public static SCKtvApplauded parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKtvApplauded(), p0);
    }
    public SCKtvApplauded clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.ktvId = "";
       this.musicOrderId = "";
       this.applauseId = "";
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
       if (!(this.applauseId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.applauseId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKtvApplauded mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.applauseId = p0.readString();
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
       if (!(this.applauseId).equals(str)) {
          p0.writeString(5, this.applauseId);
       }
       super.writeTo(p0);
       return;
    }
}
