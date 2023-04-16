package com.kuaishou.livestream.message.nano.SCTheaterClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCTheaterClosed extends MessageNano	// class@001467
{
    public String liveStreamId;
    public String theaterId;
    public String voicePartyId;
    public static SCTheaterClosed[] _emptyArray;

    public void SCTheaterClosed(){
       super();
       this.clear();
    }
    public static SCTheaterClosed[] emptyArray(){
       if (SCTheaterClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCTheaterClosed._emptyArray == null) {
             SCTheaterClosed[] sCTheaterClo = new SCTheaterClosed[0];
             SCTheaterClosed._emptyArray = sCTheaterClo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCTheaterClosed._emptyArray;
    }
    public static SCTheaterClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCTheaterClosed().mergeFrom(p0);
    }
    public static SCTheaterClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCTheaterClosed(), p0);
    }
    public SCTheaterClosed clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.theaterId = "";
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
       if (!(this.theaterId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.theaterId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCTheaterClosed mergeFrom(CodedInputByteBufferNano p0){
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
                }else {
                   this.theaterId = p0.readString();
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
       if (!(this.theaterId).equals(str)) {
          p0.writeString(3, this.theaterId);
       }
       super.writeTo(p0);
       return;
    }
}
