package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkSwitchRoom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveVoicePartyPkSwitchRoom extends MessageNano	// class@001454
{
    public boolean goBack;
    public String liveStreamId;
    public String pkId;
    public String voicePartyId;
    public static SCLiveVoicePartyPkSwitchRoom[] _emptyArray;

    public void SCLiveVoicePartyPkSwitchRoom(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkSwitchRoom[] emptyArray(){
       if (SCLiveVoicePartyPkSwitchRoom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkSwitchRoom._emptyArray == null) {
             SCLiveVoicePartyPkSwitchRoom[] sCLiveVoiceP = new SCLiveVoicePartyPkSwitchRoom[0];
             SCLiveVoicePartyPkSwitchRoom._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkSwitchRoom._emptyArray;
    }
    public static SCLiveVoicePartyPkSwitchRoom parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkSwitchRoom().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkSwitchRoom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkSwitchRoom(), p0);
    }
    public SCLiveVoicePartyPkSwitchRoom clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.pkId = "";
       this.goBack = false;
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
       SCLiveVoicePartyPkSwitchRoom tgoBack = this.goBack;
       if (tgoBack != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tgoBack);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkSwitchRoom mergeFrom(CodedInputByteBufferNano p0){
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
                      this.goBack = p0.readBool();
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
       SCLiveVoicePartyPkSwitchRoom tgoBack = this.goBack;
       if (tgoBack != null) {
          p0.writeBool(4, tgoBack);
       }
       super.writeTo(p0);
       return;
    }
}
