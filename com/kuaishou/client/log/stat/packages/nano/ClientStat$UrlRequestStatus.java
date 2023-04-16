package com.kuaishou.client.log.stat.packages.nano.ClientStat$UrlRequestStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$UrlRequestStatus extends MessageNano	// class@001436
{
    public int costMs;
    public String failReason;
    public boolean success;
    public String url;
    public static ClientStat$UrlRequestStatus[] _emptyArray;

    public void ClientStat$UrlRequestStatus(){
       super();
       this.clear();
    }
    public static ClientStat$UrlRequestStatus[] emptyArray(){
       if (ClientStat$UrlRequestStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$UrlRequestStatus._emptyArray == null) {
             ClientStat$UrlRequestStatus[] urlRequestSt = new ClientStat$UrlRequestStatus[0];
             ClientStat$UrlRequestStatus._emptyArray = urlRequestSt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$UrlRequestStatus._emptyArray;
    }
    public static ClientStat$UrlRequestStatus parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$UrlRequestStatus().mergeFrom(p0);
    }
    public static ClientStat$UrlRequestStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$UrlRequestStatus(), p0);
    }
    public ClientStat$UrlRequestStatus clear(){
       this.url = "";
       this.success = false;
       this.costMs = 0;
       this.failReason = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.url);
       }
       ClientStat$UrlRequestStatus tsuccess = this.success;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tsuccess);
       }
       tsuccess = this.costMs;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tsuccess);
       }
       if (!(this.failReason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.failReason);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$UrlRequestStatus mergeFrom(CodedInputByteBufferNano p0){
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
                      this.failReason = p0.readString();
                   }
                }else {
                   this.costMs = p0.readUInt32();
                }
             }else {
                this.success = p0.readBool();
             }
          }else {
             this.url = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(1, this.url);
       }
       ClientStat$UrlRequestStatus tsuccess = this.success;
       if (tsuccess != null) {
          p0.writeBool(2, tsuccess);
       }
       tsuccess = this.costMs;
       if (tsuccess != null) {
          p0.writeUInt32(3, tsuccess);
       }
       if (!(this.failReason).equals(str)) {
          p0.writeString(4, this.failReason);
       }
       super.writeTo(p0);
       return;
    }
}
