package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsApplyInfoFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$MicSeatsApplyInfoFeed extends MessageNano	// class@001305
{
    public String id;
    public long time;
    public UserInfos$UserInfo user;
    public String voicePartyId;
    public static LiveStreamMessages$MicSeatsApplyInfoFeed[] _emptyArray;

    public void LiveStreamMessages$MicSeatsApplyInfoFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatsApplyInfoFeed[] emptyArray(){
       if (LiveStreamMessages$MicSeatsApplyInfoFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatsApplyInfoFeed._emptyArray == null) {
             LiveStreamMessages$MicSeatsApplyInfoFeed[] micSeatsAppl = new LiveStreamMessages$MicSeatsApplyInfoFeed[0];
             LiveStreamMessages$MicSeatsApplyInfoFeed._emptyArray = micSeatsAppl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatsApplyInfoFeed._emptyArray;
    }
    public static LiveStreamMessages$MicSeatsApplyInfoFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatsApplyInfoFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatsApplyInfoFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatsApplyInfoFeed(), p0);
    }
    public LiveStreamMessages$MicSeatsApplyInfoFeed clear(){
       this.id = "";
       this.voicePartyId = "";
       this.user = null;
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       LiveStreamMessages$MicSeatsApplyInfoFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tuser);
       }
       tuser = this.time;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatsApplyInfoFeed mergeFrom(CodedInputByteBufferNano p0){
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
                      this.time = p0.readUInt64();
                   }
                }else if(this.user == null){
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
             }else {
                this.voicePartyId = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       LiveStreamMessages$MicSeatsApplyInfoFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(3, tuser);
       }
       tuser = this.time;
       if (tuser) {
          p0.writeUInt64(4, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
