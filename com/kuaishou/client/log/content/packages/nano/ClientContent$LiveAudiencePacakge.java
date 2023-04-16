package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveAudiencePacakge;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveAudiencePacakge extends MessageNano	// class@001265
{
    public String identity;
    public int index;
    public static ClientContent$LiveAudiencePacakge[] _emptyArray;

    public void ClientContent$LiveAudiencePacakge(){
       super();
       this.clear();
    }
    public static ClientContent$LiveAudiencePacakge[] emptyArray(){
       if (ClientContent$LiveAudiencePacakge._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveAudiencePacakge._emptyArray == null) {
             ClientContent$LiveAudiencePacakge[] liveAudience = new ClientContent$LiveAudiencePacakge[0];
             ClientContent$LiveAudiencePacakge._emptyArray = liveAudience;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveAudiencePacakge._emptyArray;
    }
    public static ClientContent$LiveAudiencePacakge parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveAudiencePacakge().mergeFrom(p0);
    }
    public static ClientContent$LiveAudiencePacakge parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveAudiencePacakge(), p0);
    }
    public ClientContent$LiveAudiencePacakge clear(){
       this.identity = "";
       this.index = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.identity).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       ClientContent$LiveAudiencePacakge tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tindex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveAudiencePacakge mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.index = p0.readUInt32();
             }
          }else {
             this.identity = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.identity).equals("")) {
          p0.writeString(1, this.identity);
       }
       ClientContent$LiveAudiencePacakge tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(2, tindex);
       }
       super.writeTo(p0);
       return;
    }
}
