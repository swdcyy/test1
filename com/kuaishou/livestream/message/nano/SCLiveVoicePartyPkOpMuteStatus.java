package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMuteStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveVoicePartyPkOpMuteStatus extends MessageNano	// class@001451
{
    public String liveStreamId;
    public boolean mute;
    public String pkId;
    public String voicePartyId;
    public static SCLiveVoicePartyPkOpMuteStatus[] _emptyArray;

    public void SCLiveVoicePartyPkOpMuteStatus(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkOpMuteStatus[] emptyArray(){
       if (SCLiveVoicePartyPkOpMuteStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkOpMuteStatus._emptyArray == null) {
             SCLiveVoicePartyPkOpMuteStatus[] sCLiveVoiceP = new SCLiveVoicePartyPkOpMuteStatus[0];
             SCLiveVoicePartyPkOpMuteStatus._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkOpMuteStatus._emptyArray;
    }
    public static SCLiveVoicePartyPkOpMuteStatus parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkOpMuteStatus().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkOpMuteStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkOpMuteStatus(), p0);
    }
    public SCLiveVoicePartyPkOpMuteStatus clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.pkId = "";
       this.mute = false;
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
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pkId);
       }
       SCLiveVoicePartyPkOpMuteStatus tmute = this.mute;
       if (tmute != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tmute);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkOpMuteStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.mute = p0.readBool();
                   }
                }else {
                   this.pkId = p0.readString();
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
       if (!(this.pkId).equals(str)) {
          p0.writeString(3, this.pkId);
       }
       SCLiveVoicePartyPkOpMuteStatus tmute = this.mute;
       if (tmute != null) {
          p0.writeBool(4, tmute);
       }
       super.writeTo(p0);
       return;
    }
}
