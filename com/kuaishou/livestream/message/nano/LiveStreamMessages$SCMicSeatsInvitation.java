package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeatsInvitation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCMicSeatsInvitation extends MessageNano	// class@001357
{
    public long guestUserId;
    public long incomingTimeoutMillis;
    public String liveStreamId;
    public long time;
    public String voicePartyId;
    public static LiveStreamMessages$SCMicSeatsInvitation[] _emptyArray;

    public void LiveStreamMessages$SCMicSeatsInvitation(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCMicSeatsInvitation[] emptyArray(){
       if (LiveStreamMessages$SCMicSeatsInvitation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCMicSeatsInvitation._emptyArray == null) {
             LiveStreamMessages$SCMicSeatsInvitation[] sCMicSeatsIn = new LiveStreamMessages$SCMicSeatsInvitation[0];
             LiveStreamMessages$SCMicSeatsInvitation._emptyArray = sCMicSeatsIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCMicSeatsInvitation._emptyArray;
    }
    public static LiveStreamMessages$SCMicSeatsInvitation parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCMicSeatsInvitation().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCMicSeatsInvitation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCMicSeatsInvitation(), p0);
    }
    public LiveStreamMessages$SCMicSeatsInvitation clear(){
       this.time = 0;
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.guestUserId = 0;
       this.incomingTimeoutMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCMicSeatsInvitation ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.voicePartyId);
       }
       ttime = this.guestUserId;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       ttime = this.incomingTimeoutMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCMicSeatsInvitation mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.incomingTimeoutMillis = p0.readUInt64();
                      }
                   }else {
                      this.guestUserId = p0.readUInt64();
                   }
                }else {
                   this.voicePartyId = p0.readString();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCMicSeatsInvitation ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(3, this.voicePartyId);
       }
       ttime = this.guestUserId;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       ttime = this.incomingTimeoutMillis;
       if (ttime - i) {
          p0.writeUInt64(5, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
