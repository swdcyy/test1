package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyCommonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;

public final class LiveStreamMessages$SCVoicePartyCommonInfo extends MessageNano	// class@001373
{
    public LiveStreamMessages$VoicePartyCommonInfo commonInfo;
    public String liveStreamId;
    public String voicePartyId;
    public static LiveStreamMessages$SCVoicePartyCommonInfo[] _emptyArray;

    public void LiveStreamMessages$SCVoicePartyCommonInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCVoicePartyCommonInfo[] emptyArray(){
       if (LiveStreamMessages$SCVoicePartyCommonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCVoicePartyCommonInfo._emptyArray == null) {
             LiveStreamMessages$SCVoicePartyCommonInfo[] sCVoiceParty = new LiveStreamMessages$SCVoicePartyCommonInfo[0];
             LiveStreamMessages$SCVoicePartyCommonInfo._emptyArray = sCVoiceParty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCVoicePartyCommonInfo._emptyArray;
    }
    public static LiveStreamMessages$SCVoicePartyCommonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCVoicePartyCommonInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCVoicePartyCommonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCVoicePartyCommonInfo(), p0);
    }
    public LiveStreamMessages$SCVoicePartyCommonInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.commonInfo = null;
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
       LiveStreamMessages$SCVoicePartyCommonInfo tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tcommonInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCVoicePartyCommonInfo mergeFrom(CodedInputByteBufferNano p0){
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
                }else if(this.commonInfo == null){
                   this.commonInfo = new LiveStreamMessages$VoicePartyCommonInfo();
                }
                p0.readMessage(this.commonInfo);
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
       LiveStreamMessages$SCVoicePartyCommonInfo tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          p0.writeMessage(3, tcommonInfo);
       }
       super.writeTo(p0);
       return;
    }
}
