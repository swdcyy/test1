package com.kuaishou.livestream.message.nano.SCMicSeatsOpenVideoAuthority;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCMicSeatsOpenVideoAuthority extends MessageNano	// class@00145a
{
    public int authorizedUser;
    public String liveStreamId;
    public String voicePartyId;
    public static SCMicSeatsOpenVideoAuthority[] _emptyArray;

    public void SCMicSeatsOpenVideoAuthority(){
       super();
       this.clear();
    }
    public static SCMicSeatsOpenVideoAuthority[] emptyArray(){
       if (SCMicSeatsOpenVideoAuthority._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMicSeatsOpenVideoAuthority._emptyArray == null) {
             SCMicSeatsOpenVideoAuthority[] sCMicSeatsOp = new SCMicSeatsOpenVideoAuthority[0];
             SCMicSeatsOpenVideoAuthority._emptyArray = sCMicSeatsOp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMicSeatsOpenVideoAuthority._emptyArray;
    }
    public static SCMicSeatsOpenVideoAuthority parseFrom(CodedInputByteBufferNano p0){
       return new SCMicSeatsOpenVideoAuthority().mergeFrom(p0);
    }
    public static SCMicSeatsOpenVideoAuthority parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMicSeatsOpenVideoAuthority(), p0);
    }
    public SCMicSeatsOpenVideoAuthority clear(){
       this.authorizedUser = 0;
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCMicSeatsOpenVideoAuthority tauthorizedU = this.authorizedUser;
       if (tauthorizedU != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tauthorizedU);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.voicePartyId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMicSeatsOpenVideoAuthority mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.voicePartyId = p0.readString();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.authorizedUser = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCMicSeatsOpenVideoAuthority tauthorizedU = this.authorizedUser;
       if (tauthorizedU != null) {
          p0.writeInt32(1, tauthorizedU);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(3, this.voicePartyId);
       }
       super.writeTo(p0);
       return;
    }
}
