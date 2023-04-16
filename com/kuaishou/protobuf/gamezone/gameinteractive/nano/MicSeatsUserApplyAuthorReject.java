package com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatsUserApplyAuthorReject;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class MicSeatsUserApplyAuthorReject extends MessageNano	// class@000bb7
{
    public long authorId;
    public String liveStreamId;
    public long userId;
    public String voicePartyId;
    public static MicSeatsUserApplyAuthorReject[] _emptyArray;

    public void MicSeatsUserApplyAuthorReject(){
       super();
       this.clear();
    }
    public static MicSeatsUserApplyAuthorReject[] emptyArray(){
       if (MicSeatsUserApplyAuthorReject._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MicSeatsUserApplyAuthorReject._emptyArray == null) {
             MicSeatsUserApplyAuthorReject[] micSeatsUser = new MicSeatsUserApplyAuthorReject[0];
             MicSeatsUserApplyAuthorReject._emptyArray = micSeatsUser;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MicSeatsUserApplyAuthorReject._emptyArray;
    }
    public static MicSeatsUserApplyAuthorReject parseFrom(CodedInputByteBufferNano p0){
       return new MicSeatsUserApplyAuthorReject().mergeFrom(p0);
    }
    public static MicSeatsUserApplyAuthorReject parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MicSeatsUserApplyAuthorReject(), p0);
    }
    public MicSeatsUserApplyAuthorReject clear(){
       this.liveStreamId = "";
       this.authorId = 0;
       this.userId = 0;
       this.voicePartyId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       MicSeatsUserApplyAuthorReject tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthorId);
       }
       tauthorId = this.userId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.voicePartyId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MicSeatsUserApplyAuthorReject mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.voicePartyId = p0.readString();
                   }
                }else {
                   this.userId = p0.readUInt64();
                }
             }else {
                this.authorId = p0.readUInt64();
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
       MicSeatsUserApplyAuthorReject tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(2, tauthorId);
       }
       tauthorId = this.userId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(4, this.voicePartyId);
       }
       super.writeTo(p0);
       return;
    }
}
