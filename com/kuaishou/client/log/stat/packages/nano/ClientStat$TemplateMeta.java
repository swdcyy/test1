package com.kuaishou.client.log.stat.packages.nano.ClientStat$TemplateMeta;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$TemplateMeta extends MessageNano	// class@001433
{
    public String id;
    public int version;
    public static ClientStat$TemplateMeta[] _emptyArray;

    public void ClientStat$TemplateMeta(){
       super();
       this.clear();
    }
    public static ClientStat$TemplateMeta[] emptyArray(){
       if (ClientStat$TemplateMeta._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$TemplateMeta._emptyArray == null) {
             ClientStat$TemplateMeta[] templateMeta = new ClientStat$TemplateMeta[0];
             ClientStat$TemplateMeta._emptyArray = templateMeta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$TemplateMeta._emptyArray;
    }
    public static ClientStat$TemplateMeta parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$TemplateMeta().mergeFrom(p0);
    }
    public static ClientStat$TemplateMeta parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$TemplateMeta(), p0);
    }
    public ClientStat$TemplateMeta clear(){
       this.id = "";
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       ClientStat$TemplateMeta tversion = this.version;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$TemplateMeta mergeFrom(CodedInputByteBufferNano p0){
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
                this.version = p0.readUInt32();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.id).equals("")) {
          p0.writeString(1, this.id);
       }
       ClientStat$TemplateMeta tversion = this.version;
       if (tversion != null) {
          p0.writeUInt32(2, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
