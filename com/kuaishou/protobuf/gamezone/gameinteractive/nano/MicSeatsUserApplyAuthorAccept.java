package com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatsUserApplyAuthorAccept;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class MicSeatsUserApplyAuthorAccept extends MessageNano	// class@000bb6
{
    public String aryaConfig;
    public long authorId;
    public String liveStreamId;
    public long userId;
    public String voicePartyId;
    public static MicSeatsUserApplyAuthorAccept[] _emptyArray;

    public void MicSeatsUserApplyAuthorAccept(){
       super();
       this.clear();
    }
    public static MicSeatsUserApplyAuthorAccept[] emptyArray(){
       if (MicSeatsUserApplyAuthorAccept._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MicSeatsUserApplyAuthorAccept._emptyArray == null) {
             MicSeatsUserApplyAuthorAccept[] micSeatsUser = new MicSeatsUserApplyAuthorAccept[0];
             MicSeatsUserApplyAuthorAccept._emptyArray = micSeatsUser;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MicSeatsUserApplyAuthorAccept._emptyArray;
    }
    public static MicSeatsUserApplyAuthorAccept parseFrom(CodedInputByteBufferNano p0){
       return new MicSeatsUserApplyAuthorAccept().mergeFrom(p0);
    }
    public static MicSeatsUserApplyAuthorAccept parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MicSeatsUserApplyAuthorAccept(), p0);
    }
    public MicSeatsUserApplyAuthorAccept clear(){
       this.liveStreamId = "";
       this.aryaConfig = "";
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
       if (!(this.aryaConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.aryaConfig);
       }
       MicSeatsUserApplyAuthorAccept tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       tauthorId = this.userId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthorId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.voicePartyId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MicSeatsUserApplyAuthorAccept mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
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
                this.aryaConfig = p0.readString();
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
       if (!(this.aryaConfig).equals(str)) {
          p0.writeString(2, this.aryaConfig);
       }
       MicSeatsUserApplyAuthorAccept tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       tauthorId = this.userId;
       if (tauthorId) {
          p0.writeUInt64(4, tauthorId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(5, this.voicePartyId);
       }
       super.writeTo(p0);
       return;
    }
}
