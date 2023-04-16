package com.kuaishou.livestream.message.nano.LiveVoicePartyPkTopContributor;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveVoicePartyPkTopContributor extends MessageNano	// class@0013d2
{
    public UserInfos$UserInfo user;
    public static LiveVoicePartyPkTopContributor[] _emptyArray;

    public void LiveVoicePartyPkTopContributor(){
       super();
       this.clear();
    }
    public static LiveVoicePartyPkTopContributor[] emptyArray(){
       if (LiveVoicePartyPkTopContributor._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyPkTopContributor._emptyArray == null) {
             LiveVoicePartyPkTopContributor[] liveVoicePar = new LiveVoicePartyPkTopContributor[0];
             LiveVoicePartyPkTopContributor._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyPkTopContributor._emptyArray;
    }
    public static LiveVoicePartyPkTopContributor parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyPkTopContributor().mergeFrom(p0);
    }
    public static LiveVoicePartyPkTopContributor parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyPkTopContributor(), p0);
    }
    public LiveVoicePartyPkTopContributor clear(){
       this.user = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveVoicePartyPkTopContributor tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyPkTopContributor mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveVoicePartyPkTopContributor tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
