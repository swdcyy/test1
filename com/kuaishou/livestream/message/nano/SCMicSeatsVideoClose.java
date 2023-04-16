package com.kuaishou.livestream.message.nano.SCMicSeatsVideoClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCMicSeatsVideoClose extends MessageNano	// class@00145b
{
    public long guestId;
    public String liveStreamId;
    public String voicePartyId;
    public static SCMicSeatsVideoClose[] _emptyArray;

    public void SCMicSeatsVideoClose(){
       super();
       this.clear();
    }
    public static SCMicSeatsVideoClose[] emptyArray(){
       if (SCMicSeatsVideoClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMicSeatsVideoClose._emptyArray == null) {
             SCMicSeatsVideoClose[] sCMicSeatsVi = new SCMicSeatsVideoClose[0];
             SCMicSeatsVideoClose._emptyArray = sCMicSeatsVi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMicSeatsVideoClose._emptyArray;
    }
    public static SCMicSeatsVideoClose parseFrom(CodedInputByteBufferNano p0){
       return new SCMicSeatsVideoClose().mergeFrom(p0);
    }
    public static SCMicSeatsVideoClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMicSeatsVideoClose(), p0);
    }
    public SCMicSeatsVideoClose clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.guestId = 0;
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
       SCMicSeatsVideoClose tguestId = this.guestId;
       if (tguestId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tguestId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMicSeatsVideoClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.guestId = p0.readUInt64();
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
       SCMicSeatsVideoClose tguestId = this.guestId;
       if (tguestId) {
          p0.writeUInt64(3, tguestId);
       }
       super.writeTo(p0);
       return;
    }
}
