package com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$VoicePartyChannelInfo extends MessageNano	// class@001387
{
    public long channelId;
    public String endColor;
    public String name;
    public String startColor;
    public static LiveStreamMessages$VoicePartyChannelInfo[] _emptyArray;

    public void LiveStreamMessages$VoicePartyChannelInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$VoicePartyChannelInfo[] emptyArray(){
       if (LiveStreamMessages$VoicePartyChannelInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$VoicePartyChannelInfo._emptyArray == null) {
             LiveStreamMessages$VoicePartyChannelInfo[] voicePartyCh = new LiveStreamMessages$VoicePartyChannelInfo[0];
             LiveStreamMessages$VoicePartyChannelInfo._emptyArray = voicePartyCh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$VoicePartyChannelInfo._emptyArray;
    }
    public static LiveStreamMessages$VoicePartyChannelInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$VoicePartyChannelInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$VoicePartyChannelInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$VoicePartyChannelInfo(), p0);
    }
    public LiveStreamMessages$VoicePartyChannelInfo clear(){
       this.channelId = 0;
       this.name = "";
       this.startColor = "";
       this.endColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$VoicePartyChannelInfo tchannelId = this.channelId;
       if (tchannelId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tchannelId);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       if (!(this.startColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.startColor);
       }
       if (!(this.endColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.endColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$VoicePartyChannelInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.endColor = p0.readString();
                   }
                }else {
                   this.startColor = p0.readString();
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             this.channelId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$VoicePartyChannelInfo tchannelId = this.channelId;
       if (tchannelId - null) {
          p0.writeUInt64(1, tchannelId);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       if (!(this.startColor).equals(str)) {
          p0.writeString(3, this.startColor);
       }
       if (!(this.endColor).equals(str)) {
          p0.writeString(4, this.endColor);
       }
       super.writeTo(p0);
       return;
    }
}
