package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveBroadcastPacakge;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveBroadcastPacakge extends MessageNano	// class@001269
{
    public String broadcastInfo;
    public String expTag;
    public String receiveBroadcastAudienceId;
    public String toAnchorUserId;
    public String toLiveStreamId;
    public static ClientContent$LiveBroadcastPacakge[] _emptyArray;

    public void ClientContent$LiveBroadcastPacakge(){
       super();
       this.clear();
    }
    public static ClientContent$LiveBroadcastPacakge[] emptyArray(){
       if (ClientContent$LiveBroadcastPacakge._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveBroadcastPacakge._emptyArray == null) {
             ClientContent$LiveBroadcastPacakge[] liveBroadcas = new ClientContent$LiveBroadcastPacakge[0];
             ClientContent$LiveBroadcastPacakge._emptyArray = liveBroadcas;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveBroadcastPacakge._emptyArray;
    }
    public static ClientContent$LiveBroadcastPacakge parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveBroadcastPacakge().mergeFrom(p0);
    }
    public static ClientContent$LiveBroadcastPacakge parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveBroadcastPacakge(), p0);
    }
    public ClientContent$LiveBroadcastPacakge clear(){
       this.toLiveStreamId = "";
       this.receiveBroadcastAudienceId = "";
       this.expTag = "";
       this.broadcastInfo = "";
       this.toAnchorUserId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.toLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.toLiveStreamId);
       }
       if (!(this.receiveBroadcastAudienceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.receiveBroadcastAudienceId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.expTag);
       }
       if (!(this.broadcastInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.broadcastInfo);
       }
       if (!(this.toAnchorUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.toAnchorUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveBroadcastPacakge mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.toAnchorUserId = p0.readString();
                      }
                   }else {
                      this.broadcastInfo = p0.readString();
                   }
                }else {
                   this.expTag = p0.readString();
                }
             }else {
                this.receiveBroadcastAudienceId = p0.readString();
             }
          }else {
             this.toLiveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.toLiveStreamId).equals(str)) {
          p0.writeString(1, this.toLiveStreamId);
       }
       if (!(this.receiveBroadcastAudienceId).equals(str)) {
          p0.writeString(2, this.receiveBroadcastAudienceId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(3, this.expTag);
       }
       if (!(this.broadcastInfo).equals(str)) {
          p0.writeString(4, this.broadcastInfo);
       }
       if (!(this.toAnchorUserId).equals(str)) {
          p0.writeString(5, this.toAnchorUserId);
       }
       super.writeTo(p0);
       return;
    }
}
