package com.kuaishou.client.log.content.packages.nano.ClientContent$VisitDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$VisitDetailPackage extends MessageNano	// class@001300
{
    public long clientTimestamp;
    public String url;
    public static ClientContent$VisitDetailPackage[] _emptyArray;

    public void ClientContent$VisitDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VisitDetailPackage[] emptyArray(){
       if (ClientContent$VisitDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VisitDetailPackage._emptyArray == null) {
             ClientContent$VisitDetailPackage[] visitDetailP = new ClientContent$VisitDetailPackage[0];
             ClientContent$VisitDetailPackage._emptyArray = visitDetailP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VisitDetailPackage._emptyArray;
    }
    public static ClientContent$VisitDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VisitDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$VisitDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VisitDetailPackage(), p0);
    }
    public ClientContent$VisitDetailPackage clear(){
       this.clientTimestamp = 0;
       this.url = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$VisitDetailPackage tclientTimes = this.clientTimestamp;
       if (tclientTimes) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tclientTimes);
       }
       if (!(this.url).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VisitDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.url = p0.readString();
             }
          }else {
             this.clientTimestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$VisitDetailPackage tclientTimes = this.clientTimestamp;
       if (tclientTimes) {
          p0.writeUInt64(1, tclientTimes);
       }
       if (!(this.url).equals("")) {
          p0.writeString(2, this.url);
       }
       super.writeTo(p0);
       return;
    }
}
